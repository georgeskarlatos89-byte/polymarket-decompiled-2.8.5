package com.checkout.components.interfaces.uicustomisation.designtoken;

import com.checkout.components.interfaces.uicustomisation.font.Font;
import com.checkout.components.interfaces.uicustomisation.font.FontStyle;
import com.checkout.components.interfaces.uicustomisation.font.FontWeight;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/designtoken/DefaultFonts;", "", "Lcom/checkout/components/interfaces/uicustomisation/font/Font;", "a", "Lcom/checkout/components/interfaces/uicustomisation/font/Font;", "getHEADING", "()Lcom/checkout/components/interfaces/uicustomisation/font/Font;", "HEADING", "b", "getSUBHEADING", "SUBHEADING", "c", "getFOOTNOTE", "FOOTNOTE", d.d, "getBUTTON", "BUTTON", "e", "getINPUT", "INPUT", "f", "getLABEL", "LABEL", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultFonts {
    public static final int $stable = 0;
    public static final DefaultFonts INSTANCE = new DefaultFonts();

    /* renamed from: a, reason: from kotlin metadata */
    private static final Font HEADING;

    /* renamed from: b, reason: from kotlin metadata */
    private static final Font SUBHEADING;

    /* renamed from: c, reason: from kotlin metadata */
    private static final Font FOOTNOTE;

    /* renamed from: d, reason: from kotlin metadata */
    private static final Font BUTTON;

    /* renamed from: e, reason: from kotlin metadata */
    private static final Font INPUT;

    /* renamed from: f, reason: from kotlin metadata */
    private static final Font LABEL;

    static {
        FontStyle fontStyle = FontStyle.Normal;
        HEADING = new Font(null, fontStyle, FontWeight.SemiBold, 17, null, null, 1, null);
        FontWeight fontWeight = FontWeight.Normal;
        SUBHEADING = new Font(null, fontStyle, fontWeight, 15, null, null, 1, null);
        FOOTNOTE = new Font(null, fontStyle, fontWeight, 12, null, null, 1, null);
        BUTTON = new Font(null, fontStyle, fontWeight, 14, null, null, 1, null);
        INPUT = new Font(null, fontStyle, fontWeight, 16, null, null, 1, null);
        LABEL = new Font(null, fontStyle, FontWeight.Medium, 14, null, null, 1, null);
    }

    private DefaultFonts() {
    }

    public final Font getBUTTON() {
        return BUTTON;
    }

    public final Font getFOOTNOTE() {
        return FOOTNOTE;
    }

    public final Font getHEADING() {
        return HEADING;
    }

    public final Font getINPUT() {
        return INPUT;
    }

    public final Font getLABEL() {
        return LABEL;
    }

    public final Font getSUBHEADING() {
        return SUBHEADING;
    }
}
