package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class vj6 extends jjc {
    public final int o = y8d.e(this);
    public jjc p;

    @Override // defpackage.jjc
    public final void S0() {
        super.S0();
        for (jjc jjcVar = this.p; jjcVar != null; jjcVar = jjcVar.f) {
            jjcVar.b1(this.h);
            if (!jjcVar.n) {
                jjcVar.S0();
            }
        }
    }

    @Override // defpackage.jjc
    public final void T0() {
        for (jjc jjcVar = this.p; jjcVar != null; jjcVar = jjcVar.f) {
            jjcVar.T0();
        }
        super.T0();
    }

    @Override // defpackage.jjc
    public final void X0() {
        super.X0();
        for (jjc jjcVar = this.p; jjcVar != null; jjcVar = jjcVar.f) {
            jjcVar.X0();
        }
    }

    @Override // defpackage.jjc
    public final void Y0() {
        for (jjc jjcVar = this.p; jjcVar != null; jjcVar = jjcVar.f) {
            jjcVar.Y0();
        }
        super.Y0();
    }

    @Override // defpackage.jjc
    public final void Z0() {
        super.Z0();
        for (jjc jjcVar = this.p; jjcVar != null; jjcVar = jjcVar.f) {
            jjcVar.Z0();
        }
    }

    @Override // defpackage.jjc
    public final void a1(jjc jjcVar) {
        this.a = jjcVar;
        for (jjc jjcVar2 = this.p; jjcVar2 != null; jjcVar2 = jjcVar2.f) {
            jjcVar2.a1(jjcVar);
        }
    }

    @Override // defpackage.jjc
    public final void b1(x8d x8dVar) {
        this.h = x8dVar;
        for (jjc jjcVar = this.p; jjcVar != null; jjcVar = jjcVar.f) {
            jjcVar.b1(x8dVar);
        }
    }

    public final mj6 c1(mj6 mj6Var) {
        jjc jjcVar;
        jjc jjcVar2;
        jjc jjcVar3 = ((jjc) mj6Var).a;
        if (jjcVar3 != mj6Var) {
            if (mj6Var instanceof jjc) {
                jjcVar = (jjc) mj6Var;
            } else {
                jjcVar = null;
            }
            if (jjcVar != null) {
                jjcVar2 = jjcVar.e;
            } else {
                jjcVar2 = null;
            }
            if (jjcVar3 != this.a || !Intrinsics.areEqual(jjcVar2, this)) {
                dmk.n("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (jjcVar3.n) {
                kw9.c("Cannot delegate to an already attached node");
            }
            jjcVar3.a1(this.a);
            int i = this.c;
            int f = y8d.f(jjcVar3);
            jjcVar3.c = f;
            int i2 = this.c;
            int i3 = f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof ywa)) {
                kw9.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + jjcVar3);
            }
            jjcVar3.f = this.p;
            this.p = jjcVar3;
            jjcVar3.e = this;
            e1(f | this.c, false);
            if (this.n) {
                if (i3 != 0 && (i & 2) == 0) {
                    r8d r8dVar = nj6.h(this).G;
                    this.a.b1(null);
                    r8dVar.g();
                } else {
                    b1(this.h);
                }
                jjcVar3.S0();
                jjcVar3.Y0();
                if (!jjcVar3.n) {
                    kw9.c("autoInvalidateInsertedNode called on unattached node");
                }
                y8d.a(jjcVar3, -1, 1);
            }
        }
        return mj6Var;
    }

    public final void d1(mj6 mj6Var) {
        jjc jjcVar = null;
        for (jjc jjcVar2 = this.p; jjcVar2 != null; jjcVar2 = jjcVar2.f) {
            if (jjcVar2 == mj6Var) {
                boolean z = jjcVar2.n;
                if (z) {
                    rpc rpcVar = y8d.a;
                    if (!z) {
                        kw9.c("autoInvalidateRemovedNode called on unattached node");
                    }
                    y8d.a(jjcVar2, -1, 2);
                    jjcVar2.Z0();
                    jjcVar2.T0();
                }
                jjcVar2.a1(jjcVar2);
                jjcVar2.d = 0;
                jjc jjcVar3 = jjcVar2.f;
                if (jjcVar == null) {
                    this.p = jjcVar3;
                } else {
                    jjcVar.f = jjcVar3;
                }
                jjcVar2.f = null;
                jjcVar2.e = null;
                int i = this.c;
                int f = y8d.f(this);
                e1(f, true);
                if (this.n && (i & 2) != 0 && (f & 2) == 0) {
                    r8d r8dVar = nj6.h(this).G;
                    this.a.b1(null);
                    r8dVar.g();
                    return;
                }
                return;
            }
            jjcVar = jjcVar2;
        }
        f05.g(mj6Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [jjc] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void e1(int i, boolean z) {
        int i2;
        jjc jjcVar;
        int i3 = this.c;
        this.c = i;
        if (i3 != i) {
            jjc jjcVar2 = this.a;
            if (jjcVar2 == this) {
                this.d = i;
            }
            boolean z2 = this.n;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.c;
                    r2.c = i;
                    if (r2 == jjcVar2) {
                        break;
                    } else {
                        r2 = r2.e;
                    }
                }
                if (z && r2 == jjcVar2) {
                    i = y8d.f(jjcVar2);
                    jjcVar2.c = i;
                }
                if (r2 != 0 && (jjcVar = r2.f) != null) {
                    i2 = jjcVar.d;
                } else {
                    i2 = 0;
                }
                int i4 = i | i2;
                for (jjc jjcVar3 = r2; jjcVar3 != null; jjcVar3 = jjcVar3.e) {
                    i4 |= jjcVar3.c;
                    jjcVar3.d = i4;
                }
            }
        }
    }
}
