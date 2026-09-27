package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;
import com.fingerprintjs.android.fpjs_pro.raw_signal_providers.file_timestamps.FileTimestamps;
import defpackage.dmk;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "", "", "c", "()Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class t5 extends Lambda implements Function0<Map<String, Long[]>> {
    public static int i = 0;
    public static int j = 0;
    public static int k = 0;
    public static int l = 1;
    public final /* synthetic */ u5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(u5 u5Var) {
        super(0);
        this.h = u5Var;
    }

    public static int b() {
        int i2 = i;
        int i3 = i2 % 6147751;
        i = i2 + 1;
        if (i3 != 0) {
            return j;
        }
        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
        j = elapsedRealtime;
        return elapsedRealtime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, Long[]> c() {
        D8871 setpivotyn16904;
        Object obj;
        Long[] lArr;
        u5 u5Var = this.h;
        bc bcVar = u5Var.a;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i2 = u5.d;
            List list = u5Var.b;
            u5.c = (i2 + 83) % 128;
            Iterator it = list.iterator();
            int i3 = k;
            l = ((i3 ^ 113) + ((i3 & 113) << 1)) % 128;
            while (it.hasNext()) {
                int i4 = l;
                int i5 = (i4 ^ 77) + ((i4 & 77) << 1);
                k = i5 % 128;
                if (i5 % 2 == 0) {
                    C1722 c1722 = (C1722) it.next();
                    String valueOf = String.valueOf(c1722.a());
                    int i6 = u5.c + 43;
                    u5.d = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 54 / 0;
                    }
                    FileTimestamps component5 = bcVar.component5(c1722.setPivotYN16904());
                    if (component5 != null) {
                        int i8 = l + 89;
                        k = i8 % 128;
                        if (i8 % 2 != 0) {
                            lArr = new Long[2];
                            lArr[0] = Long.valueOf(component5.b());
                            lArr[0] = Long.valueOf(component5.f());
                            lArr[3] = Long.valueOf(component5.g());
                        } else {
                            lArr = new Long[]{Long.valueOf(component5.b()), Long.valueOf(component5.f()), Long.valueOf(component5.g())};
                        }
                        int i9 = l;
                        k = (((i9 | 61) << 1) - (i9 ^ 61)) % 128;
                    } else {
                        lArr = null;
                    }
                    linkedHashMap.put(valueOf, lArr);
                } else {
                    C1722 c17222 = (C1722) it.next();
                    String.valueOf(c17222.a());
                    int i10 = u5.c + 43;
                    u5.d = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 54 / 0;
                    }
                    bcVar.component5(c17222.setPivotYN16904());
                    throw null;
                }
            }
            setpivotyn16904 = new vD14832N6715(linkedHashMap);
        } catch (Throwable th) {
            setpivotyn16904 = new setPivotYN16904(th);
        }
        if (setpivotyn16904 instanceof vD14832N6715) {
            int i12 = component9.b;
            int i13 = i12 + 69;
            component9.c = i13 % 128;
            if (i13 % 2 == 0) {
                obj = ((vD14832N6715) setpivotyn16904).component5;
                int i14 = 93 / 0;
            } else {
                obj = ((vD14832N6715) setpivotyn16904).component5;
            }
            int i15 = i12 + 73;
            component9.c = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 5 / 0;
            }
            return (Map) obj;
        }
        char[] cArr = component9.a;
        if (!(setpivotyn16904 instanceof setPivotYN16904)) {
            dmk.a();
            return null;
        }
        throw ((Throwable) ((setPivotYN16904) setpivotyn16904).D8871);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Map<String, Long[]> invoke() {
        int i2 = k;
        int i3 = ((i2 | 65) << 1) - (i2 ^ 65);
        l = i3 % 128;
        if (i3 % 2 != 0) {
            Map<String, Long[]> c = c();
            int i4 = l;
            k = (((i4 | 93) << 1) - (i4 ^ 93)) % 128;
            return c;
        }
        c();
        throw null;
    }
}
