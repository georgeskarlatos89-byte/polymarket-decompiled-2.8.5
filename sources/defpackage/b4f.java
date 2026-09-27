package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b4f extends e4f {
    public final nhe a;

    public b4f(nhe nheVar) {
        this.a = nheVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof b4f) || !Intrinsics.areEqual(this.a, ((b4f) obj).a)) {
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
        return "FinishProcessing(onComplete=" + this.a + ")";
    }
}
