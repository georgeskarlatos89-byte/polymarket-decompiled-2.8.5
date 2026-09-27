package io.sentry.android.core.internal.util;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class n implements Comparable {
    public final long a;
    public final long b;

    public n(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        int compare = Long.compare(this.b, nVar.b);
        if (compare != 0) {
            return compare;
        }
        return Long.compare(this.a, nVar.a);
    }
}
