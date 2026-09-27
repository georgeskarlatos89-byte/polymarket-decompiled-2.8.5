package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nvh implements la0 {
    public final la0 a;
    public final long b;

    public nvh(h58 h58Var, long j) {
        this.a = h58Var;
        this.b = j;
    }

    @Override // defpackage.la0
    public final c5k a(tfj tfjVar) {
        return new ovh(this.a.a(tfjVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nvh)) {
            return false;
        }
        nvh nvhVar = (nvh) obj;
        if (nvhVar.b != this.b || !Intrinsics.areEqual(nvhVar.a, this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
