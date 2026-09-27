package com.launchdarkly.sdk;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.ful;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class ContextKindTypeAdapter extends TypeAdapter<d> {
    @Override // com.google.gson.TypeAdapter
    public final d read(JsonReader jsonReader) {
        return d.a(ful.c(jsonReader));
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, d dVar) {
        jsonWriter.value(dVar.a);
    }
}
