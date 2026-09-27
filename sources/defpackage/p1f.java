package defpackage;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class p1f implements o1f, Serializable {
    public final List a;

    public p1f(List list) {
        this.a = list;
    }

    @Override // defpackage.o1f
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i < list.size()) {
                if (!((o1f) list.get(i)).apply(obj)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1f) {
            return this.a.equals(((p1f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
