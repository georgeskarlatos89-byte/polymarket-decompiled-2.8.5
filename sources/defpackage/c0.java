package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lc0;", "Ls6i;", "t6n", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c0 extends s6i {
    public static final Set f = ArraysKt.l0(new String[]{"key", "client_secret", "ephemeral_key", "legacy_customer_ephemeral_key"});
    public static final List g = CollectionsKt.listOf("ek_live_", "ek_test_", "pk_live_", "pk_test_", "sk_live_", "sk_test_", "uk_live_", "uk_test_", "rk_live_", "rk_test_");

    public c0(String str, Throwable th) {
        super(0, 7, null, null, str, th);
    }

    @Override // defpackage.s6i
    /* renamed from: a */
    public final String getG() {
        return "connectionError";
    }
}
