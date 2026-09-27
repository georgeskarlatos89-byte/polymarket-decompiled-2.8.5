package io.sentry.vendor.gson.stream;

import com.appsflyer.internal.l;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.dmk;
import defpackage.f27;
import defpackage.m51;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a implements Closeable {
    public final Reader a;
    public long i;
    public int j;
    public String k;
    public int[] l;
    public String[] n;
    public int[] o;
    public boolean b = false;
    public final char[] c = new char[Barcode.FORMAT_UPC_E];
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int m = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.l = iArr;
        iArr[0] = 6;
        this.n = new String[32];
        this.o = new int[32];
        this.a = reader;
    }

    public final int A(boolean z) {
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
                    throw new EOFException("End of input".concat(y()));
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
                        Y();
                        i = this.d;
                        i2 = this.e;
                    } else {
                        this.d = i4 + 1;
                        while (true) {
                            if (this.d + 2 > this.e && !o(2)) {
                                a0("Unterminated comment");
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
                    Y();
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

    public final void D() {
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
        StringBuilder sb = new StringBuilder("Expected null but was ");
        sb.append(peek());
        l.m(sb, y());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r10.d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String G(char c) {
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
                sb.append(R());
                i2 = this.d;
                i3 = this.e;
            }
        } while (o(1));
        a0("Unterminated string");
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
    public final String K() {
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

    public final void N(int i) {
        int i2 = this.m;
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
    }

    public final char R() {
        int i;
        if (this.d == this.e && !o(1)) {
            a0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        char[] cArr = this.c;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                if (c != 'b') {
                    if (c != 'f') {
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i2 + 5 > this.e && !o(4)) {
                                        a0("Unterminated escape sequence");
                                        throw null;
                                    }
                                    int i4 = this.d;
                                    int i5 = i4 + 4;
                                    char c2 = 0;
                                    while (i4 < i5) {
                                        char c3 = cArr[i4];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 >= '0' && c3 <= '9') {
                                            i = c3 - '0';
                                        } else if (c3 >= 'a' && c3 <= 'f') {
                                            i = c3 - 'W';
                                        } else if (c3 >= 'A' && c3 <= 'F') {
                                            i = c3 - '7';
                                        } else {
                                            throw new NumberFormatException("\\u".concat(new String(cArr, this.d, 4)));
                                        }
                                        c2 = (char) (i + c4);
                                        i4++;
                                    }
                                    this.d += 4;
                                    return c2;
                                }
                                a0("Invalid escape sequence");
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
            return c;
        }
        this.f++;
        this.g = i3;
        return c;
    }

    public final void X(char c) {
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
                    R();
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
        a0("Unterminated string");
        throw null;
    }

    public final void Y() {
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

    public final void a0(String str) {
        throw new IOException(str.concat(y()));
    }

    public final void beginArray() {
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 3) {
            N(1);
            this.o[this.m - 1] = 0;
            this.h = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(peek());
            l.m(sb, y());
        }
    }

    public final void beginObject() {
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 1) {
            N(3);
            this.h = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(peek());
            l.m(sb, y());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h = 0;
        this.l[0] = 8;
        this.m = 1;
        this.a.close();
    }

    public final void e() {
        if (this.b) {
            return;
        }
        a0("Use JsonReader.setLenient(true) to accept malformed JSON");
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
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(peek());
        l.m(sb, y());
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
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(peek());
        l.m(sb, y());
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x020a, code lost:
    
        if (p(r9) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0199, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x020d, code lost:
    
        if (r11 != 2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x020f, code lost:
    
        if (r13 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0215, code lost:
    
        if (r14 != Long.MIN_VALUE) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0217, code lost:
    
        if (r4 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x021e, code lost:
    
        if (r14 != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0220, code lost:
    
        if (r4 != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0222, code lost:
    
        if (r4 == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0225, code lost:
    
        r14 = -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0226, code lost:
    
        r24.i = r14;
        r24.d += r2;
        r9 = 15;
        r24.h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x021a, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0232, code lost:
    
        if (r11 == r10) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0235, code lost:
    
        if (r11 == 4) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0238, code lost:
    
        if (r11 != 7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x023a, code lost:
    
        r24.j = r2;
        r9 = 16;
        r24.h = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0265 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g() {
        int A;
        String str;
        String str2;
        int i;
        int i2;
        char c;
        char c2;
        boolean z;
        int i3;
        int[] iArr = this.l;
        int i4 = this.m - 1;
        int i5 = iArr[i4];
        char[] cArr = this.c;
        if (i5 == 1) {
            iArr[i4] = 2;
        } else if (i5 == 2) {
            int A2 = A(true);
            if (A2 != 44) {
                if (A2 != 59) {
                    if (A2 == 93) {
                        this.h = 4;
                        return 4;
                    }
                    a0("Unterminated array");
                    throw null;
                }
                e();
            }
        } else if (i5 != 3 && i5 != 5) {
            if (i5 == 4) {
                iArr[i4] = 5;
                int A3 = A(true);
                if (A3 != 58) {
                    if (A3 == 61) {
                        e();
                        if (this.d < this.e || o(1)) {
                            int i6 = this.d;
                            if (cArr[i6] == '>') {
                                this.d = i6 + 1;
                            }
                        }
                    } else {
                        a0("Expected ':'");
                        throw null;
                    }
                }
            } else if (i5 == 6) {
                if (this.b) {
                    A(true);
                    int i7 = this.d;
                    int i8 = i7 - 1;
                    this.d = i8;
                    if ((i7 + 4 <= this.e || o(5)) && cArr[i8] == ')' && cArr[i7] == ']' && cArr[i7 + 1] == '}' && cArr[i7 + 2] == '\'' && cArr[i7 + 3] == '\n') {
                        this.d += 5;
                    }
                }
                this.l[this.m - 1] = 7;
            } else if (i5 == 7) {
                if (A(false) == -1) {
                    this.h = 17;
                    return 17;
                }
                e();
                this.d--;
            } else if (i5 == 8) {
                dmk.n("JsonReader is closed");
                return 0;
            }
        } else {
            iArr[i4] = 4;
            if (i5 == 5 && (A = A(true)) != 44) {
                if (A != 59) {
                    if (A == 125) {
                        this.h = 2;
                        return 2;
                    }
                    a0("Unterminated object");
                    throw null;
                }
                e();
            }
            int A4 = A(true);
            if (A4 != 34) {
                if (A4 != 39) {
                    if (A4 != 125) {
                        e();
                        this.d--;
                        if (p((char) A4)) {
                            this.h = 14;
                            return 14;
                        }
                        a0("Expected name");
                        throw null;
                    }
                    if (i5 != 5) {
                        this.h = 2;
                        return 2;
                    }
                    a0("Expected name");
                    throw null;
                }
                e();
                this.h = 12;
                return 12;
            }
            this.h = 13;
            return 13;
        }
        int A5 = A(true);
        if (A5 != 34) {
            if (A5 != 39) {
                if (A5 != 44 && A5 != 59) {
                    if (A5 != 91) {
                        if (A5 != 93) {
                            if (A5 != 123) {
                                int i9 = this.d - 1;
                                this.d = i9;
                                char c3 = cArr[i9];
                                if (c3 != 't' && c3 != 'T') {
                                    if (c3 != 'f' && c3 != 'F') {
                                        if (c3 == 'n' || c3 == 'N') {
                                            str = "null";
                                            str2 = "NULL";
                                            i = 7;
                                        }
                                        i2 = 0;
                                        if (i2 == 0) {
                                            return i2;
                                        }
                                        int i10 = this.d;
                                        int i11 = this.e;
                                        boolean z2 = true;
                                        int i12 = 0;
                                        boolean z3 = false;
                                        char c4 = 0;
                                        long j = 0;
                                        while (true) {
                                            if (i10 + i12 == i11) {
                                                if (i12 == cArr.length) {
                                                    break;
                                                }
                                                if (!o(i12 + 1)) {
                                                    break;
                                                }
                                                i10 = this.d;
                                                i11 = this.e;
                                            }
                                            char c5 = cArr[i10 + i12];
                                            if (c5 != '+') {
                                                if (c5 != 'E' && c5 != 'e') {
                                                    if (c5 != '-') {
                                                        if (c5 != '.') {
                                                            if (c5 < '0' || c5 > '9') {
                                                                break;
                                                            }
                                                            if (c4 != 1 && c4 != 0) {
                                                                if (c4 == 2) {
                                                                    if (j == 0) {
                                                                        break;
                                                                    }
                                                                    long j2 = (10 * j) - (c5 - '0');
                                                                    if (j <= -922337203685477580L && (j != -922337203685477580L || j2 >= j)) {
                                                                        z = false;
                                                                    } else {
                                                                        z = true;
                                                                    }
                                                                    z2 &= z;
                                                                    j = j2;
                                                                } else if (c4 == 3) {
                                                                    c4 = 4;
                                                                } else if (c4 == 5 || c4 == 6) {
                                                                    c4 = 7;
                                                                }
                                                            } else {
                                                                j = -(c5 - '0');
                                                                c4 = 2;
                                                            }
                                                            i12++;
                                                        } else {
                                                            if (c4 != 2) {
                                                                break;
                                                            }
                                                            c4 = 3;
                                                            i12++;
                                                        }
                                                    } else {
                                                        c2 = 6;
                                                        if (c4 == 0) {
                                                            z3 = true;
                                                            c4 = 1;
                                                            i12++;
                                                        } else {
                                                            if (c4 != 5) {
                                                                break;
                                                            }
                                                            c4 = c2;
                                                            i12++;
                                                        }
                                                    }
                                                } else {
                                                    if (c4 != 2 && c4 != 4) {
                                                        break;
                                                    }
                                                    c4 = 5;
                                                    i12++;
                                                }
                                                if (i3 == 0) {
                                                    return i3;
                                                }
                                                if (p(cArr[this.d])) {
                                                    e();
                                                    this.h = 10;
                                                    return 10;
                                                }
                                                a0("Expected value");
                                                throw null;
                                            }
                                            c2 = 6;
                                            if (c4 != 5) {
                                                break;
                                            }
                                            c4 = c2;
                                            i12++;
                                        }
                                        i3 = 0;
                                        if (i3 == 0) {
                                        }
                                    } else {
                                        str = "false";
                                        str2 = "FALSE";
                                        i = 6;
                                    }
                                } else {
                                    str = "true";
                                    str2 = "TRUE";
                                    i = 5;
                                }
                                int length = str.length();
                                int i13 = 1;
                                while (true) {
                                    int i14 = this.d;
                                    int i15 = this.e;
                                    if (i13 < length) {
                                        if ((i14 + i13 >= i15 && !o(i13 + 1)) || ((c = cArr[this.d + i13]) != str.charAt(i13) && c != str2.charAt(i13))) {
                                            break;
                                        }
                                        i13++;
                                    } else if ((i14 + length >= i15 && !o(length + 1)) || !p(cArr[this.d + length])) {
                                        this.d += length;
                                        this.h = i;
                                        i2 = i;
                                    }
                                }
                                if (i2 == 0) {
                                }
                            } else {
                                this.h = 1;
                                return 1;
                            }
                        } else if (i5 == 1) {
                            this.h = 4;
                            return 4;
                        }
                    } else {
                        this.h = 3;
                        return 3;
                    }
                }
                if (i5 != 1 && i5 != 2) {
                    a0("Unexpected value");
                    throw null;
                }
                e();
                this.d--;
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
        if (i != 2 && i != 4) {
            return true;
        }
        return false;
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
                this.k = K();
            } else if (i != 11) {
                StringBuilder sb = new StringBuilder("Expected a double but was ");
                sb.append(peek());
                l.m(sb, y());
                return ConstantsKt.UNSET;
            }
        } else {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.k = G(c);
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        if (!this.b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + y());
        }
        this.k = null;
        this.h = 0;
        int[] iArr2 = this.o;
        int i3 = this.m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public final String nextName() {
        String G;
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 14) {
            G = K();
        } else if (i == 12) {
            G = G('\'');
        } else if (i == 13) {
            G = G('\"');
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(peek());
            l.m(sb, y());
            return null;
        }
        this.h = 0;
        this.n[this.m - 1] = G;
        return G;
    }

    public final String nextString() {
        String str;
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        if (i == 10) {
            str = K();
        } else if (i == 8) {
            str = G('\'');
        } else if (i == 9) {
            str = G('\"');
        } else if (i == 11) {
            str = this.k;
            this.k = null;
        } else if (i == 15) {
            str = Long.toString(this.i);
        } else if (i == 16) {
            str = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(peek());
            l.m(sb, y());
            return null;
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

    public final boolean p(char c) {
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

    public final b peek() {
        int i = this.h;
        if (i == 0) {
            i = g();
        }
        switch (i) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                f27.p();
                return null;
        }
    }

    public final String toString() {
        return a.class.getSimpleName().concat(y());
    }

    public final String y() {
        StringBuilder n = m51.n(this.f + 1, " at line ", (this.d - this.g) + 1, " column ", " path ");
        StringBuilder sb = new StringBuilder("$");
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.l[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb.append('.');
                    String str = this.n[i2];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(this.o[i2]);
                sb.append(']');
            }
        }
        n.append(sb.toString());
        return n.toString();
    }

    public final boolean z() {
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
        StringBuilder sb = new StringBuilder("Expected a boolean but was ");
        sb.append(peek());
        l.m(sb, y());
        return false;
    }
}
