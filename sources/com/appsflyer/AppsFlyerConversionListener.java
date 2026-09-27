package com.appsflyer;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface AppsFlyerConversionListener {
    void onAppOpenAttribution(Map<String, String> map);

    void onAttributionFailure(String str);

    void onConversionDataFail(String str);

    void onConversionDataSuccess(Map<String, Object> map);
}
