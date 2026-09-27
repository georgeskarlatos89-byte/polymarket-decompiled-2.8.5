package com.google.crypto.tink.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.dmk;
import defpackage.fi9;
import defpackage.hfa;
import defpackage.ifa;
import defpackage.k84;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class JsonParser$JsonElementTypeAdapter extends TypeAdapter<JsonElement> {
    private JsonParser$JsonElementTypeAdapter() {
    }

    public static JsonElement a(JsonReader jsonReader, JsonToken jsonToken) {
        int i = hfa.a[jsonToken.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        jsonReader.nextNull();
                        return JsonNull.INSTANCE;
                    }
                    fi9.q(jsonToken, "Unexpected token: ");
                    return null;
                }
                return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
            }
            return new JsonPrimitive(new ifa(jsonReader.nextString()));
        }
        String nextString = jsonReader.nextString();
        if (a.a(nextString)) {
            return new JsonPrimitive(nextString);
        }
        dmk.x("illegal characters in string");
        return null;
    }

    public static JsonElement b(JsonReader jsonReader, JsonToken jsonToken) {
        int i = hfa.a[jsonToken.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            jsonReader.beginObject();
            return new JsonObject();
        }
        jsonReader.beginArray();
        return new JsonArray();
    }

    @Override // com.google.gson.TypeAdapter
    public final JsonElement read(JsonReader jsonReader) {
        String str;
        boolean z;
        JsonToken peek = jsonReader.peek();
        JsonElement b = b(jsonReader, peek);
        if (b == null) {
            return a(jsonReader, peek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                if (b instanceof JsonObject) {
                    str = jsonReader.nextName();
                    if (!a.a(str)) {
                        dmk.x("illegal characters in string");
                        return null;
                    }
                } else {
                    str = null;
                }
                JsonToken peek2 = jsonReader.peek();
                JsonElement b2 = b(jsonReader, peek2);
                if (b2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (b2 == null) {
                    b2 = a(jsonReader, peek2);
                }
                if (b instanceof JsonArray) {
                    ((JsonArray) b).add(b2);
                } else {
                    JsonObject jsonObject = (JsonObject) b;
                    if (!jsonObject.has(str)) {
                        jsonObject.add(str, b2);
                    } else {
                        dmk.x(k84.g("duplicate key: ", str));
                        return null;
                    }
                }
                if (z) {
                    arrayDeque.addLast(b);
                    if (arrayDeque.size() <= 100) {
                        b = b2;
                    } else {
                        dmk.x("too many recursions");
                        return null;
                    }
                } else {
                    continue;
                }
            } else {
                if (b instanceof JsonArray) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return b;
                }
                b = (JsonElement) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, JsonElement jsonElement) {
        throw new UnsupportedOperationException("write is not supported");
    }

    public /* synthetic */ JsonParser$JsonElementTypeAdapter(int i) {
        this();
    }
}
