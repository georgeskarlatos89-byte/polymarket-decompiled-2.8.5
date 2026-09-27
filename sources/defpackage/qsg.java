package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class qsg implements wsg {
    public final float a;
    public final boolean b;

    public qsg(boolean z, float f) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsg)) {
            return false;
        }
        qsg qsgVar = (qsg) obj;
        if (Float.compare(this.a, qsgVar.a) == 0 && this.b == qsgVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Drag(value=" + this.a + ", isDragging=" + this.b + ")";
    }
}
