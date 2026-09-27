package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nz9 implements iqd {
    public final alk a;
    public final il6 b;

    public nz9(alk alkVar, il6 il6Var) {
        this.a = alkVar;
        this.b = il6Var;
    }

    @Override // defpackage.iqd
    public final float a() {
        alk alkVar = this.a;
        il6 il6Var = this.b;
        return il6Var.j0(alkVar.c(il6Var));
    }

    @Override // defpackage.iqd
    public final float b(owa owaVar) {
        alk alkVar = this.a;
        il6 il6Var = this.b;
        return il6Var.j0(alkVar.d(il6Var, owaVar));
    }

    @Override // defpackage.iqd
    public final float c(owa owaVar) {
        alk alkVar = this.a;
        il6 il6Var = this.b;
        return il6Var.j0(alkVar.b(il6Var, owaVar));
    }

    @Override // defpackage.iqd
    public final float d() {
        alk alkVar = this.a;
        il6 il6Var = this.b;
        return il6Var.j0(alkVar.a(il6Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz9)) {
            return false;
        }
        nz9 nz9Var = (nz9) obj;
        if (Intrinsics.areEqual(this.a, nz9Var.a) && Intrinsics.areEqual(this.b, nz9Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
