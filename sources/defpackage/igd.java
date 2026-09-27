package defpackage;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class igd extends gaa {
    public final h81 o;

    public igd(h81 h81Var, foa foaVar, LinkedHashSet linkedHashSet, fn fnVar, String str, URI uri, h81 h81Var2, h81 h81Var3, LinkedList linkedList, Date date, Date date2, Date date3, pna pnaVar) {
        super(zna.d, foaVar, linkedHashSet, fnVar, str, uri, h81Var2, h81Var3, linkedList, date, date2, date3, pnaVar);
        Objects.requireNonNull(h81Var, "The key value must not be null");
        this.o = h81Var;
    }

    @Override // defpackage.gaa
    public final boolean b() {
        return true;
    }

    @Override // defpackage.gaa
    public final HashMap d() {
        HashMap d = super.d();
        d.put("k", this.o.a);
        return d;
    }

    @Override // defpackage.gaa
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igd) || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.o, ((igd) obj).o);
    }

    @Override // defpackage.gaa
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.o);
    }
}
