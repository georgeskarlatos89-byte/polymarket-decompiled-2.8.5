package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mqd implements iqd {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public mqd(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (f2 >= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z & z2;
        if (f3 >= 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(z4 & z3 & (f4 >= 0.0f))) {
            iw9.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.iqd
    public final float a() {
        return this.d;
    }

    @Override // defpackage.iqd
    public final float b(owa owaVar) {
        if (owaVar == owa.Ltr) {
            return this.a;
        }
        return this.c;
    }

    @Override // defpackage.iqd
    public final float c(owa owaVar) {
        if (owaVar == owa.Ltr) {
            return this.c;
        }
        return this.a;
    }

    @Override // defpackage.iqd
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mqd) {
            mqd mqdVar = (mqd) obj;
            if (hy6.c(this.a, mqdVar.a) && hy6.c(this.b, mqdVar.b) && hy6.c(this.c, mqdVar.c) && hy6.c(this.d, mqdVar.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + sv6.a(sv6.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) hy6.d(this.a)) + ", top=" + ((Object) hy6.d(this.b)) + ", end=" + ((Object) hy6.d(this.c)) + ", bottom=" + ((Object) hy6.d(this.d)) + ')';
    }
}
