package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ecb implements icb {
    public final Throwable a;

    public ecb(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ecb) || !Intrinsics.areEqual(this.a, ((ecb) obj).a)) {
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
        return woa.p("AttestationFailed(error=", ")", this.a);
    }
}
