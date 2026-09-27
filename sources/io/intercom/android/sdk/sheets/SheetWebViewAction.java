package io.intercom.android.sdk.sheets;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class SheetWebViewAction {
    private final Map<String, Object> metaData;
    private final Map<String, Object> payload;
    private final String type;

    public SheetWebViewAction(String str, Map<String, Object> map, Map<String, Object> map2) {
        this.type = str;
        this.payload = map;
        this.metaData = map2;
    }

    public Map<String, Object> getMetaData() {
        return this.metaData;
    }

    public Map<String, Object> getPayload() {
        return this.payload;
    }

    public String getType() {
        return this.type;
    }
}
