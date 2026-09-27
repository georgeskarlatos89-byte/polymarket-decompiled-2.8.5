package io.intercom.android.sdk.blocks.messengercard;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class MessengerCardWebViewAction {
    private final Map<String, Object> payload;
    private final String type;

    public MessengerCardWebViewAction(String str, Map<String, Object> map) {
        this.type = str;
        this.payload = map;
    }

    public Map<String, Object> getPayload() {
        return this.payload;
    }

    public String getType() {
        return this.type;
    }
}
