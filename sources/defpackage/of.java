package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class of extends tf {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final d47 f;
    public final d47 g;

    public of(String str, String str2, int i, String str3, String str4, d47 d47Var, d47 d47Var2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = d47Var;
        this.g = d47Var2;
    }

    @Override // defpackage.tf
    public final Map a() {
        xzb xzbVar = new xzb();
        xzbVar.put("address_data_blob", tf.d(this.a));
        xzbVar.put("autocomplete_session_token", this.b);
        xzbVar.put("query_length", Integer.valueOf(this.c));
        String str = this.d;
        if (str != null) {
            xzbVar.put("place_id", str);
        }
        String str2 = this.e;
        if (str2 != null) {
            xzbVar.put("source", str2);
        }
        d47 d47Var = this.f;
        if (d47Var != null) {
            xzbVar.put("ms_session_elapsed", Double.valueOf(d47.m(d47Var.a, m47.MILLISECONDS)));
        }
        d47 d47Var2 = this.g;
        if (d47Var2 != null) {
            xzbVar.put("ms_to_fetch", Double.valueOf(d47.m(d47Var2.a, m47.MILLISECONDS)));
        }
        return xzbVar.b();
    }

    @Override // defpackage.fp
    public final String c() {
        return "mc_address_autocomplete_selected";
    }
}
