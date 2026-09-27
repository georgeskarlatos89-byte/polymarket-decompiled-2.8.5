package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kzg implements mzh {
    public final long a;

    public kzg(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kzg.class == obj.getClass() && this.a == ((kzg) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.a;
    }

    public final String toString() {
        return woa.n(this.a, ")", new StringBuilder("SetRetryDelayEvent("));
    }
}
