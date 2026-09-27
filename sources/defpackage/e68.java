package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e68 implements alk {
    public final float a;
    public final float b;

    public e68(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.alk
    public final int a(il6 il6Var) {
        return il6Var.O(0.0f);
    }

    @Override // defpackage.alk
    public final int b(il6 il6Var, owa owaVar) {
        return il6Var.O(0.0f);
    }

    @Override // defpackage.alk
    public final int c(il6 il6Var) {
        return il6Var.O(this.b);
    }

    @Override // defpackage.alk
    public final int d(il6 il6Var, owa owaVar) {
        return il6Var.O(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e68) {
                e68 e68Var = (e68) obj;
                if (hy6.c(this.a, e68Var.a) && hy6.c(0.0f, 0.0f) && hy6.c(0.0f, 0.0f) && hy6.c(this.b, e68Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + sv6.a(sv6.a(Float.hashCode(this.a) * 31, 0.0f, 31), 0.0f, 31);
    }

    public final String toString() {
        return "Insets(left=" + ((Object) hy6.d(this.a)) + ", top=" + ((Object) hy6.d(0.0f)) + ", right=" + ((Object) hy6.d(0.0f)) + ", bottom=" + ((Object) hy6.d(this.b)) + ')';
    }
}
