package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.accompanist.drawablepainter.DrawablePainter;
import kotlin.Lazy;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o90 implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        long j;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((s90) obj).invalidateSelf();
                return;
            default:
                drawable.getClass();
                DrawablePainter drawablePainter = (DrawablePainter) obj;
                kvd kvdVar = drawablePainter.g;
                kvdVar.setValue(Integer.valueOf(((Number) kvdVar.getValue()).intValue() + 1));
                Drawable drawable2 = drawablePainter.f;
                Lazy lazy = h17.a;
                if (drawable2.getIntrinsicWidth() >= 0 && drawable2.getIntrinsicHeight() >= 0) {
                    j = yhl.a(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                } else {
                    j = 9205357640488583168L;
                }
                drawablePainter.h.setValue(new d9h(j));
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((s90) this.b).scheduleSelf(runnable, j);
                return;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) h17.a.getValue()).postAtTime(runnable, j);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((s90) this.b).unscheduleSelf(runnable);
                return;
            default:
                drawable.getClass();
                runnable.getClass();
                ((Handler) h17.a.getValue()).removeCallbacks(runnable);
                return;
        }
    }
}
