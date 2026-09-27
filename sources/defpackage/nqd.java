package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nqd implements alk {
    public final iqd a;

    public nqd(iqd iqdVar) {
        this.a = iqdVar;
    }

    @Override // defpackage.alk
    public final int a(il6 il6Var) {
        return il6Var.O(this.a.d());
    }

    @Override // defpackage.alk
    public final int b(il6 il6Var, owa owaVar) {
        return il6Var.O(this.a.c(owaVar));
    }

    @Override // defpackage.alk
    public final int c(il6 il6Var) {
        return il6Var.O(this.a.a());
    }

    @Override // defpackage.alk
    public final int d(il6 il6Var, owa owaVar) {
        return il6Var.O(this.a.b(owaVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqd)) {
            return false;
        }
        return Intrinsics.areEqual(((nqd) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        owa owaVar = owa.Ltr;
        iqd iqdVar = this.a;
        return "PaddingValues(" + ((Object) hy6.d(iqdVar.b(owaVar))) + ", " + ((Object) hy6.d(iqdVar.d())) + ", " + ((Object) hy6.d(iqdVar.c(owaVar))) + ", " + ((Object) hy6.d(iqdVar.a())) + ')';
    }
}
