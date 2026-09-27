package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d39 implements f39 {
    public final Throwable a;

    public d39(Throwable th) {
        th.getClass();
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d39) && Intrinsics.areEqual(this.a, ((d39) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return woa.p("Failure(error=", ")", this.a);
    }
}
