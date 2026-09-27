package defpackage;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._HeadersCommonKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class c3 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public c3() {
        vt1 vt1Var = new vt1((char) 0, 8);
        vt1Var.b = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        vt1Var.d = iArr;
        vt1Var.c = -1;
        this.c = vt1Var;
        this.e = new StringBuilder();
    }

    public static /* synthetic */ void q(c3 c3Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = c3Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        c3Var.p(i, str, str2);
        throw null;
    }

    public static boolean u(char c) {
        if (c != ',' && c != ':' && c != ']' && c != '}') {
            return true;
        }
        return false;
    }

    public static int z(tu7 tu7Var, long j, t68 t68Var) {
        if (j == tu7Var.getPosition()) {
            return 0;
        }
        t68Var.a = j;
        return 1;
    }

    public void A(long j) {
        he1 he1Var = (he1) this.e;
        if (he1Var != null && he1Var.a == j) {
            return;
        }
        ge1 ge1Var = (ge1) this.c;
        this.e = new he1(j, ge1Var.a.a(j), ge1Var.c, ge1Var.d, ge1Var.e, ge1Var.f);
    }

    public abstract int B();

    public String C(int i, int i2) {
        return s().subSequence(i, i2).toString();
    }

    public boolean D() {
        int B = B();
        CharSequence s = s();
        if (B < s.length() && B != -1 && s.charAt(B) == ',') {
            this.b++;
            return true;
        }
        return false;
    }

    public boolean E(boolean z) {
        int y = y(B());
        int length = s().length() - y;
        if (length >= 4 && y != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != s().charAt(y + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || h7n.c(s().charAt(y + 4)) != 0) {
                    if (z) {
                        this.b = y + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void F(char c) {
        String str;
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String l = l();
                this.b = i;
                if (Intrinsics.areEqual(l, "null")) {
                    p(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String e = h7n.e(h7n.c(c));
        int i2 = this.b;
        int i3 = i2 - 1;
        if (i2 != s().length() && i3 >= 0) {
            str = String.valueOf(s().charAt(i3));
        } else {
            str = "EOF";
        }
        q(this, hdi.p("Expected ", e, ", but had '", str, "' instead"), i3, null, 4);
        throw null;
    }

    public int a(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.b = i;
            n();
            if (this.b + 4 < charSequence.length()) {
                return a(charSequence, this.b);
            }
            q(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        ((StringBuilder) this.e).append((char) (r(charSequence, i + 3) + (r(charSequence, i) << 12) + (r(charSequence, i + 1) << 8) + (r(charSequence, i + 2) << 4)));
        return i2;
    }

    public void b(int i, int i2) {
        ((StringBuilder) this.e).append(s(), i, i2);
    }

    public abstract boolean c();

    public void d(int i, String str) {
        if (s().length() - i >= str.length()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != (s().charAt(i + i2) | ' ')) {
                    q(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                    throw null;
                }
            }
            this.b = str.length() + i;
            return;
        }
        q(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }

    public abstract String e();

    public abstract byte f();

    public byte g(byte b) {
        String str;
        byte f = f();
        if (f != b) {
            String e = h7n.e(b);
            int i = this.b;
            int i2 = i - 1;
            if (i != s().length() && i2 >= 0) {
                str = String.valueOf(s().charAt(i2));
            } else {
                str = "EOF";
            }
            q(this, hdi.p("Expected ", e, ", but had '", str, "' instead"), i2, null, 4);
            throw null;
        }
        return f;
    }

    public abstract void h(char c);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0190, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0193, code lost:
    
        q(r23, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ac, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ad, code lost:
    
        q(r23, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0174, code lost:
    
        if (r8 != 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0176, code lost:
    
        r6 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b4, code lost:
    
        defpackage.dmk.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b7, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01b8, code lost:
    
        if (r13 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ba, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01bf, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c2, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c3, code lost:
    
        q(r23, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c9, code lost:
    
        q(r23, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ce, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0131, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0110, code lost:
    
        q(r23, "Unexpected symbol '" + r7 + "' in numeric literal", r6, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0128, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012d, code lost:
    
        if (r11 == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0132, code lost:
    
        if (r1 == r11) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0134, code lost:
    
        if (r13 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0138, code lost:
    
        if (r1 == (r11 - 1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0140, code lost:
    
        if (r19 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0142, code lost:
    
        if (r2 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014e, code lost:
    
        if (s().charAt(r11) != '\"') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0150, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0153, code lost:
    
        q(r23, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015c, code lost:
    
        q(r23, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0162, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0163, code lost:
    
        r23.b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0165, code lost:
    
        if (r20 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0167, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016a, code lost:
    
        if (r8 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016c, code lost:
    
        r6 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017b, code lost:
    
        r1 = r1 * r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0180, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0186, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018e, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long i() {
        boolean z;
        boolean z2;
        boolean z3;
        int y = y(B());
        int i = 0;
        if (y < s().length() && y != -1) {
            if (s().charAt(y) == '\"') {
                y++;
                if (y != s().length()) {
                    z = true;
                } else {
                    q(this, "EOF", 0, null, 6);
                    throw null;
                }
            } else {
                z = false;
            }
            int i2 = y;
            int i3 = 0;
            boolean z4 = false;
            boolean z5 = false;
            long j = 0;
            long j2 = 0;
            while (true) {
                if (i2 != s().length()) {
                    char charAt = s().charAt(i2);
                    if ((charAt != 'e' && charAt != 'E') || z4) {
                        z2 = z;
                        if (charAt == '-' && z4) {
                            if (i2 != y) {
                                i2++;
                                i3 = i;
                                z = z2;
                            } else {
                                q(this, "Unexpected symbol '-' in numeric literal", i, null, 6);
                                throw null;
                            }
                        } else if (charAt == '+' && z4) {
                            if (i2 != y) {
                                i2++;
                                z = z2;
                                i3 = 1;
                            } else {
                                q(this, "Unexpected symbol '+' in numeric literal", i, null, 6);
                                throw null;
                            }
                        } else {
                            z3 = z4;
                            if (charAt == '-') {
                                if (i2 == y) {
                                    i2++;
                                    z = z2;
                                    z4 = z3;
                                    z5 = true;
                                } else {
                                    q(this, "Unexpected symbol '-' in numeric literal", i, null, 6);
                                    throw null;
                                }
                            } else {
                                if (h7n.c(charAt) != 0) {
                                    break;
                                }
                                i2++;
                                int i4 = charAt - '0';
                                if (i4 < 0 || i4 >= 10) {
                                    break;
                                }
                                if (z3) {
                                    j = (j * 10) + i4;
                                    z = z2;
                                    z4 = z3;
                                } else {
                                    j2 = (j2 * 10) - i4;
                                    if (j2 <= 0) {
                                        z = z2;
                                        z4 = z3;
                                        i = 0;
                                    } else {
                                        q(this, "Numeric value overflow", 0, null, 6);
                                        throw null;
                                    }
                                }
                            }
                        }
                    } else if (i2 != y) {
                        i2++;
                        i3 = 1;
                        z4 = true;
                    } else {
                        q(this, "Unexpected symbol " + charAt + " in numeric literal", i, null, 6);
                        throw null;
                    }
                } else {
                    z2 = z;
                    z3 = z4;
                    break;
                }
            }
        } else {
            q(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public String j() {
        String str = (String) this.d;
        if (str != null) {
            str.getClass();
            this.d = null;
            return str;
        }
        return e();
    }

    public String k(CharSequence charSequence, int i, int i2) {
        String sb;
        char c;
        StringBuilder sb2 = (StringBuilder) this.e;
        charSequence.getClass();
        char charAt = charSequence.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                b(i, i2);
                int y = y(i2 + 1);
                if (y != -1) {
                    int i3 = y + 1;
                    char charAt2 = s().charAt(y);
                    if (charAt2 == 'u') {
                        i3 = a(s(), i3);
                    } else {
                        if (charAt2 < 'u') {
                            c = bj3.a[charAt2];
                        } else {
                            c = 0;
                        }
                        if (c != 0) {
                            sb2.append(c);
                        } else {
                            q(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                            throw null;
                        }
                    }
                    i = y(i3);
                    if (i == -1) {
                        q(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    b(i, i2);
                    i = y(i2);
                    if (i == -1) {
                        q(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            charAt = charSequence.charAt(i2);
        }
        if (!z) {
            sb = C(i, i2);
        } else {
            b(i, i2);
            sb = sb2.toString();
            sb2.setLength(0);
        }
        this.b = i2 + 1;
        return sb;
    }

    public String l() {
        String str;
        StringBuilder sb = (StringBuilder) this.e;
        String str2 = (String) this.d;
        if (str2 != null) {
            str2.getClass();
            this.d = null;
            return str2;
        }
        int B = B();
        if (B < s().length() && B != -1) {
            byte c = h7n.c(s().charAt(B));
            if (c == 1) {
                return j();
            }
            if (c == 0) {
                boolean z = false;
                while (h7n.c(s().charAt(B)) == 0) {
                    B++;
                    if (B >= s().length()) {
                        b(this.b, B);
                        int y = y(B);
                        if (y == -1) {
                            this.b = B;
                            b(0, 0);
                            String sb2 = sb.toString();
                            sb.setLength(0);
                            return sb2;
                        }
                        B = y;
                        z = true;
                    }
                }
                int i = this.b;
                if (!z) {
                    str = C(i, B);
                } else {
                    b(i, B);
                    String sb3 = sb.toString();
                    sb.setLength(0);
                    str = sb3;
                }
                this.b = B;
                return str;
            }
            q(this, "Expected beginning of the string, but got " + s().charAt(B), 0, null, 6);
            throw null;
        }
        q(this, "EOF", B, null, 4);
        throw null;
    }

    public String m() {
        String l = l();
        if (Intrinsics.areEqual(l, "null") && s().charAt(this.b - 1) != '\"') {
            q(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
            throw null;
        }
        return l;
    }

    public void o() {
        if (f() == 10) {
            return;
        }
        q(this, "Expected EOF after parsing, but had " + s().charAt(this.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void p(int i, String str, String str2) {
        String concat;
        str2.getClass();
        if (str2.length() == 0) {
            concat = "";
        } else {
            concat = "\n".concat(str2);
        }
        StringBuilder t = sv6.t(str, " at path: ");
        t.append(((vt1) this.c).r());
        t.append(concat);
        throw hzm.d(i, t.toString(), s());
    }

    public int r(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        q(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence s();

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        return z(r28, r9, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int t(tu7 tu7Var, t68 t68Var) {
        ke1 ke1Var = (ke1) this.d;
        while (true) {
            he1 he1Var = (he1) this.e;
            pfn.g(he1Var);
            long j = he1Var.f;
            long j2 = he1Var.g;
            long j3 = he1Var.h;
            if (j2 - j <= this.b) {
                this.e = null;
                ke1Var.O();
                return z(tu7Var, j, t68Var);
            }
            long position = j3 - tu7Var.getPosition();
            if (position < 0 || position > _HeadersCommonKt.HEADER_LIMIT) {
                break;
            }
            tu7Var.l((int) position);
            tu7Var.d();
            je1 d = ke1Var.d(tu7Var, he1Var.b);
            int i = d.c;
            long j4 = d.a;
            long j5 = d.b;
            if (i != -3) {
                if (i != -2) {
                    if (i != -1) {
                        if (i == 0) {
                            long position2 = j5 - tu7Var.getPosition();
                            if (position2 >= 0 && position2 <= _HeadersCommonKt.HEADER_LIMIT) {
                                tu7Var.l((int) position2);
                            }
                            this.e = null;
                            ke1Var.O();
                            return z(tu7Var, j5, t68Var);
                        }
                        dmk.n("Invalid case");
                        return 0;
                    }
                    he1Var.e = j4;
                    he1Var.g = j5;
                    he1Var.h = he1.a(he1Var.b, he1Var.d, j4, he1Var.f, j5, he1Var.c);
                } else {
                    he1Var.d = j4;
                    he1Var.f = j5;
                    he1Var.h = he1.a(he1Var.b, j4, he1Var.e, j5, he1Var.g, he1Var.c);
                }
            } else {
                this.e = null;
                ke1Var.O();
                return z(tu7Var, j3, t68Var);
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) s());
                sb.append("', currentPosition=");
                return sv6.o(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public abstract String v(String str, boolean z);

    public byte w() {
        CharSequence s = s();
        int i = this.b;
        while (true) {
            int y = y(i);
            if (y != -1) {
                char charAt = s.charAt(y);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    this.b = y;
                    return h7n.c(charAt);
                }
                i = y + 1;
            } else {
                this.b = y;
                return (byte) 10;
            }
        }
    }

    public String x(boolean z) {
        String j;
        byte w = w();
        if (z) {
            if (w == 1 || w == 0) {
                j = l();
            } else {
                return null;
            }
        } else {
            if (w != 1) {
                return null;
            }
            j = j();
        }
        this.d = j;
        return j;
    }

    public abstract int y(int i);

    public void n() {
    }

    public c3(ie1 ie1Var, ke1 ke1Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = ke1Var;
        this.b = i;
        this.c = new ge1(ie1Var, j, j2, j3, j4, j5);
    }
}
