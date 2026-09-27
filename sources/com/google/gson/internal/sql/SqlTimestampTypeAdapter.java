package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {
    static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            return new SqlTimestampTypeAdapter(gson.getAdapter(Date.class), null);
        }
    };
    private final TypeAdapter<Date> dateTypeAdapter;

    private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.dateTypeAdapter = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public Timestamp read2(JsonReader jsonReader) {
        Date read = this.dateTypeAdapter.read(jsonReader);
        if (read != null) {
            return new Timestamp(read.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Timestamp timestamp) {
        write2(jsonWriter, timestamp);
    }

    public /* synthetic */ SqlTimestampTypeAdapter(TypeAdapter typeAdapter, AnonymousClass1 anonymousClass1) {
        this(typeAdapter);
    }

    /* renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(JsonWriter jsonWriter, Timestamp timestamp) {
        this.dateTypeAdapter.write(jsonWriter, timestamp);
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ Timestamp read(JsonReader jsonReader) {
        return read2(jsonReader);
    }
}
