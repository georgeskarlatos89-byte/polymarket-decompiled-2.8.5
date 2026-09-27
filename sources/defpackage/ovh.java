package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ovh implements c5k {
    public final c5k a;
    public final long b;

    public ovh(c5k c5kVar, long j) {
        this.a = c5kVar;
        this.b = j;
    }

    @Override // defpackage.c5k
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.c5k
    public final long d(sa0 sa0Var, sa0 sa0Var2, sa0 sa0Var3) {
        return this.a.d(sa0Var, sa0Var2, sa0Var3) + this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ovh)) {
            return false;
        }
        ovh ovhVar = (ovh) obj;
        if (ovhVar.b != this.b || !Intrinsics.areEqual(ovhVar.a, this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.c5k
    public final sa0 r(long j, sa0 sa0Var, sa0 sa0Var2, sa0 sa0Var3) {
        long j2 = this.b;
        if (j < j2) {
            return sa0Var3;
        }
        return this.a.r(j - j2, sa0Var, sa0Var2, sa0Var3);
    }

    @Override // defpackage.c5k
    public final sa0 u(long j, sa0 sa0Var, sa0 sa0Var2, sa0 sa0Var3) {
        long j2 = this.b;
        if (j < j2) {
            return sa0Var;
        }
        return this.a.u(j - j2, sa0Var, sa0Var2, sa0Var3);
    }
}
