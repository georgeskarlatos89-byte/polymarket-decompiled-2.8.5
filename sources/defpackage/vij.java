package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vij {
    public final oh8 a;
    public final qi8 b;
    public final int c;
    public final int d;
    public final Object e;

    public vij(oh8 oh8Var, qi8 qi8Var, int i, int i2, Object obj) {
        this.a = oh8Var;
        this.b = qi8Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vij)) {
            return false;
        }
        vij vijVar = (vij) obj;
        if (Intrinsics.areEqual(this.a, vijVar.a) && Intrinsics.areEqual(this.b, vijVar.b) && this.c == vijVar.c && this.d == vijVar.d && Intrinsics.areEqual(this.e, vijVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        oh8 oh8Var = this.a;
        if (oh8Var == null) {
            hashCode = 0;
        } else {
            hashCode = oh8Var.hashCode();
        }
        int b = woa.b(this.d, woa.b(this.c, ((hashCode * 31) + this.b.a) * 31, 31), 31);
        Object obj = this.e;
        if (obj != null) {
            i = obj.hashCode();
        }
        return b + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else if (i != 1) {
            str = "Invalid";
        } else {
            str = "Italic";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        return woa.q(sb, this.e, ')');
    }
}
