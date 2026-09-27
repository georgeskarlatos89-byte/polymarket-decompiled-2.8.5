package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzxa;", "Lqjc;", "Laya;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class zxa extends qjc {
    public final float a;
    public final boolean b;

    public zxa(boolean z, float f) {
        this.a = f;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jjc, aya] */
    @Override // defpackage.qjc
    public final jjc create() {
        ?? jjcVar = new jjc();
        jjcVar.o = this.a;
        jjcVar.p = this.b;
        return jjcVar;
    }

    public final boolean equals(Object obj) {
        zxa zxaVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof zxa) {
            zxaVar = (zxa) obj;
        } else {
            zxaVar = null;
        }
        if (zxaVar != null && this.a == zxaVar.a && this.b == zxaVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.qjc
    public final void inspectableProperties(zz9 zz9Var) {
        zz9Var.a = "weight";
        float f = this.a;
        zz9Var.b = Float.valueOf(f);
        tl0 tl0Var = zz9Var.c;
        tl0Var.c(Float.valueOf(f), "weight");
        tl0Var.c(Boolean.valueOf(this.b), "fill");
    }

    @Override // defpackage.qjc
    public final void update(jjc jjcVar) {
        aya ayaVar = (aya) jjcVar;
        ayaVar.o = this.a;
        ayaVar.p = this.b;
    }
}
