package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class knb extends ey3 {
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knb(Throwable th) {
        super(false);
        th.getClass();
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof knb) {
            knb knbVar = (knb) obj;
            if (this.a == knbVar.a && Intrinsics.areEqual(this.b, knbVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.a + ", error=" + this.b + ')';
    }
}
