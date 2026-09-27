package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hj1 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public hj1(CharSequence charSequence, int i, Locale locale) {
        this.a = 9;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            lw9.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            lw9.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new nj3(charSequence, i));
    }

    public static int d(int i, int i2) {
        return f(i2) + k(i);
    }

    public static int e(int i, int i2) {
        return f(i2) + k(i);
    }

    public static int f(int i) {
        if (i >= 0) {
            return i(i);
        }
        return 10;
    }

    public static int g(int i, ndc ndcVar) {
        return h(ndcVar) + k(i);
    }

    public static int h(ndc ndcVar) {
        int d = ndcVar.d();
        return i(d) + d;
    }

    public static int i(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int j(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        if ((j & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int k(int i) {
        return i(i << 3);
    }

    public static hj1 u(OutputStream outputStream, int i) {
        return new hj1(outputStream, new byte[i]);
    }

    public int A(int i) {
        b(i);
        int preceding = ((BreakIterator) this.e).preceding(i);
        if (s(preceding) && o(preceding) && !r(preceding)) {
            return A(preceding);
        }
        return preceding;
    }

    public void B() {
        ((OutputStream) this.e).write((byte[]) this.d, 0, this.c);
        this.c = 0;
    }

    public void C(int i, int i2, String str) {
        if (i > i2) {
            lw9.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            lw9.a("start must be non-negative, but was " + i);
        }
        gg1 gg1Var = (gg1) this.e;
        if (gg1Var == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            gg1 gg1Var2 = new gg1(2);
            gg1Var2.b = max;
            gg1Var2.e = cArr;
            gg1Var2.c = length;
            gg1Var2.d = i4;
            this.e = gg1Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 >= 0 && i8 <= gg1Var.b - gg1Var.f()) {
            int length2 = str.length() - (i8 - i7);
            if (length2 > gg1Var.f()) {
                int f = length2 - gg1Var.f();
                int i9 = gg1Var.b * 2;
                while (i9 - gg1Var.b < f) {
                    i9 *= 2;
                }
                char[] cArr2 = new char[i9];
                System.arraycopy((char[]) gg1Var.e, 0, cArr2, 0, gg1Var.c);
                int i10 = gg1Var.b;
                int i11 = gg1Var.d;
                int i12 = i10 - i11;
                int i13 = i9 - i12;
                System.arraycopy((char[]) gg1Var.e, i11, cArr2, i13, (i12 + i11) - i11);
                gg1Var.e = cArr2;
                gg1Var.b = i9;
                gg1Var.d = i13;
            }
            int i14 = gg1Var.c;
            if (i7 < i14 && i8 <= i14) {
                int i15 = i14 - i8;
                char[] cArr3 = (char[]) gg1Var.e;
                System.arraycopy(cArr3, i8, cArr3, gg1Var.d - i15, i15);
                gg1Var.c = i7;
                gg1Var.d -= i15;
            } else if (i7 < i14 && i8 >= i14) {
                gg1Var.d = gg1Var.f() + i8;
                gg1Var.c = i7;
            } else {
                int f2 = gg1Var.f() + i7;
                int f3 = gg1Var.f() + i8;
                int i16 = gg1Var.d;
                int i17 = f2 - i16;
                char[] cArr4 = (char[]) gg1Var.e;
                System.arraycopy(cArr4, i16, cArr4, gg1Var.c, i17);
                i7 = gg1Var.c + i17;
                gg1Var.c = i7;
                gg1Var.d = f3;
            }
            str.getChars(0, str.length(), (char[]) gg1Var.e, i7);
            gg1Var.c = str.length() + gg1Var.c;
            return;
        }
        this.d = toString();
        this.e = null;
        this.b = -1;
        this.c = -1;
        C(i, i2, str);
    }

    public synchronized int D() {
        return this.c;
    }

    public void E(int i, int i2) {
        Q(i, 0);
        G(i2);
    }

    public void F(int i, int i2) {
        Q(i, 0);
        G(i2);
    }

    public void G(int i) {
        if (i >= 0) {
            O(i);
        } else {
            P(i);
        }
    }

    public void H(int i, ndc ndcVar) {
        Q(i, 2);
        I(ndcVar);
    }

    public void I(ndc ndcVar) {
        O(ndcVar.d());
        ndcVar.e(this);
    }

    public void J(int i) {
        byte b = (byte) i;
        if (this.c == this.b) {
            B();
        }
        byte[] bArr = (byte[]) this.d;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr[i2] = b;
    }

    public void K(gw1 gw1Var) {
        int size = gw1Var.size();
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        byte[] bArr = (byte[]) this.d;
        if (i3 >= size) {
            gw1Var.c(0, i2, size, bArr);
            this.c += size;
            return;
        }
        gw1Var.c(0, i2, i3, bArr);
        int i4 = size - i3;
        this.c = i;
        B();
        if (i4 <= i) {
            gw1Var.c(i3, 0, i4, bArr);
            this.c = i4;
            return;
        }
        OutputStream outputStream = (OutputStream) this.e;
        if (i3 >= 0) {
            if (i4 >= 0) {
                int i5 = i3 + i4;
                if (i5 <= gw1Var.size()) {
                    if (i4 > 0) {
                        gw1Var.s(outputStream, i3, i4);
                        return;
                    }
                    return;
                }
                f27.h(39, i5, "Source end offset exceeded: ");
                return;
            }
            f27.h(23, i4, "Length < 0: ");
            return;
        }
        f27.h(30, i3, "Source offset < 0: ");
    }

    public void L(byte[] bArr) {
        int length = bArr.length;
        int i = this.b;
        int i2 = this.c;
        int i3 = i - i2;
        byte[] bArr2 = (byte[]) this.d;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i2, length);
            this.c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i2, i3);
        int i4 = length - i3;
        this.c = i;
        B();
        if (i4 <= i) {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.c = i4;
        } else {
            ((OutputStream) this.e).write(bArr, i3, i4);
        }
    }

    public void M(int i) {
        J(i & 255);
        J((i >> 8) & 255);
        J((i >> 16) & 255);
        J((i >> 24) & 255);
    }

    public void N(long j) {
        J(((int) j) & 255);
        J(((int) (j >> 8)) & 255);
        J(((int) (j >> 16)) & 255);
        J(((int) (j >> 24)) & 255);
        J(((int) (j >> 32)) & 255);
        J(((int) (j >> 40)) & 255);
        J(((int) (j >> 48)) & 255);
        J(((int) (j >> 56)) & 255);
    }

    public void O(int i) {
        while ((i & (-128)) != 0) {
            J((i & 127) | 128);
            i >>>= 7;
        }
        J(i);
    }

    public void P(long j) {
        while (((-128) & j) != 0) {
            J((((int) j) & 127) | 128);
            j >>>= 7;
        }
        J((int) j);
    }

    public void Q(int i, int i2) {
        O((i << 3) | i2);
    }

    public synchronized void a(long j, Object obj) {
        if (this.c > 0) {
            if (j <= ((long[]) this.d)[((this.b + r0) - 1) % ((Object[]) this.e).length]) {
                c();
            }
        }
        l();
        int i = this.b;
        int i2 = this.c;
        Object[] objArr = (Object[]) this.e;
        int length = (i + i2) % objArr.length;
        ((long[]) this.d)[length] = j;
        objArr[length] = obj;
        this.c = i2 + 1;
    }

    public void b(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (!z) {
            StringBuilder n = m51.n(i, "Invalid offset: ", i2, ". Valid range is [", " , ");
            n.append(i3);
            n.append(']');
            lw9.a(n.toString());
        }
    }

    public synchronized void c() {
        this.b = 0;
        this.c = 0;
        Arrays.fill((Object[]) this.e, (Object) null);
    }

    public void l() {
        int length = ((Object[]) this.e).length;
        if (this.c < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.b;
        int i3 = length - i2;
        System.arraycopy((long[]) this.d, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.e, this.b, objArr, 0, i3);
        int i4 = this.b;
        if (i4 > 0) {
            System.arraycopy((long[]) this.d, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.e, 0, objArr, i3, this.b);
        }
        this.d = jArr;
        this.e = objArr;
        this.b = 0;
    }

    public void m() {
        B();
    }

    public int n() {
        gg1 gg1Var = (gg1) this.e;
        String str = (String) this.d;
        if (gg1Var == null) {
            return str.length();
        }
        return (gg1Var.b - gg1Var.f()) + (str.length() - (this.c - this.b));
    }

    public boolean o(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i <= this.c && i2 <= i) {
            if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
                int i3 = i - 1;
                if (!Character.isSurrogate(charSequence.charAt(i3))) {
                    if (jb7.d()) {
                        jb7 a = jb7.a();
                        if (a.c() != 1 || a.b(charSequence, i3) == -1) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean p(int i) {
        int i2 = this.b + 1;
        if (i <= this.c && i2 <= i) {
            return h7n.d(Character.codePointBefore((CharSequence) this.d, i));
        }
        return false;
    }

    public boolean q(int i) {
        b(i);
        if (((BreakIterator) this.e).isBoundary(i)) {
            if (!s(i) || !s(i - 1) || !s(i + 1)) {
                if (i <= 0 || i >= ((CharSequence) this.d).length() - 1 || (!r(i) && !r(i + 1))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean r(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (!Intrinsics.areEqual(of, unicodeBlock) || !Intrinsics.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            if (Intrinsics.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean s(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i < this.c && i2 <= i) {
            if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
                if (jb7.d()) {
                    jb7 a = jb7.a();
                    if (a.c() != 1 || a.b(charSequence, i) == -1) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean t(int i) {
        int i2 = this.b;
        if (i < this.c && i2 <= i) {
            return h7n.d(Character.codePointAt((CharSequence) this.d, i));
        }
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                gg1 gg1Var = (gg1) this.e;
                String str = (String) this.d;
                if (gg1Var != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, this.b);
                    sb.append((char[]) gg1Var.e, 0, gg1Var.c);
                    char[] cArr = (char[]) gg1Var.e;
                    int i = gg1Var.d;
                    sb.append(cArr, i, gg1Var.b - i);
                    String str2 = (String) this.d;
                    sb.append((CharSequence) str2, this.c, str2.length());
                    return sb.toString();
                }
                return str;
            default:
                return super.toString();
        }
    }

    public int v(int i) {
        b(i);
        int following = ((BreakIterator) this.e).following(i);
        if (s(following - 1) && s(following) && !r(following)) {
            return v(following);
        }
        return following;
    }

    public Object w(long j, boolean z) {
        Object obj = null;
        long j2 = Long.MAX_VALUE;
        while (this.c > 0) {
            long j3 = j - ((long[]) this.d)[this.b];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            obj = z();
            j2 = j3;
        }
        return obj;
    }

    public synchronized Object x() {
        Object z;
        if (this.c == 0) {
            z = null;
        } else {
            z = z();
        }
        return z;
    }

    public synchronized Object y(long j) {
        return w(j, true);
    }

    public Object z() {
        boolean z;
        if (this.c > 0) {
            z = true;
        } else {
            z = false;
        }
        pfn.f(z);
        Object[] objArr = (Object[]) this.e;
        int i = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.b = (i + 1) % objArr.length;
        this.c--;
        return obj;
    }

    public hj1(int i, byte b) {
        this.a = i;
        switch (i) {
            case 8:
                this.d = new long[10];
                this.e = new Object[10];
                return;
            default:
                return;
        }
    }

    public /* synthetic */ hj1(int i, Serializable serializable, int i2, Object obj, int i3) {
        this.a = i3;
        this.b = i;
        this.d = serializable;
        this.c = i2;
        this.e = obj;
    }

    public hj1(OutputStream outputStream, byte[] bArr) {
        this.a = 1;
        this.e = outputStream;
        this.d = bArr;
        this.c = 0;
        this.b = bArr.length;
    }

    public hj1(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = 5;
        this.b = i;
        pfn.b(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.d = fArr;
        this.e = fArr2;
        this.c = i2;
    }

    public hj1(hj1 hj1Var) {
        this.a = 6;
        float[] fArr = (float[]) hj1Var.d;
        this.b = fArr.length / 3;
        this.d = jrl.c(fArr);
        this.e = jrl.c((float[]) hj1Var.e);
        int i = hj1Var.c;
        if (i == 1) {
            this.c = 5;
        } else if (i != 2) {
            this.c = 4;
        } else {
            this.c = 6;
        }
    }

    public hj1(je7 je7Var, bm9 bm9Var) {
        this.a = 2;
        this.d = new SparseArray();
        this.e = je7Var;
        TypedArray typedArray = (TypedArray) bm9Var.c;
        this.b = typedArray.getResourceId(28, 0);
        this.c = typedArray.getResourceId(53, 0);
    }

    public hj1(int i) {
        this.a = 0;
        this.d = new k8j[i];
        this.c = 0;
    }
}
