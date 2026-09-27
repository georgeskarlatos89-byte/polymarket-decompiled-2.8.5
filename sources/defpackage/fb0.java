package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fb0 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public fb0(String str, int i, int i2, Object obj) {
        boolean z;
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lw9.a("Reversed range is not supported");
        }
    }

    public static fb0 a(fb0 fb0Var, cb0 cb0Var, int i, int i2) {
        Object obj = cb0Var;
        if ((i2 & 1) != 0) {
            obj = fb0Var.a;
        }
        int i3 = fb0Var.b;
        if ((i2 & 4) != 0) {
            i = fb0Var.c;
        }
        return new fb0(fb0Var.d, i3, i, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb0)) {
            return false;
        }
        fb0 fb0Var = (fb0) obj;
        if (Intrinsics.areEqual(this.a, fb0Var.a) && this.b == fb0Var.b && this.c == fb0Var.c && Intrinsics.areEqual(this.d, fb0Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.d.hashCode() + woa.b(this.c, woa.b(this.b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return m51.m(sb, this.d, ')');
    }

    public fb0(Object obj, int i, int i2) {
        this("", i, i2, obj);
    }
}
