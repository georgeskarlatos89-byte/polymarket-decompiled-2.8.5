package defpackage;

import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class sf extends tf {
    public final String a;

    public sf(String str) {
        this.a = str;
    }

    @Override // defpackage.tf
    public final Map a() {
        return c1c.b(new Pair("address_data_blob", tf.d(this.a)));
    }

    @Override // defpackage.fp
    public final String c() {
        return "mc_address_show";
    }
}
