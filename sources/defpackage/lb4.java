package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lb4 implements km9 {
    public Paint a;

    @Override // defpackage.km9
    public final boolean a() {
        return true;
    }

    @Override // defpackage.km9
    public final void b(Canvas canvas) {
        Paint paint = this.a;
        if (paint == null) {
            paint = new Paint();
            paint.setColor(0);
            this.a = paint;
        }
        canvas.drawPaint(paint);
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof lb4)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.km9
    public final int getHeight() {
        return -1;
    }

    @Override // defpackage.km9
    public final long getSize() {
        return 0L;
    }

    @Override // defpackage.km9
    public final int getWidth() {
        return -1;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + woa.d(-992, 31, 0L);
    }

    public final String toString() {
        return "ColorImage(color=0, width=-1, height=-1, size=0, shareable=true)";
    }
}
