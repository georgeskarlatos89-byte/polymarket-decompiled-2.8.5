package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wzc {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public String j;

    public wzc(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof wzc)) {
                wzc wzcVar = (wzc) obj;
                if (this.a == wzcVar.a && this.b == wzcVar.b && this.c == wzcVar.c && Intrinsics.areEqual(this.j, wzcVar.j) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && this.d == wzcVar.d && this.e == wzcVar.e && this.f == wzcVar.f && this.g == wzcVar.g && this.h == wzcVar.h && this.i == wzcVar.i) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = (((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31;
        String str = this.j;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((((((((((((i2 + i) * 29791) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        String str = this.j;
        StringBuilder sb = new StringBuilder(wzc.class.getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        if ((str != null || this.c != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.d) {
                sb.append(" inclusive");
            }
            if (this.e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i = this.i;
        int i2 = this.h;
        int i3 = this.g;
        int i4 = this.f;
        if (i4 != -1 || i3 != -1 || i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(")");
        }
        return sb.toString();
    }
}
