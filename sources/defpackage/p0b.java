package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp0b;", "Lqjc;", "Lq0b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class p0b extends qjc {
    public final h58 a;
    public final h58 b;
    public final h58 c;

    public p0b(h58 h58Var, h58 h58Var2, h58 h58Var3) {
        this.a = h58Var;
        this.b = h58Var2;
        this.c = h58Var3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jjc, q0b] */
    @Override // defpackage.qjc
    public final jjc create() {
        ?? jjcVar = new jjc();
        jjcVar.o = this.a;
        jjcVar.p = this.b;
        jjcVar.q = this.c;
        return jjcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0b)) {
            return false;
        }
        p0b p0bVar = (p0b) obj;
        if (Intrinsics.areEqual(this.a, p0bVar.a) && Intrinsics.areEqual(this.b, p0bVar.b) && Intrinsics.areEqual(this.c, p0bVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        h58 h58Var = this.a;
        if (h58Var == null) {
            hashCode = 0;
        } else {
            hashCode = h58Var.hashCode();
        }
        int i2 = hashCode * 31;
        h58 h58Var2 = this.b;
        if (h58Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = h58Var2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        h58 h58Var3 = this.c;
        if (h58Var3 != null) {
            i = h58Var3.hashCode();
        }
        return i3 + i;
    }

    @Override // defpackage.qjc
    public final void inspectableProperties(zz9 zz9Var) {
        zz9Var.a = "animateItem";
        tl0 tl0Var = zz9Var.c;
        tl0Var.c(this.a, "fadeInSpec");
        tl0Var.c(this.b, "placementSpec");
        tl0Var.c(this.c, "fadeOutSpec");
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.a + ", placementSpec=" + this.b + ", fadeOutSpec=" + this.c + ')';
    }

    @Override // defpackage.qjc
    public final void update(jjc jjcVar) {
        q0b q0bVar = (q0b) jjcVar;
        q0bVar.o = this.a;
        q0bVar.p = this.b;
        q0bVar.q = this.c;
    }
}
