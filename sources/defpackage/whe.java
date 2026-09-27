package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class whe extends aie {
    public final nhe b;

    public whe(nhe nheVar) {
        super(null);
        this.b = nheVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof whe) || !Intrinsics.areEqual(this.b, ((whe) obj).b)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "FinishProcessing(onComplete=" + this.b + ")";
    }
}
