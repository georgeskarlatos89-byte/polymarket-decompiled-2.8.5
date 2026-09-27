package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vsj implements Comparable {
    public static final usj b = new usj(null);
    public final short a;

    public /* synthetic */ vsj(short s) {
        this.a = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.d(this.a & 65535, ((vsj) obj).a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vsj) {
            if (this.a != ((vsj) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 65535);
    }
}
