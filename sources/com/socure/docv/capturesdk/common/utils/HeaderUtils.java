package com.socure.docv.capturesdk.common.utils;

import defpackage.c1c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\u0006J\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/HeaderUtils;", "", "<init>", "()V", "getPrimaryHeader", "", "", "publicKey", "getStepHeader", "transactionToken", "getSubmitModuleHeader", "sessionToken", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HeaderUtils {
    public static final int $stable = 0;
    public static final HeaderUtils INSTANCE = new HeaderUtils();

    private HeaderUtils() {
    }

    public final Map<String, String> getPrimaryHeader(String publicKey) {
        publicKey.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Authorization", "SocureApiKey " + publicKey);
        return linkedHashMap;
    }

    public final Map<String, String> getStepHeader(String transactionToken) {
        transactionToken.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ApiConstant.HEADER_SOCURE_TRANSACTION_TOKEN, transactionToken);
        return linkedHashMap;
    }

    public final Map<String, String> getSubmitModuleHeader(String sessionToken) {
        sessionToken.getClass();
        return c1c.b(new Pair(ApiConstant.HEADER_SESSION_TOKEN, sessionToken));
    }
}
