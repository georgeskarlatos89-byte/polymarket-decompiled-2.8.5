package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.a;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_common.zzah;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.ad0;
import defpackage.arn;
import defpackage.cy7;
import defpackage.di1;
import defpackage.dpi;
import defpackage.fld;
import defpackage.gw7;
import defpackage.iid;
import defpackage.j57;
import defpackage.m57;
import defpackage.pz8;
import defpackage.q3l;
import defpackage.r3l;
import defpackage.sjc;
import defpackage.td0;
import defpackage.xjc;
import defpackage.zw8;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class OptionalModuleUtils {
    public static final String BARCODE = "barcode";
    public static final String BARCODE_MODULE_ID = "com.google.android.gms.vision.barcode";
    public static final String CUSTOM_ICA = "custom_ica";
    public static final String CUSTOM_ICA_MODULE_ID = "com.google.android.gms.vision.custom.ica";
    public static final String DEPRECATED_DYNAMITE_MODULE_ID = "com.google.android.gms.vision.dynamite";
    public static final String DOCSCAN_CROP_MODULE_ID = "com.google.android.gms.mlkit_docscan_crop";
    public static final String DOCSCAN_DETECT_MODULE_ID = "com.google.android.gms.mlkit_docscan_detect";
    public static final String DOCSCAN_ENHANCE_MODULE_ID = "com.google.android.gms.mlkit_docscan_enhance";
    public static final String DOCSCAN_SHADOW_REMOVAL_MODULE_ID = "com.google.android.gms.mlkit_docscan_shadow";
    public static final String DOCSCAN_STAIN_REMOVAL_MODULE_ID = "com.google.android.gms.mlkit_docscan_stain";
    public static final gw7[] EMPTY_FEATURES = new gw7[0];
    public static final String FACE = "face";
    public static final String FACE_MODULE_ID = "com.google.android.gms.vision.face";
    public static final gw7 FEATURE_BARCODE;
    public static final gw7 FEATURE_CUSTOM_ICA;
    public static final gw7 FEATURE_DOCSCAN_CROP;
    public static final gw7 FEATURE_DOCSCAN_DETECT;
    public static final gw7 FEATURE_DOCSCAN_ENHANCE;
    public static final gw7 FEATURE_DOCSCAN_SHADOW_REMOVAL;
    public static final gw7 FEATURE_DOCSCAN_STAIN_REMOVAL;
    public static final gw7 FEATURE_DOCSCAN_UI;
    public static final gw7 FEATURE_FACE;
    public static final gw7 FEATURE_ICA;
    public static final gw7 FEATURE_IMAGE_CAPTION;
    public static final gw7 FEATURE_IMAGE_QUALITY_AESTHETIC;
    public static final gw7 FEATURE_IMAGE_QUALITY_TECHNICAL;
    public static final gw7 FEATURE_LANGID;
    public static final gw7 FEATURE_MLKIT_BARCODE_UI;
    public static final gw7 FEATURE_NLCLASSIFIER;
    public static final gw7 FEATURE_OCR;
    public static final gw7 FEATURE_OCR_CHINESE;
    public static final gw7 FEATURE_OCR_COMMON;
    public static final gw7 FEATURE_OCR_DEVANAGARI;
    public static final gw7 FEATURE_OCR_JAPANESE;
    public static final gw7 FEATURE_OCR_KOREAN;
    public static final gw7 FEATURE_SMART_REPLY;
    public static final gw7 FEATURE_SUBJECT_SEGMENTATION;
    public static final gw7 FEATURE_TFLITE_DYNAMITE;
    public static final String ICA = "ica";
    public static final String ICA_MODULE_ID = "com.google.android.gms.vision.ica";
    public static final String IMAGE_CAPTION_MODULE_ID = "com.google.android.gms.mlkit_image_caption";
    public static final String IMAGE_QUALITY_AESTHETIC_MODULE_ID = "com.google.android.gms.mlkit_quality_aesthetic";
    public static final String IMAGE_QUALITY_TECHNICAL_MODULE_ID = "com.google.android.gms.mlkit_quality_technical";
    public static final String LANGID = "langid";
    public static final String LANGID_MODULE_ID = "com.google.android.gms.mlkit.langid";
    public static final String MLKIT_BARCODE_UI = "barcode_ui";
    public static final String NLCLASSIFIER = "nlclassifier";
    public static final String NLCLASSIFIER_MODULE_ID = "com.google.android.gms.mlkit.nlclassifier";
    public static final String OCR = "ocr";
    public static final String OCR_CHINESE_MODULE_ID = "com.google.android.gms.mlkit_ocr_chinese";
    public static final String OCR_COMMON_MODULE_ID = "com.google.android.gms.mlkit_ocr_common";
    public static final String OCR_DEVANAGARI_MODULE_ID = "com.google.android.gms.mlkit_ocr_devanagari";
    public static final String OCR_JAPANESE_MODULE_ID = "com.google.android.gms.mlkit_ocr_japanese";
    public static final String OCR_KOREAN_MODULE_ID = "com.google.android.gms.mlkit_ocr_korean";
    public static final String OCR_MODULE_ID = "com.google.android.gms.vision.ocr";
    public static final String SMART_REPLY = "smart_reply";
    public static final String SMART_REPLY_MODULE_ID = "com.google.android.gms.mlkit_smartreply";
    public static final String SUBJECT_SEGMENTATION_MODULE_ID = "com.google.android.gms.mlkit_subject_segmentation";
    public static final String TFLITE_DYNAMITE = "tflite_dynamite";
    public static final String TFLITE_DYNAMITE_MODULE_ID = "com.google.android.gms.tflite_dynamite";
    private static final zzai zza;
    private static final zzai zzb;

    static {
        gw7 gw7Var = new gw7("vision.barcode", 1L);
        FEATURE_BARCODE = gw7Var;
        gw7 gw7Var2 = new gw7("vision.custom.ica", 1L);
        FEATURE_CUSTOM_ICA = gw7Var2;
        gw7 gw7Var3 = new gw7("vision.face", 1L);
        FEATURE_FACE = gw7Var3;
        gw7 gw7Var4 = new gw7("vision.ica", 1L);
        FEATURE_ICA = gw7Var4;
        gw7 gw7Var5 = new gw7("vision.ocr", 1L);
        FEATURE_OCR = gw7Var5;
        FEATURE_OCR_CHINESE = new gw7("mlkit.ocr.chinese", 1L);
        FEATURE_OCR_COMMON = new gw7("mlkit.ocr.common", 1L);
        FEATURE_OCR_DEVANAGARI = new gw7("mlkit.ocr.devanagari", 1L);
        FEATURE_OCR_JAPANESE = new gw7("mlkit.ocr.japanese", 1L);
        FEATURE_OCR_KOREAN = new gw7("mlkit.ocr.korean", 1L);
        gw7 gw7Var6 = new gw7("mlkit.langid", 1L);
        FEATURE_LANGID = gw7Var6;
        gw7 gw7Var7 = new gw7("mlkit.nlclassifier", 1L);
        FEATURE_NLCLASSIFIER = gw7Var7;
        gw7 gw7Var8 = new gw7(TFLITE_DYNAMITE, 1L);
        FEATURE_TFLITE_DYNAMITE = gw7Var8;
        gw7 gw7Var9 = new gw7("mlkit.barcode.ui", 1L);
        FEATURE_MLKIT_BARCODE_UI = gw7Var9;
        gw7 gw7Var10 = new gw7("mlkit.smartreply", 1L);
        FEATURE_SMART_REPLY = gw7Var10;
        FEATURE_IMAGE_CAPTION = new gw7("mlkit.image.caption", 1L);
        FEATURE_DOCSCAN_DETECT = new gw7("mlkit.docscan.detect", 1L);
        FEATURE_DOCSCAN_CROP = new gw7("mlkit.docscan.crop", 1L);
        FEATURE_DOCSCAN_ENHANCE = new gw7("mlkit.docscan.enhance", 1L);
        FEATURE_DOCSCAN_UI = new gw7("mlkit.docscan.ui", 1L);
        FEATURE_DOCSCAN_STAIN_REMOVAL = new gw7("mlkit.docscan.stain", 1L);
        FEATURE_DOCSCAN_SHADOW_REMOVAL = new gw7("mlkit.docscan.shadow", 1L);
        FEATURE_IMAGE_QUALITY_AESTHETIC = new gw7("mlkit.quality.aesthetic", 1L);
        FEATURE_IMAGE_QUALITY_TECHNICAL = new gw7("mlkit.quality.technical", 1L);
        FEATURE_SUBJECT_SEGMENTATION = new gw7("mlkit.segmentation.subject", 1L);
        zzah zzahVar = new zzah();
        zzahVar.zza("barcode", gw7Var);
        zzahVar.zza(CUSTOM_ICA, gw7Var2);
        zzahVar.zza(FACE, gw7Var3);
        zzahVar.zza(ICA, gw7Var4);
        zzahVar.zza(OCR, gw7Var5);
        zzahVar.zza(LANGID, gw7Var6);
        zzahVar.zza(NLCLASSIFIER, gw7Var7);
        zzahVar.zza(TFLITE_DYNAMITE, gw7Var8);
        zzahVar.zza(MLKIT_BARCODE_UI, gw7Var9);
        zzahVar.zza(SMART_REPLY, gw7Var10);
        zza = zzahVar.zzb();
        zzah zzahVar2 = new zzah();
        zzahVar2.zza(BARCODE_MODULE_ID, gw7Var);
        zzahVar2.zza(CUSTOM_ICA_MODULE_ID, gw7Var2);
        zzahVar2.zza(FACE_MODULE_ID, gw7Var3);
        zzahVar2.zza(ICA_MODULE_ID, gw7Var4);
        zzahVar2.zza(OCR_MODULE_ID, gw7Var5);
        zzahVar2.zza(LANGID_MODULE_ID, gw7Var6);
        zzahVar2.zza(NLCLASSIFIER_MODULE_ID, gw7Var7);
        zzahVar2.zza(TFLITE_DYNAMITE_MODULE_ID, gw7Var8);
        zzahVar2.zza(SMART_REPLY_MODULE_ID, gw7Var10);
        zzb = zzahVar2.zzb();
    }

    private OptionalModuleUtils() {
    }

    public static boolean areAllRequiredModulesAvailable(Context context, final gw7[] gw7VarArr) {
        try {
            return ((sjc) Tasks.await(new cy7(context, null, cy7.f, ad0.U, zw8.c, 4).c(new fld() { // from class: com.google.mlkit.common.sdkinternal.zzq
                @Override // defpackage.fld
                public final gw7[] getOptionalFeatures() {
                    gw7[] gw7VarArr2 = OptionalModuleUtils.EMPTY_FEATURES;
                    return gw7VarArr;
                }
            }).d(new iid() { // from class: com.google.mlkit.common.sdkinternal.zzr
                @Override // defpackage.iid
                public final void onFailure(Exception exc) {
                    m0.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).a;
        } catch (InterruptedException | ExecutionException e) {
            m0.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e);
            return false;
        }
    }

    public static void requestDownload(Context context, final gw7[] gw7VarArr) {
        Task doRead;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fld() { // from class: com.google.mlkit.common.sdkinternal.zzo
            @Override // defpackage.fld
            public final gw7[] getOptionalFeatures() {
                gw7[] gw7VarArr2 = OptionalModuleUtils.EMPTY_FEATURES;
                return gw7VarArr;
            }
        });
        arn.a("APIs must not be empty.", !arrayList.isEmpty());
        cy7 cy7Var = new cy7(context, null, cy7.f, ad0.U, zw8.c, 4);
        td0 O = td0.O(arrayList, true);
        if (O.a.isEmpty()) {
            doRead = Tasks.d(new xjc(0, false));
        } else {
            di1 a = dpi.a();
            a.e = new gw7[]{q3l.a};
            a.c = true;
            a.b = 27304;
            a.d = new r3l(0, cy7Var, O);
            doRead = cy7Var.doRead(a.a());
        }
        doRead.d(new iid() { // from class: com.google.mlkit.common.sdkinternal.zzp
            @Override // defpackage.iid
            public final void onFailure(Exception exc) {
                m0.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    private static gw7[] zza(Map map, List list) {
        gw7[] gw7VarArr = new gw7[list.size()];
        for (int i = 0; i < list.size(); i++) {
            gw7 gw7Var = (gw7) map.get(list.get(i));
            arn.h(gw7Var);
            gw7VarArr[i] = gw7Var;
        }
        return gw7VarArr;
    }

    @Deprecated
    public static boolean areAllRequiredModulesAvailable(Context context, List<String> list) {
        a.b.getClass();
        if (pz8.a(context) >= 221500000) {
            return areAllRequiredModulesAvailable(context, zza(zzb, list));
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                m57.c(context, m57.b, it.next());
            }
            return true;
        } catch (j57 unused) {
            return false;
        }
    }

    @Deprecated
    public static void requestDownload(Context context, String str) {
        requestDownload(context, zzaf.zzh(str));
    }

    @Deprecated
    public static void requestDownload(Context context, List<String> list) {
        a.b.getClass();
        if (pz8.a(context) >= 221500000) {
            requestDownload(context, zza(zza, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }
}
