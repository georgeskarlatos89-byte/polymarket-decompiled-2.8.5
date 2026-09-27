package io.intercom.android.sdk.models;

import com.google.gson.JsonObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class Sheet {
    private final String body;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        JsonObject sheet_request_body;
        String sheet_title;

        public Sheet build() {
            return new Sheet(this);
        }
    }

    public Sheet(Builder builder) {
        String jsonElement;
        JsonObject jsonObject = builder.sheet_request_body;
        if (jsonObject == null) {
            jsonElement = "";
        } else {
            jsonElement = jsonObject.toString();
        }
        this.body = jsonElement;
    }

    public String getBody() {
        return this.body;
    }
}
