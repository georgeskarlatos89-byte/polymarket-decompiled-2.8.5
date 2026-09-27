package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "component9", "()V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class p0 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ n h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(n nVar) {
        super(0);
        this.h = nVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = i | i2 | i7;
        int i9 = ~i;
        int i10 = (~i2) | i7;
        int i11 = (~i10) | i9;
        int i12 = (~(i2 | i9 | i7)) | (~(i10 | i));
        int i13 = (-1589641216) * i6;
        int i14 = 511705088 * i3;
        int i15 = ((-1639972864) * i5) + i14 + i13 + ((-1203980746) * i12) + (i11 * (-1203980746)) + (1203980746 * i8) + (1501345335 * i) + (((-385660469) * i4) - 1543503872);
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i5, -167119771, (2053704882 * i3) + i4 + i + i6);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a, 1163984896, (i5 * (-1784727723)) + (i3 * 927583762) + (i6 * (-1228230607)) + (i12 * 86) + (i11 * 86) + (i8 * (-86)) + (i * (-1228230521)) + ((i4 * (-1228230693)) - 288632672), 992935936, (1278279680 * a) + i15) != 1) {
            a(new Object[]{(p0) objArr[0]}, 659411446, R24140$5$1.setPivotYN16904(), R24140$5$1.setPivotYN16904(), -659411445, R24140$5$1.setPivotYN16904(), R24140$5$1.setPivotYN16904());
            return Unit.INSTANCE;
        }
        ((p0) objArr[0]).h.g = bj.e();
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return a(new Object[]{this}, -1599548390, R24140$5$1.setPivotYN16904(), R24140$5$1.setPivotYN16904(), 1599548390, R24140$5$1.setPivotYN16904(), R24140$5$1.setPivotYN16904());
    }
}
