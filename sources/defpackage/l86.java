package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class l86 {
    public final c8i a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public l86(c8i c8iVar, boolean z, boolean z2, boolean z3) {
        c8iVar.getClass();
        this.a = c8iVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean a() {
        if (!this.a.z0()) {
            pw7 pw7Var = pw7.a;
            rw7 rw7Var = rw7.a;
            if (Intrinsics.areEqual(rw7Var, pw7Var)) {
                return false;
            }
            if (Intrinsics.areEqual(rw7Var, qw7.a)) {
                return true;
            }
            if (!Intrinsics.areEqual(rw7Var, rw7Var)) {
                dmk.a();
                return false;
            }
        }
        return this.b;
    }

    public final boolean b() {
        if (this.a.z0()) {
            return a();
        }
        pw7 pw7Var = pw7.a;
        rw7 rw7Var = rw7.a;
        if (Intrinsics.areEqual(rw7Var, pw7Var)) {
            return false;
        }
        if (Intrinsics.areEqual(rw7Var, qw7.a)) {
            return true;
        }
        if (Intrinsics.areEqual(rw7Var, rw7Var)) {
            return a();
        }
        dmk.a();
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l86(bdb bdbVar) {
        this(bdbVar.a, bdbVar.p, bdbVar.q, bdbVar.r);
        bdbVar.getClass();
    }
}
