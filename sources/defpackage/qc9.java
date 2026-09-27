package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqc9;", "Lqjc;", "Lrc9;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class qc9 extends qjc {
    public final fd1 a;

    public qc9(fd1 fd1Var) {
        this.a = fd1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jjc, rc9] */
    @Override // defpackage.qjc
    public final jjc create() {
        ?? jjcVar = new jjc();
        jjcVar.o = this.a;
        return jjcVar;
    }

    public final boolean equals(Object obj) {
        qc9 qc9Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof qc9) {
            qc9Var = (qc9) obj;
        } else {
            qc9Var = null;
        }
        if (qc9Var == null) {
            return false;
        }
        return Intrinsics.areEqual(this.a, qc9Var.a);
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
        ((rc9) jjcVar).o = this.a;
    }
}
