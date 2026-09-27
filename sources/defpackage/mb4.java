package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mb4 {
    public static final mb4 h = new mb4(1, 2, 3, -1, -1, null);
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        ix2.v(0, 1, 2, 3, 4);
        u1k.G(5);
    }

    public mb4(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    public static String a(int i) {
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    return ace.f(i, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String b(int i) {
        if (i != -1) {
            if (i != 6) {
                if (i != 1) {
                    if (i != 2) {
                        return ace.f(i, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String c(int i) {
        if (i != -1) {
            if (i != 10) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 6) {
                                if (i != 7) {
                                    return ace.f(i, "Undefined color transfer ");
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static boolean e(mb4 mb4Var) {
        if (mb4Var == null) {
            return true;
        }
        int i = mb4Var.a;
        if (i == -1 || i == 1 || i == 2) {
            int i2 = mb4Var.b;
            if (i2 == -1 || i2 == 2) {
                int i3 = mb4Var.c;
                if ((i3 == -1 || i3 == 3) && mb4Var.d == null) {
                    int i4 = mb4Var.f;
                    if (i4 == -1 || i4 == 8) {
                        int i5 = mb4Var.e;
                        if (i5 == -1 || i5 == 8) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 9) {
            return 6;
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            return -1;
        }
        return 2;
    }

    public static int g(int i) {
        if (i != 1) {
            if (i != 4) {
                if (i != 13) {
                    if (i == 16) {
                        return 6;
                    }
                    if (i == 18) {
                        return 7;
                    }
                    if (i != 6 && i != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    public final boolean d() {
        if (this.a != -1 && this.b != -1 && this.c != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mb4.class == obj.getClass()) {
            mb4 mb4Var = (mb4) obj;
            if (this.a == mb4Var.a && this.b == mb4Var.b && this.c == mb4Var.c && Arrays.equals(this.d, mb4Var.d) && this.e == mb4Var.e && this.f == mb4Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        if (i == 0) {
            int hashCode = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
            this.g = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.a));
        sb.append(", ");
        sb.append(a(this.b));
        sb.append(", ");
        sb.append(c(this.c));
        sb.append(", ");
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", ");
        String str2 = "NA";
        int i = this.e;
        if (i == -1) {
            str = "NA";
        } else {
            str = i + "bit Luma";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return woa.r(sb, str2, ")");
    }
}
