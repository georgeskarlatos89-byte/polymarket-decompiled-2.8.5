package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class nz3 extends k04 {
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz3(String str) {
        super(str, null);
        str.getClass();
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nz3) && Intrinsics.areEqual(this.c, ((nz3) obj).c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return sv6.n("Customised(locale=", this.c, ")");
    }
}
