package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c57 {
    public static final c57 c = new c57(0, 0);
    public static final c57 d = new c57(1, 8);
    public static final c57 e = new c57(3, 10);
    public static final c57 f = new c57(4, 10);
    public static final c57 g = new c57(5, 10);
    public static final c57 h = new c57(6, 10);
    public static final c57 i = new c57(6, 8);
    public final int a;
    public final int b;

    public c57(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public final boolean a() {
        if (b() && this.a != 1 && this.b == 10) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        int i2 = this.a;
        if (i2 != 0 && i2 != 2 && this.b != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c57) {
            c57 c57Var = (c57) obj;
            if (this.a == c57Var.a && this.b == c57Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return ix2.i(this.b, "}", sb);
    }
}
