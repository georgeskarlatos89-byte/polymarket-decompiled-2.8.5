package com.launchdarkly.sdk;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonWriter;
import defpackage.fva;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(LDValueTypeAdapter.class)
/* loaded from: classes3.dex */
final class LDValueArray extends LDValue {
    private static final LDValueArray EMPTY = new LDValueArray(Collections.EMPTY_LIST);
    private final List<LDValue> list;

    public LDValueArray(List list) {
        this.list = Collections.unmodifiableList(list);
    }

    public static LDValueArray t(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            return new LDValueArray(arrayList);
        }
        return EMPTY;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final LDValue c(int i) {
        if (i >= 0 && i < this.list.size()) {
            return this.list.get(i);
        }
        return LDValueNull.INSTANCE;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final fva e() {
        return fva.ARRAY;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final int o() {
        return this.list.size();
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final Iterable r() {
        return this.list;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public final void s(JsonWriter jsonWriter) {
        jsonWriter.beginArray();
        Iterator<LDValue> it = this.list.iterator();
        while (it.hasNext()) {
            it.next().s(jsonWriter);
        }
        jsonWriter.endArray();
    }
}
