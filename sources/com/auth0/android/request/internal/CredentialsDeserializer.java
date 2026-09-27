package com.auth0.android.request.internal;

import com.auth0.android.result.Credentials;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/auth0/android/request/internal/CredentialsDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/auth0/android/result/Credentials;", "<init>", "()V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class CredentialsDeserializer implements JsonDeserializer<Credentials> {
    @Override // com.google.gson.JsonDeserializer
    public final Credentials deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        if (jsonElement.isJsonObject() && !jsonElement.isJsonNull() && !jsonElement.getAsJsonObject().entrySet().isEmpty()) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            String str = (String) jsonDeserializationContext.deserialize(asJsonObject.remove("id_token"), String.class);
            String str2 = (String) jsonDeserializationContext.deserialize(asJsonObject.remove("access_token"), String.class);
            String str3 = (String) jsonDeserializationContext.deserialize(asJsonObject.remove("token_type"), String.class);
            String str4 = (String) jsonDeserializationContext.deserialize(asJsonObject.remove("refresh_token"), String.class);
            Long l = (Long) jsonDeserializationContext.deserialize(asJsonObject.remove("expires_in"), Long.TYPE);
            String str5 = (String) jsonDeserializationContext.deserialize(asJsonObject.remove("scope"), String.class);
            String str6 = (String) jsonDeserializationContext.deserialize(asJsonObject.remove("recovery_code"), String.class);
            Date date = (Date) jsonDeserializationContext.deserialize(asJsonObject.remove("expires_at"), Date.class);
            if (date == null && l != null) {
                date = new Date((l.longValue() * 1000) + System.currentTimeMillis());
            }
            Date date2 = date;
            str.getClass();
            str2.getClass();
            str3.getClass();
            date2.getClass();
            Credentials credentials = new Credentials(str, str2, str3, str4, date2, str5);
            credentials.c(str6);
            return credentials;
        }
        throw new JsonParseException("credentials json is not a valid json object");
    }
}
