package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class u3f {
    public Size a;
    public final FrameLayout b;
    public final o3f c;
    public boolean d = false;

    public u3f(FrameLayout frameLayout, o3f o3fVar) {
        this.b = frameLayout;
        this.c = o3fVar;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void c();

    public abstract void d();

    public abstract void e(lei leiVar, gy gyVar);

    public final void f() {
        boolean z;
        int i;
        View a = a();
        if (a != null && this.d) {
            FrameLayout frameLayout = this.b;
            Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
            int layoutDirection = frameLayout.getLayoutDirection();
            o3f o3fVar = this.c;
            o3fVar.getClass();
            if (size.getHeight() != 0 && size.getWidth() != 0) {
                if (o3fVar.f()) {
                    if (a instanceof TextureView) {
                        ((TextureView) a).setTransform(o3fVar.d());
                    } else {
                        Display display = a.getDisplay();
                        boolean z2 = false;
                        if (o3fVar.g && display != null && display.getRotation() != o3fVar.e) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z3 = o3fVar.g;
                        if (!z3) {
                            if (!z3) {
                                i = o3fVar.c;
                            } else {
                                i = -rkn.d(o3fVar.e);
                            }
                            if (i != 0) {
                                z2 = true;
                            }
                        }
                        if (z || z2) {
                            o9n.b("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                        }
                    }
                    RectF e = o3fVar.e(size, layoutDirection);
                    a.setPivotX(0.0f);
                    a.setPivotY(0.0f);
                    a.setScaleX(e.width() / o3fVar.a.getWidth());
                    a.setScaleY(e.height() / o3fVar.a.getHeight());
                    a.setTranslationX(e.left - a.getLeft());
                    a.setTranslationY(e.top - a.getTop());
                    return;
                }
                return;
            }
            o9n.f("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
        }
    }

    public abstract ujb g();
}
