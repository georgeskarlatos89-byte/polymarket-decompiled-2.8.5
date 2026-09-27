package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p9i extends z07 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final e40 e;

    public p9i(float f, float f2, int i, int i2, e40 e40Var, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        e40Var = (i3 & 16) != 0 ? null : e40Var;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = e40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9i)) {
            return false;
        }
        p9i p9iVar = (p9i) obj;
        if (this.a == p9iVar.a && this.b == p9iVar.b && this.c == p9iVar.c && this.d == p9iVar.d && Intrinsics.areEqual(this.e, p9iVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int b = woa.b(this.d, woa.b(this.c, sv6.a(Float.hashCode(this.a) * 31, this.b, 31), 31), 31);
        e40 e40Var = this.e;
        if (e40Var != null) {
            i = e40Var.hashCode();
        } else {
            i = 0;
        }
        return b + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        String str2 = "Unknown";
        int i = this.c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else if (i != 2) {
            str = "Unknown";
        } else {
            str = "Square";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
