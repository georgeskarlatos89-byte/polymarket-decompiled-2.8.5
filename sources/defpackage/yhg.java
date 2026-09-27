package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class yhg {
    public final String a;
    public final int b;
    public final int c;

    public yhg(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhg)) {
            return false;
        }
        yhg yhgVar = (yhg) obj;
        if (Intrinsics.areEqual(this.a, yhgVar.a) && this.b == yhgVar.b && this.c == yhgVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + woa.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return ix2.i(this.c, ")", m51.q("ScannedCardData(cardNumber=", this.a, ", expirationMonth=", this.b, ", expirationYear="));
    }
}
