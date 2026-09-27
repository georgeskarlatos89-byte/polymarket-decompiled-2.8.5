package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.polymarket.clients.ClientChatMessageAttachment;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ct3 {
    public static ClientChatMessageAttachment.ImageData a(Context context, Bitmap bitmap) {
        Object m882constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            File createTempFile = File.createTempFile("squad-photo-", ".jpg", context.getCacheDir());
            createTempFile.getClass();
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 82, fileOutputStream);
                fileOutputStream.close();
                String b = sg1.b(bitmap);
                String name = createTempFile.getName();
                name.getClass();
                URI uri = createTempFile.toURI();
                uri.getClass();
                m882constructorimpl = Result.m882constructorimpl(new ClientChatMessageAttachment.ImageData(name, uri, null, Double.valueOf(bitmap.getWidth()), Double.valueOf(bitmap.getHeight()), Long.valueOf(createTempFile.length()), b, null, 132, null));
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (m882constructorimpl instanceof r5g) {
            m882constructorimpl = null;
        }
        return (ClientChatMessageAttachment.ImageData) m882constructorimpl;
    }
}
