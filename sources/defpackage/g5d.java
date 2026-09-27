package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g5d extends h5d {
    public final e2e a;

    public g5d(e2e e2eVar) {
        this.a = e2eVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof g5d) || !Intrinsics.areEqual(this.a, ((g5d) obj).a)) {
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
        return "StartFallback(args=" + this.a + ")";
    }
}
