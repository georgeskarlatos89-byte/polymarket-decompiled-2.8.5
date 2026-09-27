package defpackage;

import com.appsflyer.internal.l;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class ufa implements Closeable {
    public final StringReader a;
    public long i;
    public int j;
    public String k;
    public int[] l;
    public String[] n;
    public int[] o;
    public g1i b = g1i.LEGACY_STRICT;
    public final char[] c = new char[Barcode.FORMAT_UPC_E];
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int m = 1;

    static {
        ci5.b = new ci5(11);
    }

    public ufa(StringReader stringReader) {
        int[] iArr = new int[32];
        this.l = iArr;
        iArr[0] = 6;
        this.n = new String[32];
        this.o = new int[32];
        this.a = stringReader;
    }

    public final boolean A() {
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 5) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.h = 0;
            int[] iArr2 = this.o;
            int i3 = this.m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw m0("a boolean");
    }

    public final int D(boolean z) {
        char c;
        int i = this.d;
        int i2 = this.e;
        while (true) {
            if (i == i2) {
                this.d = i;
                if (!o(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input".concat(z()));
                }
                i = this.d;
                i2 = this.e;
            }
            int i3 = i + 1;
            char[] cArr = this.c;
            c = cArr[i];
            if (c == '\n') {
                this.f++;
                this.g = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.d = i3;
                    if (i3 == i2) {
                        this.d = i;
                        boolean o = o(2);
                        this.d++;
                        if (!o) {
                            break;
                        }
                    }
                    e();
                    int i4 = this.d;
                    char c2 = cArr[i4];
                    if (c2 != '*') {
                        if (c2 != '/') {
                            break;
                        }
                        this.d = i4 + 1;
                        f0();
                        i = this.d;
                        i2 = this.e;
                    } else {
                        this.d = i4 + 1;
                        while (true) {
                            if (this.d + 2 > this.e && !o(2)) {
                                j0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.d;
                            if (cArr[i5] == '\n') {
                                this.f++;
                                this.g = i5 + 1;
                            } else {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.d;
                                    if (i6 < 2) {
                                        if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        i = i7 + 2;
                                        i2 = this.e;
                                        break;
                                    }
                                }
                            }
                            this.d++;
                        }
                    }
                } else if (c == '#') {
                    this.d = i3;
                    e();
                    f0();
                    i = this.d;
                    i2 = this.e;
                } else {
                    this.d = i3;
                    return c;
                }
            }
            i = i3;
        }
        return c;
    }

    public final void G() {
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 7) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw m0("null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        r11.d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String K(char c) {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.d;
            int i3 = this.e;
            while (true) {
                int i4 = i3;
                int i5 = i2;
                while (true) {
                    cArr = this.c;
                    if (i2 >= i4) {
                        break;
                    }
                    int i6 = i2 + 1;
                    char c2 = cArr[i2];
                    if (this.b == g1i.STRICT && c2 < ' ') {
                        j0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    }
                    if (c2 == c) {
                        this.d = i6;
                        int i7 = (i6 - i5) - 1;
                        if (sb == null) {
                            return new String(cArr, i5, i7);
                        }
                        sb.append(cArr, i5, i7);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        break;
                    }
                    if (c2 == '\n') {
                        this.f++;
                        this.g = i6;
                    }
                    i2 = i6;
                }
                sb.append(cArr, i5, i);
                sb.append(Y());
                i2 = this.d;
                i3 = this.e;
            }
        } while (o(1));
        j0("Unterminated string");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String N() {
        char[] cArr;
        String sb;
        StringBuilder sb2 = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.d + i2;
                int i4 = this.e;
                cArr = this.c;
                if (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 < cArr.length) {
                    if (o(i2 + 1)) {
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(cArr, this.d, i2);
                    this.d += i2;
                }
            }
            i = i2;
            int i5 = this.d;
            if (sb2 != null) {
                sb = new String(cArr, i5, i);
            } else {
                sb2.append(cArr, i5, i);
                sb = sb2.toString();
            }
            this.d += i;
            return sb;
        } while (o(1));
        int i52 = this.d;
        if (sb2 != null) {
        }
        this.d += i;
        return sb;
    }

    public final ega R() {
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        switch (i) {
            case 1:
                return ega.BEGIN_OBJECT;
            case 2:
                return ega.END_OBJECT;
            case 3:
                return ega.BEGIN_ARRAY;
            case 4:
                return ega.END_ARRAY;
            case 5:
            case 6:
                return ega.BOOLEAN;
            case 7:
                return ega.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return ega.STRING;
            case 12:
            case 13:
            case 14:
                return ega.NAME;
            case 15:
            case 16:
                return ega.NUMBER;
            case 17:
                return ega.END_DOCUMENT;
            default:
                f27.p();
                return null;
        }
    }

    public final void X(int i) {
        int i2 = this.m;
        if (i2 - 1 < 255) {
            int[] iArr = this.l;
            if (i2 == iArr.length) {
                int i3 = i2 * 2;
                this.l = Arrays.copyOf(iArr, i3);
                this.o = Arrays.copyOf(this.o, i3);
                this.n = (String[]) Arrays.copyOf(this.n, i3);
            }
            int[] iArr2 = this.l;
            int i4 = this.m;
            this.m = i4 + 1;
            iArr2[i4] = i;
            return;
        }
        throw new IOException("Nesting limit 255 reached".concat(z()));
    }

    public final char Y() {
        int i;
        if (this.d == this.e && !o(1)) {
            j0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        char[] cArr = this.c;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c != 'b') {
                            if (c != 'f') {
                                if (c == 'n') {
                                    return '\n';
                                }
                                if (c != 'r') {
                                    if (c != 't') {
                                        if (c == 'u') {
                                            if (i2 + 5 > this.e && !o(4)) {
                                                j0("Unterminated escape sequence");
                                                throw null;
                                            }
                                            int i4 = this.d;
                                            int i5 = i4 + 4;
                                            int i6 = 0;
                                            while (i4 < i5) {
                                                char c2 = cArr[i4];
                                                int i7 = i6 << 4;
                                                if (c2 >= '0' && c2 <= '9') {
                                                    i = c2 - '0';
                                                } else if (c2 >= 'a' && c2 <= 'f') {
                                                    i = c2 - 'W';
                                                } else if (c2 >= 'A' && c2 <= 'F') {
                                                    i = c2 - '7';
                                                } else {
                                                    j0("Malformed Unicode escape \\u".concat(new String(cArr, this.d, 4)));
                                                    throw null;
                                                }
                                                i6 = i + i7;
                                                i4++;
                                            }
                                            this.d += 4;
                                            return (char) i6;
                                        }
                                        j0("Invalid escape sequence");
                                        throw null;
                                    }
                                    return '\t';
                                }
                                return '\r';
                            }
                            return '\f';
                        }
                        return '\b';
                    }
                }
            }
            return c;
        }
        if (this.b != g1i.STRICT) {
            this.f++;
            this.g = i3;
        } else {
            j0("Cannot escape a newline character in strict mode");
            throw null;
        }
        if (this.b == g1i.STRICT) {
            j0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public final void a0(g1i g1iVar) {
        Objects.requireNonNull(g1iVar);
        this.b = g1iVar;
    }

    public final void beginArray() {
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 3) {
            X(1);
            this.o[this.m - 1] = 0;
            this.h = 0;
            return;
        }
        throw m0("BEGIN_ARRAY");
    }

    public final void beginObject() {
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 1) {
            X(3);
            this.h = 0;
            return;
        }
        throw m0("BEGIN_OBJECT");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h = 0;
        this.l[0] = 8;
        this.m = 1;
        this.a.close();
    }

    public final void e() {
        if (this.b == g1i.LENIENT) {
            return;
        }
        j0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void e0(char c) {
        do {
            int i = this.d;
            int i2 = this.e;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.c[i];
                if (c2 == c) {
                    this.d = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.d = i3;
                    Y();
                    i = this.d;
                    i2 = this.e;
                } else {
                    if (c2 == '\n') {
                        this.f++;
                        this.g = i3;
                    }
                    i = i3;
                }
            }
            this.d = i;
        } while (o(1));
        j0("Unterminated string");
        throw null;
    }

    public final void endArray() {
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 4) {
            int i2 = this.m;
            this.m = i2 - 1;
            int[] iArr = this.o;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            this.h = 0;
            return;
        }
        throw m0("END_ARRAY");
    }

    public final void endObject() {
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 2) {
            int i2 = this.m;
            int i3 = i2 - 1;
            this.m = i3;
            this.n[i3] = null;
            int[] iArr = this.o;
            int i4 = i2 - 2;
            iArr[i4] = iArr[i4] + 1;
            this.h = 0;
            return;
        }
        throw m0("END_OBJECT");
    }

    public final void f0() {
        char c;
        do {
            if (this.d < this.e || o(1)) {
                int i = this.d;
                int i2 = i + 1;
                this.d = i2;
                c = this.c[i];
                if (c == '\n') {
                    this.f++;
                    this.g = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d1, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0226, code lost:
    
        if (y(r14) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01aa, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0229, code lost:
    
        if (r12 != 2) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x022b, code lost:
    
        if (r13 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0231, code lost:
    
        if (r24 != Long.MIN_VALUE) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0233, code lost:
    
        if (r7 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x023a, code lost:
    
        if (r24 != 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x023c, code lost:
    
        if (r7 != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x023e, code lost:
    
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0240, code lost:
    
        if (r7 == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0243, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0244, code lost:
    
        r26.i = r4;
        r26.d += r2;
        r9 = 15;
        r26.h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0236, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0250, code lost:
    
        if (r12 == r8) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0253, code lost:
    
        if (r12 == 4) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0256, code lost:
    
        if (r12 != 7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0258, code lost:
    
        r26.j = r2;
        r9 = 16;
        r26.h = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0282 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g() {
        int D;
        int i;
        String str;
        String str2;
        int i2;
        boolean z;
        int i3;
        char c;
        boolean z2;
        int i4;
        int[] iArr = this.l;
        boolean z3 = true;
        int i5 = this.m - 1;
        int i6 = iArr[i5];
        char[] cArr = this.c;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int D2 = D(true);
            if (D2 != 44) {
                if (D2 != 59) {
                    if (D2 == 93) {
                        this.h = 4;
                        return 4;
                    }
                    j0("Unterminated array");
                    throw null;
                }
                e();
            }
        } else if (i6 != 3 && i6 != 5) {
            if (i6 == 4) {
                iArr[i5] = 5;
                int D3 = D(true);
                if (D3 != 58) {
                    if (D3 == 61) {
                        e();
                        if (this.d < this.e || o(1)) {
                            int i7 = this.d;
                            if (cArr[i7] == '>') {
                                this.d = i7 + 1;
                            }
                        }
                    } else {
                        j0("Expected ':'");
                        throw null;
                    }
                }
            } else if (i6 == 6) {
                if (this.b == g1i.LENIENT) {
                    D(true);
                    int i8 = this.d;
                    this.d = i8 - 1;
                    if (i8 + 4 <= this.e || o(5)) {
                        int i9 = this.d;
                        if (cArr[i9] == ')' && cArr[i9 + 1] == ']' && cArr[i9 + 2] == '}' && cArr[i9 + 3] == '\'' && cArr[i9 + 4] == '\n') {
                            this.d = i9 + 5;
                        }
                    }
                }
                this.l[this.m - 1] = 7;
            } else if (i6 == 7) {
                if (D(false) == -1) {
                    this.h = 17;
                    return 17;
                }
                e();
                this.d--;
            } else if (i6 == 8) {
                dmk.n("JsonReader is closed");
                return 0;
            }
        } else {
            iArr[i5] = 4;
            if (i6 == 5 && (D = D(true)) != 44) {
                if (D != 59) {
                    if (D == 125) {
                        this.h = 2;
                        return 2;
                    }
                    j0("Unterminated object");
                    throw null;
                }
                e();
            }
            int D4 = D(true);
            if (D4 != 34) {
                if (D4 != 39) {
                    if (D4 != 125) {
                        e();
                        this.d--;
                        if (y((char) D4)) {
                            this.h = 14;
                            return 14;
                        }
                        j0("Expected name");
                        throw null;
                    }
                    if (i6 != 5) {
                        this.h = 2;
                        return 2;
                    }
                    j0("Expected name");
                    throw null;
                }
                e();
                this.h = 12;
                return 12;
            }
            this.h = 13;
            return 13;
        }
        int D5 = D(true);
        if (D5 != 34) {
            if (D5 != 39) {
                if (D5 != 44 && D5 != 59) {
                    if (D5 != 91) {
                        if (D5 != 93) {
                            if (D5 != 123) {
                                int i10 = this.d - 1;
                                this.d = i10;
                                char c2 = cArr[i10];
                                if (c2 != 't' && c2 != 'T') {
                                    if (c2 != 'f' && c2 != 'F') {
                                        if (c2 == 'n' || c2 == 'N') {
                                            str = "null";
                                            str2 = "NULL";
                                            i2 = 7;
                                        }
                                        i3 = 0;
                                        if (i3 == 0) {
                                            return i3;
                                        }
                                        int i11 = this.d;
                                        int i12 = this.e;
                                        boolean z4 = true;
                                        int i13 = 0;
                                        long j = 0;
                                        boolean z5 = false;
                                        char c3 = 0;
                                        while (true) {
                                            if (i11 + i13 == i12) {
                                                if (i13 == cArr.length) {
                                                    break;
                                                }
                                                if (!o(i13 + 1)) {
                                                    long j2 = j;
                                                    break;
                                                }
                                                i11 = this.d;
                                                i12 = this.e;
                                            }
                                            char c4 = cArr[i11 + i13];
                                            if (c4 != '+') {
                                                if (c4 != 'E' && c4 != 'e') {
                                                    if (c4 != '-') {
                                                        if (c4 != '.') {
                                                            if (c4 < '0' || c4 > '9') {
                                                                break;
                                                            }
                                                            if (c3 != z3 && c3 != 0) {
                                                                if (c3 == 2) {
                                                                    if (j == 0) {
                                                                        break;
                                                                    }
                                                                    long j3 = j;
                                                                    long j4 = (10 * j) - (c4 - '0');
                                                                    if (j3 <= -922337203685477580L && (j3 != -922337203685477580L || j4 >= j3)) {
                                                                        z2 = false;
                                                                    } else {
                                                                        z2 = true;
                                                                    }
                                                                    z4 &= z2;
                                                                    j = j4;
                                                                } else {
                                                                    long j5 = j;
                                                                    if (c3 == 3) {
                                                                        j = j5;
                                                                        c3 = 4;
                                                                    } else if (c3 != 5 && c3 != 6) {
                                                                        j = j5;
                                                                    } else {
                                                                        j = j5;
                                                                        c3 = 7;
                                                                    }
                                                                }
                                                            } else {
                                                                j = -(c4 - '0');
                                                                c3 = 2;
                                                            }
                                                            i13++;
                                                            z3 = true;
                                                        } else {
                                                            if (c3 != 2) {
                                                                break;
                                                            }
                                                            c3 = 3;
                                                            i13++;
                                                            z3 = true;
                                                        }
                                                    } else if (c3 == 0) {
                                                        z5 = true;
                                                        c3 = 1;
                                                        i13++;
                                                        z3 = true;
                                                    } else {
                                                        if (c3 != 5) {
                                                            break;
                                                        }
                                                        c3 = 6;
                                                        i13++;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    if (c3 != 2 && c3 != 4) {
                                                        break;
                                                    }
                                                    c3 = 5;
                                                    i13++;
                                                    z3 = true;
                                                }
                                                if (i4 == 0) {
                                                    return i4;
                                                }
                                                if (y(cArr[this.d])) {
                                                    e();
                                                    this.h = 10;
                                                    return 10;
                                                }
                                                j0("Expected value");
                                                throw null;
                                            }
                                            if (c3 != 5) {
                                                break;
                                            }
                                            c3 = 6;
                                            i13++;
                                            z3 = true;
                                        }
                                        i4 = 0;
                                        if (i4 == 0) {
                                        }
                                    } else {
                                        str = "false";
                                        str2 = "FALSE";
                                        i2 = 6;
                                    }
                                } else {
                                    str = "true";
                                    str2 = "TRUE";
                                    i2 = 5;
                                }
                                if (this.b != g1i.STRICT) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                int length = str.length();
                                int i14 = 0;
                                while (true) {
                                    int i15 = this.d;
                                    int i16 = this.e;
                                    if (i14 < length) {
                                        if ((i15 + i14 >= i16 && !o(i14 + 1)) || ((c = cArr[this.d + i14]) != str.charAt(i14) && (!z || c != str2.charAt(i14)))) {
                                            break;
                                        }
                                        i14++;
                                    } else if ((i15 + length >= i16 && !o(length + 1)) || !y(cArr[this.d + length])) {
                                        this.d += length;
                                        this.h = i2;
                                        i3 = i2;
                                    }
                                }
                                i3 = 0;
                                if (i3 == 0) {
                                }
                            } else {
                                this.h = 1;
                                return 1;
                            }
                        } else {
                            i = 1;
                            if (i6 == 1) {
                                this.h = 4;
                                return 4;
                            }
                        }
                    } else {
                        this.h = 3;
                        return 3;
                    }
                } else {
                    i = 1;
                }
                if (i6 != i && i6 != 2) {
                    j0("Unexpected value");
                    throw null;
                }
                e();
                this.d -= i;
                this.h = 7;
                return 7;
            }
            e();
            this.h = 8;
            return 8;
        }
        this.h = 9;
        return 9;
    }

    public final boolean hasNext() {
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i != 2 && i != 4 && i != 17) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void i0() {
        /*
            r3 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r3.d
            int r1 = r1 + r0
            int r2 = r3.e
            if (r1 >= r2) goto L4f
            char[] r2 = r3.c
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L49
            r2 = 10
            if (r1 == r2) goto L49
            r2 = 12
            if (r1 == r2) goto L49
            r2 = 13
            if (r1 == r2) goto L49
            r2 = 32
            if (r1 == r2) goto L49
            r2 = 35
            if (r1 == r2) goto L46
            r2 = 44
            if (r1 == r2) goto L49
            r2 = 47
            if (r1 == r2) goto L46
            r2 = 61
            if (r1 == r2) goto L46
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L49
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L49
            r2 = 58
            if (r1 == r2) goto L49
            r2 = 59
            if (r1 == r2) goto L46
            switch(r1) {
                case 91: goto L49;
                case 92: goto L46;
                case 93: goto L49;
                default: goto L43;
            }
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            r3.e()
        L49:
            int r1 = r3.d
            int r1 = r1 + r0
            r3.d = r1
            return
        L4f:
            r3.d = r1
            r0 = 1
            boolean r0 = r3.o(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufa.i0():void");
    }

    public final void j0(String str) {
        throw new IOException(str + z() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    }

    public final IllegalStateException m0(String str) {
        String str2;
        if (R() == ega.NULL) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        StringBuilder s = ix2.s("Expected ", str, " but was ");
        s.append(R());
        s.append(z());
        s.append("\nSee ");
        s.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(s.toString());
    }

    public final double nextDouble() {
        char c;
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            this.k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else if (i != 8 && i != 9) {
            if (i == 10) {
                this.k = N();
            } else if (i != 11) {
                throw m0("a double");
            }
        } else {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.k = K(c);
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        if (this.b != g1i.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            j0("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.k = null;
        this.h = 0;
        int[] iArr2 = this.o;
        int i3 = this.m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public final int nextInt() {
        char c;
        String K;
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 15) {
            long j = this.i;
            int i2 = (int) j;
            if (j == i2) {
                this.h = 0;
                int[] iArr = this.o;
                int i3 = this.m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.i + z());
        }
        if (i == 16) {
            this.k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw m0("an int");
            }
            if (i == 10) {
                K = N();
                this.k = K;
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                K = K(c);
                this.k = K;
            }
            try {
                int parseInt = Integer.parseInt(K);
                this.h = 0;
                int[] iArr2 = this.o;
                int i4 = this.m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.k = null;
            this.h = 0;
            int[] iArr3 = this.o;
            int i6 = this.m - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        l.j(this.k, z(), "Expected an int but was ");
        return 0;
    }

    public final long nextLong() {
        char c;
        String K;
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            this.k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw m0("a long");
            }
            if (i == 10) {
                K = N();
                this.k = K;
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                K = K(c);
                this.k = K;
            }
            try {
                long parseLong = Long.parseLong(K);
                this.h = 0;
                int[] iArr2 = this.o;
                int i3 = this.m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.k = null;
            this.h = 0;
            int[] iArr3 = this.o;
            int i4 = this.m - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        l.j(this.k, z(), "Expected a long but was ");
        return 0L;
    }

    public final String nextName() {
        String K;
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 14) {
            K = N();
        } else if (i == 12) {
            K = K('\'');
        } else if (i == 13) {
            K = K('\"');
        } else {
            throw m0("a name");
        }
        this.h = 0;
        this.n[this.m - 1] = K;
        return K;
    }

    public final String nextString() {
        String str;
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 10) {
            str = N();
        } else if (i == 8) {
            str = K('\'');
        } else if (i == 9) {
            str = K('\"');
        } else if (i == 11) {
            str = this.k;
            this.k = null;
        } else if (i == 15) {
            str = Long.toString(this.i);
        } else if (i == 16) {
            str = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else {
            throw m0("a string");
        }
        this.h = 0;
        int[] iArr = this.o;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final boolean o(int i) {
        int i2;
        int i3;
        int i4 = this.g;
        int i5 = this.d;
        this.g = i4 - i5;
        int i6 = this.e;
        char[] cArr = this.c;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.e = 0;
        }
        this.d = 0;
        do {
            int i8 = this.e;
            int read = this.a.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.e + read;
            this.e = i2;
            if (this.f == 0 && (i3 = this.g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.d++;
                this.g = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final String p(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.m;
            if (i < i2) {
                int i3 = this.l[i];
                switch (i3) {
                    case 1:
                    case 2:
                        int i4 = this.o[i];
                        if (z && i4 > 0 && i == i2 - 1) {
                            i4--;
                        }
                        sb.append('[');
                        sb.append(i4);
                        sb.append(']');
                        break;
                    case 3:
                    case 4:
                    case 5:
                        sb.append('.');
                        String str = this.n[i];
                        if (str == null) {
                            break;
                        } else {
                            sb.append(str);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        dmk.i(ace.f(i3, "Unknown scope value: "));
                        return null;
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    public final void skipValue() {
        int i = 0;
        do {
            int i2 = this.h;
            if (i2 == 0) {
                i2 = g();
            }
            switch (i2) {
                case 1:
                    X(3);
                    i++;
                    this.h = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.n[this.m - 1] = null;
                    }
                    this.m--;
                    i--;
                    this.h = 0;
                    break;
                case 3:
                    X(1);
                    i++;
                    this.h = 0;
                    break;
                case 4:
                    this.m--;
                    i--;
                    this.h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.h = 0;
                    break;
                case 8:
                    e0('\'');
                    this.h = 0;
                    break;
                case 9:
                    e0('\"');
                    this.h = 0;
                    break;
                case 10:
                    i0();
                    this.h = 0;
                    break;
                case 12:
                    e0('\'');
                    if (i == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 13:
                    e0('\"');
                    if (i == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 14:
                    i0();
                    if (i == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 16:
                    this.d += this.j;
                    this.h = 0;
                    break;
                case 17:
                    return;
            }
        } while (i > 0);
        int[] iArr = this.o;
        int i3 = this.m - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final String toString() {
        return ufa.class.getSimpleName().concat(z());
    }

    public final boolean y(char c) {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c != ',') {
                    if (c != '/' && c != '=') {
                        if (c != '{' && c != '}' && c != ':') {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            e();
            return false;
        }
        return false;
    }

    public final String z() {
        StringBuilder n = m51.n(this.f + 1, " at line ", (this.d - this.g) + 1, " column ", " path ");
        n.append(p(false));
        return n.toString();
    }
}
