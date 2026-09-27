package io.ably.lib.objects;

import com.google.gson.JsonArray;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface ObjectsSerializer {
    JsonArray asJsonArray(Object[] objArr);

    Object[] readFromJsonArray(JsonArray jsonArray);

    Object[] readMsgpackArray(MessageUnpacker messageUnpacker);

    void writeMsgpackArray(Object[] objArr, MessagePacker messagePacker);
}
