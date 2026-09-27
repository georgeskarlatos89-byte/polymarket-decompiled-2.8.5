package com.launchdarkly.sdk;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonWriter;
import defpackage.fva;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(LDValueTypeAdapter.class)
/* loaded from: classes3.dex */
final class LDValueNull extends LDValue {
    static final LDValueNull INSTANCE = new Object();

    @Override // com.launchdarkly.sdk.LDValue
    public final fva e() {
        return fva.NULL;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final String q() {
        return "null";
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final void s(JsonWriter jsonWriter) {
        jsonWriter.nullValue();
    }
}
