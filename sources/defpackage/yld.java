package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class yld implements zld {
    public final String a;
    public final String b;

    public yld(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yld)) {
            return false;
        }
        yld yldVar = (yld) obj;
        if (Intrinsics.areEqual(this.a, yldVar.a) && Intrinsics.areEqual(this.b, yldVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hdi.p("Spread(spreadText=", this.a, ", lastText=", this.b, ")");
    }
}
