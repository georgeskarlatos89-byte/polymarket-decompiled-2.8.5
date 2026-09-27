package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class s28 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f48 b;

    public /* synthetic */ s28(f48 f48Var, int i) {
        this.a = i;
        this.b = f48Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        f48 f48Var = this.b;
        switch (i) {
            case 0:
                return f48Var.b;
            default:
                return f48Var.c;
        }
    }
}
