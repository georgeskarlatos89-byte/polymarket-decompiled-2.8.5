package defpackage;

import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class z23 implements b33 {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final Map c;

    public z23(boolean z, String str) {
        this.b = str;
        this.c = c1c.b(new Pair("is_ready", Boolean.valueOf(z)));
    }

    @Override // defpackage.b33
    public final Map a() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // defpackage.b33
    public final String b() {
        int i = this.a;
        return this.b;
    }

    @Override // defpackage.fp
    public final String c() {
        switch (this.a) {
            case 0:
                return "elements.captcha.passive.attach";
            default:
                return "elements.captcha.passive.error";
        }
    }

    public z23(String str, Throwable th) {
        this.b = str;
        this.c = hdi.v("error_message", th != null ? th.getMessage() : null);
    }
}
