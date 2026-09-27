package io.sentry.android.core;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class z1 implements Comparable {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final long g;

    public z1(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = z2;
        this.g = j5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((z1) obj).b);
    }

    public z1(long j) {
        this(j, j, 0L, 0L, false, false, 0L);
    }
}
