package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class mdl {
    public transient d6l a;
    public transient u3 b;

    public final Map a() {
        u3 u3Var = this.b;
        if (u3Var == null) {
            qdl qdlVar = (qdl) this;
            u3 u3Var2 = new u3(qdlVar, qdlVar.c, 1);
            this.b = u3Var2;
            return u3Var2;
        }
        return u3Var;
    }

    public final Set b() {
        d6l d6lVar = this.a;
        if (d6lVar == null) {
            qdl qdlVar = (qdl) this;
            d6l d6lVar2 = new d6l(qdlVar, qdlVar.c);
            this.a = d6lVar2;
            return d6lVar2;
        }
        return d6lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mdl)) {
            return false;
        }
        return a().equals(((mdl) obj).a());
    }

    public final int hashCode() {
        return ((u3) a()).b.hashCode();
    }

    public final String toString() {
        return ((u3) a()).b.toString();
    }
}
