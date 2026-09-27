package defpackage;

import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.uicustomisation.font.Font;
import com.checkout.components.interfaces.uicustomisation.font.FontName;
import com.checkout.components.interfaces.uicustomisation.font.FontStyle;
import com.checkout.components.interfaces.uicustomisation.font.FontWeight;
import com.checkout.components.ui.utils.extensions.Utils;
import com.polymarket.android.R;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ba5 {
    public static final int d = DesignTokens.$stable | 8;
    public final z95 a;
    public final DesignTokens b;
    public final pjg c;

    public ba5(z95 z95Var, DesignTokens designTokens, pjg pjgVar) {
        this.a = z95Var;
        this.b = designTokens;
        this.c = pjgVar;
    }

    public static /* synthetic */ pwi b(ba5 ba5Var, int i, FontWeight fontWeight, FontStyle fontStyle, int i2) {
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        long primaryColor = Utils.INSTANCE.primaryColor(ba5Var.b);
        if ((i2 & 4) != 0) {
            fontWeight2 = null;
        } else {
            fontWeight2 = fontWeight;
        }
        if ((i2 & 8) != 0) {
            fontStyle2 = null;
        } else {
            fontStyle2 = fontStyle;
        }
        return ba5Var.a(i, primaryColor, fontWeight2, fontStyle2);
    }

    public final pwi a(int i, long j, FontWeight fontWeight, FontStyle fontStyle) {
        Font font;
        Map<FontName, Font> fonts;
        DesignTokens designTokens = this.b;
        if (designTokens != null && (fonts = designTokens.getFonts()) != null) {
            font = fonts.get(FontName.Label);
        } else {
            font = null;
        }
        return uwn.S(null, j, font, Integer.valueOf(i), fontWeight, fontStyle, null, 131);
    }

    public final aa5 c() {
        BorderRadius borderRadius;
        ColorTokens colorTokens;
        Font font;
        Font font2;
        Long l;
        Long l2;
        Font font3;
        Map<FontName, Font> fonts;
        Map<FontName, Font> fonts2;
        ColorTokens colorTokens2;
        ColorTokens colorTokens3;
        Map<FontName, Font> fonts3;
        Map<FontName, Font> fonts4;
        uwn uwnVar = uwn.e;
        z95 z95Var = this.a;
        String a = z95Var.a(R.string.cko_form_search);
        DesignTokens designTokens = this.b;
        if (designTokens == null || (borderRadius = designTokens.getBorderFormRadius()) == null) {
            borderRadius = new BorderRadius(30);
        }
        BorderRadius borderRadius2 = borderRadius;
        Font font4 = null;
        if (designTokens != null) {
            colorTokens = designTokens.getColorTokens();
        } else {
            colorTokens = null;
        }
        if (designTokens != null && (fonts4 = designTokens.getFonts()) != null) {
            font = fonts4.get(FontName.Label);
        } else {
            font = null;
        }
        if (designTokens != null && (fonts3 = designTokens.getFonts()) != null) {
            font2 = fonts3.get(FontName.Input);
        } else {
            font2 = null;
        }
        ky9 N = uwn.N(uwnVar, a, null, null, borderRadius2, colorTokens, font2, font, 510);
        vp9 T = uwn.T(null, null);
        Integer valueOf = Integer.valueOf(R.drawable.cko_ic_cross_close);
        if (designTokens != null && (colorTokens3 = designTokens.getColorTokens()) != null) {
            l = Long.valueOf(colorTokens3.getColorPrimary());
        } else {
            l = null;
        }
        vp9 a2 = vp9.a(T, valueOf, l, null, null, null, null, 252);
        vp9 vp9Var = new vp9(null, null, 16, 30, new dqd(10, 10, 3), 227);
        Integer valueOf2 = Integer.valueOf(R.drawable.cko_ic_search);
        if (designTokens != null && (colorTokens2 = designTokens.getColorTokens()) != null) {
            l2 = Long.valueOf(colorTokens2.getColorPrimary());
        } else {
            l2 = null;
        }
        ky9 a3 = ky9.a(N, null, vp9.a(vp9Var, valueOf2, l2, null, null, null, null, 252), a2, 15615);
        a6j a4 = this.c.a(z95Var.a(R.string.cko_address_country_select));
        FontWeight fontWeight = FontWeight.Normal;
        FontStyle fontStyle = FontStyle.Normal;
        pwi b = b(this, 16, fontWeight, fontStyle, 2);
        Utils utils = Utils.INSTANCE;
        pwi a5 = a(16, utils.secondaryColor(designTokens), fontWeight, fontStyle);
        pwi b2 = b(this, 24, null, null, 14);
        String a6 = z95Var.a(R.string.cko_form_no_matches_found);
        if (designTokens != null && (fonts2 = designTokens.getFonts()) != null) {
            font3 = fonts2.get(FontName.Subheading);
        } else {
            font3 = null;
        }
        pwi S = uwn.S(a6, utils.primaryColor(designTokens), font3, 24, fontWeight, null, null, 194);
        String a7 = z95Var.a(R.string.cko_form_try_searching_with_another_term);
        if (designTokens != null && (fonts = designTokens.getFonts()) != null) {
            font4 = fonts.get(FontName.Input);
        }
        return new aa5(b, a5, b2, a3, S, uwn.S(a7, utils.secondaryColor(designTokens), font4, 16, fontWeight, null, null, 194), a4, utils.backgroundColor(designTokens), utils.actionColor(designTokens), utils.primaryColor(designTokens));
    }
}
