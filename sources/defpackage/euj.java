package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class euj implements alk {
    public final alk a;
    public final alk b;

    public euj(alk alkVar, alk alkVar2) {
        this.a = alkVar;
        this.b = alkVar2;
    }

    @Override // defpackage.alk
    public final int a(il6 il6Var) {
        return Math.max(this.a.a(il6Var), this.b.a(il6Var));
    }

    @Override // defpackage.alk
    public final int b(il6 il6Var, owa owaVar) {
        return Math.max(this.a.b(il6Var, owaVar), this.b.b(il6Var, owaVar));
    }

    @Override // defpackage.alk
    public final int c(il6 il6Var) {
        return Math.max(this.a.c(il6Var), this.b.c(il6Var));
    }

    @Override // defpackage.alk
    public final int d(il6 il6Var, owa owaVar) {
        return Math.max(this.a.d(il6Var, owaVar), this.b.d(il6Var, owaVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euj)) {
            return false;
        }
        euj eujVar = (euj) obj;
        if (Intrinsics.areEqual(eujVar.a, this.a) && Intrinsics.areEqual(eujVar.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
