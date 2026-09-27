package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k3j {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public k3j(long j) {
        f(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long j2 = this.a;
                if (j2 == 9223372036854775806L) {
                    Long l = (Long) this.d.get();
                    l.getClass();
                    j2 = l.longValue();
                }
                this.b = j2 - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                int i = u1k.a;
                long S = u1k.S(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + S) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                if (Math.abs(j4 - S) < Math.abs(j5 - S)) {
                    j = j4;
                } else {
                    j = j5;
                }
            }
            long j6 = j;
            int i2 = u1k.a;
            return a(u1k.S(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                int i = u1k.a;
                long S = u1k.S(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = S / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                long j5 = ((j3 + 1) * 8589934592L) + j;
                if (j4 >= S) {
                    j = j4;
                } else {
                    j = j5;
                }
            }
            long j6 = j;
            int i2 = u1k.a;
            return a(u1k.S(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j;
        j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized boolean e() {
        boolean z;
        if (this.b != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void f(long j) {
        long j2;
        this.a = j;
        if (j == Long.MAX_VALUE) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        this.b = j2;
        this.c = -9223372036854775807L;
    }

    public final synchronized void g(long j, boolean z) {
        boolean z2;
        try {
            if (this.a == 9223372036854775806L) {
                z2 = true;
            } else {
                z2 = false;
            }
            pfn.f(z2);
            if (e()) {
                return;
            }
            if (z) {
                this.d.set(Long.valueOf(j));
            } else {
                while (!e()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
