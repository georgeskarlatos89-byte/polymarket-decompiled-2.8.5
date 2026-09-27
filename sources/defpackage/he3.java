package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class he3 {
    public final String a;
    public final z79 b;
    public final z79 c;
    public final z79 d;
    public final boolean e;

    public he3(String str, z79 z79Var, z79 z79Var2, z79 z79Var3, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z79Var;
        this.c = z79Var2;
        this.d = z79Var3;
        this.e = z;
    }

    public static he3 a(he3 he3Var, boolean z) {
        String str = he3Var.a;
        z79 z79Var = he3Var.b;
        z79 z79Var2 = he3Var.c;
        z79 z79Var3 = he3Var.d;
        he3Var.getClass();
        str.getClass();
        return new he3(str, z79Var, z79Var2, z79Var3, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof he3) {
                he3 he3Var = (he3) obj;
                if (!Intrinsics.areEqual(this.a, he3Var.a) || !Intrinsics.areEqual(this.b, he3Var.b) || !Intrinsics.areEqual(this.c, he3Var.c) || !Intrinsics.areEqual(this.d, he3Var.d) || this.e != he3Var.e) {
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
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        z79 z79Var = this.b;
        if (z79Var == null) {
            hashCode = 0;
        } else {
            hashCode = z79Var.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        z79 z79Var2 = this.c;
        if (z79Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = z79Var2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        z79 z79Var3 = this.d;
        if (z79Var3 != null) {
            i = z79Var3.hashCode();
        }
        return Boolean.hashCode(this.e) + ((i3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeViewState(email=");
        sb.append(this.a);
        sb.append(", whatsappHint=");
        sb.append(this.b);
        sb.append(", emailHint=");
        sb.append(this.c);
        sb.append(", phoneHint=");
        sb.append(this.d);
        sb.append(", isLoading=");
        return ix2.r(sb, this.e, ")");
    }
}
