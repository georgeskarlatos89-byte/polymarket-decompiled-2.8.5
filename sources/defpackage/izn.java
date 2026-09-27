package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class izn {
    public final String a;
    public final int b;

    public izn(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof izn) {
                izn iznVar = (izn) obj;
                if (this.a.equals(iznVar.a) && this.b == iznVar.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.a);
        sb.append(", enableFirelog=true, firelogEventType=");
        return ix2.i(this.b, "}", sb);
    }
}
