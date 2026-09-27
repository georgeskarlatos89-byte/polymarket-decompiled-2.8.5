package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e98 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h98 b;

    public /* synthetic */ e98(h98 h98Var, int i) {
        this.a = i;
        this.b = h98Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        h98 h98Var = this.b;
        switch (i) {
            case 0:
                ra8 ra8Var = h98Var.h;
                if (ra8Var instanceof pa8) {
                    y7k a = h98Var.a();
                    if (a != null) {
                        a.g();
                    }
                    h98Var.g(((pa8) ra8Var).a);
                    y7k a2 = h98Var.a();
                    if (a2 != null) {
                        a2.i();
                    }
                } else if (ra8Var instanceof oa8) {
                    y7k a3 = h98Var.a();
                    if (a3 != null) {
                        a3.f();
                    }
                    h98Var.h(((oa8) ra8Var).a);
                    y7k a4 = h98Var.a();
                    if (a4 != null) {
                        a4.i();
                    }
                } else if (ra8Var instanceof qa8) {
                    y7k a5 = h98Var.a();
                    if (a5 != null) {
                        a5.f();
                    }
                    h98Var.o = true;
                    h98Var.n((qa8) ra8Var);
                } else if (ra8Var != null) {
                    dmk.a();
                    return null;
                }
                return Unit.INSTANCE;
            case 1:
                ra8 ra8Var2 = h98Var.h;
                if (ra8Var2 != null) {
                    h98Var.i = j98.a;
                    h98Var.m(null);
                    h98Var.o = true;
                    h98Var.m = null;
                    if (ra8Var2 instanceof pa8) {
                        h98Var.g(((pa8) ra8Var2).a);
                    } else if (ra8Var2 instanceof oa8) {
                        h98Var.h(((oa8) ra8Var2).a);
                    } else if (ra8Var2 instanceof qa8) {
                        h98Var.n((qa8) ra8Var2);
                    } else {
                        dmk.a();
                        return null;
                    }
                    y7k a6 = h98Var.a();
                    if (a6 != null) {
                        a6.i();
                    }
                }
                return Unit.INSTANCE;
            default:
                return Boolean.valueOf(h98Var.f());
        }
    }
}
