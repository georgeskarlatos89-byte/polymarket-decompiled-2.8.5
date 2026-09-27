package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class leg implements neg {
    public final h6e a;

    public leg(h6e h6eVar) {
        h6eVar.getClass();
        this.a = h6eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof leg) && Intrinsics.areEqual(this.a, ((leg) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "USBankAccount(usBankAccount=" + this.a + ")";
    }
}
