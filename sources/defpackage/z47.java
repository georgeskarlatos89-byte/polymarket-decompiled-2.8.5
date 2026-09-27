package defpackage;

import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z47 extends ojl {
    public final /* synthetic */ int b;

    public /* synthetic */ z47(int i) {
        this.b = i;
    }

    @Override // defpackage.ojl
    public final float b(Object obj) {
        switch (this.b) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // defpackage.ojl
    public final void f(Object obj, float f) {
        switch (this.b) {
            case 0:
                ((View) obj).setAlpha(f);
                return;
            case 1:
                ((View) obj).setScaleX(f);
                return;
            case 2:
                ((View) obj).setScaleY(f);
                return;
            case 3:
                ((View) obj).setRotation(f);
                return;
            case 4:
                ((View) obj).setRotationX(f);
                return;
            default:
                ((View) obj).setRotationY(f);
                return;
        }
    }
}
