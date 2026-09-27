package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h68 implements alk {
    public final int a;

    public h68(int i) {
        this.a = i;
    }

    @Override // defpackage.alk
    public final int a(il6 il6Var) {
        return this.a;
    }

    @Override // defpackage.alk
    public final int b(il6 il6Var, owa owaVar) {
        return 0;
    }

    @Override // defpackage.alk
    public final int c(il6 il6Var) {
        return 0;
    }

    @Override // defpackage.alk
    public final int d(il6 il6Var, owa owaVar) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h68) && this.a == ((h68) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final String toString() {
        return ix2.i(this.a, ", right=0, bottom=0)", new StringBuilder("Insets(left=0, top="));
    }
}
