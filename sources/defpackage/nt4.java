package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nt4 extends pt4 {
    public final Exception a;

    public nt4(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof nt4) || !Intrinsics.areEqual(this.a, ((nt4) obj).a)) {
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
        return "Failure(error=" + this.a + ")";
    }
}
