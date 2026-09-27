package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.sentry.android.core.m0;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class arl {
    public static final k17 a = new uwn(24);

    public static if1 a(hf1 hf1Var, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    m0.p("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                }
            } else if (i2 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    m0.p("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else {
                if (current.getIntrinsicWidth() > 0) {
                    i = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i2 = current.getIntrinsicHeight();
                }
                Lock lock = pbj.d;
                lock.lock();
                Bitmap p = hf1Var.p(i, i2, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(p);
                    current.setBounds(0, 0, i, i2);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = p;
                    z = true;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
            bitmap = null;
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            hf1Var = a;
        }
        return if1.a(hf1Var, bitmap);
    }

    public static final String b(pq4 pq4Var, int i) {
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.l(AndroidCompositionLocals_androidKt.a);
        return ((Context) sr8Var.l(AndroidCompositionLocals_androidKt.b)).getResources().getString(i);
    }
}
