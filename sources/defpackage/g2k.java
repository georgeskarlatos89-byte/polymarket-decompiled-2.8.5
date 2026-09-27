package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class g2k {
    public static final hj7 a(gp9 gp9Var, Throwable th) {
        km9 km9Var;
        if (th instanceof scd) {
            Function1 function1 = gp9Var.o;
            dp9 dp9Var = gp9Var.u;
            km9Var = (km9) function1.invoke(gp9Var);
            if (km9Var == null) {
                km9Var = (km9) dp9Var.j.invoke(gp9Var);
            }
            if (km9Var == null && (km9Var = (km9) gp9Var.n.invoke(gp9Var)) == null) {
                km9Var = (km9) dp9Var.i.invoke(gp9Var);
            }
        } else {
            km9Var = (km9) gp9Var.n.invoke(gp9Var);
            if (km9Var == null) {
                km9Var = (km9) gp9Var.u.i.invoke(gp9Var);
            }
        }
        return new hj7(km9Var, gp9Var, th);
    }
}
