package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fne {
    public final long a;
    public final long b;
    public final int c;

    public fne(int i, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        dyi[] dyiVarArr = cyi.b;
        if ((j & 1095216660480L) == 0) {
            lw9.a("width cannot be TextUnit.Unspecified");
        }
        if ((1095216660480L & j2) == 0) {
            lw9.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fne) {
                fne fneVar = (fne) obj;
                if (cyi.a(this.a, fneVar.a) && cyi.a(this.b, fneVar.b) && this.c == fneVar.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        dyi[] dyiVarArr = cyi.b;
        return Integer.hashCode(this.c) + woa.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Placeholder(width=");
        sb.append((Object) cyi.e(this.a));
        sb.append(", height=");
        sb.append((Object) cyi.e(this.b));
        sb.append(", placeholderVerticalAlign=");
        int i = this.c;
        if (i == 1) {
            str = "AboveBaseline";
        } else if (i == 2) {
            str = "Top";
        } else if (i == 3) {
            str = "Bottom";
        } else if (i == 4) {
            str = "Center";
        } else if (i == 5) {
            str = "TextTop";
        } else if (i == 6) {
            str = "TextBottom";
        } else if (i == 7) {
            str = "TextCenter";
        } else {
            str = "Invalid";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
