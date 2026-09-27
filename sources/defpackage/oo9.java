package defpackage;

import androidx.camera.core.ImageProcessingUtil;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class oo9 implements ll8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ to9 b;

    public /* synthetic */ oo9(to9 to9Var, to9 to9Var2, int i) {
        this.a = i;
        this.b = to9Var2;
    }

    @Override // defpackage.ll8
    public final void a(ml8 ml8Var) {
        int i = this.a;
        to9 to9Var = this.b;
        switch (i) {
            case 0:
                int i2 = ImageProcessingUtil.a;
                to9Var.close();
                return;
            default:
                int i3 = ImageProcessingUtil.a;
                to9Var.close();
                return;
        }
    }
}
