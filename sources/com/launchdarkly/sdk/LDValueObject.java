package com.launchdarkly.sdk;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonWriter;
import defpackage.fva;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(LDValueTypeAdapter.class)
/* loaded from: classes3.dex */
final class LDValueObject extends LDValue {
    private static final LDValueObject EMPTY = new LDValueObject(Collections.EMPTY_MAP);
    private final Map<String, LDValue> map;

    public LDValueObject(Map map) {
        this.map = map;
    }

    public static LDValueObject t(HashMap hashMap) {
        if (hashMap.isEmpty()) {
            return EMPTY;
        }
        return new LDValueObject(hashMap);
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final LDValue d(String str) {
        LDValue lDValue = this.map.get(str);
        if (lDValue == null) {
            return LDValueNull.INSTANCE;
        }
        return lDValue;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final fva e() {
        return fva.OBJECT;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final Iterable k() {
        return this.map.keySet();
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final int o() {
        return this.map.size();
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final Iterable r() {
        return this.map.values();
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final void s(JsonWriter jsonWriter) {
        jsonWriter.beginObject();
        for (Map.Entry<String, LDValue> entry : this.map.entrySet()) {
            jsonWriter.name(entry.getKey());
            entry.getValue().s(jsonWriter);
        }
        jsonWriter.endObject();
    }
}
