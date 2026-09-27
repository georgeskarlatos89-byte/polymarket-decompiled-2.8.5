package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro.Error;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/Error;", "p0", "", "D8871", "(Lcom/fingerprintjs/android/fpjs_pro/Error;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class y extends Lambda implements Function1<Error, Unit> {
    public static final y h = new Lambda(1);
    public static int i = 0;
    public static int j = 1;

    public y() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = (~(i8 | i7)) | i5;
        int i10 = ~i7;
        int i11 = i8 | i5;
        int i12 = (~(i2 | i10 | i5)) | (~(i11 | i7));
        int i13 = (i12 * 1122240372) + (2050486552 * i9) + ((-1483212659) * i7) + (1883508457 * i5) + 799145984;
        int i14 = (~i11) | (~(i10 | (~i5)));
        int i15 = ((-1540358144) * i4) + (337379328 * i3) + ((-360972288) * i6) + (1122240372 * i14) + i13;
        int a = com.fingerprintjs.android.fpjs_pro.g.a(i4, -1351514252, (1353909401 * i3) + i5 + i7 + i6);
        if (com.fingerprintjs.android.fpjs_pro.g.c(a, 1028784128, (i4 * (-684621612)) + (i3 * 1123214353) + (i6 * 521834041) + (i14 * 212) + (i12 * 212) + (i9 * (-424)) + (i7 * 521833829) + ((i5 * 521834465) - 1171472169), 1635647488, (669122560 * a) + i15) != 1) {
            y yVar = (y) objArr[0];
            Object obj = objArr[1];
            int i16 = j;
            int i17 = i16 & 81;
            int i18 = (i17 - (~((i16 ^ 81) | i17))) - 1;
            i = i18 % 128;
            int i19 = i18 % 2;
            Object[] objArr2 = {yVar, (Error) obj};
            int pivotYN16904 = h5.setPivotYN16904();
            int pivotYN169042 = h5.setPivotYN16904();
            int pivotYN169043 = h5.setPivotYN16904();
            int pivotYN169044 = h5.setPivotYN16904();
            if (i19 != 0) {
                a(objArr2, pivotYN16904, pivotYN169043, pivotYN169044, -119935611, pivotYN169042, 119935612);
                int i20 = 60 / 0;
                return Unit.INSTANCE;
            }
            a(objArr2, pivotYN16904, pivotYN169043, pivotYN169044, -119935611, pivotYN169042, 119935612);
            return Unit.INSTANCE;
        }
        int i21 = i;
        int i22 = ((i21 | 49) << 1) - (i21 ^ 49);
        j = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 95 / 0;
            return null;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Error error) {
        return a(new Object[]{this, error}, h5.setPivotYN16904(), h5.setPivotYN16904(), h5.setPivotYN16904(), 1649194383, h5.setPivotYN16904(), -1649194383);
    }
}
