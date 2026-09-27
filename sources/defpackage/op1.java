package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class op1 {
    public final String a;
    public final zrf b;
    public final String c;
    public final String d;
    public final dkh e;
    public final float f;

    public op1(String str, zrf zrfVar, String str2, String str3, dkh dkhVar, float f, int i) {
        dkhVar = (i & 16) != 0 ? null : dkhVar;
        f = (i & 32) != 0 ? 1.0f : f;
        zrfVar.getClass();
        this.a = str;
        this.b = zrfVar;
        this.c = str2;
        this.d = str3;
        this.e = dkhVar;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof op1) {
                op1 op1Var = (op1) obj;
                if (!Intrinsics.areEqual(this.a, op1Var.a) || !Intrinsics.areEqual(this.b, op1Var.b) || !Intrinsics.areEqual(this.c, op1Var.c) || !Intrinsics.areEqual(this.d, op1Var.d) || !Intrinsics.areEqual(this.e, op1Var.e) || Float.compare(this.f, op1Var.f) != 0) {
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
        int hashCode3 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        dkh dkhVar = this.e;
        if (dkhVar != null) {
            i = dkhVar.a.hashCode();
        }
        return Float.hashCode(this.f) + ((i3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleTarget(key=");
        sb.append(this.a);
        sb.append(", rect=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        k84.q(sb, this.c, ", gradientSeed=", this.d, ", highlight=");
        sb.append(this.e);
        sb.append(", restAlpha=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
