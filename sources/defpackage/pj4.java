package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class pj4 implements rj4 {
    public final y9b a;

    public pj4(y9b y9bVar) {
        this.a = y9bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof pj4) || !Intrinsics.areEqual(this.a, ((pj4) obj).a)) {
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
        return "Completed(linkActivityResult=" + this.a + ")";
    }
}
