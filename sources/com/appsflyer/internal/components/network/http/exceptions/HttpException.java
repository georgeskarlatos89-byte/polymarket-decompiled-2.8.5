package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFd1dSDK;
import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFd1dSDK getRevenue;

    public HttpException(Throwable th, AFd1dSDK aFd1dSDK) {
        super(th.getMessage(), th);
        this.getRevenue = aFd1dSDK;
    }

    public AFd1dSDK getMetrics() {
        return this.getRevenue;
    }
}
