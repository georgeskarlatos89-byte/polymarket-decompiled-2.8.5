package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r24 extends jf1 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(rma.a);

    @Override // defpackage.rma
    public final boolean equals(Object obj) {
        return obj instanceof r24;
    }

    @Override // defpackage.rma
    public final int hashCode() {
        return 1101716364;
    }

    @Override // defpackage.jf1
    public final Bitmap transform(hf1 hf1Var, Bitmap bitmap, int i, int i2) {
        Bitmap.Config config;
        Bitmap p;
        Lock lock = pbj.d;
        int min = Math.min(i, i2);
        float f = min;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
        if (config2.equals(bitmap.getConfig())) {
            config = config2;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            p = bitmap;
        } else {
            p = hf1Var.p(bitmap.getWidth(), bitmap.getHeight(), config);
            new Canvas(p).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        if (!config2.equals(bitmap.getConfig())) {
            config2 = Bitmap.Config.ARGB_8888;
        }
        Bitmap p2 = hf1Var.p(min, min, config2);
        p2.setHasAlpha(true);
        lock.lock();
        try {
            Canvas canvas = new Canvas(p2);
            canvas.drawCircle(f2, f2, f2, pbj.b);
            canvas.drawBitmap(p, (Rect) null, rectF, pbj.c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!p.equals(bitmap)) {
                hf1Var.c(p);
            }
            return p2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // defpackage.rma
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
