package com.fingerprintjs.android.fpjs_pro_internal;

import android.net.Uri;
import com.fingerprintjs.android.fpjs_pro_internal.C1722;
import com.fingerprintjs.android.fpjs_pro_internal.m2;
import defpackage.c1c;
import defpackage.d1c;
import defpackage.hdi;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http.HttpStatusCodesKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class Y16199 implements bz {
    public static int p = 0;
    public static int q = 1;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Function1 g;
    public final Map h;
    public final String i;
    public final String j;
    public final boolean k;
    public final List l;
    public final String m;
    public final m2.a n = m2.a.c;
    public final Map o = hdi.v(C1722.k.e.setPivotYN16904(), C1722.w7.e.setPivotYN16904());

    public Y16199(String str, String str2, String str3, String str4, String str5, String str6, Function1<? super bv, ? extends List<? extends eT28692>> function1, Map<String, ? extends Object> map, String str7, String str8, boolean z, List<Pair<String, String>> list, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = function1;
        this.h = map;
        this.i = str7;
        this.j = str8;
        this.k = z;
        this.l = list;
        this.m = str9;
    }

    public static /* synthetic */ Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i);
        int i9 = (~(i7 | i4)) | i8;
        int i10 = ~i;
        int i11 = ~i4;
        int i12 = i9 | (~(i10 | i11 | i5));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i5;
        int i15 = (~(i4 | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = 582483968 * i6;
        int i18 = ((-297271296) * i2) + (36700160 * i3) + i17 + ((-347588399) * i16) + (695176798 * i15) + (i12 * 695176798) + (234895570 * i) + ((i5 * 234895570) - 128974848);
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i2, -604038433, ((-327997910) * i3) + i5 + i + i6);
        int i19 = i15 * (-1294);
        int i20 = i16 * 647;
        int i21 = i6 * (-238134313);
        int i22 = i3 * (-1022231738);
        int i23 = i2 * 4118089;
        int c = com.fingerprintjs.android.fpjs_pro.g.c(a, -35979264, i23 + i22 + i21 + i20 + i19 + (i12 * (-1294)) + (i * (-238133666)) + (i5 * (-238133666)) + 182491156, 1404239872, (1302134784 * a) + i18);
        if (c != 1) {
            if (c != 2) {
                Y16199 y16199 = (Y16199) objArr[0];
                p = (q + 121) % 128;
                Uri parse = Uri.parse(y16199.a);
                parse.getClass();
                Uri.Builder buildUpon = parse.buildUpon();
                buildUpon.getClass();
                String pivotYN16904 = C1722.i.e.setPivotYN16904();
                y5 y5Var = y5.a;
                buildUpon.appendQueryParameter(pivotYN16904, y5.a(y16199.i));
                buildUpon.appendQueryParameter(C1722.d5.e.setPivotYN16904(), y16199.b);
                q = (p + 53) % 128;
                for (Pair pair : y16199.l) {
                    q = (p + 109) % 128;
                    buildUpon.appendQueryParameter(C1722.m2.e.setPivotYN16904(), pair.getFirst() + AgentHeaderCreator.AGENT_DIVIDER + pair.getSecond());
                    int i24 = q;
                    p = ((i24 ^ 109) + ((i24 & 109) << 1)) % 128;
                }
                String obj = buildUpon.build().toString();
                int i25 = p + 93;
                q = i25 % 128;
                if (i25 % 2 != 0) {
                    return obj;
                }
                throw null;
            }
            Y16199 y161992 = (Y16199) objArr[0];
            int i26 = q;
            int i27 = ((i26 | 113) << 1) - (i26 ^ 113);
            int i28 = i27 % 128;
            p = i28;
            int i29 = i27 % 2;
            Map map = y161992.o;
            if (i29 != 0) {
                int i30 = 63 / 0;
            }
            int i31 = (i28 & 125) + (i28 | 125);
            q = i31 % 128;
            if (i31 % 2 != 0) {
                return map;
            }
            throw null;
        }
        Y16199 y161993 = (Y16199) objArr[0];
        int i32 = p;
        int i33 = ((i32 | 9) << 1) - (i32 ^ 9);
        q = i33 % 128;
        int i34 = i33 % 2;
        Object[] objArr2 = {y161993};
        int a2 = i2.a();
        int a3 = i2.a();
        int a4 = i2.a();
        int a5 = i2.a();
        if (i34 != 0) {
            String str = (String) b(objArr2, -287158943, a5, a4, a2, 287158943, a3);
            int i35 = p + 15;
            q = i35 % 128;
            if (i35 % 2 != 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.bz
    public final m2 D8871() {
        int i = q + 11;
        int i2 = i % 128;
        p = i2;
        if (i % 2 == 0) {
            int i3 = (i2 & 11) + (i2 | 11);
            q = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = (i2 ^ 69) + ((i2 & 69) << 1);
                q = i4 % 128;
                if (i4 % 2 != 0) {
                    return this.n;
                }
                throw null;
            }
            throw null;
        }
        int i5 = (i2 & 11) + (i2 | 11);
        q = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0308  */
    @Override // com.fingerprintjs.android.fpjs_pro_internal.bz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map a(bv bvVar) {
        String str;
        int i;
        String str2;
        Map map;
        Iterator it;
        HashMap hashMap = new HashMap();
        C1722.hc hcVar = C1722.hc.e;
        String pivotYN16904 = hcVar.setPivotYN16904();
        String c = k4.c(nL14774.wX26196(), nL14774.wX26196(), 955275278, -955275275, nL14774.wX26196(), nL14774.wX26196());
        String str3 = "";
        String str4 = this.f;
        if (str4 == null) {
            str4 = "";
        }
        Pair pair = new Pair(pivotYN16904, d1c.e(new Pair(c, str4), new Pair(k4.c(nL14774.wX26196(), nL14774.wX26196(), -500297098, 500297104, nL14774.wX26196(), nL14774.wX26196()), C1722.fe.e.setPivotYN16904())));
        C1722.h5 h5Var = C1722.h5.e;
        Map e = d1c.e(pair, new Pair(h5Var.setPivotYN16904(), 0));
        int i2 = k4.q;
        String str5 = k4.a;
        k4.p = (i2 + 13) % 128;
        hashMap.put(str5, this.b);
        String c2 = k4.c(nL14774.wX26196(), nL14774.wX26196(), -1547223531, 1547223535, nL14774.wX26196(), nL14774.wX26196());
        String str6 = this.j;
        if (str6 != null) {
            str3 = str6;
        }
        hashMap.put(c2, str3);
        hashMap.put(k4.c(nL14774.wX26196(), nL14774.wX26196(), -1780132949, 1780132949, nL14774.wX26196(), nL14774.wX26196()), e);
        String str7 = this.c;
        if (str7 != null) {
            int i3 = p;
            q = ((i3 ^ 117) + ((i3 & 117) << 1)) % 128;
            if (str7.length() != 0) {
                int i4 = p;
                q = ((i4 & HttpStatusCodesKt.HTTP_EARLY_HINTS) + (i4 | HttpStatusCodesKt.HTTP_EARLY_HINTS)) % 128;
                hashMap.put(k4.c(nL14774.wX26196(), nL14774.wX26196(), -470742108, 470742110, nL14774.wX26196(), nL14774.wX26196()), d1c.e(new Pair(h5Var.setPivotYN16904(), 0), new Pair(hcVar.setPivotYN16904(), str7)));
                q = (p + 95) % 128;
                str = this.d;
                if (str == null && str.length() != 0) {
                    hashMap.put(k4.a(), d1c.e(new Pair(h5Var.setPivotYN16904(), 0), new Pair(hcVar.setPivotYN16904(), str)));
                    int i5 = q;
                    p = ((i5 & 27) + (i5 | 27)) % 128;
                } else {
                    int i6 = p;
                    i = ((i6 | 27) << 1) - (i6 ^ 27);
                    q = i % 128;
                    if (i % 2 == 0) {
                        hashMap.put(k4.a(), c1c.b(new Pair(h5Var.setPivotYN16904(), -1)));
                    } else {
                        hashMap.put(k4.a(), c1c.b(new Pair(h5Var.setPivotYN16904(), -1)));
                        throw null;
                    }
                }
                String str8 = this.e;
                if (str8 != null) {
                    int i7 = q;
                    p = (((i7 | 49) << 1) - (i7 ^ 49)) % 128;
                    if (str8.length() != 0) {
                        hashMap.put(k4.b(), d1c.e(new Pair(h5Var.setPivotYN16904(), 0), new Pair(hcVar.setPivotYN16904(), str8)));
                        if (this.k) {
                            int i8 = q;
                            p = ((i8 ^ 37) + ((i8 & 37) << 1)) % 128;
                            int i9 = k4.p + 29;
                            k4.q = i9 % 128;
                            if (i9 % 2 != 0) {
                                hashMap.put(k4.h, 1);
                            } else {
                                throw null;
                            }
                        }
                        str2 = this.m;
                        if (str2.length() <= 0) {
                            hashMap.put(k4.c(nL14774.wX26196(), nL14774.wX26196(), -1549319453, 1549319454, nL14774.wX26196(), nL14774.wX26196()), str2);
                            int i10 = q;
                            p = ((i10 ^ 17) + ((i10 & 17) << 1)) % 128;
                        } else {
                            int i11 = p;
                            q = (((i11 | 29) << 1) - (i11 ^ 29)) % 128;
                        }
                        map = this.h;
                        if (!map.isEmpty()) {
                            int i12 = p + 23;
                            q = i12 % 128;
                            if (i12 % 2 != 0) {
                                int i13 = k4.p;
                                String str9 = k4.b;
                                k4.q = (((i13 | 117) << 1) - (i13 ^ 117)) % 128;
                                hashMap.put(str9, map);
                            } else {
                                int i14 = k4.p;
                                String str10 = k4.b;
                                k4.q = (((i14 | 117) << 1) - (i14 ^ 117)) % 128;
                                hashMap.put(str10, map);
                                throw null;
                            }
                        }
                        it = ((Iterable) this.g.invoke(bvVar)).iterator();
                        while (it.hasNext()) {
                            int i15 = q + 9;
                            p = i15 % 128;
                            if (i15 % 2 == 0) {
                                eT28692 et28692 = (eT28692) it.next();
                                et28692.getClass();
                                int i16 = (eT28692.e + 75) % 128;
                                eT28692.d = i16;
                                String str11 = et28692.a;
                                eT28692.e = (i16 + 101) % 128;
                                hashMap.put(str11, et28692.a());
                            } else {
                                eT28692 et286922 = (eT28692) it.next();
                                et286922.getClass();
                                int i17 = (eT28692.e + 75) % 128;
                                eT28692.d = i17;
                                String str12 = et286922.a;
                                eT28692.e = (i17 + 101) % 128;
                                hashMap.put(str12, et286922.a());
                                throw null;
                            }
                        }
                        return hashMap;
                    }
                }
                hashMap.put(k4.b(), c1c.b(new Pair(h5Var.setPivotYN16904(), -1)));
                if (this.k) {
                }
                str2 = this.m;
                if (str2.length() <= 0) {
                }
                map = this.h;
                if (!map.isEmpty()) {
                }
                it = ((Iterable) this.g.invoke(bvVar)).iterator();
                while (it.hasNext()) {
                }
                return hashMap;
            }
        }
        hashMap.put(k4.c(nL14774.wX26196(), nL14774.wX26196(), -470742108, 470742110, nL14774.wX26196(), nL14774.wX26196()), c1c.b(new Pair(h5Var.setPivotYN16904(), -1)));
        str = this.d;
        if (str == null) {
        }
        int i62 = p;
        i = ((i62 | 27) << 1) - (i62 ^ 27);
        q = i % 128;
        if (i % 2 == 0) {
        }
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.bz
    public final Map setPivotYN16904() {
        int a = i2.a();
        int a2 = i2.a();
        return (Map) b(new Object[]{this}, -117516514, i2.a(), i2.a(), a, 117516516, a2);
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.bz
    public final String vD14832N6715() {
        int a = i2.a();
        int a2 = i2.a();
        return (String) b(new Object[]{this}, -1085119574, i2.a(), i2.a(), a, 1085119575, a2);
    }
}
