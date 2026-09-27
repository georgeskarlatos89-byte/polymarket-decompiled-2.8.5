package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zn0 implements do0 {
    public final Throwable a;

    public zn0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zn0) || !Intrinsics.areEqual(this.a, ((zn0) obj).a)) {
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
        return woa.p("Error(throwable=", ")", this.a);
    }
}
