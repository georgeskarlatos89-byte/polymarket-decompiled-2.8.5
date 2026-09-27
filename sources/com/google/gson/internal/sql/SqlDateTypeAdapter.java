package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {
    static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Date.class) {
                return null;
            }
            return new SqlDateTypeAdapter(null);
        }
    };
    private final DateFormat format;

    private SqlDateTypeAdapter() {
        this.format = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public Date read2(JsonReader jsonReader) {
        Date date;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.format.getTimeZone();
            try {
                try {
                    date = new Date(this.format.parse(nextString).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + nextString + "' as SQL Date; at path " + jsonReader.getPreviousPath(), e);
                }
            } finally {
                this.format.setTimeZone(timeZone);
            }
        }
        return date;
    }

    /* renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(JsonWriter jsonWriter, Date date) {
        String format;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format = this.format.format((java.util.Date) date);
        }
        jsonWriter.value(format);
    }

    public /* synthetic */ SqlDateTypeAdapter(AnonymousClass1 anonymousClass1) {
        this();
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Date date) {
        write2(jsonWriter, date);
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ Date read(JsonReader jsonReader) {
        return read2(jsonReader);
    }
}
