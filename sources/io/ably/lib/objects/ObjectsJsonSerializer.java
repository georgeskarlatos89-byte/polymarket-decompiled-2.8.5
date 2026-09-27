package io.ably.lib.objects;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.ably.lib.util.Log;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class ObjectsJsonSerializer implements JsonSerializer<Object[]>, JsonDeserializer<Object[]> {
    private static final String TAG = "io.ably.lib.objects.ObjectsJsonSerializer";

    @Override // com.google.gson.JsonDeserializer
    /* renamed from: deserialize, reason: avoid collision after fix types in other method */
    public Object[] deserialize2(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        ObjectsSerializer serializer = ObjectsHelper.getSerializer();
        if (serializer == null) {
            Log.w(TAG, "Skipping 'state' field json deserialization because ObjectsSerializer not found.");
            return null;
        }
        if (jsonElement.isJsonArray()) {
            return serializer.readFromJsonArray(jsonElement.getAsJsonArray());
        }
        throw new JsonParseException("Expected a JSON array for 'state' field, but got: " + jsonElement);
    }

    /* renamed from: serialize, reason: avoid collision after fix types in other method */
    public JsonElement serialize2(Object[] objArr, Type type, JsonSerializationContext jsonSerializationContext) {
        ObjectsSerializer serializer = ObjectsHelper.getSerializer();
        if (serializer == null) {
            Log.w(TAG, "Skipping 'state' field json serialization because ObjectsSerializer not found.");
            return JsonNull.INSTANCE;
        }
        return serializer.asJsonArray(objArr);
    }

    @Override // com.google.gson.JsonSerializer
    public /* bridge */ /* synthetic */ JsonElement serialize(Object[] objArr, Type type, JsonSerializationContext jsonSerializationContext) {
        return serialize2(objArr, type, jsonSerializationContext);
    }

    @Override // com.google.gson.JsonDeserializer
    public /* bridge */ /* synthetic */ Object[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return deserialize2(jsonElement, type, jsonDeserializationContext);
    }
}
