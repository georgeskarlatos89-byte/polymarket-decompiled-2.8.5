package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ln7k;", "Lqjc;", "Lo7k;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n7k extends qjc {
    public final gd1 a;

    public n7k(gd1 gd1Var) {
        this.a = gd1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jjc, o7k] */
    @Override // defpackage.qjc
    public final jjc create() {
        ?? jjcVar = new jjc();
        jjcVar.o = this.a;
        return jjcVar;
    }

    public final boolean equals(Object obj) {
        n7k n7kVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof n7k) {
            n7kVar = (n7k) obj;
        } else {
            n7kVar = null;
        }
        if (n7kVar == null) {
            return false;
        }
        return Intrinsics.areEqual(this.a, n7kVar.a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }

    @Override // defpackage.qjc
    public final void inspectableProperties(zz9 zz9Var) {
        zz9Var.a = "align";
        zz9Var.b = this.a;
    }

    @Override // defpackage.qjc
    public final void update(jjc jjcVar) {
        ((o7k) jjcVar).o = this.a;
    }
}
