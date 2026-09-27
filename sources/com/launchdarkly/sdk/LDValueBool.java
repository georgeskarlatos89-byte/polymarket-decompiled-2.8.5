package com.launchdarkly.sdk;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonWriter;
import defpackage.fva;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(LDValueTypeAdapter.class)
/* loaded from: classes3.dex */
final class LDValueBool extends LDValue {
    private final boolean value;
    static final LDValueBool TRUE = new LDValueBool(true);
    static final LDValueBool FALSE = new LDValueBool(false);

    public LDValueBool(boolean z) {
        this.value = z;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final boolean a() {
        return this.value;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final fva e() {
        return fva.BOOLEAN;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final String q() {
        if (this.value) {
            return "true";
        }
        return "false";
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final void s(JsonWriter jsonWriter) {
        jsonWriter.value(this.value);
    }
}
