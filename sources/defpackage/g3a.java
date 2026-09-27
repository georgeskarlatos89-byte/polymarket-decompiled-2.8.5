package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g3a implements h3a {
    public final String a;

    public g3a(String str) {
        this.a = str;
    }

    @Override // defpackage.fp
    public final String c() {
        return "elements.intent_confirmation_challenge.start";
    }

    @Override // defpackage.h3a
    public final Map getParams() {
        return hdi.v("captcha_vendor_name", this.a);
    }
}
