package defpackage;

import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class pf extends tf {
    public final String a;
    public final String b;

    public pf(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.tf
    public final Map a() {
        return d1c.e(new Pair("address_data_blob", tf.d(this.a)), new Pair("autocomplete_session_token", this.b));
    }

    @Override // defpackage.fp
    public final String c() {
        return "mc_address_autocomplete_start";
    }
}
