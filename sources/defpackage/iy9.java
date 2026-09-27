package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class iy9 {
    public final ib4 a;
    public final ib4 b;
    public final ib4 c;
    public final ib4 d;
    public final ib4 e;
    public final ib4 f;
    public final long g;
    public final ib4 h;
    public final ib4 i;
    public final ib4 j;
    public final ib4 k;

    public iy9(ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, long j, ib4 ib4Var7, ib4 ib4Var8, ib4 ib4Var9, ib4 ib4Var10) {
        this.a = ib4Var;
        this.b = ib4Var2;
        this.c = ib4Var3;
        this.d = ib4Var4;
        this.e = ib4Var5;
        this.f = ib4Var6;
        this.g = j;
        this.h = ib4Var7;
        this.i = ib4Var8;
        this.j = ib4Var9;
        this.k = ib4Var10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy9)) {
            return false;
        }
        iy9 iy9Var = (iy9) obj;
        if (!Intrinsics.areEqual(this.a, iy9Var.a) || !Intrinsics.areEqual(this.b, iy9Var.b) || !Intrinsics.areEqual(this.c, iy9Var.c) || !Intrinsics.areEqual(this.d, iy9Var.d) || !Intrinsics.areEqual(this.e, iy9Var.e) || !Intrinsics.areEqual(this.f, iy9Var.f)) {
            return false;
        }
        long j = iy9Var.g;
        int i = ib4.n;
        if (hkj.a(this.g, j) && Intrinsics.areEqual(this.h, iy9Var.h) && Intrinsics.areEqual(this.i, iy9Var.i) && Intrinsics.areEqual(this.j, iy9Var.j) && Intrinsics.areEqual(this.k, iy9Var.k)) {
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
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int i = 0;
        ib4 ib4Var = this.a;
        if (ib4Var == null) {
            hashCode = 0;
        } else {
            long j = ib4Var.a;
            gkj gkjVar = hkj.b;
            hashCode = Long.hashCode(j);
        }
        int i2 = hashCode * 31;
        ib4 ib4Var2 = this.b;
        if (ib4Var2 == null) {
            hashCode2 = 0;
        } else {
            long j2 = ib4Var2.a;
            gkj gkjVar2 = hkj.b;
            hashCode2 = Long.hashCode(j2);
        }
        int i3 = (i2 + hashCode2) * 31;
        ib4 ib4Var3 = this.c;
        if (ib4Var3 == null) {
            hashCode3 = 0;
        } else {
            long j3 = ib4Var3.a;
            gkj gkjVar3 = hkj.b;
            hashCode3 = Long.hashCode(j3);
        }
        int i4 = (i3 + hashCode3) * 31;
        ib4 ib4Var4 = this.d;
        if (ib4Var4 == null) {
            hashCode4 = 0;
        } else {
            long j4 = ib4Var4.a;
            gkj gkjVar4 = hkj.b;
            hashCode4 = Long.hashCode(j4);
        }
        int i5 = (i4 + hashCode4) * 31;
        ib4 ib4Var5 = this.e;
        if (ib4Var5 == null) {
            hashCode5 = 0;
        } else {
            long j5 = ib4Var5.a;
            gkj gkjVar5 = hkj.b;
            hashCode5 = Long.hashCode(j5);
        }
        int i6 = (i5 + hashCode5) * 31;
        ib4 ib4Var6 = this.f;
        if (ib4Var6 == null) {
            hashCode6 = 0;
        } else {
            long j6 = ib4Var6.a;
            gkj gkjVar6 = hkj.b;
            hashCode6 = Long.hashCode(j6);
        }
        int i7 = (i6 + hashCode6) * 31;
        int i8 = ib4.n;
        gkj gkjVar7 = hkj.b;
        int d = woa.d(i7, 31, this.g);
        ib4 ib4Var7 = this.h;
        if (ib4Var7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = Long.hashCode(ib4Var7.a);
        }
        int i9 = (d + hashCode7) * 31;
        ib4 ib4Var8 = this.i;
        if (ib4Var8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = Long.hashCode(ib4Var8.a);
        }
        int i10 = (i9 + hashCode8) * 31;
        ib4 ib4Var9 = this.j;
        if (ib4Var9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = Long.hashCode(ib4Var9.a);
        }
        int i11 = (i10 + hashCode9) * 31;
        ib4 ib4Var10 = this.k;
        if (ib4Var10 != null) {
            i = Long.hashCode(ib4Var10.a);
        }
        return i11 + i;
    }

    public final String toString() {
        return "InputFieldColors(textColor=" + this.a + ", placeholderColor=" + this.b + ", focusedIndicatorColor=" + this.c + ", unfocusedIndicatorColor=" + this.d + ", disabledIndicatorColor=" + this.e + ", errorIndicatorColor=" + this.f + ", containerColor=" + ib4.h(this.g) + ", cursorColor=" + this.h + ", errorCursorColor=" + this.i + ", cursorHandleColor=" + this.j + ", cursorHighlightColor=" + this.k + ")";
    }
}
