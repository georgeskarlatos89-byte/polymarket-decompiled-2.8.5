package io.sentry.android.core.performance;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b implements Comparable {
    public final g a = new Object();
    public final g b = new Object();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int compare = Long.compare(this.a.c, bVar.a.c);
        if (compare == 0) {
            return Long.compare(this.b.c, bVar.b.c);
        }
        return compare;
    }
}
