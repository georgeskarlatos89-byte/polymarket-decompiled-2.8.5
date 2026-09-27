package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class o61 {
    public final String a;
    public final boolean b;

    public o61(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o61)) {
            return false;
        }
        o61 o61Var = (o61) obj;
        if (Intrinsics.areEqual(this.a, o61Var.a) && this.b == o61Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PromoBadgeState(promoText=" + this.a + ", eligible=" + this.b + ")";
    }
}
