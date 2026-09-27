package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ib3 extends jf1 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(rma.a);

    @Override // defpackage.rma
    public final boolean equals(Object obj) {
        return obj instanceof ib3;
    }

    @Override // defpackage.rma
    public final int hashCode() {
        return -599754482;
    }

    @Override // defpackage.jf1
    public final Bitmap transform(hf1 hf1Var, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = pbj.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap p = hf1Var.p(i, i2, config);
        p.setHasAlpha(bitmap.hasAlpha());
        pbj.a(bitmap, p, matrix);
        return p;
    }

    @Override // defpackage.rma
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
