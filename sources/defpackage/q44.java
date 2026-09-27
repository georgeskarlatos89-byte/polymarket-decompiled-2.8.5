package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q44 {
    public final int a;
    public final Method b;

    public q44(Method method, int i) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q44) {
                q44 q44Var = (q44) obj;
                if (this.a == q44Var.a && this.b.getName().equals(q44Var.b.getName())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
