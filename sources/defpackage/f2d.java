package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f2d extends i2d {
    public final Exception a;

    public f2d(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f2d) || !Intrinsics.areEqual(this.a, ((f2d) obj).a)) {
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
        return "InternalError(throwable=" + this.a + ")";
    }
}
