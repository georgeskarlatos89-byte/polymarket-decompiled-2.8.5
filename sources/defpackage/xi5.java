package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class xi5 extends tf implements j83 {
    public final /* synthetic */ int a;
    public final LinkedHashMap b;

    public xi5(String str, d47 d47Var, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = d1c.j(lyn.c(d47Var), c1c.b(new Pair("implementation", str)));
                return;
            default:
                this.b = d1c.j(lyn.c(d47Var), c1c.b(new Pair("implementation", str)));
                return;
        }
    }

    @Override // defpackage.tf
    public final Map a() {
        int i = this.a;
        return this.b;
    }

    @Override // defpackage.fp
    public final String c() {
        switch (this.a) {
            case 0:
                return "cs_cardscan_cancel";
            case 1:
                return "cs_cardscan_failed";
            default:
                return "cs_cardscan_success";
        }
    }

    public xi5(String str, d47 d47Var, Throwable th) {
        this.a = 1;
        this.b = d1c.j(lyn.c(d47Var), d1c.e(new Pair("implementation", str), new Pair("error_message", th != null ? th.getClass().getSimpleName() : null)));
    }
}
