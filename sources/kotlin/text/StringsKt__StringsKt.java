package kotlin.text;

import defpackage.ace;
import defpackage.b9b;
import defpackage.bl6;
import defpackage.eb4;
import defpackage.f27;
import defpackage.sl0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "", "", "lines", "(Ljava/lang/CharSequence;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes6.dex */
class StringsKt__StringsKt extends e {
    public static final List A(int i, CharSequence charSequence, String str, boolean z) {
        boolean z2;
        z(i);
        int i2 = 0;
        int v = v(0, charSequence, str, z);
        if (v != -1 && i != 1) {
            if (i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = 10;
            if (z2 && i <= 10) {
                i3 = i;
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, v).toString());
                i2 = str.length() + v;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                v = v(i2, charSequence, str, z);
            } while (v != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        return eb4.c(charSequence.toString());
    }

    public static List<String> lines(CharSequence charSequence) {
        charSequence.getClass();
        b9b b9bVar = new b9b(charSequence);
        if (!b9bVar.hasNext()) {
            return CollectionsKt.emptyList();
        }
        Object next = b9bVar.next();
        if (!b9bVar.hasNext()) {
            return eb4.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (b9bVar.hasNext()) {
            arrayList.add(b9bVar.next());
        }
        return arrayList;
    }

    public static List split$default(CharSequence charSequence, String[] strArr, final boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        charSequence.getClass();
        strArr.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return A(i, charSequence, str, z);
            }
        }
        z(i);
        final List asList = Arrays.asList(strArr);
        asList.getClass();
        bl6<IntRange> bl6Var = new bl6(charSequence, i, new Function2() { // from class: kotlin.text.g
            /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
            
                r13 = r14;
             */
            @Override // kotlin.jvm.functions.Function2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj2, Object obj3) {
                Object obj4;
                Pair pair;
                Pair pair2;
                boolean z2;
                Object obj5;
                CharSequence charSequence2 = (CharSequence) obj2;
                int intValue = ((Integer) obj3).intValue();
                charSequence2.getClass();
                List list = asList;
                boolean z3 = z;
                if (!z3 && list.size() == 1) {
                    String str2 = (String) CollectionsKt.t0(list);
                    int R = StringsKt.R(charSequence2, str2, intValue, false, 4);
                    if (R >= 0) {
                        pair2 = new Pair(Integer.valueOf(R), str2);
                    }
                    pair2 = null;
                } else {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    kotlin.ranges.a aVar = new kotlin.ranges.a(intValue, charSequence2.length(), 1);
                    boolean z4 = charSequence2 instanceof String;
                    int i3 = aVar.c;
                    int i4 = aVar.b;
                    if (z4) {
                        if ((i3 > 0 && intValue <= i4) || (i3 < 0 && i4 <= intValue)) {
                            int i5 = intValue;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj5 = it.next();
                                        String str3 = (String) obj5;
                                        z2 = z3;
                                        if (e.p(str3, 0, (String) charSequence2, i5, str3.length(), z2)) {
                                            break;
                                        }
                                        z3 = z2;
                                    } else {
                                        z2 = z3;
                                        obj5 = null;
                                        break;
                                    }
                                }
                                String str4 = (String) obj5;
                                if (str4 != null) {
                                    pair = new Pair(Integer.valueOf(i5), str4);
                                    break;
                                }
                                if (i5 == i4) {
                                    break;
                                }
                                i5 += i3;
                                z3 = z2;
                            }
                        }
                        pair2 = null;
                    } else {
                        if ((i3 > 0 && intValue <= i4) || (i3 < 0 && i4 <= intValue)) {
                            int i6 = intValue;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj4 = it2.next();
                                        String str5 = (String) obj4;
                                        if (StringsKt__StringsKt.y(str5, 0, charSequence2, i6, str5.length(), z3)) {
                                            break;
                                        }
                                    } else {
                                        obj4 = null;
                                        break;
                                    }
                                }
                                String str6 = (String) obj4;
                                if (str6 != null) {
                                    pair = new Pair(Integer.valueOf(i6), str6);
                                    break;
                                }
                                if (i6 == i4) {
                                    break;
                                }
                                i6 += i3;
                            }
                        }
                        pair2 = null;
                    }
                }
                if (pair2 == null) {
                    return null;
                }
                return new Pair(pair2.getFirst(), Integer.valueOf(((String) pair2.getSecond()).length()));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.w(new sl0(bl6Var, 3)));
        for (IntRange intRange : bl6Var) {
            intRange.getClass();
            arrayList.add(charSequence.subSequence(intRange.a, intRange.b + 1).toString());
        }
        return arrayList;
    }

    public static final int v(int i, CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return w(charSequence, str, i, charSequence.length(), z, false);
    }

    public static final int w(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        kotlin.ranges.a aVar;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (!z2) {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            aVar = new kotlin.ranges.a(i3, i4, 1);
        } else {
            int P = StringsKt.P(charSequence);
            if (i3 > P) {
                i3 = P;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            kotlin.ranges.a.d.getClass();
            aVar = new kotlin.ranges.a(i3, i4, -1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = aVar.c;
        int i6 = aVar.b;
        int i7 = aVar.a;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    if (e.p(str, 0, (String) charSequence, i8, str.length(), z)) {
                        return i8;
                    }
                    if (i8 == i6) {
                        break;
                    }
                    i8 += i5;
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!y(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    public static final int x(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt.T(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (a.b(c, charAt, z)) {
                    return i;
                }
            }
            if (i != length) {
                i++;
            } else {
                return -1;
            }
        }
    }

    public static final boolean y(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!a.b(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final void z(int i) {
        if (i >= 0) {
            return;
        }
        f27.q(ace.f(i, "Limit must be non-negative, but was "));
    }
}
