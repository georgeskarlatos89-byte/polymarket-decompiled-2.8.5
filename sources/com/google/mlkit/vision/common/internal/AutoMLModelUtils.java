package com.google.mlkit.vision.common.internal;

import android.content.Context;
import com.google.mlkit.common.internal.model.ModelUtils;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.Constants;
import defpackage.arn;
import defpackage.dmk;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class AutoMLModelUtils {
    private AutoMLModelUtils() {
    }

    public static String[] getModelAndLabelFilePaths(Context context, LocalModel localModel, boolean z) {
        String absoluteFilePath;
        String str;
        if (z) {
            absoluteFilePath = localModel.getAssetFilePath();
            arn.h(absoluteFilePath);
        } else {
            absoluteFilePath = localModel.getAbsoluteFilePath();
            arn.h(absoluteFilePath);
        }
        if (localModel.isManifestFile()) {
            ModelUtils.AutoMLManifest parseManifestFile = ModelUtils.parseManifestFile(absoluteFilePath, z, context);
            if (parseManifestFile != null) {
                if (Constants.AUTOML_IMAGE_LABELING_MODEL_TYPE.equals(parseManifestFile.getModelType())) {
                    absoluteFilePath = new File(new File(absoluteFilePath).getParent(), parseManifestFile.getModelFile()).toString();
                    str = new File(new File(absoluteFilePath).getParent(), parseManifestFile.getLabelsFile()).toString();
                } else {
                    dmk.n("Model type should be: IMAGE_LABELING.");
                    return null;
                }
            } else {
                dmk.x("Failed to parse manifest file.");
                return null;
            }
        } else {
            str = "";
        }
        return new String[]{absoluteFilePath, str};
    }

    public static List<String> readLabelsFile(Context context, String str, boolean z) {
        InputStream fileInputStream;
        ArrayList arrayList = new ArrayList();
        if (z) {
            fileInputStream = context.getAssets().open(str);
        } else {
            fileInputStream = new FileInputStream(new File(str));
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                arrayList.add(readLine);
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
    }
}
