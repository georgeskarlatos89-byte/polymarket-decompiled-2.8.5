package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxi1;", "Lqjc;", "Lyi1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class xi1 extends qjc {
    public final jn a;
    public final boolean b;
    public final Function1 c;

    public xi1(jn jnVar, boolean z, Function1 function1) {
        this.a = jnVar;
        this.b = z;
        this.c = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yi1, jjc] */
    @Override // defpackage.qjc
    public final jjc create() {
        ?? jjcVar = new jjc();
        jjcVar.o = this.a;
        jjcVar.p = this.b;
        return jjcVar;
    }

    public final boolean equals(Object obj) {
        xi1 xi1Var;
        if (this != obj) {
            if (obj instanceof xi1) {
                xi1Var = (xi1) obj;
            } else {
                xi1Var = null;
            }
            if (xi1Var != null && Intrinsics.areEqual(this.a, xi1Var.a) && this.b == xi1Var.b) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.qjc
    public final void inspectableProperties(zz9 zz9Var) {
        this.c.invoke(zz9Var);
    }

    @Override // defpackage.qjc
    public final void update(jjc jjcVar) {
        yi1 yi1Var = (yi1) jjcVar;
        yi1Var.o = this.a;
        yi1Var.p = this.b;
    }
}
