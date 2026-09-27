package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e9e implements h9e {
    public final j6e a;

    public e9e(j6e j6eVar) {
        j6eVar.getClass();
        this.a = j6eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e9e) && Intrinsics.areEqual(this.a, ((e9e) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SavedPaymentMethodSelected(savedPaymentMethod=" + this.a + ")";
    }
}
