package defpackage;

import com.google.gson.stream.JsonWriter;
import java.io.CharArrayWriter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class uua extends JsonWriter {
    public final JsonWriter a;

    public uua(JsonWriter jsonWriter) {
        super(new CharArrayWriter(0));
        this.a = jsonWriter;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginArray() {
        this.a.beginArray();
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginObject() {
        this.a.beginObject();
        return this;
    }

    public final void e(long j) {
        this.a.value(j);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endArray() {
        this.a.endArray();
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endObject() {
        this.a.endObject();
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter jsonValue(String str) {
        this.a.jsonValue(str);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter name(String str) {
        this.a.name(str);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter nullValue() {
        this.a.nullValue();
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Boolean bool) {
        JsonWriter jsonWriter = this.a;
        if (bool == null) {
            jsonWriter.nullValue();
            return this;
        }
        jsonWriter.value(bool.booleanValue());
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(double d) {
        long j = (long) d;
        if (d == j) {
            e(j);
            return this;
        }
        this.a.value(d);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(long j) {
        e(j);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Number number) {
        if (number == null) {
            this.a.nullValue();
            return this;
        }
        value(number.doubleValue());
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(boolean z) {
        this.a.value(z);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(String str) {
        this.a.value(str);
        return this;
    }
}
