package kotlin.collections;

import defpackage.ahh;
import defpackage.c1c;
import defpackage.dmk;
import defpackage.eb4;
import defpackage.ed7;
import defpackage.fd7;
import defpackage.pk0;
import defpackage.pl0;
import defpackage.sl0;
import defpackage.sud;
import defpackage.tl0;
import defpackage.vzg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"pl0", "ql0", "kotlin/collections/ArraysKt___ArraysJvmKt", "kotlin/collections/ArraysKt___ArraysKt"}, d2 = {}, k = 4, mv = {2, 4, 0}, xi = 49)
/* loaded from: classes6.dex */
public final class ArraysKt extends ArraysKt___ArraysKt {
    public static Float A(int i, float[] fArr) {
        if (i >= 0 && i < fArr.length) {
            return Float.valueOf(fArr[i]);
        }
        return null;
    }

    public static Integer B(int i, int[] iArr) {
        iArr.getClass();
        if (i >= 0 && i < iArr.length) {
            return Integer.valueOf(iArr[i]);
        }
        return null;
    }

    public static Object C(int i, Object[] objArr) {
        objArr.getClass();
        if (i >= 0 && i < objArr.length) {
            return objArr[i];
        }
        return null;
    }

    public static int D(int i, int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int E(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (Intrinsics.areEqual(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static /* synthetic */ void F(Object[] objArr, StringBuilder sb) {
        ArraysKt___ArraysKt.c(objArr, sb, ", ", "<", ">", "...", sud.f);
    }

    public static String G(String str, char[] cArr) {
        cArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (char c : cArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            sb.append(c);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String H(byte[] bArr, String str, Function1 function1, int i) {
        String str2;
        int i2;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str3 = "";
        if ((i & 2) != 0) {
            str2 = "";
        } else {
            str2 = "[";
        }
        if ((i & 4) == 0) {
            str3 = "]";
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 32;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        bArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i3 = 0;
        for (byte b : bArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (function1 != null) {
                sb.append((CharSequence) function1.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append((CharSequence) "...");
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String I(float[] fArr) {
        fArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (float f : fArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) String.valueOf(f));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String J(Object[] objArr, String str, String str2, String str3, Function1 function1, int i) {
        String str4;
        String str5;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        ArraysKt___ArraysKt.c(objArr, sb, str6, str4, str5, "...", function1);
        return sb.toString();
    }

    public static float K(float[] fArr) {
        if (fArr.length != 0) {
            return fArr[fArr.length - 1];
        }
        ahh.i("Array is empty.");
        return 0.0f;
    }

    public static Object L(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        ahh.i("Array is empty.");
        return null;
    }

    public static int M(Object obj, Object[] objArr) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (Intrinsics.areEqual(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static Character N(char[] cArr) {
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    public static int O(int[] iArr) {
        if (iArr.length != 0) {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i < i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return i;
        }
        dmk.t();
        return 0;
    }

    public static Integer P(int[] iArr) {
        iArr.getClass();
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int i2 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    public static byte[] Q(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static Object[] R(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static List S(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList i0 = i0(objArr);
        Collections.reverse(i0);
        return i0;
    }

    public static char T(char[] cArr) {
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            dmk.v("Array has more than one element.");
            return (char) 0;
        }
        ahh.i("Array is empty.");
        return (char) 0;
    }

    public static Object U(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length == 1) {
                return objArr[0];
            }
            dmk.v("Array has more than one element.");
            return null;
        }
        ahh.i("Array is empty.");
        return null;
    }

    public static byte[] V(byte[] bArr, IntRange intRange) {
        bArr.getClass();
        intRange.getClass();
        if (intRange.isEmpty()) {
            return new byte[0];
        }
        return ArraysKt___ArraysJvmKt.copyOfRange(bArr, intRange.a, intRange.b + 1);
    }

    public static List W(Object[] objArr, Comparator comparator) {
        objArr.getClass();
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static HashSet X(Object[] objArr) {
        objArr.getClass();
        HashSet hashSet = new HashSet(c1c.a(objArr.length));
        ArraysKt___ArraysKt.d(objArr, hashSet);
        return hashSet;
    }

    public static List Y(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(bArr.length);
                for (byte b : bArr) {
                    arrayList.add(Byte.valueOf(b));
                }
                return arrayList;
            }
            return eb4.c(Byte.valueOf(bArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static List Z(char[] cArr) {
        int length = cArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(cArr.length);
                for (char c : cArr) {
                    arrayList.add(Character.valueOf(c));
                }
                return arrayList;
            }
            return eb4.c(Character.valueOf(cArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static List a0(double[] dArr) {
        int length = dArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(dArr.length);
                for (double d : dArr) {
                    arrayList.add(Double.valueOf(d));
                }
                return arrayList;
            }
            return eb4.c(Double.valueOf(dArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static List b0(float[] fArr) {
        int length = fArr.length;
        if (length != 0) {
            if (length != 1) {
                return h0(fArr);
            }
            return eb4.c(Float.valueOf(fArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static List c0(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i : iArr) {
                    arrayList.add(Integer.valueOf(i));
                }
                return arrayList;
            }
            return eb4.c(Integer.valueOf(iArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static List d0(long[] jArr) {
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                for (long j : jArr) {
                    arrayList.add(Long.valueOf(j));
                }
                return arrayList;
            }
            return eb4.c(Long.valueOf(jArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static Iterable e(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return new sl0(objArr, 0);
    }

    public static List e0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
                asList.getClass();
                return asList;
            }
            return eb4.c(objArr[0]);
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static List f(Object[] objArr) {
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static List f0(short[] sArr) {
        int length = sArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(sArr.length);
                for (short s : sArr) {
                    arrayList.add(Short.valueOf(s));
                }
                return arrayList;
            }
            return eb4.c(Short.valueOf(sArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static Sequence g(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return ed7.a;
        }
        return new tl0(objArr, 0);
    }

    public static List g0(boolean[] zArr) {
        int length = zArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(zArr.length);
                for (boolean z : zArr) {
                    arrayList.add(Boolean.valueOf(z));
                }
                return arrayList;
            }
            return eb4.c(Boolean.valueOf(zArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static boolean h(int i, int[] iArr) {
        iArr.getClass();
        if (D(i, iArr) >= 0) {
            return true;
        }
        return false;
    }

    public static ArrayList h0(float[] fArr) {
        fArr.getClass();
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static boolean i(Object obj, Object[] objArr) {
        objArr.getClass();
        if (E(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static ArrayList i0(Object[] objArr) {
        objArr.getClass();
        return new ArrayList(new pk0(objArr, false));
    }

    public static boolean j(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (c == cArr[i]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    public static LinkedHashSet j0(Object[] objArr) {
        objArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(c1c.a(objArr.length));
        ArraysKt___ArraysKt.d(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static void k(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static Set k0(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(c1c.a(iArr.length));
                for (int i : iArr) {
                    linkedHashSet.add(Integer.valueOf(i));
                }
                return linkedHashSet;
            }
            return vzg.b(Integer.valueOf(iArr[0]));
        }
        return fd7.a;
    }

    public static void l(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static Set l0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(c1c.a(objArr.length));
                ArraysKt___ArraysKt.d(objArr, linkedHashSet);
                return linkedHashSet;
            }
            return vzg.b(objArr[0]);
        }
        return fd7.a;
    }

    public static void m(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static ArrayList m0(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new Pair(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    public static void n(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static /* synthetic */ void o(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        k(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void p(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        l(0, i, i2, objArr, objArr2);
    }

    public static Object[] q(Object[] objArr, int i, int i2) {
        objArr.getClass();
        pl0.a(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static void r(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static /* synthetic */ void s(Object obj, Object[] objArr) {
        r(0, objArr.length, obj, objArr);
    }

    public static void t(int[] iArr, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        iArr.getClass();
        Arrays.fill(iArr, 0, i2, i);
    }

    public static void u(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static Object v(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        ahh.i("Array is empty.");
        return null;
    }

    public static Object w(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    public static IntRange x(int[] iArr) {
        return new kotlin.ranges.a(0, iArr.length - 1, 1);
    }

    public static int y(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int z(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }
}
