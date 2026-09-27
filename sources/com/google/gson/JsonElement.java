package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import defpackage.dmk;
import defpackage.fi9;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class JsonElement {
    @Deprecated
    public JsonElement() {
    }

    public abstract JsonElement deepCopy();

    public BigDecimal getAsBigDecimal() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public BigInteger getAsBigInteger() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean getAsBoolean() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte getAsByte() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    @Deprecated
    public char getAsCharacter() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double getAsDouble() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float getAsFloat() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int getAsInt() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public JsonArray getAsJsonArray() {
        if (isJsonArray()) {
            return (JsonArray) this;
        }
        fi9.q(this, "Not a JSON Array: ");
        return null;
    }

    public JsonNull getAsJsonNull() {
        if (isJsonNull()) {
            return (JsonNull) this;
        }
        fi9.q(this, "Not a JSON Null: ");
        return null;
    }

    public JsonObject getAsJsonObject() {
        if (isJsonObject()) {
            return (JsonObject) this;
        }
        fi9.q(this, "Not a JSON Object: ");
        return null;
    }

    public JsonPrimitive getAsJsonPrimitive() {
        if (isJsonPrimitive()) {
            return (JsonPrimitive) this;
        }
        fi9.q(this, "Not a JSON Primitive: ");
        return null;
    }

    public long getAsLong() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number getAsNumber() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public short getAsShort() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String getAsString() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean isJsonArray() {
        return this instanceof JsonArray;
    }

    public boolean isJsonNull() {
        return this instanceof JsonNull;
    }

    public boolean isJsonObject() {
        return this instanceof JsonObject;
    }

    public boolean isJsonPrimitive() {
        return this instanceof JsonPrimitive;
    }

    public String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            JsonWriter jsonWriter = new JsonWriter(Streams.writerForAppendable(sb));
            jsonWriter.setStrictness(Strictness.LENIENT);
            Streams.write(this, jsonWriter);
            return sb.toString();
        } catch (IOException e) {
            dmk.i(e);
            return null;
        }
    }
}
