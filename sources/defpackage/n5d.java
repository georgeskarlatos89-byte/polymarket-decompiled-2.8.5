package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class n5d implements o5d {
    public final yhg a;

    public n5d(yhg yhgVar) {
        this.a = yhgVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof n5d) || !Intrinsics.areEqual(this.a, ((n5d) obj).a)) {
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
        return "Found(scannedCardData=" + this.a + ")";
    }
}
