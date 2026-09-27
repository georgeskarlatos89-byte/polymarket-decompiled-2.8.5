package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class hkj implements Comparable {
    public static final gkj b = new gkj(null);
    public final long a;

    public /* synthetic */ hkj(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.e(this.a ^ Long.MIN_VALUE, ((hkj) obj).a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hkj) {
            if (this.a != ((hkj) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return ozm.i(10, this.a);
    }
}
