package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class pp4 {
    public static final boolean a(Function0 function0, Throwable th) {
        uq6 uq6Var;
        th.getClass();
        List b = wum.a.b(th);
        int size = b.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) b.get(i)) instanceof uq6) {
                return false;
            }
        }
        try {
            lp4 lp4Var = (lp4) function0.invoke();
            if (lp4Var != null) {
                boolean z2 = lp4Var.b;
                List list = lp4Var.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((op4) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                lp4Var.getClass();
                uq6Var = new uq6(lp4Var);
            } else {
                uq6Var = null;
            }
        } catch (Throwable th2) {
            uq6Var = th2;
        }
        if (uq6Var != null) {
            gp7.a(th, uq6Var);
        }
        return z;
    }
}
