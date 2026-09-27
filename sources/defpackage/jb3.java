package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jb3 extends jf1 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(rma.a);

    @Override // defpackage.rma
    public final boolean equals(Object obj) {
        return obj instanceof jb3;
    }

    @Override // defpackage.rma
    public final int hashCode() {
        return -670243078;
    }

    @Override // defpackage.jf1
    public final Bitmap transform(hf1 hf1Var, Bitmap bitmap, int i, int i2) {
        Paint paint = pbj.a;
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Log.isLoggable("TransformationUtils", 2);
        return pbj.b(hf1Var, bitmap, i, i2);
    }

    @Override // defpackage.rma
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
