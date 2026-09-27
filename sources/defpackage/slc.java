package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class slc implements zec {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public slc(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && slc.class == obj.getClass()) {
            slc slcVar = (slc) obj;
            if (this.a == slcVar.a && this.b == slcVar.b && this.c == slcVar.c && this.d == slcVar.d && this.e == slcVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return uan.b(this.e) + ((uan.b(this.d) + ((uan.b(this.c) + ((uan.b(this.b) + ((uan.b(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
