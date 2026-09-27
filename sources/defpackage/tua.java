package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.CharArrayReader;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tua extends JsonReader {
    public static final JsonToken[] b = JsonToken.values();
    public final JsonReader a;

    public tua(JsonReader jsonReader) {
        super(new CharArrayReader(new char[0]));
        this.a = jsonReader;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginArray() {
        this.a.beginArray();
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginObject() {
        this.a.beginObject();
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endArray() {
        this.a.endArray();
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endObject() {
        this.a.endObject();
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean nextBoolean() {
        return this.a.nextBoolean();
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() {
        return this.a.nextDouble();
    }

    @Override // com.google.gson.stream.JsonReader
    public final int nextInt() {
        return this.a.nextInt();
    }

    @Override // com.google.gson.stream.JsonReader
    public final long nextLong() {
        return this.a.nextLong();
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextName() {
        return this.a.nextName();
    }

    @Override // com.google.gson.stream.JsonReader
    public final void nextNull() {
        this.a.nextNull();
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextString() {
        return this.a.nextString();
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken peek() {
        return b[this.a.peek().ordinal()];
    }

    @Override // com.google.gson.stream.JsonReader
    public final void skipValue() {
        this.a.skipValue();
    }
}
