package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lje implements y75, vz9 {
    public final float a;

    public lje(float f) {
        this.a = f;
        if (f >= 0.0f && f <= 100.0f) {
            return;
        }
        nw9.a("The percent should be in the range of [0, 100]");
    }

    @Override // defpackage.y75
    public final float a(long j, il6 il6Var) {
        return (this.a / 100.0f) * d9h.d(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lje) && Float.compare(this.a, ((lje) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return hdi.r(new StringBuilder("CornerSize(size = "), this.a, "%)");
    }
}
