package com.polymarket.clients;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"GeoGatedAction", "Lcom/polymarket/clients/GeoGatedAction;", "rawValue", "", "GeoFailureCode", "Lcom/polymarket/clients/GeoFailureCode;", "", "AppClients"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientGeoVerificationKt {
    public static final GeoFailureCode GeoFailureCode(int i) {
        return GeoFailureCode.INSTANCE.init(i);
    }

    public static final GeoGatedAction GeoGatedAction(String str) {
        str.getClass();
        return GeoGatedAction.INSTANCE.init(str);
    }
}
