package defpackage;

import com.polymarket.data.NumberFormatType;
import com.polymarket.data.NumberFormatters;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class gdd {
    public static final String a(Number number, NumberFormatType numberFormatType) {
        numberFormatType.getClass();
        return NumberFormatters.INSTANCE.formatted(number.doubleValue(), numberFormatType);
    }
}
