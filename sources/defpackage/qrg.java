package defpackage;

import com.polymarket.data.EAmount;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Pair;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class qrg {
    public static Pair a(EAmount eAmount, EAmount eAmount2) {
        if (eAmount != null && eAmount2 != null) {
            if (eAmount2.getValueDouble() <= ConstantsKt.UNSET) {
                return new Pair(null, Boolean.FALSE);
            }
            if (Math.abs(eAmount.getValueDouble()) < 0.01d) {
                return new Pair(null, Boolean.FALSE);
            }
            String formatted = eAmount.formatted(EAmount.FormatType.INSTANCE.getDefault(), true);
            return new Pair(formatted, Boolean.valueOf(e.u(formatted, "+", false)));
        }
        return new Pair(null, Boolean.FALSE);
    }
}
