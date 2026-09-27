package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1ySDK;
import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class ParsingException extends IOException {
    private final AFe1ySDK<String> getRevenue;

    public ParsingException(String str, Throwable th, AFe1ySDK<String> aFe1ySDK) {
        super(str, th);
        this.getRevenue = aFe1ySDK;
    }

    public AFe1ySDK<String> getRawResponse() {
        return this.getRevenue;
    }
}
