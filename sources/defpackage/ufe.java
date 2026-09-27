package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ufe extends wfe {
    public final LinkedHashMap b;

    public ufe(d47 d47Var, boolean z) {
        this.b = d1c.j(lyn.c(d47Var), c1c.b(new Pair("displayed_successfully", Boolean.valueOf(z))));
    }

    @Override // defpackage.fp
    public final String c() {
        return "payment_method_messaging_displayed";
    }

    @Override // defpackage.cge
    public final Map getParams() {
        return this.b;
    }
}
