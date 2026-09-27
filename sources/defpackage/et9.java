package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class et9 implements ark, x65 {
    public final gt9 a;
    public Integer b;
    public Integer c;
    public Integer d;

    public et9(gt9 gt9Var, Integer num, Integer num2, Integer num3) {
        this.a = gt9Var;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    @Override // defpackage.ark
    public final void a(Integer num) {
        this.a.b = num;
    }

    @Override // defpackage.ark
    public final Integer b() {
        return this.a.a;
    }

    @Override // defpackage.ark
    public final void c(Integer num) {
        this.a.a = num;
    }

    @Override // defpackage.x65
    public final Object copy() {
        gt9 gt9Var = this.a;
        return new et9(new gt9(gt9Var.a, gt9Var.b), this.b, this.c, this.d);
    }

    @Override // defpackage.ark
    public final Integer d() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof et9) {
            et9 et9Var = (et9) obj;
            if (Intrinsics.areEqual(this.a, et9Var.a) && Intrinsics.areEqual(this.b, et9Var.b) && Intrinsics.areEqual(this.c, et9Var.c) && Intrinsics.areEqual(this.d, et9Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.a.hashCode() * 29791;
        Integer num = this.b;
        int i3 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i * 961) + hashCode;
        Integer num2 = this.c;
        if (num2 != null) {
            i2 = num2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i2 * 31) + i4;
        Integer num3 = this.d;
        if (num3 != null) {
            i3 = num3.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        Integer num = this.d;
        gt9 gt9Var = this.a;
        Object obj = "??";
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(gt9Var);
            sb.append('-');
            Object obj2 = this.b;
            if (obj2 == null) {
                obj2 = "??";
            }
            sb.append(obj2);
            sb.append(" (day of week is ");
            Object obj3 = this.c;
            if (obj3 != null) {
                obj = obj3;
            }
            return woa.q(sb, obj, ')');
        }
        if (this.b == null && gt9Var.b == null) {
            StringBuilder sb2 = new StringBuilder("(");
            Object obj4 = gt9Var.a;
            if (obj4 == null) {
                obj4 = "??";
            }
            sb2.append(obj4);
            sb2.append(")-");
            sb2.append(this.d);
            sb2.append(" (day of week is ");
            Object obj5 = this.c;
            if (obj5 != null) {
                obj = obj5;
            }
            return woa.q(sb2, obj, ')');
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(gt9Var);
        sb3.append('-');
        Object obj6 = this.b;
        if (obj6 == null) {
            obj6 = "??";
        }
        sb3.append(obj6);
        sb3.append(" (day of week is ");
        Object obj7 = this.c;
        if (obj7 != null) {
            obj = obj7;
        }
        sb3.append(obj);
        sb3.append(", day of year is ");
        sb3.append(this.d);
        sb3.append(')');
        return sb3.toString();
    }
}
