package com.appsflyer.internal;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.ably.lib.http.HttpConstants;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/internal/AFd1hSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCurrencyIso4217Code", "Ljava/lang/String;", "getMediationNetwork", "getRevenue", "AFAdRevenueData", "getMonetizationNetwork", "component1", "component2", "areAllFieldsValid", "component4"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum AFd1hSDK {
    TEXT(ApiConstant.TEXT_PLAIN_MEDIA_TYPE),
    JSON("application/json"),
    OCTET_STREAM("application/octet-stream"),
    XML("application/xml"),
    HTML("text/html"),
    FORM(HttpConstants.ContentTypes.FORM_ENCODING),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_PNG("image/png");


    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public final String getMediationNetwork;

    AFd1hSDK(String str) {
        this.getMediationNetwork = str;
    }
}
