package defpackage;

import java.util.LinkedHashMap;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class wgf {
    public static final LinkedHashMap a;

    static {
        Pair[] pairArr = {new Pair(ii7.UNKNOWN_ERR, new h0(26)), new Pair(ii7.ABORT_ERR, new h0(0)), new Pair(ii7.ATTESTATION_NOT_PRIVATE_ERR, new h0(16)), new Pair(ii7.CONSTRAINT_ERR, new h0(1)), new Pair(ii7.DATA_ERR, new h0(3)), new Pair(ii7.INVALID_STATE_ERR, new h0(10)), new Pair(ii7.ENCODING_ERR, new h0(4)), new Pair(ii7.NETWORK_ERR, new h0(12)), new Pair(ii7.NOT_ALLOWED_ERR, new h0(14)), new Pair(ii7.NOT_SUPPORTED_ERR, new h0(17)), new Pair(ii7.SECURITY_ERR, new h0(22)), new Pair(ii7.TIMEOUT_ERR, new h0(24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(c1c.a(12));
        d1c.m(linkedHashMap, pairArr);
        a = linkedHashMap;
    }
}
