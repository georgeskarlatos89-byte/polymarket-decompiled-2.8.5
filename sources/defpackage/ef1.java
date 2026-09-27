package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ef1 implements km9 {
    public final Bitmap a;

    public ef1(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.km9
    public final boolean a() {
        return true;
    }

    @Override // defpackage.km9
    public final void b(Canvas canvas) {
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ef1) && Intrinsics.areEqual(this.a, ((ef1) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.km9
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.km9
    public final long getSize() {
        int i;
        int i2;
        Bitmap bitmap = this.a;
        if (!bitmap.isRecycled()) {
            try {
                i2 = bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i = 2;
                } else if (config == Bitmap.Config.RGBA_F16) {
                    i = 8;
                } else {
                    i = 4;
                }
                i2 = i * height;
            }
            return i2;
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    @Override // defpackage.km9
    public final int getWidth() {
        return this.a.getWidth();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.a + ", shareable=true)";
    }
}
