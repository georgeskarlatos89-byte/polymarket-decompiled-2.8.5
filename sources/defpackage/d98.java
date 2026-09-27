package defpackage;

import com.polymarket.data.EEventStreamSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d98 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h98 b;

    public /* synthetic */ d98(h98 h98Var, int i) {
        this.a = i;
        this.b = h98Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y7k a;
        int i = this.a;
        h98 h98Var = this.b;
        switch (i) {
            case 0:
                r98 r98Var = (r98) obj;
                r98Var.getClass();
                h98Var.b.setValue(r98Var);
                Function1 function1 = h98Var.f;
                if (function1 != null) {
                    function1.invoke(r98Var);
                }
                int i2 = f98.c[r98Var.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        EEventStreamSource eEventStreamSource = h98Var.m;
                        if (eEventStreamSource == null) {
                            ra8 ra8Var = h98Var.h;
                            if ((ra8Var instanceof qa8) && !h98Var.n) {
                                h98Var.n = true;
                                y7k a2 = h98Var.a();
                                if (a2 != null) {
                                    a2.f();
                                }
                                h98Var.n((qa8) ra8Var);
                            }
                        } else {
                            h98Var.m = null;
                            h98Var.j(eEventStreamSource);
                            if (h98Var.o && (a = h98Var.a()) != null) {
                                a.i();
                            }
                        }
                    }
                } else {
                    h98Var.n = false;
                }
                return Unit.INSTANCE;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                h98Var.d.setValue(bool);
                return Unit.INSTANCE;
        }
    }
}
