package kotlin.text;

import defpackage.bl6;
import defpackage.dmk;
import defpackage.f27;
import defpackage.m51;
import defpackage.r2i;
import defpackage.sl0;
import defpackage.sv6;
import defpackage.woa;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"l2i", "kotlin/text/c", "m2i", "n2i", "o2i", "p2i", "kotlin/text/d", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/e", "kotlin/text/StringsKt__StringsKt", "kotlin/text/h", "r2i"}, d2 = {}, k = 4, mv = {2, 4, 0}, xi = 49)
/* loaded from: classes6.dex */
public final class StringsKt extends r2i {
    public static boolean L(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (R(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.w(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean M(CharSequence charSequence, char c) {
        charSequence.getClass();
        if (Q(charSequence, c, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean N(CharSequence charSequence, char c) {
        charSequence.getClass();
        if (charSequence.length() <= 0 || !a.b(charSequence.charAt(charSequence.length() - 1), c, false)) {
            return false;
        }
        return true;
    }

    public static boolean O(CharSequence charSequence, String str) {
        if (charSequence instanceof String) {
            return e.n((String) charSequence, str, false);
        }
        return StringsKt__StringsKt.y(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int P(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static int Q(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (!(charSequence instanceof String)) {
            return StringsKt__StringsKt.x(charSequence, new char[]{c}, i, false);
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int R(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.v(i, charSequence, str, z);
    }

    public static /* synthetic */ int S(CharSequence charSequence, char[] cArr, int i) {
        return StringsKt__StringsKt.x(charSequence, cArr, i, false);
    }

    public static boolean T(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt.c(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int U(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = P(charSequence);
        }
        charSequence.getClass();
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(ArraysKt.T(cArr), i);
            }
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            while (-1 < i) {
                if (a.b(cArr[0], charSequence.charAt(i), false)) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static int V(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = P(charSequence);
        }
        int i3 = i;
        charSequence.getClass();
        str.getClass();
        if (!(charSequence instanceof String)) {
            return StringsKt__StringsKt.w(charSequence, str, i3, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i3);
    }

    public static /* bridge */ /* synthetic */ List W(String str) {
        return StringsKt__StringsKt.lines(str);
    }

    public static String X(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append('0');
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                sb.append((CharSequence) str);
                charSequence = sb;
            }
            return charSequence.toString();
        }
        dmk.v(sv6.j(i, "Desired length ", " is less than zero."));
        return null;
    }

    public static String Y(CharSequence charSequence, String str) {
        str.getClass();
        charSequence.getClass();
        if (f0(str, charSequence, false)) {
            return str.substring(charSequence.length());
        }
        return str;
    }

    public static String Z(String str, String str2) {
        str.getClass();
        if (O(str, str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    public static String a0(String str) {
        str.getClass();
        if (str.length() >= 2 && f0(str, "\"", false) && O(str, "\"")) {
            return woa.k(1, 1, str);
        }
        return str;
    }

    public static StringBuilder b0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        f27.m(m51.j(i2, "End index (", i, ") is less than start index (", ")."));
        return null;
    }

    public static List c0(CharSequence charSequence, final char[] cArr) {
        charSequence.getClass();
        if (cArr.length == 1) {
            return StringsKt__StringsKt.A(0, charSequence, String.valueOf(cArr[0]), false);
        }
        StringsKt__StringsKt.z(0);
        bl6<IntRange> bl6Var = new bl6(charSequence, 0, new Function2() { // from class: kotlin.text.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                charSequence2.getClass();
                int x = StringsKt__StringsKt.x(charSequence2, cArr, intValue, false);
                if (x < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(x), 1);
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.w(new sl0(bl6Var, 3)));
        for (IntRange intRange : bl6Var) {
            intRange.getClass();
            arrayList.add(charSequence.subSequence(intRange.a, intRange.b + 1).toString());
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ List d0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2) {
        return StringsKt__StringsKt.split$default(charSequence, strArr, z, i, i2, null);
    }

    public static boolean e0(int i, String str) {
        return StringsKt__StringsKt.y(str, i, "boundary=", 0, 9, true);
    }

    public static boolean f0(String str, CharSequence charSequence, boolean z) {
        charSequence.getClass();
        if (!z && (charSequence instanceof String)) {
            return e.u(str, (String) charSequence, false);
        }
        return StringsKt__StringsKt.y(str, 0, charSequence, 0, charSequence.length(), z);
    }

    public static boolean g0(String str, char c) {
        str.getClass();
        if (str.length() <= 0 || !a.b(str.charAt(0), c, false)) {
            return false;
        }
        return true;
    }

    public static String h0(String str, IntRange intRange) {
        str.getClass();
        intRange.getClass();
        return str.substring(intRange.a, intRange.b + 1);
    }

    public static String i0(String str, String str2, char c) {
        str.getClass();
        str2.getClass();
        int Q = Q(str, c, 0, 6);
        if (Q == -1) {
            return str2;
        }
        return str.substring(Q + 1, str.length());
    }

    public static String j0(String str, String str2, String str3) {
        com.fingerprintjs.android.fpjs_pro.g.x(str, str2, str3);
        int R = R(str, str2, 0, false, 6);
        if (R == -1) {
            return str3;
        }
        return str.substring(str2.length() + R, str.length());
    }

    public static String k0(String str, String str2, char c) {
        str.getClass();
        str2.getClass();
        int U = U(str, c, 0, 6);
        if (U == -1) {
            return str2;
        }
        return str.substring(U + 1, str.length());
    }

    public static String l0(String str) {
        str.getClass();
        str.getClass();
        int V = V(str, ".", 0, 6);
        if (V == -1) {
            return str;
        }
        return str.substring(1 + V, str.length());
    }

    public static String m0(String str, char c) {
        str.getClass();
        str.getClass();
        int Q = Q(str, c, 0, 6);
        if (Q == -1) {
            return str;
        }
        return str.substring(0, Q);
    }

    public static String n0(String str, String str2) {
        str.getClass();
        str.getClass();
        int R = R(str, str2, 0, false, 6);
        if (R == -1) {
            return str;
        }
        return str.substring(0, R);
    }

    public static String o0(String str, char c) {
        str.getClass();
        str.getClass();
        int U = U(str, c, 0, 6);
        if (U == -1) {
            return str;
        }
        return str.substring(0, U);
    }

    public static Boolean p0(String str) {
        str.getClass();
        if (Intrinsics.areEqual(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Integer q0(int i, String str) {
        boolean z;
        int i2;
        int i3;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length != 0) {
            int i4 = 0;
            char charAt = str.charAt(0);
            int i5 = -2147483647;
            if (charAt < '0') {
                i2 = 1;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            i5 = Integer.MIN_VALUE;
                            z = true;
                        } else {
                            return null;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    return null;
                }
            } else {
                z = false;
                i2 = 0;
            }
            int i6 = -59652323;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), i);
                if (digit >= 0) {
                    if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + digit) {
                        return null;
                    }
                    i4 = i3 - digit;
                    i2++;
                } else {
                    return null;
                }
            }
            if (z) {
                return Integer.valueOf(i4);
            }
            return Integer.valueOf(-i4);
        }
        return null;
    }

    public static Long r0(int i, String str) {
        boolean z;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str.charAt(0);
            long j = -9223372036854775807L;
            if (charAt < '0') {
                z = true;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            j = Long.MIN_VALUE;
                            i2 = 1;
                        } else {
                            return null;
                        }
                    } else {
                        z = false;
                        i2 = 1;
                    }
                } else {
                    return null;
                }
            } else {
                z = false;
            }
            long j2 = 0;
            long j3 = -256204778801521550L;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), i);
                if (digit >= 0) {
                    if (j2 < j3) {
                        if (j3 == -256204778801521550L) {
                            j3 = j / i;
                            if (j2 < j3) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    long j4 = j2 * i;
                    long j5 = digit;
                    if (j4 < j + j5) {
                        return null;
                    }
                    j2 = j4 - j5;
                    i2++;
                } else {
                    return null;
                }
            }
            if (z) {
                return Long.valueOf(j2);
            }
            return Long.valueOf(-j2);
        }
        return null;
    }

    public static CharSequence s0(CharSequence charSequence) {
        int i;
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean c = CharsKt.c(charSequence.charAt(i));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!c) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static String t0(String str, char... cArr) {
        int i;
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean j = ArraysKt.j(cArr, str.charAt(i));
            if (!z) {
                if (!j) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!j) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    public static String u0(String str, char... cArr) {
        CharSequence charSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!ArraysKt.j(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static String v0(String str, char... cArr) {
        CharSequence charSequence;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (!ArraysKt.j(cArr, str.charAt(i))) {
                    charSequence = str.subSequence(i, str.length());
                    break;
                }
                i++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }
}
