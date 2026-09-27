package com.launchdarkly.sdk.android;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import defpackage.sua;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class LDFailureSerialization implements JsonSerializer<LDFailure>, JsonDeserializer<LDFailure> {
    @Override // com.google.gson.JsonDeserializer
    public final LDFailure deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        sua suaVar = (sua) jsonDeserializationContext.deserialize(asJsonObject.get("failureType"), sua.class);
        String asString = asJsonObject.getAsJsonPrimitive("message").getAsString();
        if (suaVar == sua.UNEXPECTED_RESPONSE_CODE) {
            return new LDInvalidResponseCodeFailure(asString, asJsonObject.getAsJsonPrimitive("responseCode").getAsInt(), asJsonObject.getAsJsonPrimitive("retryable").getAsBoolean());
        }
        return new LDFailure(asString, suaVar);
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(LDFailure lDFailure, Type type, JsonSerializationContext jsonSerializationContext) {
        LDFailure lDFailure2 = lDFailure;
        if (lDFailure2 == null) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("failureType", jsonSerializationContext.serialize(lDFailure2.a()));
        jsonObject.addProperty("message", lDFailure2.getMessage());
        if (lDFailure2 instanceof LDInvalidResponseCodeFailure) {
            LDInvalidResponseCodeFailure lDInvalidResponseCodeFailure = (LDInvalidResponseCodeFailure) lDFailure2;
            jsonObject.addProperty("responseCode", Integer.valueOf(lDInvalidResponseCodeFailure.b()));
            jsonObject.addProperty("retryable", Boolean.valueOf(lDInvalidResponseCodeFailure.c()));
        }
        return jsonObject;
    }
}
