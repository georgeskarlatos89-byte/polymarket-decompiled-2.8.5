package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class snb implements tnb {
    public final String a;

    public snb(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof snb) && Intrinsics.areEqual(this.a, ((snb) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tnb
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sv6.n("Unknown(value=", this.a, ")");
    }
}
