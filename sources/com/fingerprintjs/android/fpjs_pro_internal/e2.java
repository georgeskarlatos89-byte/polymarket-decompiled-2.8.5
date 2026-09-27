package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import android.os.Process;
import android.util.TypedValue;
import android.view.View;
import defpackage.hdi;
import defpackage.r5g;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class e2 {
    public static int a = 0;
    public static int b = 1;
    public static int c = 0;
    public static int d = 0;
    public static int e = 0;
    public static int f = 1;
    public static int g;
    public static int h;

    public static final Integer a(JSONObject jSONObject, String str) {
        Object m882constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(Integer.valueOf(jSONObject.getInt(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (m882constructorimpl instanceof r5g) {
            m882constructorimpl = null;
        }
        return (Integer) m882constructorimpl;
    }

    public static final boolean b(Location location) {
        try {
            Object[] objArr = {0L, r0, r0, new d2(location), 7, null};
            Boolean bool = Boolean.FALSE;
            Object f2 = rV4669.f(942509419);
            if (f2 == null) {
                int mode = View.MeasureSpec.getMode(0) + 848;
                char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 51;
                Class cls = Long.TYPE;
                Class cls2 = Boolean.TYPE;
                f2 = rV4669.g(mode, c2, i, -1316401137, "setPivotYN16904", new Class[]{cls, cls2, cls2, Function1.class, Integer.TYPE, Object.class});
            }
            return ((Boolean) component9.D8871((D8871) ((Method) f2).invoke(null, objArr), bool)).booleanValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int c() {
        int i = g;
        int i2 = i % 6982470;
        g = i + 1;
        if (i2 != 0) {
            return h;
        }
        int a2 = hdi.a();
        h = a2;
        return a2;
    }

    public static final int d(List list) {
        List list2 = list;
        int i = 0;
        if (list2 instanceof Collection) {
            int i2 = a;
            int i3 = (i2 ^ 45) + ((i2 & 45) << 1);
            b = i3 % 128;
            if (i3 % 2 != 0) {
                if (list2.isEmpty()) {
                    return 0;
                }
            } else {
                list2.isEmpty();
                throw null;
            }
        }
        Iterator it = list2.iterator();
        int i4 = a;
        b = (((i4 | 23) << 1) - (i4 ^ 23)) % 128;
        while (it.hasNext()) {
            int i5 = a;
            b = ((i5 & 119) + (i5 | 119)) % 128;
            if (((n) it.next()).b != null) {
                int i6 = b;
                a = ((i6 & 61) + (i6 | 61)) % 128;
                b0.D8871();
                b0.D8871();
                int i7 = b;
                int i8 = ((i7 | 33) << 1) - (i7 ^ 33);
                a = i8 % 128;
                if (i8 % 2 != 0) {
                    i += 44;
                    if (i < 0) {
                        CollectionsKt.F0();
                        throw null;
                    }
                } else {
                    int i9 = (i & 127) + (i | 127);
                    i = (i9 & (-126)) + (i9 | (-126));
                    if (i < 0) {
                        CollectionsKt.F0();
                        throw null;
                    }
                }
            } else {
                b0.D8871();
                b0.D8871();
            }
        }
        return i;
    }

    public static final String e(JSONObject jSONObject, String str) {
        Object m882constructorimpl;
        String str2;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object obj2 = jSONObject.get(str);
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            m882constructorimpl = Result.m882constructorimpl(str2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m882constructorimpl instanceof r5g)) {
            obj = m882constructorimpl;
        }
        return (String) obj;
    }

    public static final Long f(JSONObject jSONObject, String str) {
        Object m882constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(Long.valueOf(jSONObject.getLong(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (m882constructorimpl instanceof r5g) {
            m882constructorimpl = null;
        }
        return (Long) m882constructorimpl;
    }

    public static final Boolean g(JSONObject jSONObject, String str) {
        Object m882constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(Boolean.valueOf(jSONObject.getBoolean(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (m882constructorimpl instanceof r5g) {
            m882constructorimpl = null;
        }
        return (Boolean) m882constructorimpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x012b, code lost:
    
        if (r0 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x014e, code lost:
    
        r7 = com.fingerprintjs.android.fpjs_pro_internal.e2.a;
        r9 = r7 ^ 19;
        r7 = (r7 & 19) << 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0148, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.e2.b = (r9 + r7) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0156, code lost:
    
        if (r8 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0160, code lost:
    
        return java.lang.Long.valueOf(r8.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0130, code lost:
    
        r9 = r0.longValue();
        r7 = r7.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0136, code lost:
    
        if (r7 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0138, code lost:
    
        r8 = java.lang.Long.valueOf(r9 - r7.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0142, code lost:
    
        r7 = com.fingerprintjs.android.fpjs_pro_internal.e2.a;
        r9 = r7 & 111;
        r7 = r7 | 111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x012e, code lost:
    
        if (r0 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Long h(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        long longValue;
        Object next;
        long j;
        long j2;
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = ~i5;
        int i10 = (~(i7 | i8 | i9)) | (~(i | i2));
        int i11 = ~(i5 | i2);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i2);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = (-88080384) * i4;
        int i16 = (469762048 * i3) + ((-1337982976) * i6) + i15 + ((-325430244) * i14) + (325430244 * i13) + (i12 * 325430244) + (237349861 * i2) + ((-413510627) * i) + 1558183936;
        int a2 = com.fingerprintjs.android.fpjs_pro.g.a(i3, 1735201104, (1349231875 * i6) + i + i2 + i4);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a2, -417333248, (i3 * (-1872492752)) + (i6 * (-66979019)) + (i4 * 236313959) + (i14 * 836) + (i13 * (-836)) + (i12 * (-836)) + (i2 * 236313123) + ((i * 236314795) - 374860141), 639631360, (1272971264 * a2) + i16) != 1) {
            List list = (List) objArr[0];
            int i17 = b;
            int i18 = (i17 ^ 1) + ((i17 & 1) << 1);
            a = i18 % 128;
            Long l = null;
            if (i18 % 2 == 0) {
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    int i19 = a;
                    int i20 = ((i19 | 51) << 1) - (i19 ^ 51);
                    b = i20 % 128;
                    if (i20 % 2 != 0) {
                        next = null;
                    } else {
                        throw null;
                    }
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        Long l2 = ((n) next).j;
                        if (l2 != null) {
                            int i21 = a;
                            int i22 = ((i21 | 41) << 1) - (i21 ^ 41);
                            b = i22 % 128;
                            if (i22 % 2 == 0) {
                                j = l2.longValue();
                                int i23 = 22 / 0;
                            } else {
                                j = l2.longValue();
                            }
                        } else {
                            j = 0;
                        }
                        do {
                            Object next2 = it.next();
                            Long l3 = ((n) next2).j;
                            if (l3 != null) {
                                j2 = l3.longValue();
                            } else {
                                j2 = 0;
                            }
                            if (j < j2) {
                                next = next2;
                                j = j2;
                            }
                        } while (it.hasNext());
                        int i24 = a;
                        int i25 = ((i24 ^ 73) + ((i24 & 73) << 1)) % 128;
                        b = i25;
                        a = ((i25 ^ 27) + ((i25 & 27) << 1)) % 128;
                    }
                }
                n nVar = (n) next;
                if (nVar != null) {
                    int i26 = b + 101;
                    a = i26 % 128;
                    int i27 = i26 % 2;
                    Long l4 = nVar.j;
                    if (i27 != 0) {
                        int i28 = 67 / 0;
                    }
                }
                return 0L;
            }
            list.iterator().hasNext();
            throw null;
        }
        List list2 = (List) objArr[0];
        int i29 = b;
        int i30 = (i29 ^ 3) + ((i29 & 3) << 1);
        a = i30 % 128;
        int i31 = i30 % 2;
        Object[] objArr2 = {list2};
        int D8871 = b0.D8871();
        int D88712 = b0.D8871();
        int D88713 = b0.D8871();
        int D88714 = b0.D8871();
        if (i31 != 0) {
            longValue = h(objArr2, 1092981938, -1092981938, D88714, D88712, D8871, D88713).longValue();
            int i32 = 61 / 0;
        } else {
            longValue = h(objArr2, 1092981938, -1092981938, D88714, D88712, D8871, D88713).longValue();
        }
        return Long.valueOf(longValue);
    }

    public static long[] i(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (i2 & 4294967295L) | ((i & 4294967295L) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            long j = jArr[i3 - 1];
            jArr[i3] = ((j ^ (j >> 30)) * 1812433253) + i3;
        }
        return jArr;
    }
}
