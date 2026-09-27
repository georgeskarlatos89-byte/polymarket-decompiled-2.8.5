package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.C1722;
import com.fingerprintjs.android.fpjs_pro_internal.d;
import defpackage.dmk;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class x5 {
    public final ce a;

    public x5(ce ceVar) {
        this.a = ceVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final D8871 a(byte[] bArr, unregisterForContextMenu unregisterforcontextmenu) {
        D8871 setpivotyn16904;
        String str;
        d dVar;
        Boolean bool;
        Long l;
        Integer num;
        Integer num2;
        Boolean bool2;
        Long l2;
        Integer num3;
        Integer num4;
        Boolean bool3;
        Boolean bool4;
        Long l3;
        Integer num5;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        boolean z;
        long j;
        int i;
        int i2;
        boolean z2;
        long j2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        long j3;
        int i5;
        boolean z5;
        boolean z6;
        try {
            setpivotyn16904 = new vD14832N6715(this.a.vD14832N6715(bArr));
        } catch (Throwable th) {
            setpivotyn16904 = new setPivotYN16904(th);
        }
        Boolean bool8 = null;
        if (setpivotyn16904 instanceof vD14832N6715) {
            try {
                JSONObject jSONObject = new JSONObject(new String((byte[]) ((vD14832N6715) setpivotyn16904).component5, Charsets.UTF_8));
                String e = e2.e(jSONObject, C1722.s5.e.setPivotYN16904());
                d.Companion companion = d.INSTANCE;
                if (e != null) {
                    str = e.toLowerCase(Locale.ROOT);
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual(str, C1722.ce.e.setPivotYN16904())) {
                    dVar = d.a.b;
                } else {
                    dVar = new d(null);
                }
                JSONObject optJSONObject = jSONObject.optJSONObject(C1722.m5.e.setPivotYN16904());
                if (optJSONObject != null) {
                    bool = e2.g(optJSONObject, C1722.yd.e.setPivotYN16904());
                } else {
                    bool = null;
                }
                if (optJSONObject != null) {
                    l = e2.f(optJSONObject, C1722.y.e.setPivotYN16904());
                } else {
                    l = null;
                }
                if (optJSONObject != null) {
                    num = e2.a(optJSONObject, C1722.dd.e.setPivotYN16904());
                } else {
                    num = null;
                }
                if (optJSONObject != null) {
                    num2 = e2.a(optJSONObject, C1722.k5.e.setPivotYN16904());
                } else {
                    num2 = null;
                }
                if (optJSONObject != null) {
                    bool2 = e2.g(optJSONObject, C1722.i2.e.setPivotYN16904());
                } else {
                    bool2 = null;
                }
                if (optJSONObject != null) {
                    l2 = e2.f(optJSONObject, C1722.k2.e.setPivotYN16904());
                } else {
                    l2 = null;
                }
                if (optJSONObject != null) {
                    num3 = e2.a(optJSONObject, C1722.n2.e.setPivotYN16904());
                } else {
                    num3 = null;
                }
                if (optJSONObject != null) {
                    num4 = e2.a(optJSONObject, C1722.h2.e.setPivotYN16904());
                } else {
                    num4 = null;
                }
                if (optJSONObject != null) {
                    bool3 = e2.g(optJSONObject, C1722.g4.e.setPivotYN16904());
                } else {
                    bool3 = null;
                }
                if (optJSONObject != null) {
                    bool4 = e2.g(optJSONObject, C1722.b4.e.setPivotYN16904());
                } else {
                    bool4 = null;
                }
                if (optJSONObject != null) {
                    l3 = e2.f(optJSONObject, C1722.d4.e.setPivotYN16904());
                } else {
                    l3 = null;
                }
                if (optJSONObject != null) {
                    num5 = e2.a(optJSONObject, C1722.e4.e.setPivotYN16904());
                } else {
                    num5 = null;
                }
                if (optJSONObject != null) {
                    bool5 = null;
                    bool8 = e2.g(optJSONObject, C1722.y4.e.setPivotYN16904());
                } else {
                    bool5 = null;
                }
                if (optJSONObject != null) {
                    bool6 = bool8;
                    bool7 = e2.g(optJSONObject, C1722.u4.e.setPivotYN16904());
                } else {
                    bool6 = bool8;
                    bool7 = bool5;
                }
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = unregisterforcontextmenu.a;
                }
                boolean z7 = z;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = unregisterforcontextmenu.b;
                }
                long j4 = j;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = unregisterforcontextmenu.c;
                }
                int i6 = i;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = unregisterforcontextmenu.d;
                }
                int i7 = i2;
                if (bool2 != null) {
                    z2 = bool2.booleanValue();
                } else {
                    z2 = unregisterforcontextmenu.e;
                }
                boolean z8 = z2;
                if (l2 != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = unregisterforcontextmenu.f;
                }
                long j5 = j2;
                if (num3 != null) {
                    i3 = num3.intValue();
                } else {
                    i3 = unregisterforcontextmenu.g;
                }
                int i8 = i3;
                if (num4 != null) {
                    i4 = num4.intValue();
                } else {
                    i4 = unregisterforcontextmenu.h;
                }
                int i9 = i4;
                if (bool3 != null) {
                    z3 = bool3.booleanValue();
                } else {
                    z3 = unregisterforcontextmenu.i;
                }
                boolean z9 = z3;
                if (bool4 != null) {
                    z4 = bool4.booleanValue();
                } else {
                    z4 = unregisterforcontextmenu.j;
                }
                boolean z10 = z4;
                if (l3 != null) {
                    j3 = l3.longValue();
                } else {
                    j3 = unregisterforcontextmenu.k;
                }
                long j6 = j3;
                if (num5 != null) {
                    i5 = num5.intValue();
                } else {
                    i5 = unregisterforcontextmenu.l;
                }
                int i10 = i5;
                if (bool6 != null) {
                    z5 = bool6.booleanValue();
                } else {
                    z5 = unregisterforcontextmenu.m;
                }
                boolean z11 = z5;
                if (bool7 != null) {
                    z6 = bool7.booleanValue();
                } else {
                    z6 = unregisterforcontextmenu.n;
                }
                return new vD14832N6715(new uH18377$D8871(new unregisterForContextMenu(z7, j4, i6, i7, z8, j5, i8, i9, z9, z10, j6, i10, z11, z6), dVar));
            } catch (Throwable th2) {
                return new setPivotYN16904(th2);
            }
        }
        if (setpivotyn16904 instanceof setPivotYN16904) {
            return setpivotyn16904;
        }
        dmk.a();
        return null;
    }
}
