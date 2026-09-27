package com.fingerprintjs.android.fpjs_pro_internal;

import defpackage.hdi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/w5;", "", "c", "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class w5 {

    /* renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final w5 d = new w5(CollectionsKt.emptyList(), CollectionsKt.emptyList());
    public static int e = 0;
    public static int f = 1;
    public final List a;
    public final List b;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/w5$a;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.w5$a, reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        public static int a;
        public static int b;

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static int a() {
            int i = a;
            int i2 = i % 5925069;
            a = i + 1;
            if (i2 != 0) {
                return b;
            }
            int a2 = hdi.a();
            b = a2;
            return a2;
        }
    }

    static {
        if (77 % 2 != 0) {
        } else {
            throw null;
        }
    }

    public w5(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public static /* synthetic */ Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = ~i6;
        int i9 = ~((~i4) | i8);
        int i10 = ~(i2 | i8);
        int i11 = i9 | i10;
        int i12 = i10 | i4;
        int i13 = ~(i8 | i4);
        int i14 = (1290797056 * i3) + ((-767557632) * i) + ((-837287936) * i5) + (189531495 * i13) + ((-189531495) * i12) + (i11 * 189531495) + ((-647756440) * i4) + (((-1026819430) * i6) - 865599488);
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i3, 977123338, (1577873432 * i) + i6 + i4 + i5);
        int i15 = i12 * (-503);
        int i16 = i13 * 503;
        int i17 = i5 * (-1177406223);
        int i18 = i * 1546282648;
        int i19 = i3 * (-1884272278);
        int c = com.fingerprintjs.android.fpjs_pro.g.c(a, 70909952, i19 + i18 + i17 + i16 + i15 + (i11 * 503) + (i4 * (-1177405720)) + (i6 * (-1177406726)) + 1326046462, 451280896, ((-539361280) * a) + i14);
        if (c != 1) {
            if (c != 2) {
                w5 w5Var = (w5) objArr[0];
                int i20 = f + 55;
                int i21 = i20 % 128;
                e = i21;
                int i22 = i20 % 2;
                List list = w5Var.a;
                if (i22 == 0) {
                    int i23 = (i21 & 41) + (i21 | 41);
                    f = i23 % 128;
                    if (i23 % 2 != 0) {
                        return list;
                    }
                    throw null;
                }
                throw null;
            }
            w5 w5Var2 = new w5((List) objArr[0], (List) objArr[1]);
            int i24 = f;
            int i25 = ((i24 | 115) << 1) - (i24 ^ 115);
            e = i25 % 128;
            if (i25 % 2 == 0) {
                return w5Var2;
            }
            throw null;
        }
        w5 w5Var3 = (w5) objArr[0];
        int i26 = e;
        int i27 = ((i26 | 79) << 1) - (i26 ^ 79);
        f = i27 % 128;
        int i28 = i27 % 2;
        int hashCode = w5Var3.a.hashCode();
        if (i28 == 0) {
            int i29 = hashCode + 41;
            int i30 = -w5Var3.b.hashCode();
            i7 = (i29 & i30) + (i30 | i29);
        } else {
            i7 = ((hashCode * 31) - (~w5Var3.b.hashCode())) - 1;
        }
        int i31 = f;
        e = (((i31 | 79) << 1) - (i31 ^ 79)) % 128;
        return Integer.valueOf(i7);
    }

    public final List a() {
        int i = f;
        int i2 = ((i ^ 11) + ((i & 11) << 1)) % 128;
        e = i2;
        f = (i2 + 9) % 128;
        return this.b;
    }

    public final boolean equals(Object obj) {
        int i = e;
        int i2 = ((i & 53) + (i | 53)) % 128;
        f = i2;
        if (this == obj) {
            f = (i + 111) % 128;
            return true;
        }
        if (!(obj instanceof w5)) {
            e = (((i2 | 81) << 1) - (i2 ^ 81)) % 128;
            return false;
        }
        w5 w5Var = (w5) obj;
        if (!Intrinsics.areEqual(this.a, w5Var.a)) {
            int i3 = e;
            f = ((i3 & 79) + (i3 | 79)) % 128;
            return false;
        }
        if (Intrinsics.areEqual(this.b, w5Var.b)) {
            return true;
        }
        int i4 = f;
        int i5 = (i4 ^ 19) + ((i4 & 19) << 1);
        e = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Integer) b(new Object[]{this}, e0.component5(), e0.component5(), e0.component5(), -241631086, e0.component5(), 241631087)).intValue();
    }

    public final String toString() {
        f = (e + 9) % 128;
        String str = "CpuInfo(commonInfo=" + this.a + ", perProcessorInfo=" + this.b + ")";
        int i = f;
        e = ((i & 29) + (i | 29)) % 128;
        return str;
    }
}
