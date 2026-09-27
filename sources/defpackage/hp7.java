package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hp7 implements alk {
    public final alk a;
    public final alk b;

    public hp7(alk alkVar, alk alkVar2) {
        this.a = alkVar;
        this.b = alkVar2;
    }

    @Override // defpackage.alk
    public final int a(il6 il6Var) {
        int a = this.a.a(il6Var) - this.b.a(il6Var);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // defpackage.alk
    public final int b(il6 il6Var, owa owaVar) {
        int b = this.a.b(il6Var, owaVar) - this.b.b(il6Var, owaVar);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // defpackage.alk
    public final int c(il6 il6Var) {
        int c = this.a.c(il6Var) - this.b.c(il6Var);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // defpackage.alk
    public final int d(il6 il6Var, owa owaVar) {
        int d = this.a.d(il6Var, owaVar) - this.b.d(il6Var, owaVar);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp7)) {
            return false;
        }
        hp7 hp7Var = (hp7) obj;
        if (Intrinsics.areEqual(hp7Var.a, this.a) && Intrinsics.areEqual(hp7Var.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
