package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hp8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public hp8(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hp8) {
                hp8 hp8Var = (hp8) obj;
                if (!Intrinsics.areEqual(this.a, hp8Var.a) || !Intrinsics.areEqual(this.b, hp8Var.b) || !Intrinsics.areEqual(this.c, hp8Var.c) || !Intrinsics.areEqual(this.d, hp8Var.d) || !Intrinsics.areEqual(this.e, hp8Var.e) || !Intrinsics.areEqual(this.f, hp8Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int e = hdi.e((i4 + hashCode4) * 31, 31, this.e);
        String str5 = this.f;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return e + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetInfo(className=");
        sb.append(this.a);
        sb.append(", resourceName=");
        sb.append(this.b);
        sb.append(", tag=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", hierarchy=");
        return m51.m(sb, this.f, ')');
    }
}
