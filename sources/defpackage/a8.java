package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a8 implements f8 {
    public final Throwable a;

    public a8(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a8) || !Intrinsics.areEqual(this.a, ((a8) obj).a)) {
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
