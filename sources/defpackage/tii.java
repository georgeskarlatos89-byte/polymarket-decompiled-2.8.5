package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tii {
    public final String a;
    public final int b;
    public final int c;

    public tii(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tii)) {
            return false;
        }
        tii tiiVar = (tii) obj;
        if (Intrinsics.areEqual(this.a, tiiVar.a) && this.b == tiiVar.b && this.c == tiiVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + woa.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return sv6.o(sb, this.c, ')');
    }
}
