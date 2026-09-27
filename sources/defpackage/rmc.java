package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rmc implements zec {
    public final long a;
    public final long b;
    public final long c;

    public rmc(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmc)) {
            return false;
        }
        rmc rmcVar = (rmc) obj;
        if (this.a == rmcVar.a && this.b == rmcVar.b && this.c == rmcVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return uan.b(this.c) + ((uan.b(this.b) + ((uan.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
