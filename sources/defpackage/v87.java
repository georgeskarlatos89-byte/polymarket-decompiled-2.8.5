package defpackage;

import android.content.Context;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class v87 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public v87(Context context) {
        int i;
        int i2;
        boolean b = uen.b(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        Integer m = ven.m(context, R.attr.elevationOverlayColor);
        if (m != null) {
            i = m.intValue();
        } else {
            i = 0;
        }
        Integer m2 = ven.m(context, R.attr.elevationOverlayAccentColor);
        if (m2 != null) {
            i2 = m2.intValue();
        } else {
            i2 = 0;
        }
        Integer m3 = ven.m(context, R.attr.colorSurface);
        int intValue = m3 != null ? m3.intValue() : 0;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = intValue;
        this.e = f2;
    }
}
