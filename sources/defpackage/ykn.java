package defpackage;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ykn {
    public final boolean a;
    public final List b;
    public final i7l c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final a7n k;

    public ykn(boolean z, jr9 jr9Var, i7l i7lVar, String str, String str2, jr9 jr9Var2, jr9 jr9Var3, boolean z2, boolean z3, boolean z4, a7n a7nVar) {
        jr9Var.getClass();
        i7lVar.getClass();
        str.getClass();
        str2.getClass();
        jr9Var2.getClass();
        jr9Var3.getClass();
        a7nVar.getClass();
        this.a = z;
        this.b = jr9Var;
        this.c = i7lVar;
        this.d = str;
        this.e = str2;
        this.f = jr9Var2;
        this.g = jr9Var3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = a7nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykn)) {
            return false;
        }
        ykn yknVar = (ykn) obj;
        if (this.a == yknVar.a && Intrinsics.areEqual(this.b, yknVar.b) && Intrinsics.areEqual(this.c, yknVar.c) && Intrinsics.areEqual(this.d, yknVar.d) && Intrinsics.areEqual(this.e, yknVar.e) && Intrinsics.areEqual(this.f, yknVar.f) && Intrinsics.areEqual(this.g, yknVar.g) && this.h == yknVar.h && this.i == yknVar.i && this.j == yknVar.j && Intrinsics.areEqual(this.k, yknVar.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j));
    }

    public final String toString() {
        boolean z = this.a;
        int length = String.valueOf(z).length();
        List list = this.b;
        int length2 = String.valueOf(list).length();
        i7l i7lVar = this.c;
        int length3 = String.valueOf(i7lVar).length();
        String str = this.d;
        int length4 = String.valueOf(str).length();
        String str2 = this.e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.g;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.h;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.i;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.j;
        int length10 = String.valueOf(z4).length();
        a7n a7nVar = this.k;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(a7nVar).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(i7lVar);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(a7nVar);
        sb.append(")");
        return sb.toString();
    }
}
