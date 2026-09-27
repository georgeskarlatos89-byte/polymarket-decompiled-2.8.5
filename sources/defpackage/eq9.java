package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class eq9 {
    public static int k;
    public static final qf5 l = new qf5(10);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final y4k f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public eq9(String str, float f, float f2, float f3, float f4, y4k y4kVar, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = y4kVar;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof eq9) {
                eq9 eq9Var = (eq9) obj;
                if (Intrinsics.areEqual(this.a, eq9Var.a) && hy6.c(this.b, eq9Var.b) && hy6.c(this.c, eq9Var.c) && this.d == eq9Var.d && this.e == eq9Var.e && Intrinsics.areEqual(this.f, eq9Var.f)) {
                    long j = eq9Var.g;
                    int i = ib4.n;
                    if (hkj.a(this.g, j) && this.h == eq9Var.h && this.i == eq9Var.i) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + sv6.a(sv6.a(sv6.a(sv6.a(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31)) * 31;
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Boolean.hashCode(this.i) + woa.b(this.h, woa.d(hashCode, 31, this.g), 31);
    }
}
