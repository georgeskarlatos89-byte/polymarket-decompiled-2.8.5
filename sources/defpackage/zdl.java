package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zdl {
    public transient jcl a;
    public transient u3 b;

    public final Map a() {
        u3 u3Var = this.b;
        if (u3Var == null) {
            eel eelVar = (eel) this;
            u3 u3Var2 = new u3(eelVar, eelVar.c, 2);
            this.b = u3Var2;
            return u3Var2;
        }
        return u3Var;
    }

    public final Set b() {
        jcl jclVar = this.a;
        if (jclVar == null) {
            eel eelVar = (eel) this;
            jcl jclVar2 = new jcl(eelVar, eelVar.c);
            this.a = jclVar2;
            return jclVar2;
        }
        return jclVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zdl)) {
            return false;
        }
        return a().equals(((zdl) obj).a());
    }

    public final int hashCode() {
        return ((u3) a()).b.hashCode();
    }

    public final String toString() {
        return ((u3) a()).b.toString();
    }
}
