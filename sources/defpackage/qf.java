package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class qf extends tf {
    public final String a;
    public final String b;
    public final d47 c;
    public final int d;
    public final d47 e;
    public final String f;

    public qf(String str, String str2, d47 d47Var, int i, d47 d47Var2, String str3) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = d47Var;
        this.d = i;
        this.e = d47Var2;
        this.f = str3;
    }

    @Override // defpackage.tf
    public final Map a() {
        xzb xzbVar = new xzb();
        xzbVar.put("address_data_blob", tf.d(this.a));
        xzbVar.put("autocomplete_session_token", this.b);
        xzbVar.put("result_count", Integer.valueOf(this.d));
        String str = this.f;
        if (str != null) {
            xzbVar.put("source", str);
        }
        d47 d47Var = this.c;
        if (d47Var != null) {
            xzbVar.put("ms_to_fetch", Double.valueOf(d47.m(d47Var.a, m47.MILLISECONDS)));
        }
        d47 d47Var2 = this.e;
        if (d47Var2 != null) {
            xzbVar.put("ms_session_elapsed", Double.valueOf(d47.m(d47Var2.a, m47.MILLISECONDS)));
        }
        return xzbVar.b();
    }

    @Override // defpackage.fp
    public final String c() {
        return "mc_address_autocomplete_suggestions";
    }
}
