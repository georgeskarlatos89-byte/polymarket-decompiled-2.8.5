package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zwk {
    public final long a;

    public zwk(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zwk) && this.a == ((zwk) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return woa.n(this.a, ", webViewRequestMode=0}", new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="));
    }
}
