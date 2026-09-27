package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;
import com.fingerprintjs.android.fpjs_pro_internal.oD4563;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "vD14832N6715", "(I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class R24140$5$1 extends Lambda implements Function1<Integer, Unit> {
    public static int i = 0;
    public static int j = 0;
    public static int k = 0;
    public static int l = 1;
    public final /* synthetic */ n h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R24140$5$1(n nVar) {
        super(1);
        this.h = nVar;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~((~i5) | i3);
        int i9 = (~((~i3) | (~i2))) | i8;
        int i10 = (i9 * 1126725195) + ((-1126725195) * i8) + ((-1880913482) * i2) + (i3 * (-1880913482)) + 198443008;
        int i11 = i3 | i2;
        int i12 = ((-319553536) * i7) + ((-1529085952) * i6) + ((-754188288) * i4) + (1126725195 * i11) + i10;
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i7, -2104995841, ((-39394691) * i6) + i3 + i2 + i4);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a, -1450508288, (i7 * 1996616689) + (i6 * 1055723859) + (i4 * 1773845519) + (i11 * 613) + (i9 * 613) + (i8 * (-613)) + (i2 * 1773844906) + ((i3 * 1773844906) - 1404835566), -778371072, ((-289079296) * a) + i12) != 1) {
            R24140$5$1 r24140$5$1 = (R24140$5$1) objArr[0];
            int intValue = ((Number) objArr[1]).intValue();
            int i13 = l;
            int i14 = i13 & 13;
            int i15 = ((i13 ^ 13) | i14) << 1;
            int i16 = -((i13 | 13) & (~i14));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            k = i17 % 128;
            if (i17 % 2 == 0) {
                r24140$5$1.h.d = intValue;
                r24140$5$1.h.h = bj.e();
                int i18 = k;
                int i19 = i18 & 43;
                int i20 = (((i18 | 43) & (~i19)) - (~(i19 << 1))) - 1;
                l = i20 % 128;
                if (i20 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            r24140$5$1.h.d = intValue;
            r24140$5$1.h.h = bj.e();
            throw null;
        }
        R24140$5$1 r24140$5$12 = (R24140$5$1) objArr[0];
        Object obj = objArr[1];
        int i21 = k;
        int i22 = i21 & 51;
        l = (((i21 | 51) & (~i22)) + (i22 << 1)) % 128;
        a(new Object[]{r24140$5$12, Integer.valueOf(((Number) obj).intValue())}, -1427555925, 1427555925, oD4563.Companion.a(), oD4563.Companion.a(), oD4563.Companion.a(), oD4563.Companion.a());
        Unit unit = Unit.INSTANCE;
        int i23 = l;
        int i24 = (i23 ^ 69) + ((i23 & 69) << 1);
        k = i24 % 128;
        if (i24 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static int setPivotYN16904() {
        int i2 = i;
        int i3 = i2 % 9080969;
        i = i2 + 1;
        if (i3 != 0) {
            return j;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        j = elapsedCpuTime;
        return elapsedCpuTime;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.Unit, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        return a(new Object[]{this, num}, -1322938996, 1322938997, oD4563.Companion.a(), oD4563.Companion.a(), oD4563.Companion.a(), oD4563.Companion.a());
    }
}
