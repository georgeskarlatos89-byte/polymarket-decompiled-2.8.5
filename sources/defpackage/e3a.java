package defpackage;

import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e3a implements h3a {
    public final /* synthetic */ int a;
    public final float b;
    public final String c;

    public /* synthetic */ e3a(float f, int i, String str) {
        this.a = i;
        this.b = f;
        this.c = str;
    }

    @Override // defpackage.fp
    public final String c() {
        switch (this.a) {
            case 0:
                return "elements.intent_confirmation_challenge.cancel";
            case 1:
                return "elements.intent_confirmation_challenge.success";
            default:
                return "elements.intent_confirmation_challenge.web_view_loaded";
        }
    }

    @Override // defpackage.h3a
    public final Map getParams() {
        int i = this.a;
        String str = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                return d1c.e(new Pair("duration", Float.valueOf(f)), new Pair("captcha_vendor_name", str));
            case 1:
                return d1c.e(new Pair("duration", Float.valueOf(f)), new Pair("captcha_vendor_name", str));
            default:
                return d1c.e(new Pair("duration", Float.valueOf(f)), new Pair("captcha_vendor_name", str));
        }
    }
}
