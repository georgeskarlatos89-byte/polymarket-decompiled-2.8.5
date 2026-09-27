package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ed implements alk {
    public final alk a;
    public final nqd b;

    public ed(alk alkVar, nqd nqdVar) {
        this.a = alkVar;
        this.b = nqdVar;
    }

    @Override // defpackage.alk
    public final int a(il6 il6Var) {
        return this.b.a(il6Var) + this.a.a(il6Var);
    }

    @Override // defpackage.alk
    public final int b(il6 il6Var, owa owaVar) {
        return this.b.b(il6Var, owaVar) + this.a.b(il6Var, owaVar);
    }

    @Override // defpackage.alk
    public final int c(il6 il6Var) {
        return this.b.c(il6Var) + this.a.c(il6Var);
    }

    @Override // defpackage.alk
    public final int d(il6 il6Var, owa owaVar) {
        return this.b.d(il6Var, owaVar) + this.a.d(il6Var, owaVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ed) {
                ed edVar = (ed) obj;
                if (Intrinsics.areEqual(edVar.a, this.a) && Intrinsics.areEqual(edVar.b, this.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.b.a.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ')';
    }
}
