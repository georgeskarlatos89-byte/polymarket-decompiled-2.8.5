package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ubb implements wbb {
    public final Throwable a;

    public ubb(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ubb) || !Intrinsics.areEqual(this.a, ((ubb) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return woa.p("Error(error=", ")", this.a);
    }
}
