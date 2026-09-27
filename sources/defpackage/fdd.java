package defpackage;

import android.icu.text.DecimalFormatSymbols;
import kotlin.jvm.functions.Function1;
import skip.foundation.NumberFormatter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fdd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ char b;

    public /* synthetic */ fdd(char c, int i) {
        this.a = i;
        this.b = c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        char c = this.b;
        DecimalFormatSymbols decimalFormatSymbols = (DecimalFormatSymbols) obj;
        switch (i) {
            case 0:
                return NumberFormatter.l(c, decimalFormatSymbols);
            case 1:
                return NumberFormatter.d(c, decimalFormatSymbols);
            case 2:
                return NumberFormatter.i(c, decimalFormatSymbols);
            case 3:
                return NumberFormatter.j(c, decimalFormatSymbols);
            case 4:
                return NumberFormatter.o(c, decimalFormatSymbols);
            case 5:
                return NumberFormatter.c(c, decimalFormatSymbols);
            default:
                return NumberFormatter.b(c, decimalFormatSymbols);
        }
    }
}
