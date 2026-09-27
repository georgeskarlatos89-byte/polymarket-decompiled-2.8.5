package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class png {
    public static final png c;
    public final long a;
    public final long b;

    static {
        png pngVar = new png(0L, 0L);
        new png(Long.MAX_VALUE, Long.MAX_VALUE);
        new png(Long.MAX_VALUE, 0L);
        new png(0L, Long.MAX_VALUE);
        c = pngVar;
    }

    public png(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        pfn.b(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j, long j2, long j3) {
        boolean z;
        long j4 = this.a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        int i = u1k.a;
        long j6 = j - j4;
        if (((j4 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j5;
        if (((j5 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z2 = false;
        if (j6 <= j2 && j2 <= j7) {
            z = true;
        } else {
            z = false;
        }
        if (j6 <= j3 && j3 <= j7) {
            z2 = true;
        }
        if (z && z2) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
        } else {
            if (!z) {
                if (z2) {
                    return j3;
                }
                return j6;
            }
            return j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && png.class == obj.getClass()) {
            png pngVar = (png) obj;
            if (this.a == pngVar.a && this.b == pngVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
