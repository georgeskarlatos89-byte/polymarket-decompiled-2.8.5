package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class s24 implements nbj {
    public final String a = s24.class.getName();

    public final boolean equals(Object obj) {
        return obj instanceof s24;
    }

    @Override // defpackage.nbj
    public final String getCacheKey() {
        return this.a;
    }

    public final int hashCode() {
        return s24.class.hashCode();
    }

    @Override // defpackage.nbj
    public final Object transform(Bitmap bitmap, b9h b9hVar, Continuation continuation) {
        Paint paint = new Paint(3);
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f = min / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f - (bitmap.getWidth() / 2.0f), f - (bitmap.getHeight() / 2.0f), paint);
        return createBitmap;
    }
}
