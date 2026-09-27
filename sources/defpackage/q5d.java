package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class q5d implements s5d {
    public final r6d a;

    public q5d(r6d r6dVar) {
        this.a = r6dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof q5d) || !Intrinsics.areEqual(this.a, ((q5d) obj).a)) {
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
        return "Failed(error=" + this.a + ")";
    }
}
