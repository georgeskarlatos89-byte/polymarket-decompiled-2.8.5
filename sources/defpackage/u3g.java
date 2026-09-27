package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u3g {
    public final int a;
    public final qi8 b;
    public final int c;
    public final oi8 d;

    public u3g(int i, qi8 qi8Var, int i2, oi8 oi8Var) {
        this.a = i;
        this.b = qi8Var;
        this.c = i2;
        this.d = oi8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u3g) {
            u3g u3gVar = (u3g) obj;
            if (this.a == u3gVar.a && Intrinsics.areEqual(this.b, u3gVar.b) && this.c == u3gVar.c && Intrinsics.areEqual(this.d, u3gVar.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.a.hashCode() + woa.b(0, woa.b(this.c, ((this.a * 31) + this.b.a) * 31, 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ResourceFont(resId=");
        sb.append(this.a);
        sb.append(", weight=");
        sb.append(this.b);
        sb.append(", style=");
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else if (i == 1) {
            str = "Italic";
        } else {
            str = "Invalid";
        }
        sb.append((Object) str);
        sb.append(", loadingStrategy=Blocking)");
        return sb.toString();
    }
}
