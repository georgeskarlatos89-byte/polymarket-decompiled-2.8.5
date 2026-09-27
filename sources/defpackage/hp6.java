package defpackage;

import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class hp6 {
    public static final FontFamily.Custom a;
    public static final float b;

    static {
        Integer valueOf = Integer.valueOf(R.font.cko_roboto_italic);
        Integer valueOf2 = Integer.valueOf(R.font.cko_roboto_light);
        Integer valueOf3 = Integer.valueOf(R.font.cko_roboto_medium);
        Integer valueOf4 = Integer.valueOf(R.font.cko_roboto_semi_bold);
        Integer valueOf5 = Integer.valueOf(R.font.cko_roboto_bold);
        a = new FontFamily.Custom(R.font.cko_roboto_normal, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf5);
        b = 4.0f;
    }
}
