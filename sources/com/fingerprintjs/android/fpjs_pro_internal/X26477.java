package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.fingerprintjs.android.fpjs_pro_internal.br;
import defpackage.eb4;
import defpackage.r5g;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class X26477 {
    public static int a = 0;
    public static int b = 1;
    public static int c;
    public static int d;

    public static final boolean a(Pair pair) {
        int i;
        int i2 = b;
        a = ((i2 & 95) + (i2 | 95)) % 128;
        if (Intrinsics.areEqual(pair.getFirst(), "processor")) {
            int i3 = b;
            int i4 = ((i3 | 49) << 1) - (i3 ^ 49);
            a = i4 % 128;
            int i5 = i4 % 2;
            CharSequence charSequence = (CharSequence) pair.getSecond();
            if (i5 != 0) {
                i = 1;
            } else {
                i = 0;
            }
            while (i < charSequence.length()) {
                int i6 = a;
                int i7 = (i6 & 121) + (i6 | 121);
                b = i7 % 128;
                if (i7 % 2 != 0) {
                    if (!Character.isDigit(charSequence.charAt(i))) {
                        int i8 = a;
                        b = ((i8 ^ 121) + ((i8 & 121) << 1)) % 128;
                    } else {
                        i = (i & (-77)) + (i | (-77)) + 78;
                    }
                } else {
                    Character.isDigit(charSequence.charAt(i));
                    throw null;
                }
            }
            br.component9.a();
            br.component9.a();
            int i9 = b + 29;
            a = i9 % 128;
            if (i9 % 2 != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0442, code lost:
    
        if (r5.size() == r6) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0455, code lost:
    
        r7 = com.fingerprintjs.android.fpjs_pro_internal.X26477.a;
        com.fingerprintjs.android.fpjs_pro_internal.X26477.b = ((r7 ^ 87) + ((r7 & 87) << 1)) % 128;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0453, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0451, code lost:
    
        if (r5.size() == 2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01ce, code lost:
    
        if (r1 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01d2, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x024b, code lost:
    
        r1 = com.fingerprintjs.android.fpjs_pro_internal.X26477.a;
        com.fingerprintjs.android.fpjs_pro_internal.X26477.b = (((r1 | 47) << 1) - (r1 ^ 47)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x023f, code lost:
    
        r0 = com.fingerprintjs.android.fpjs_pro_internal.X26477.b;
        r1 = ((r0 & 41) + (r0 | 41)) % 128;
        com.fingerprintjs.android.fpjs_pro_internal.X26477.a = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x023d, code lost:
    
        if (r1 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02a3, code lost:
    
        if (a((kotlin.Pair) r2) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02c1, code lost:
    
        r3 = com.fingerprintjs.android.fpjs_pro_internal.X26477.a;
        com.fingerprintjs.android.fpjs_pro_internal.X26477.b = (r3 + 61) % 128;
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02b3, code lost:
    
        r3 = com.fingerprintjs.android.fpjs_pro_internal.X26477.a;
        com.fingerprintjs.android.fpjs_pro_internal.X26477.b = ((r3 ^ 115) + ((r3 & 115) << 1)) % 128;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02b1, code lost:
    
        if (a((kotlin.Pair) r2) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x036f, code lost:
    
        if (r4 < 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x037a, code lost:
    
        kotlin.collections.CollectionsKt.throwIndexOverflow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0378, code lost:
    
        if (r4 < 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        Object next;
        List d0;
        boolean z;
        int i7;
        int i8;
        Pair pair;
        int i9;
        int i10;
        String str;
        String str2;
        Object next2;
        int i11;
        Object next3;
        int i12;
        boolean z2;
        int i13;
        Object obj;
        int i14 = ~i6;
        int i15 = ~i2;
        int i16 = i14 | i15;
        int i17 = ~(i16 | i4);
        int i18 = ~i4;
        int i19 = (~(i15 | i18)) | (~(i14 | i2)) | (~(i15 | i6));
        int i20 = ~(i18 | i16);
        int i21 = (1374945280 * i5) + ((-1907359744) * i) + (1903427584 * i3) + ((-1345052743) * i20) + (i19 * (-1345052743)) + (1604861810 * i17) + ((-1046486968) * i2) + (i6 * (-1046486968)) + 2037645312;
        int a2 = com.fingerprintjs.android.fpjs_pro.g.a(i5, -1869228383, (1938118820 * i) + i6 + i2 + i3);
        int i22 = i20 * 851;
        int c2 = com.fingerprintjs.android.fpjs_pro.g.c(a2, 1239351296, (1557372491 * i5) + ((-1260466036) * i) + (647973227 * i3) + i22 + (i19 * 851) + (i17 * 1702) + (i2 * 647972376) + ((i6 * 647972376) - 1941852458), 490405888, (1516044288 * a2) + i21);
        Object obj2 = "";
        int i23 = 5;
        int i24 = 3;
        if (c2 != 1) {
            if (c2 != 2) {
                if (c2 != 3) {
                    if (c2 != 4) {
                        int i25 = b;
                        a = (((i25 | 85) << 1) - (i25 ^ 85)) % 128;
                        w5 w5Var = (w5) b(new Object[0], br.component9.a(), 1064113716, br.component9.a(), br.component9.a(), br.component9.a(), -1064113714);
                        b = (a + 93) % 128;
                        return w5Var;
                    }
                    int identityHashCode = System.identityHashCode((X26477) objArr[0]);
                    int i26 = ~((562783612 & identityHashCode) | (562783612 ^ identityHashCode));
                    int i27 = ((((-1909454847) ^ i26) | (i26 & (-1909454847))) * 1504) - 829078520;
                    int i28 = (~(((-1346671235) ^ identityHashCode) | (identityHashCode & (-1346671235)))) * (-1504);
                    int i29 = (i27 & i28) + (i28 | i27);
                    int i30 = ((i29 | 1147230624) << 1) - (1147230624 ^ i29);
                    int a3 = br.component9.a();
                    int i31 = ~a3;
                    int i32 = ~(((-33622097) ^ i31) | ((-33622097) & i31));
                    int i33 = (((i32 ^ 1075856641) | (i32 & 1075856641)) * (-591)) + 1824670620;
                    int i34 = (a3 ^ (-35359319)) | (a3 & (-35359319));
                    int i35 = ((i34 ^ 1077593863) | (i34 & 1077593863)) * 591;
                    try {
                        if (i30 <= (i33 ^ i35) + ((i35 & i33) << 1)) {
                            Object[] objArr2 = {1L, r0, r0, x0.h, 109, null};
                            Boolean bool = Boolean.TRUE;
                            Object f = rV4669.f(-308176489);
                            if (f == null) {
                                int combineMeasuredStates = View.combineMeasuredStates(0, 0) + 1526;
                                char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 51;
                                Class cls = Long.TYPE;
                                Class cls2 = Boolean.TYPE;
                                f = rV4669.g(combineMeasuredStates, c3, scrollDefaultDelay, 1678066931, "D8871", new Class[]{cls, cls2, cls2, Function0.class, Integer.TYPE, Object.class});
                            }
                            Object invoke = ((Method) f).invoke(null, objArr2);
                            Result.Companion companion = Result.INSTANCE;
                            boolean z3 = invoke instanceof r5g;
                            obj = invoke;
                        } else {
                            Object[] objArr3 = {0L, r0, r0, x0.h, 7, null};
                            Boolean bool2 = Boolean.FALSE;
                            Object f2 = rV4669.f(-308176489);
                            if (f2 == null) {
                                int indexOf = TextUtils.indexOf("", "", 0) + 1526;
                                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i36 = 51 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                Class cls3 = Long.TYPE;
                                Class cls4 = Boolean.TYPE;
                                f2 = rV4669.g(indexOf, jumpTapTimeout, i36, 1678066931, "D8871", new Class[]{cls3, cls4, cls4, Function0.class, Integer.TYPE, Object.class});
                            }
                            Object invoke2 = ((Method) f2).invoke(null, objArr3);
                            Result.Companion companion2 = Result.INSTANCE;
                            boolean z4 = invoke2 instanceof r5g;
                            obj = invoke2;
                        }
                        String str3 = (String) obj2;
                        int i37 = ((i13 | 71) << 1) - (i13 ^ 71);
                        b = i37 % 128;
                        if (i37 % 2 != 0) {
                            return str3;
                        }
                        throw null;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                List list = (List) objArr[0];
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int i38 = b;
                    int i39 = (i38 ^ 33) + ((i38 & 33) << 1);
                    a = i39 % 128;
                    if (i39 % 2 != 0) {
                        next3 = it.next();
                        int i40 = 37 / 0;
                    } else {
                        next3 = it.next();
                    }
                    if (!z2) {
                        break;
                    }
                    int i41 = (i12 ^ 109) + ((i12 & 109) << 1);
                    b = i41 % 128;
                    if (i41 % 2 != 0) {
                        arrayList.add(next3);
                    } else {
                        arrayList.add(next3);
                        throw null;
                    }
                }
                return arrayList;
            }
            ArrayList i0 = CollectionsKt.i0(CollectionsKt.i0(eb4.c(""), StringsKt.W(FilesKt.h(new File("/proc/cpuinfo")))), eb4.c(""));
            ArrayList arrayList2 = new ArrayList(CollectionsKt.w(i0));
            Iterator it2 = i0.iterator();
            int i42 = 0;
            while (it2.hasNext()) {
                Object next4 = it2.next();
                int i43 = ((i42 | 1) << 1) - (i42 ^ 1);
                if (i42 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList2.add(new Pair((String) next4, Integer.valueOf(i42)));
                i42 = i43;
            }
            ArrayList C = CollectionsKt.C(CollectionsKt.S0(arrayList2, a1.h));
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = i0.iterator();
            int i44 = 0;
            while (it3.hasNext()) {
                int i45 = b;
                int i46 = (i45 & 117) + (i45 | 117);
                a = i46 % 128;
                if (i46 % 2 != 0) {
                    next2 = it3.next();
                    int i47 = (i44 & 58) + (i44 | 58);
                    i11 = (i47 & (-24)) + (i47 | (-24));
                } else {
                    next2 = it3.next();
                    i11 = i44 + 1;
                }
                if (!C.contains(Integer.valueOf(i44))) {
                    arrayList3.add(next2);
                } else {
                    br.component9.a();
                    br.component9.a();
                }
                i44 = i11;
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt.w(arrayList3));
            Iterator it4 = arrayList3.iterator();
            int i48 = 0;
            while (it4.hasNext()) {
                Object next5 = it4.next();
                int i49 = (i48 ^ 1) + ((i48 & 1) << 1);
                if (i48 < 0) {
                    int i50 = a;
                    int i51 = (i50 ^ 15) + ((i50 & 15) << 1);
                    b = i51 % 128;
                    if (i51 % 2 != 0) {
                        CollectionsKt.throwIndexOverflow();
                    } else {
                        CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                }
                Integer valueOf = Integer.valueOf(i48);
                if (!StringsKt.T((String) next5)) {
                    valueOf = null;
                }
                arrayList4.add(valueOf);
                i48 = i49;
            }
            ArrayList S0 = CollectionsKt.S0(CollectionsKt.C(arrayList4), new y0(arrayList3));
            ArrayList arrayList5 = new ArrayList(CollectionsKt.w(S0));
            Iterator it5 = S0.iterator();
            while (it5.hasNext()) {
                List<String> list2 = (List) it5.next();
                ArrayList arrayList6 = new ArrayList();
                for (String str4 : list2) {
                    b = (a + 101) % 128;
                    int i52 = a;
                    int i53 = ((i52 | 73) << 1) - (i52 ^ 73);
                    b = i53 % 128;
                    if (i53 % 2 == 0) {
                        d0 = StringsKt.d0(str4, new String[]{":"}, true, i24, 2);
                    } else {
                        d0 = StringsKt.d0(str4, new String[]{":"}, false, 2, 2);
                    }
                    if (z) {
                        br.component9.a();
                        br.component9.a();
                    } else {
                        d0 = null;
                    }
                    if (d0 != null) {
                        List<String> list3 = d0;
                        ArrayList arrayList7 = new ArrayList(CollectionsKt.w(list3));
                        for (String str5 : list3) {
                            int length = str5.length();
                            int i54 = 0;
                            while (true) {
                                if (i54 < length) {
                                    i9 = i23;
                                    int i55 = a + 83;
                                    i10 = i24;
                                    b = i55 % 128;
                                    if (i55 % 2 != 0) {
                                        if (!CharsKt.c(str5.charAt(i54))) {
                                            a = (b + 3) % 128;
                                            str = str5.substring(i54);
                                            break;
                                        }
                                        i54++;
                                        a = (b + 51) % 128;
                                        i23 = i9;
                                        i24 = i10;
                                    } else {
                                        CharsKt.c(str5.charAt(i54));
                                        throw null;
                                    }
                                } else {
                                    i9 = i23;
                                    i10 = i24;
                                    str = "";
                                    break;
                                }
                            }
                            int length2 = str.length() - 1;
                            while (true) {
                                if (length2 >= 0) {
                                    int i56 = b;
                                    int i57 = ((i56 | 19) << 1) - (i56 ^ 19);
                                    a = i57 % 128;
                                    if (i57 % 2 == 0) {
                                        if (!CharsKt.c(str.charAt(length2))) {
                                            str2 = str.substring(0, (length2 & 1) + (length2 | 1));
                                            break;
                                        }
                                        int i58 = (length2 ^ 70) + ((length2 & 70) << 1);
                                        length2 = (i58 ^ (-71)) + ((i58 & (-71)) << 1);
                                    } else {
                                        CharsKt.c(str.charAt(length2));
                                        throw null;
                                    }
                                } else {
                                    int i59 = a;
                                    b = ((i59 & 55) + (i59 | 55)) % 128;
                                    str2 = "";
                                    break;
                                }
                            }
                            arrayList7.add(str2);
                            br.component9.a();
                            br.component9.a();
                            i23 = i9;
                            i24 = i10;
                        }
                        i7 = i23;
                        i8 = i24;
                        pair = new Pair(arrayList7.get(0), arrayList7.get(1));
                    } else {
                        i7 = i23;
                        i8 = i24;
                        int i60 = a + 45;
                        b = i60 % 128;
                        if (i60 % 2 != 0) {
                            pair = null;
                        } else {
                            throw null;
                        }
                    }
                    if (pair != null) {
                        int i61 = a + 99;
                        b = i61 % 128;
                        if (i61 % 2 == 0) {
                            arrayList6.add(pair);
                            int i62 = 69 / 0;
                        } else {
                            arrayList6.add(pair);
                        }
                    }
                    i23 = i7;
                    i24 = i8;
                }
                arrayList5.add(arrayList6);
            }
            ArrayList arrayList8 = new ArrayList();
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                Object next6 = it6.next();
                if (!((List) next6).isEmpty()) {
                    arrayList8.add(next6);
                    int i63 = b;
                    a = ((i63 ^ 89) + ((i63 & 89) << 1)) % 128;
                } else {
                    int i64 = a;
                    b = (((i64 | 47) << 1) - (i64 ^ 47)) % 128;
                }
            }
            ArrayList arrayList9 = new ArrayList(CollectionsKt.w(arrayList8));
            Iterator it7 = arrayList8.iterator();
            while (it7.hasNext()) {
                int i65 = b;
                a = (((i65 | 39) << 1) - (i65 ^ 39)) % 128;
                List list4 = (List) it7.next();
                ArrayList arrayList10 = new ArrayList();
                Iterator it8 = list4.iterator();
                while (true) {
                    boolean z5 = false;
                    while (it8.hasNext()) {
                        next = it8.next();
                        if (z5) {
                            int i66 = b;
                            a = ((i66 & 11) + (i66 | 11)) % 128;
                            arrayList10.add(next);
                            int i67 = a;
                            b = ((i67 ^ 27) + ((i67 & 27) << 1)) % 128;
                        } else if (!a((Pair) next)) {
                            a = (b + 95) % 128;
                        } else {
                            int i68 = b;
                            int i69 = ((i68 & 43) + (i68 | 43)) % 128;
                            a = i69;
                            int i70 = i69 + 71;
                            b = i70 % 128;
                            if (i70 % 2 == 0) {
                                break;
                            }
                            arrayList10.add(next);
                            z5 = true;
                        }
                    }
                    arrayList10.add(next);
                }
                arrayList9.add(arrayList10);
            }
            ArrayList arrayList11 = new ArrayList();
            Iterator it9 = arrayList9.iterator();
            while (it9.hasNext()) {
                int i71 = a + 119;
                b = i71 % 128;
                if (i71 % 2 != 0) {
                    Object next7 = it9.next();
                    if (!((List) next7).isEmpty()) {
                        int i72 = b;
                        int i73 = ((i72 | 125) << 1) - (i72 ^ 125);
                        int i74 = i73 % 128;
                        a = i74;
                        if (i73 % 2 == 0) {
                            b = (i74 + 41) % 128;
                            arrayList11.add(next7);
                        }
                    }
                } else {
                    ((List) it9.next()).isEmpty();
                    throw null;
                }
            }
            ArrayList arrayList12 = new ArrayList(CollectionsKt.w(arrayList11));
            Iterator it10 = arrayList11.iterator();
            while (it10.hasNext()) {
                List list5 = (List) it10.next();
                ArrayList arrayList13 = new ArrayList();
                for (Object obj3 : list5) {
                    if (!a((Pair) obj3)) {
                        int i75 = a + 45;
                        b = i75 % 128;
                        if (i75 % 2 != 0) {
                            arrayList13.add(obj3);
                        } else {
                            arrayList13.add(obj3);
                            throw null;
                        }
                    }
                }
                arrayList12.add(arrayList13);
            }
            ArrayList arrayList14 = new ArrayList(CollectionsKt.w(arrayList8));
            Iterator it11 = arrayList8.iterator();
            while (it11.hasNext()) {
                int i76 = b;
                a = ((i76 & 3) + (i76 | 3)) % 128;
                arrayList14.add((List) b(new Object[]{(List) it11.next()}, br.component9.a(), 2079548886, br.component9.a(), br.component9.a(), br.component9.a(), -2079548883));
                int i77 = b;
                a = ((i77 ^ 123) + ((i77 & 123) << 1)) % 128;
            }
            ArrayList arrayList15 = new ArrayList();
            Iterator it12 = arrayList14.iterator();
            a = (b + 87) % 128;
            while (it12.hasNext()) {
                int i78 = a;
                b = ((i78 ^ 13) + ((i78 & 13) << 1)) % 128;
                Object next8 = it12.next();
                if (!((List) next8).isEmpty()) {
                    int i79 = b;
                    int i80 = ((i79 | 87) << 1) - (i79 ^ 87);
                    a = i80 % 128;
                    if (i80 % 2 == 0) {
                        arrayList15.add(next8);
                    } else {
                        arrayList15.add(next8);
                        throw null;
                    }
                }
            }
            w5 w5Var2 = new w5(CollectionsKt.G(arrayList15), arrayList12);
            int i81 = b;
            int i82 = (i81 ^ 59) + ((i81 & 59) << 1);
            a = i82 % 128;
            if (i82 % 2 != 0) {
                int i83 = 90 / 0;
            }
            return w5Var2;
        }
        br.component9.a();
        br.component9.a();
        try {
            Object[] objArr4 = {0L, r0, r0, z0.h, 7, null};
            Boolean bool3 = Boolean.FALSE;
            Object f3 = rV4669.f(-308176489);
            if (f3 == null) {
                int offsetAfter = 1526 - TextUtils.getOffsetAfter("", 0);
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int indexOf2 = 51 - TextUtils.indexOf("", "");
                Class cls5 = Long.TYPE;
                Class cls6 = Boolean.TYPE;
                f3 = rV4669.g(offsetAfter, doubleTapTimeout, indexOf2, 1678066931, "D8871", new Class[]{cls5, cls6, cls6, Function0.class, Integer.TYPE, Object.class});
            }
            Object invoke3 = ((Method) f3).invoke(null, objArr4);
            Result.Companion companion3 = Result.INSTANCE;
            if (invoke3 instanceof r5g) {
                int i84 = a;
                int i85 = ((i84 | 61) << 1) - (i84 ^ 61);
                int i86 = i85 % 128;
                b = i86;
                if (i85 % 2 == 0) {
                    int i87 = 23 / 0;
                }
                a = (i86 + 31) % 128;
                invoke3 = 0;
            } else {
                b = (a + 93) % 128;
            }
            int intValue = ((Number) invoke3).intValue();
            a = (b + 15) % 128;
            return Integer.valueOf(intValue);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    public static int component5() {
        int i = c;
        int i2 = i % 8793434;
        c = i + 1;
        if (i2 != 0) {
            return d;
        }
        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
        d = elapsedRealtime;
        return elapsedRealtime;
    }
}
