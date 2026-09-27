package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class r5g implements Serializable {
    public final Throwable a;

    public r5g(Throwable th) {
        th.getClass();
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r5g) {
            if (Intrinsics.areEqual(this.a, ((r5g) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
