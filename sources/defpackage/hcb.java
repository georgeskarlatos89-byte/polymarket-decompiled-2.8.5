package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class hcb implements icb {
    public final h9b a;

    public hcb(h9b h9bVar) {
        this.a = h9bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof hcb) || !Intrinsics.areEqual(this.a, ((hcb) obj).a)) {
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
        return "Success(account=" + this.a + ")";
    }
}
