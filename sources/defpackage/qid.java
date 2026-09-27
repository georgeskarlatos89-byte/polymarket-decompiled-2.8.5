package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqid;", "Lqjc;", "Lrid;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class qid extends qjc {
    public final Function1 a;

    public qid(Function1 function1) {
        this.a = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jjc, rid] */
    @Override // defpackage.qjc
    public final jjc create() {
        ?? jjcVar = new jjc();
        jjcVar.o = this.a;
        jjcVar.p = -9223372034707292160L;
        return jjcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qid)) {
            return false;
        }
        if (this.a == ((qid) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.qjc
    public final void inspectableProperties(zz9 zz9Var) {
        zz9Var.a = "onSizeChanged";
        zz9Var.c.c(this.a, "onSizeChanged");
    }

    @Override // defpackage.qjc
    public final void update(jjc jjcVar) {
        rid ridVar = (rid) jjcVar;
        ridVar.o = this.a;
        ridVar.p = -9223372034707292160L;
    }
}
