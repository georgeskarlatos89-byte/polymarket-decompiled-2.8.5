package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class vp9 {
    public final Integer a;
    public final Long b;
    public final Integer c;
    public final Integer d;
    public final dqd e;
    public final Float f;
    public final Function0 g;
    public final kjc h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ vp9(Integer num, Long l, Integer num2, Integer num3, dqd dqdVar, int i) {
        this(r3, r4, r5, r6, r7, null, null, hjc.a);
        Integer num4;
        Long l2;
        Integer num5;
        Integer num6;
        dqd dqdVar2;
        if ((i & 1) != 0) {
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i & 2) != 0) {
            l2 = null;
        } else {
            l2 = l;
        }
        if ((i & 4) != 0) {
            num5 = null;
        } else {
            num5 = num2;
        }
        if ((i & 8) != 0) {
            num6 = null;
        } else {
            num6 = num3;
        }
        if ((i & 16) != 0) {
            dqdVar2 = null;
        } else {
            dqdVar2 = dqdVar;
        }
    }

    public static vp9 a(vp9 vp9Var, Integer num, Long l, dqd dqdVar, Float f, Function0 function0, kjc kjcVar, int i) {
        Integer num2;
        Float f2;
        Function0 function02;
        kjc kjcVar2;
        int i2 = 16;
        if ((i & 1) != 0) {
            num = vp9Var.a;
        }
        Integer num3 = num;
        if ((i & 2) != 0) {
            l = vp9Var.b;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            num2 = vp9Var.c;
        } else {
            num2 = 16;
        }
        if ((i & 8) != 0) {
            i2 = vp9Var.d;
        }
        Integer num4 = i2;
        if ((i & 16) != 0) {
            dqdVar = vp9Var.e;
        }
        dqd dqdVar2 = dqdVar;
        if ((i & 32) != 0) {
            f2 = vp9Var.f;
        } else {
            f2 = f;
        }
        if ((i & 64) != 0) {
            function02 = vp9Var.g;
        } else {
            function02 = function0;
        }
        if ((i & 128) != 0) {
            kjcVar2 = vp9Var.h;
        } else {
            kjcVar2 = kjcVar;
        }
        vp9Var.getClass();
        kjcVar2.getClass();
        return new vp9(num3, l2, num2, num4, dqdVar2, f2, function02, kjcVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp9)) {
            return false;
        }
        vp9 vp9Var = (vp9) obj;
        if (Intrinsics.areEqual(this.a, vp9Var.a) && Intrinsics.areEqual(this.b, vp9Var.b) && Intrinsics.areEqual(this.c, vp9Var.c) && Intrinsics.areEqual(this.d, vp9Var.d) && Intrinsics.areEqual(this.e, vp9Var.e) && Intrinsics.areEqual(this.f, vp9Var.f) && Intrinsics.areEqual(this.g, vp9Var.g) && Intrinsics.areEqual(this.h, vp9Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i = 0;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Long l = this.b;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num2 = this.c;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num3 = this.d;
        if (num3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        dqd dqdVar = this.e;
        if (dqdVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = dqdVar.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Float f = this.f;
        if (f == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = f.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Function0 function0 = this.g;
        if (function0 != null) {
            i = function0.hashCode();
        }
        return this.h.hashCode() + ((i7 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageStyle(image=");
        sb.append(this.a);
        sb.append(", tinColor=");
        sb.append(this.b);
        sb.append(", height=");
        sv6.z(sb, this.c, ", width=", this.d, ", padding=");
        sb.append(this.e);
        sb.append(", opacity=");
        sb.append(this.f);
        sb.append(", onClick=");
        sb.append(this.g);
        sb.append(", modifier=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public vp9(Integer num, Long l, Integer num2, Integer num3, dqd dqdVar, Float f, Function0 function0, kjc kjcVar) {
        this.a = num;
        this.b = l;
        this.c = num2;
        this.d = num3;
        this.e = dqdVar;
        this.f = f;
        this.g = function0;
        this.h = kjcVar;
    }
}
