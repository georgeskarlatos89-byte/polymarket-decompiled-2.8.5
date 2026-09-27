package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class cah {
    public final float a;
    public final float b;
    public final float c;

    public cah(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cah)) {
            return false;
        }
        cah cahVar = (cah) obj;
        if (Float.compare(this.a, cahVar.a) == 0 && Float.compare(this.b, cahVar.b) == 0 && Float.compare(this.c, cahVar.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + sv6.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return hdi.r(hdi.u(this.a, this.b, "Slot(x=", ", y=", ", d="), this.c, ")");
    }
}
