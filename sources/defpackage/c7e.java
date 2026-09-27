package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.fingerprintjs.android.fpjs_pro.g;
import com.google.mlkit.vision.barcode.common.Barcode;
import io.intercom.android.sdk.models.AttributeType;
import io.radar.sdk.RadarTripOptions;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.f;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c7e implements k8i, Parcelable {
    public static final Parcelable.Creator<c7e> CREATOR = new i5e(29);
    public final String a;
    public final boolean b;
    public final s6e c;
    public final w6e d;
    public final v6e e;
    public final z6e f;
    public final p6e g;
    public final q6e h;
    public final y6e i;
    public final b7e j;
    public final x6e k;
    public final t6e l;
    public final a7e m;
    public final p5e n;
    public final l5e o;
    public final wmf p;
    public final Map q;
    public final Set r;
    public final y54 s;
    public final Map t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c7e(c6e c6eVar, s6e s6eVar, b7e b7eVar, x6e x6eVar, p5e p5eVar, l5e l5eVar, y54 y54Var, int i) {
        this(c6eVar.code, c6eVar.requiresMandate, r7, null, null, null, null, null, null, r14, r15, null, null, p5eVar, r19, null, null, r22, r23, null);
        s6e s6eVar2;
        b7e b7eVar2;
        x6e x6eVar2;
        l5e l5eVar2;
        y54 y54Var2;
        if ((i & 2) != 0) {
            s6eVar2 = null;
        } else {
            s6eVar2 = s6eVar;
        }
        if ((i & 256) != 0) {
            b7eVar2 = null;
        } else {
            b7eVar2 = b7eVar;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            x6eVar2 = null;
        } else {
            x6eVar2 = x6eVar;
        }
        if ((i & 8192) != 0) {
            l5eVar2 = null;
        } else {
            l5eVar2 = l5eVar;
        }
        fd7 fd7Var = fd7.a;
        if ((i & 131072) != 0) {
            y54Var2 = null;
        } else {
            y54Var2 = y54Var;
        }
        c6eVar.getClass();
        fd7Var.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Set] */
    public static c7e g(c7e c7eVar, wmf wmfVar, dzg dzgVar, int i) {
        String str;
        Map map;
        dzg dzgVar2;
        String str2 = c7eVar.a;
        boolean z = c7eVar.b;
        s6e s6eVar = c7eVar.c;
        w6e w6eVar = c7eVar.d;
        v6e v6eVar = c7eVar.e;
        z6e z6eVar = c7eVar.f;
        p6e p6eVar = c7eVar.g;
        q6e q6eVar = c7eVar.h;
        y6e y6eVar = c7eVar.i;
        b7e b7eVar = c7eVar.j;
        x6e x6eVar = c7eVar.k;
        t6e t6eVar = c7eVar.l;
        a7e a7eVar = c7eVar.m;
        p5e p5eVar = c7eVar.n;
        l5e l5eVar = c7eVar.o;
        if ((i & 32768) != 0) {
            str = str2;
            wmfVar = c7eVar.p;
        } else {
            str = str2;
        }
        Map map2 = c7eVar.q;
        if ((i & 131072) != 0) {
            map = map2;
            dzgVar2 = c7eVar.r;
        } else {
            map = map2;
            dzgVar2 = dzgVar;
        }
        y54 y54Var = c7eVar.s;
        Map map3 = c7eVar.t;
        c7eVar.getClass();
        str.getClass();
        dzgVar2.getClass();
        return new c7e(str, z, s6eVar, w6eVar, v6eVar, z6eVar, p6eVar, q6eVar, y6eVar, b7eVar, x6eVar, t6eVar, a7eVar, p5eVar, l5eVar, wmfVar, map, dzgVar2, y54Var, map3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        Map map;
        Object obj;
        String str;
        Object obj2 = ((LinkedHashMap) o0()).get("card");
        if (obj2 instanceof Map) {
            map = (Map) obj2;
        } else {
            map = null;
        }
        if (map != null) {
            obj = map.get(AttributeType.NUMBER);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return r2i.I(4, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7e)) {
            return false;
        }
        c7e c7eVar = (c7e) obj;
        if (Intrinsics.areEqual(this.a, c7eVar.a) && this.b == c7eVar.b && Intrinsics.areEqual(this.c, c7eVar.c) && Intrinsics.areEqual(this.d, c7eVar.d) && Intrinsics.areEqual(this.e, c7eVar.e) && Intrinsics.areEqual(this.f, c7eVar.f) && Intrinsics.areEqual(this.g, c7eVar.g) && Intrinsics.areEqual(this.h, c7eVar.h) && Intrinsics.areEqual(this.i, c7eVar.i) && Intrinsics.areEqual(this.j, c7eVar.j) && Intrinsics.areEqual(this.k, c7eVar.k) && Intrinsics.areEqual(this.l, c7eVar.l) && Intrinsics.areEqual(this.m, c7eVar.m) && Intrinsics.areEqual(this.n, c7eVar.n) && this.o == c7eVar.o && Intrinsics.areEqual(this.p, c7eVar.p) && Intrinsics.areEqual(this.q, c7eVar.q) && Intrinsics.areEqual(this.r, c7eVar.r) && Intrinsics.areEqual(this.s, c7eVar.s) && Intrinsics.areEqual(this.t, c7eVar.t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int g = hdi.g(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        s6e s6eVar = this.c;
        if (s6eVar == null) {
            hashCode = 0;
        } else {
            hashCode = s6eVar.hashCode();
        }
        int i2 = (g + hashCode) * 31;
        w6e w6eVar = this.d;
        if (w6eVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = w6eVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        v6e v6eVar = this.e;
        if (v6eVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = v6eVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        z6e z6eVar = this.f;
        if (z6eVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = z6eVar.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        p6e p6eVar = this.g;
        if (p6eVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = p6eVar.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        q6e q6eVar = this.h;
        if (q6eVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = q6eVar.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        y6e y6eVar = this.i;
        if (y6eVar == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = y6eVar.a.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        b7e b7eVar = this.j;
        if (b7eVar == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = b7eVar.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        x6e x6eVar = this.k;
        if (x6eVar == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = x6eVar.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        t6e t6eVar = this.l;
        if (t6eVar == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = t6eVar.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        a7e a7eVar = this.m;
        if (a7eVar == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = a7eVar.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        p5e p5eVar = this.n;
        if (p5eVar == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = p5eVar.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        l5e l5eVar = this.o;
        if (l5eVar == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = l5eVar.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        wmf wmfVar = this.p;
        if (wmfVar == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = wmfVar.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        Map map = this.q;
        if (map == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = map.hashCode();
        }
        int d = sv6.d(this.r, (i15 + hashCode15) * 31, 31);
        y54 y54Var = this.s;
        if (y54Var == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = y54Var.hashCode();
        }
        int i16 = (d + hashCode16) * 31;
        Map map2 = this.t;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return i16 + i;
    }

    public final Set l() {
        Set set;
        boolean areEqual = Intrinsics.areEqual(this.a, c6e.Card.code);
        Set set2 = this.r;
        if (areEqual) {
            s6e s6eVar = this.c;
            if (s6eVar == null || (set = s6eVar.f) == null) {
                set = fd7.a;
            }
            return f.h(set, set2);
        }
        return set2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    @Override // defpackage.k8i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map o0() {
        Map map;
        Map map2;
        Map map3;
        x6e x6eVar;
        Map o0;
        Map map4;
        Map map5;
        Map map6;
        Map map7 = null;
        Map map8 = this.t;
        if (map8 == null) {
            String str = this.a;
            Map v = hdi.v("type", str);
            p5e p5eVar = this.n;
            if (p5eVar != null) {
                map3 = ace.r("billing_details", p5eVar.o0());
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = zc7.a;
                map3.getClass();
            }
            LinkedHashMap j = d1c.j(v, map3);
            if (Intrinsics.areEqual(str, c6e.Card.code)) {
                s6e s6eVar = this.c;
                if (s6eVar != null) {
                    o0 = s6eVar.o0();
                    if (o0 != null || o0.isEmpty()) {
                        o0 = null;
                    }
                    if (o0 == null) {
                        map4 = ace.r(str, o0);
                    } else {
                        map4 = null;
                    }
                    if (map4 == null) {
                        map4 = zc7.a;
                        map4.getClass();
                    }
                    LinkedHashMap j2 = d1c.j(j, map4);
                    map5 = this.q;
                    if (map5 == null) {
                        map6 = ace.r(RadarTripOptions.KEY_METADATA, map5);
                    } else {
                        map6 = null;
                    }
                    if (map6 == null) {
                        map6 = zc7.a;
                        map6.getClass();
                    }
                    map8 = d1c.j(j2, map6);
                }
                o0 = null;
                if (o0 != null) {
                }
                o0 = null;
                if (o0 == null) {
                }
                if (map4 == null) {
                }
                LinkedHashMap j22 = d1c.j(j, map4);
                map5 = this.q;
                if (map5 == null) {
                }
                if (map6 == null) {
                }
                map8 = d1c.j(j22, map6);
            } else if (Intrinsics.areEqual(str, c6e.Ideal.code)) {
                w6e w6eVar = this.d;
                if (w6eVar != null) {
                    o0 = w6eVar.o0();
                    if (o0 != null) {
                    }
                    o0 = null;
                    if (o0 == null) {
                    }
                    if (map4 == null) {
                    }
                    LinkedHashMap j222 = d1c.j(j, map4);
                    map5 = this.q;
                    if (map5 == null) {
                    }
                    if (map6 == null) {
                    }
                    map8 = d1c.j(j222, map6);
                }
                o0 = null;
                if (o0 != null) {
                }
                o0 = null;
                if (o0 == null) {
                }
                if (map4 == null) {
                }
                LinkedHashMap j2222 = d1c.j(j, map4);
                map5 = this.q;
                if (map5 == null) {
                }
                if (map6 == null) {
                }
                map8 = d1c.j(j2222, map6);
            } else if (Intrinsics.areEqual(str, c6e.Fpx.code)) {
                v6e v6eVar = this.e;
                if (v6eVar != null) {
                    o0 = v6eVar.o0();
                    if (o0 != null) {
                    }
                    o0 = null;
                    if (o0 == null) {
                    }
                    if (map4 == null) {
                    }
                    LinkedHashMap j22222 = d1c.j(j, map4);
                    map5 = this.q;
                    if (map5 == null) {
                    }
                    if (map6 == null) {
                    }
                    map8 = d1c.j(j22222, map6);
                }
                o0 = null;
                if (o0 != null) {
                }
                o0 = null;
                if (o0 == null) {
                }
                if (map4 == null) {
                }
                LinkedHashMap j222222 = d1c.j(j, map4);
                map5 = this.q;
                if (map5 == null) {
                }
                if (map6 == null) {
                }
                map8 = d1c.j(j222222, map6);
            } else if (Intrinsics.areEqual(str, c6e.SepaDebit.code)) {
                z6e z6eVar = this.f;
                if (z6eVar != null) {
                    o0 = z6eVar.o0();
                    if (o0 != null) {
                    }
                    o0 = null;
                    if (o0 == null) {
                    }
                    if (map4 == null) {
                    }
                    LinkedHashMap j2222222 = d1c.j(j, map4);
                    map5 = this.q;
                    if (map5 == null) {
                    }
                    if (map6 == null) {
                    }
                    map8 = d1c.j(j2222222, map6);
                }
                o0 = null;
                if (o0 != null) {
                }
                o0 = null;
                if (o0 == null) {
                }
                if (map4 == null) {
                }
                LinkedHashMap j22222222 = d1c.j(j, map4);
                map5 = this.q;
                if (map5 == null) {
                }
                if (map6 == null) {
                }
                map8 = d1c.j(j22222222, map6);
            } else if (Intrinsics.areEqual(str, c6e.AuBecsDebit.code)) {
                p6e p6eVar = this.g;
                if (p6eVar != null) {
                    o0 = p6eVar.o0();
                    if (o0 != null) {
                    }
                    o0 = null;
                    if (o0 == null) {
                    }
                    if (map4 == null) {
                    }
                    LinkedHashMap j222222222 = d1c.j(j, map4);
                    map5 = this.q;
                    if (map5 == null) {
                    }
                    if (map6 == null) {
                    }
                    map8 = d1c.j(j222222222, map6);
                }
                o0 = null;
                if (o0 != null) {
                }
                o0 = null;
                if (o0 == null) {
                }
                if (map4 == null) {
                }
                LinkedHashMap j2222222222 = d1c.j(j, map4);
                map5 = this.q;
                if (map5 == null) {
                }
                if (map6 == null) {
                }
                map8 = d1c.j(j2222222222, map6);
            } else if (Intrinsics.areEqual(str, c6e.BacsDebit.code)) {
                q6e q6eVar = this.h;
                if (q6eVar != null) {
                    o0 = q6eVar.o0();
                    if (o0 != null) {
                    }
                    o0 = null;
                    if (o0 == null) {
                    }
                    if (map4 == null) {
                    }
                    LinkedHashMap j22222222222 = d1c.j(j, map4);
                    map5 = this.q;
                    if (map5 == null) {
                    }
                    if (map6 == null) {
                    }
                    map8 = d1c.j(j22222222222, map6);
                }
                o0 = null;
                if (o0 != null) {
                }
                o0 = null;
                if (o0 == null) {
                }
                if (map4 == null) {
                }
                LinkedHashMap j222222222222 = d1c.j(j, map4);
                map5 = this.q;
                if (map5 == null) {
                }
                if (map6 == null) {
                }
                map8 = d1c.j(j222222222222, map6);
            } else if (Intrinsics.areEqual(str, c6e.Netbanking.code)) {
                y6e y6eVar = this.i;
                if (y6eVar != null) {
                    o0 = y6eVar.o0();
                    if (o0 != null) {
                    }
                    o0 = null;
                    if (o0 == null) {
                    }
                    if (map4 == null) {
                    }
                    LinkedHashMap j2222222222222 = d1c.j(j, map4);
                    map5 = this.q;
                    if (map5 == null) {
                    }
                    if (map6 == null) {
                    }
                    map8 = d1c.j(j2222222222222, map6);
                }
                o0 = null;
                if (o0 != null) {
                }
                o0 = null;
                if (o0 == null) {
                }
                if (map4 == null) {
                }
                LinkedHashMap j22222222222222 = d1c.j(j, map4);
                map5 = this.q;
                if (map5 == null) {
                }
                if (map6 == null) {
                }
                map8 = d1c.j(j22222222222222, map6);
            } else if (Intrinsics.areEqual(str, c6e.USBankAccount.code)) {
                b7e b7eVar = this.j;
                if (b7eVar != null) {
                    o0 = b7eVar.o0();
                    if (o0 != null) {
                    }
                    o0 = null;
                    if (o0 == null) {
                    }
                    if (map4 == null) {
                    }
                    LinkedHashMap j222222222222222 = d1c.j(j, map4);
                    map5 = this.q;
                    if (map5 == null) {
                    }
                    if (map6 == null) {
                    }
                    map8 = d1c.j(j222222222222222, map6);
                }
                o0 = null;
                if (o0 != null) {
                }
                o0 = null;
                if (o0 == null) {
                }
                if (map4 == null) {
                }
                LinkedHashMap j2222222222222222 = d1c.j(j, map4);
                map5 = this.q;
                if (map5 == null) {
                }
                if (map6 == null) {
                }
                map8 = d1c.j(j2222222222222222, map6);
            } else {
                if (Intrinsics.areEqual(str, c6e.Link.code) && (x6eVar = this.k) != null) {
                    o0 = x6eVar.o0();
                    if (o0 != null) {
                    }
                    o0 = null;
                    if (o0 == null) {
                    }
                    if (map4 == null) {
                    }
                    LinkedHashMap j22222222222222222 = d1c.j(j, map4);
                    map5 = this.q;
                    if (map5 == null) {
                    }
                    if (map6 == null) {
                    }
                    map8 = d1c.j(j22222222222222222, map6);
                }
                o0 = null;
                if (o0 != null) {
                }
                o0 = null;
                if (o0 == null) {
                }
                if (map4 == null) {
                }
                LinkedHashMap j222222222222222222 = d1c.j(j, map4);
                map5 = this.q;
                if (map5 == null) {
                }
                if (map6 == null) {
                }
                map8 = d1c.j(j222222222222222222, map6);
            }
        }
        l5e l5eVar = this.o;
        if (l5eVar != null) {
            map = hdi.v("allow_redisplay", l5eVar.g());
        } else {
            map = null;
        }
        if (map == null) {
            map = zc7.a;
            map.getClass();
        }
        LinkedHashMap j3 = d1c.j(map8, map);
        wmf wmfVar = this.p;
        if (wmfVar != null) {
            map2 = ace.r("radar_options", wmfVar.o0());
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = zc7.a;
            map2.getClass();
        }
        LinkedHashMap j4 = d1c.j(j3, map2);
        y54 y54Var = this.s;
        if (y54Var != null) {
            map7 = ace.r("client_attribution_metadata", y54Var.o0());
        }
        if (map7 == null) {
            map7 = zc7.a;
            map7.getClass();
        }
        return d1c.j(j4, map7);
    }

    public final String toString() {
        StringBuilder r = g.r("PaymentMethodCreateParams(code=", this.a, ", requiresMandate=", ", card=", this.b);
        r.append(this.c);
        r.append(", ideal=");
        r.append(this.d);
        r.append(", fpx=");
        r.append(this.e);
        r.append(", sepaDebit=");
        r.append(this.f);
        r.append(", auBecsDebit=");
        r.append(this.g);
        r.append(", bacsDebit=");
        r.append(this.h);
        r.append(", netbanking=");
        r.append(this.i);
        r.append(", usBankAccount=");
        r.append(this.j);
        r.append(", link=");
        r.append(this.k);
        r.append(", cashAppPay=");
        r.append(this.l);
        r.append(", swish=");
        r.append(this.m);
        r.append(", billingDetails=");
        r.append(this.n);
        r.append(", allowRedisplay=");
        r.append(this.o);
        r.append(", radarOptions=");
        r.append(this.p);
        r.append(", metadata=");
        r.append(this.q);
        r.append(", productUsage=");
        r.append(this.r);
        r.append(", clientAttributionMetadata=");
        r.append(this.s);
        r.append(", overrideParamMap=");
        r.append(this.t);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        s6e s6eVar = this.c;
        if (s6eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s6eVar.writeToParcel(parcel, i);
        }
        w6e w6eVar = this.d;
        if (w6eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(w6eVar.a);
        }
        v6e v6eVar = this.e;
        if (v6eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(v6eVar.a);
        }
        z6e z6eVar = this.f;
        if (z6eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(z6eVar.a);
        }
        p6e p6eVar = this.g;
        if (p6eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            p6eVar.writeToParcel(parcel, i);
        }
        q6e q6eVar = this.h;
        if (q6eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            q6eVar.writeToParcel(parcel, i);
        }
        y6e y6eVar = this.i;
        if (y6eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(y6eVar.a);
        }
        b7e b7eVar = this.j;
        if (b7eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            b7eVar.writeToParcel(parcel, i);
        }
        x6e x6eVar = this.k;
        if (x6eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            x6eVar.writeToParcel(parcel, i);
        }
        if (this.l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(1);
        }
        if (this.m == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(1);
        }
        p5e p5eVar = this.n;
        if (p5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            p5eVar.writeToParcel(parcel, i);
        }
        l5e l5eVar = this.o;
        if (l5eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            l5eVar.writeToParcel(parcel, i);
        }
        wmf wmfVar = this.p;
        if (wmfVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wmfVar.writeToParcel(parcel, i);
        }
        Map map = this.q;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        Set set = this.r;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
        y54 y54Var = this.s;
        if (y54Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            y54Var.writeToParcel(parcel, i);
        }
        Map map2 = this.t;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            parcel.writeValue(entry2.getValue());
        }
    }

    public c7e(String str, boolean z, p5e p5eVar, l5e l5eVar, Set set, y54 y54Var, Map map, int i) {
        this(str, z, null, null, null, null, null, null, null, null, null, null, null, (i & 8192) != 0 ? null : p5eVar, l5eVar, null, null, set, y54Var, map);
    }

    public c7e(String str, boolean z, s6e s6eVar, w6e w6eVar, v6e v6eVar, z6e z6eVar, p6e p6eVar, q6e q6eVar, y6e y6eVar, b7e b7eVar, x6e x6eVar, t6e t6eVar, a7e a7eVar, p5e p5eVar, l5e l5eVar, wmf wmfVar, Map map, Set set, y54 y54Var, Map map2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = s6eVar;
        this.d = w6eVar;
        this.e = v6eVar;
        this.f = z6eVar;
        this.g = p6eVar;
        this.h = q6eVar;
        this.i = y6eVar;
        this.j = b7eVar;
        this.k = x6eVar;
        this.l = t6eVar;
        this.m = a7eVar;
        this.n = p5eVar;
        this.o = l5eVar;
        this.p = wmfVar;
        this.q = map;
        this.r = set;
        this.s = y54Var;
        this.t = map2;
    }

    public c7e(s6e s6eVar, p5e p5eVar, y54 y54Var) {
        this(c6e.Card, s6eVar, (b7e) null, (x6e) null, p5eVar, (l5e) null, y54Var, 348156);
    }
}
