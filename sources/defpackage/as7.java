package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class as7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final Map p;
    public final Map q;
    public final Map r;

    public as7(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = str14;
        this.o = str15;
        this.p = linkedHashMap;
        this.q = linkedHashMap2;
        this.r = linkedHashMap3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zr7] */
    public final zr7 a() {
        LinkedHashMap linkedHashMap;
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        obj.m = this.m;
        obj.n = this.n;
        obj.o = this.o;
        LinkedHashMap linkedHashMap2 = null;
        Map map = this.p;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = null;
        }
        obj.p = linkedHashMap;
        Map map2 = this.q;
        if (map2 != null) {
            linkedHashMap2 = new LinkedHashMap(map2);
        }
        obj.q = linkedHashMap2;
        obj.b(this.r);
        return obj;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(as7.class, cls)) {
            return false;
        }
        obj.getClass();
        as7 as7Var = (as7) obj;
        if (Intrinsics.areEqual(this.a, as7Var.a) && Intrinsics.areEqual(this.b, as7Var.b) && Intrinsics.areEqual(this.c, as7Var.c) && Intrinsics.areEqual(this.d, as7Var.d) && Intrinsics.areEqual(this.e, as7Var.e) && Intrinsics.areEqual(this.f, as7Var.f) && Intrinsics.areEqual(this.g, as7Var.g) && Intrinsics.areEqual(this.h, as7Var.h) && Intrinsics.areEqual(this.i, as7Var.i) && Intrinsics.areEqual(this.j, as7Var.j) && Intrinsics.areEqual(this.k, as7Var.k) && Intrinsics.areEqual(this.l, as7Var.l) && Intrinsics.areEqual(this.m, as7Var.m) && Intrinsics.areEqual(this.n, as7Var.n) && Intrinsics.areEqual(this.o, as7Var.o) && Intrinsics.areEqual(this.p, as7Var.p) && Intrinsics.areEqual(this.q, as7Var.q) && Intrinsics.areEqual(this.r, as7Var.r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i19 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i20 = (i19 + i2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i21 = (i20 + i3) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i22 = (i21 + i4) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i23 = (i22 + i5) * 31;
        String str6 = this.f;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i24 = (i23 + i6) * 31;
        String str7 = this.g;
        if (str7 != null) {
            i7 = str7.hashCode();
        } else {
            i7 = 0;
        }
        int i25 = (i24 + i7) * 31;
        String str8 = this.h;
        if (str8 != null) {
            i8 = str8.hashCode();
        } else {
            i8 = 0;
        }
        int i26 = (i25 + i8) * 31;
        String str9 = this.i;
        if (str9 != null) {
            i9 = str9.hashCode();
        } else {
            i9 = 0;
        }
        int i27 = (i26 + i9) * 31;
        String str10 = this.j;
        if (str10 != null) {
            i10 = str10.hashCode();
        } else {
            i10 = 0;
        }
        int i28 = (i27 + i10) * 31;
        String str11 = this.k;
        if (str11 != null) {
            i11 = str11.hashCode();
        } else {
            i11 = 0;
        }
        int i29 = (i28 + i11) * 31;
        String str12 = this.l;
        if (str12 != null) {
            i12 = str12.hashCode();
        } else {
            i12 = 0;
        }
        int i30 = (i29 + i12) * 31;
        String str13 = this.m;
        if (str13 != null) {
            i13 = str13.hashCode();
        } else {
            i13 = 0;
        }
        int i31 = (i30 + i13) * 31;
        String str14 = this.n;
        if (str14 != null) {
            i14 = str14.hashCode();
        } else {
            i14 = 0;
        }
        int i32 = (i31 + i14) * 31;
        String str15 = this.o;
        if (str15 != null) {
            i15 = str15.hashCode();
        } else {
            i15 = 0;
        }
        int i33 = (i32 + i15) * 31;
        Map map = this.p;
        if (map != null) {
            i16 = map.hashCode();
        } else {
            i16 = 0;
        }
        int i34 = (i33 + i16) * 31;
        Map map2 = this.q;
        if (map2 != null) {
            i17 = map2.hashCode();
        } else {
            i17 = 0;
        }
        int i35 = (i34 + i17) * 31;
        Map map3 = this.r;
        if (map3 != null) {
            i18 = map3.hashCode();
        }
        return i35 + i18;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentUser(userId=");
        sb.append(this.a);
        sb.append(", deviceId=");
        sb.append(this.b);
        sb.append(", country=");
        sb.append(this.c);
        sb.append(", region=");
        sb.append(this.d);
        sb.append(", dma=");
        sb.append(this.e);
        sb.append(", city=");
        sb.append(this.f);
        sb.append(", language=");
        sb.append(this.g);
        sb.append(", platform=");
        sb.append(this.h);
        sb.append(", version=");
        sb.append(this.i);
        sb.append(", os=");
        sb.append(this.j);
        sb.append(", deviceManufacturer=");
        sb.append(this.k);
        sb.append(", deviceBrand=");
        sb.append(this.l);
        sb.append(", deviceModel=");
        sb.append(this.m);
        sb.append(", carrier=");
        sb.append(this.n);
        sb.append(", library=");
        sb.append(this.o);
        sb.append(", userProperties=");
        sb.append(this.p);
        sb.append(", groups=");
        sb.append(this.q);
        sb.append(", groupProperties=");
        return hdi.s(sb, this.r, ')');
    }

    public as7() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
