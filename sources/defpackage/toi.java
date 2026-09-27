package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class toi {
    public final float a;
    public final float b;

    public toi(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toi)) {
            return false;
        }
        toi toiVar = (toi) obj;
        if (Float.compare(this.a, toiVar.a) == 0 && Float.compare(this.b, toiVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TapZone(xBias=" + this.a + ", yBias=" + this.b + ")";
    }
}
