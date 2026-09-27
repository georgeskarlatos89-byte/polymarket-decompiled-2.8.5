package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ef4 implements ff4 {
    public final int a;
    public final float b;

    public ef4(float f, int i) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef4)) {
            return false;
        }
        ef4 ef4Var = (ef4) obj;
        if (this.a == ef4Var.a && Float.compare(this.b, ef4Var.b) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ff4
    public final String getKey() {
        return ace.f(this.a, "skeleton-");
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Skeleton(index=" + this.a + ", opacity=" + this.b + ")";
    }
}
