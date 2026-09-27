package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class lsb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fv1 b;

    public /* synthetic */ lsb(fv1 fv1Var, int i) {
        this.a = i;
        this.b = fv1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gh9 gh9Var = (gh9) obj;
        switch (this.a) {
            case 0:
                gh9Var.getClass();
                return this.b;
            default:
                return this.b;
        }
    }
}
