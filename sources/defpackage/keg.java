package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class keg implements neg {
    public final a6e a;

    public keg(a6e a6eVar) {
        a6eVar.getClass();
        this.a = a6eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof keg) && Intrinsics.areEqual(this.a, ((keg) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SepaDebit(sepaDebit=" + this.a + ")";
    }
}
