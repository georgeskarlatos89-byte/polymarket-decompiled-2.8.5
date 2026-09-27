package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gt9 implements ark, x65 {
    public Integer a;
    public Integer b;

    public gt9(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    @Override // defpackage.ark
    public final void a(Integer num) {
        this.b = num;
    }

    @Override // defpackage.ark
    public final Integer b() {
        return this.a;
    }

    @Override // defpackage.ark
    public final void c(Integer num) {
        this.a = num;
    }

    @Override // defpackage.x65
    public final Object copy() {
        return new gt9(this.a, this.b);
    }

    @Override // defpackage.ark
    public final Integer d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gt9) {
            gt9 gt9Var = (gt9) obj;
            if (Intrinsics.areEqual(this.a, gt9Var.a) && Intrinsics.areEqual(this.b, gt9Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Integer num = this.a;
        int i2 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Integer num2 = this.b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        Object obj2 = "??";
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append('-');
        Integer num = this.b;
        if (num != null) {
            obj2 = num;
        }
        sb.append(obj2);
        return sb.toString();
    }
}
