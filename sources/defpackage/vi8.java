package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vi8 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public vi8(String str, String str2, String str3, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi8)) {
            return false;
        }
        vi8 vi8Var = (vi8) obj;
        if (Intrinsics.areEqual(this.a, vi8Var.a) && Intrinsics.areEqual(this.b, vi8Var.b) && Intrinsics.areEqual(this.c, vi8Var.c) && Intrinsics.areEqual(this.d, vi8Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.d.hashCode() + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder r = m51.r("FootballBoxScoreRowUi(name=", this.a, ", helmetIcon=", this.b, ", helmetIconDark=");
        r.append(this.c);
        r.append(", values=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }
}
