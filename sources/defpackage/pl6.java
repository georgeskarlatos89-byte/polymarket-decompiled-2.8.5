package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pl6 {
    public final xif a;
    public final int b;
    public final int c;

    public pl6(xif xifVar, int i, int i2) {
        this.a = xifVar;
        this.b = i;
        this.c = i2;
    }

    public static pl6 a(Class cls) {
        return new pl6(cls, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pl6) {
            pl6 pl6Var = (pl6) obj;
            if (this.a.equals(pl6Var.a) && this.b == pl6Var.b && this.c == pl6Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    str2 = "deferred";
                } else {
                    dmk.i(ace.f(i2, "Unsupported injection: "));
                    return null;
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return woa.r(sb, str2, "}");
    }

    public pl6(Class cls, int i, int i2) {
        this(xif.a(cls), i, i2);
    }
}
