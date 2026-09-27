package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p6g {
    public final boolean a;
    public final boolean b;

    public p6g(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6g)) {
            return false;
        }
        p6g p6gVar = (p6g) obj;
        if (this.a == p6gVar.a && this.b == p6gVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RetryCardMataDataApiContext(wasRetried=" + this.a + ", secondTimeRetryable=" + this.b + ")";
    }
}
