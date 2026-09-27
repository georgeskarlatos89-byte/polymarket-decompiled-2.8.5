package com.launchdarkly.sdk;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonWriter;
import defpackage.fva;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(LDValueTypeAdapter.class)
/* loaded from: classes3.dex */
final class LDValueString extends LDValue {
    private static final LDValueString EMPTY = new LDValueString("");
    private final String value;

    public LDValueString(String str) {
        this.value = str;
    }

    public static LDValueString t(String str) {
        if (str.isEmpty()) {
            return EMPTY;
        }
        return new LDValueString(str);
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final fva e() {
        return fva.STRING;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final String p() {
        return this.value;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final void s(JsonWriter jsonWriter) {
        jsonWriter.value(this.value);
    }
}
