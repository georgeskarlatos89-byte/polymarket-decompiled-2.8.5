package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rf extends tf {
    public final String a;
    public final boolean b;
    public final Integer c;
    public final d47 d;

    public rf(String str, boolean z, Integer num, d47 d47Var) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = num;
        this.d = d47Var;
    }

    @Override // defpackage.tf
    public final Map a() {
        LinkedHashMap h = d1c.h(new Pair("address_country_code", this.a), new Pair("auto_complete_result_selected", Boolean.valueOf(this.b)));
        h.put("edit_distance", Integer.valueOf(this.c.intValue()));
        LinkedHashMap h2 = d1c.h(new Pair("address_data_blob", h));
        d47 d47Var = this.d;
        if (d47Var != null) {
            h2.put("ms_to_complete", Double.valueOf(d47.m(d47Var.a, m47.MILLISECONDS)));
        }
        return h2;
    }

    @Override // defpackage.fp
    public final String c() {
        return "mc_address_completed";
    }
}
