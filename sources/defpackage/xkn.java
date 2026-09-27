package defpackage;

import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class xkn {
    public static final String a(KClass kClass) {
        if (kClass != null) {
            return kClass.getQualifiedName();
        }
        return null;
    }

    public static final void b(iah iahVar, qj0 qj0Var, int i) {
        while (true) {
            int i2 = iahVar.v;
            if (i <= i2 || i >= iahVar.u) {
                if (i2 == 0 && i == 0) {
                    return;
                }
                iahVar.N();
                if (iahVar.x(iahVar.v)) {
                    qj0Var.q();
                }
                iahVar.i();
            } else {
                return;
            }
        }
    }
}
