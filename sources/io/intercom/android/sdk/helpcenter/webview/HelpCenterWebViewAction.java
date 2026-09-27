package io.intercom.android.sdk.helpcenter.webview;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class HelpCenterWebViewAction {
    private final String type;
    private final Map<String, Object> value;

    public HelpCenterWebViewAction(String str, Map<String, Object> map) {
        this.type = str;
        this.value = map;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getValue() {
        return this.value;
    }
}
