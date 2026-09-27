package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class iu1 implements ou1 {
    public final Throwable b;

    public iu1(Throwable th) {
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof iu1) && Intrinsics.areEqual(this.b, ((iu1) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.b;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Closed(cause=" + this.b + ')';
    }
}
