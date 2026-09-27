package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class wun {
    public final String a;

    public wun(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof wun) && this.a.equals(((wun) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return woa.r(new StringBuilder("MLKitLoggingOptions{libraryName="), this.a, ", enableFirelog=true, firelogEventType=1}");
    }
}
