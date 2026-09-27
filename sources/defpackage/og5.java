package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class og5 extends ke7 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og5(je7 je7Var, int i) {
        super(je7Var);
        this.e = i;
    }

    @Override // defpackage.ke7
    public void q() {
        switch (this.e) {
            case 0:
                je7 je7Var = this.b;
                je7Var.o = null;
                CheckableImageButton checkableImageButton = je7Var.g;
                checkableImageButton.setOnLongClickListener(null);
                j4m.e(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
