package defpackage;

import android.os.Trace;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class x1b {
    public final Function1 a;
    public af9 c;
    public int f;
    public final x99 b = new x99(17);
    public int d = -1;
    public int e = -1;

    public x1b(Function1 function1) {
        this.a = function1;
    }

    public final v1b a(int i, long j, boolean z, Function1 function1) {
        af9 af9Var = this.c;
        if (af9Var != null) {
            o2f o2fVar = (o2f) af9Var.e;
            boolean z2 = o2fVar instanceof a50;
            m2f m2fVar = new m2f(af9Var, i, this.b, function1);
            m2fVar.d = new rz4(j);
            if (z2) {
                if (z) {
                    a50 a50Var = (a50) o2fVar;
                    a50Var.b.add(new l6f(1, m2fVar));
                    if (!a50Var.c) {
                        a50Var.c = true;
                        a50Var.a.post(a50Var);
                    }
                } else {
                    a50 a50Var2 = (a50) o2fVar;
                    a50Var2.b.add(new l6f(0, m2fVar));
                    if (!a50Var2.c) {
                        a50Var2.c = true;
                        a50Var2.a.post(a50Var2);
                    }
                }
            } else {
                o2fVar.a(m2fVar);
            }
            Trace.setCounter("compose:lazy:schedule_prefetch:index", i);
            return m2fVar;
        }
        return y37.a;
    }
}
