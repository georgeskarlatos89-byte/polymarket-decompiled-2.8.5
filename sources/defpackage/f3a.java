package defpackage;

import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f3a implements h3a {
    public final float a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public f3a(float f, String str, String str2, boolean z, String str3) {
        this.a = f;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    @Override // defpackage.fp
    public final String c() {
        return "elements.intent_confirmation_challenge.error";
    }

    @Override // defpackage.h3a
    public final Map getParams() {
        return d1c.e(new Pair("duration", Float.valueOf(this.a)), new Pair("error_type", this.b), new Pair("error_code", this.c), new Pair("from_bridge", Boolean.valueOf(this.d)), new Pair("captcha_vendor_name", this.e));
    }
}
