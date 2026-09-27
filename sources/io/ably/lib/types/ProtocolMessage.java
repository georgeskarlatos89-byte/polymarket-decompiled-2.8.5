package io.ably.lib.types;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import io.ably.lib.objects.ObjectsHelper;
import io.ably.lib.objects.ObjectsJsonSerializer;
import io.ably.lib.objects.ObjectsSerializer;
import io.ably.lib.realtime.Presence;
import io.ably.lib.util.Log;
import io.radar.sdk.RadarTrackingOptions;
import java.lang.reflect.Type;
import java.util.Map;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class ProtocolMessage {
    private static final String TAG = "io.ably.lib.types.ProtocolMessage";
    public Action action;
    public Annotation[] annotations;
    public AuthDetails auth;
    public String channel;
    public String channelSerial;
    public ConnectionDetails connectionDetails;
    public String connectionId;
    public int count;
    public ErrorInfo error;
    public int flags;
    public String id;
    public Message[] messages;
    public Long msgSerial;
    public Map<String, String> params;
    public PresenceMessage[] presence;
    public PublishResult[] res;

    @JsonAdapter(ObjectsJsonSerializer.class)
    public Object[] state;
    public long timestamp;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public enum Action {
        heartbeat,
        ack,
        nack,
        connect,
        connected,
        disconnect,
        disconnected,
        close,
        closed,
        error,
        attach,
        attached,
        detach,
        detached,
        presence,
        message,
        sync,
        auth,
        activate,
        object,
        object_sync,
        annotation;

        public static Action findByValue(int i) {
            return values()[i];
        }

        public int getValue() {
            return ordinal();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public enum Flag {
        has_presence(0),
        has_backlog(1),
        resumed(2),
        attach_resume(5),
        has_objects(7),
        presence(16),
        publish(17),
        subscribe(18),
        presence_subscribe(19),
        annotation_publish(21),
        annotation_subscribe(22),
        object_subscribe(24),
        object_publish(25);

        private final int mask;

        Flag(int i) {
            this.mask = 1 << i;
        }

        public int getMask() {
            return this.mask;
        }
    }

    public ProtocolMessage(Action action, String str) {
        this.action = action;
        this.channel = str;
    }

    public static /* synthetic */ String access$000() {
        return TAG;
    }

    public static boolean ackRequired(ProtocolMessage protocolMessage) {
        Action action = protocolMessage.action;
        if (action != Action.message && action != Action.presence && action != Action.object && action != Action.annotation) {
            return false;
        }
        return true;
    }

    public static ProtocolMessage fromMsgpack(MessageUnpacker messageUnpacker) {
        return new ProtocolMessage().readMsgpack(messageUnpacker);
    }

    public boolean hasFlag(Flag flag) {
        if ((this.flags & flag.getMask()) == flag.getMask()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a4, code lost:
    
        r7.unpackString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a8, code lost:
    
        r6.annotations = io.ably.lib.types.AnnotationSerializer.readMsgpackArray(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01af, code lost:
    
        r6.params = io.ably.lib.types.MessageSerializer.readStringMap(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b6, code lost:
    
        r6.presence = io.ably.lib.types.PresenceSerializer.readMsgpackArray(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bd, code lost:
    
        r6.action = io.ably.lib.types.ProtocolMessage.Action.findByValue(r7.unpackInt());
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c8, code lost:
    
        r6.msgSerial = java.lang.Long.valueOf(r7.unpackLong());
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011f, code lost:
    
        switch(r5) {
            case 0: goto L109;
            case 1: goto L108;
            case 2: goto L107;
            case 3: goto L106;
            case 4: goto L105;
            case 5: goto L104;
            case 6: goto L103;
            case 7: goto L102;
            case 8: goto L101;
            case 9: goto L100;
            case 10: goto L99;
            case 11: goto L98;
            case 12: goto L97;
            case 13: goto L96;
            case 14: goto L92;
            case 15: goto L91;
            case 16: goto L90;
            case 17: goto L89;
            case 18: goto L88;
            default: goto L87;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0122, code lost:
    
        io.ably.lib.util.Log.v(io.ably.lib.types.ProtocolMessage.TAG, "Unexpected field: ".concat(r3));
        r7.skipValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0132, code lost:
    
        r6.connectionId = r7.unpackString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013a, code lost:
    
        r6.channelSerial = r7.unpackString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0142, code lost:
    
        r6.channel = r7.unpackString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014a, code lost:
    
        r6.connectionDetails = io.ably.lib.types.ConnectionDetails.fromMsgpack(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0152, code lost:
    
        r3 = io.ably.lib.objects.ObjectsHelper.getSerializer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0156, code lost:
    
        if (r3 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0158, code lost:
    
        r6.state = r3.readMsgpackArray(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0160, code lost:
    
        io.ably.lib.util.Log.w(io.ably.lib.types.ProtocolMessage.TAG, "Skipping 'state' field msgpack deserialization because ObjectsSerializer not found");
        r7.skipValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016c, code lost:
    
        r6.flags = r7.unpackInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0173, code lost:
    
        r6.error = io.ably.lib.types.ErrorInfo.fromMsgpack(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017a, code lost:
    
        r6.count = r7.unpackInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0181, code lost:
    
        r6.timestamp = r7.unpackLong();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0188, code lost:
    
        r6.auth = io.ably.lib.types.ProtocolMessage.AuthDetails.fromMsgpack(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018f, code lost:
    
        r6.res = io.ably.lib.types.PublishResult.readMsgpackArray(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0196, code lost:
    
        r6.id = r7.unpackString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x019d, code lost:
    
        r6.messages = io.ably.lib.types.MessageSerializer.readMsgpackArray(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProtocolMessage readMsgpack(MessageUnpacker messageUnpacker) {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else {
                intern.getClass();
                char c = 65535;
                switch (intern.hashCode()) {
                    case -1487721259:
                        if (intern.equals("msgSerial")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1422950858:
                        if (intern.equals("action")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1276666629:
                        if (intern.equals("presence")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -995427962:
                        if (intern.equals("params")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -961709276:
                        if (intern.equals("annotations")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -513224031:
                        if (intern.equals("connectionKey")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -462094004:
                        if (intern.equals("messages")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 3355:
                        if (intern.equals(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)) {
                            c = 7;
                            break;
                        }
                        break;
                    case 112800:
                        if (intern.equals("res")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 3005864:
                        if (intern.equals("auth")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 55126294:
                        if (intern.equals("timestamp")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 94851343:
                        if (intern.equals("count")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 96784904:
                        if (intern.equals("error")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 97513095:
                        if (intern.equals("flags")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case 109757585:
                        if (intern.equals("state")) {
                            c = 14;
                            break;
                        }
                        break;
                    case 321402244:
                        if (intern.equals("connectionDetails")) {
                            c = 15;
                            break;
                        }
                        break;
                    case 738950403:
                        if (intern.equals(AppsFlyerProperties.CHANNEL)) {
                            c = 16;
                            break;
                        }
                        break;
                    case 1423136983:
                        if (intern.equals("channelSerial")) {
                            c = 17;
                            break;
                        }
                        break;
                    case 1923106969:
                        if (intern.equals(Presence.GET_CONNECTIONID)) {
                            c = 18;
                            break;
                        }
                        break;
                }
            }
        }
        return this;
    }

    public void setFlag(Flag flag) {
        this.flags = flag.getMask() | this.flags;
    }

    public void setFlags(int i) {
        this.flags = i | this.flags;
    }

    public void writeMsgpack(MessagePacker messagePacker) {
        int i;
        if (this.channel != null) {
            i = 2;
        } else {
            i = 1;
        }
        if (this.msgSerial != null) {
            i++;
        }
        if (this.messages != null) {
            i++;
        }
        if (this.presence != null) {
            i++;
        }
        if (this.auth != null) {
            i++;
        }
        if (this.flags != 0) {
            i++;
        }
        if (this.params != null) {
            i++;
        }
        if (this.channelSerial != null) {
            i++;
        }
        if (this.annotations != null) {
            i++;
        }
        if (this.state != null && ObjectsHelper.getSerializer() != null) {
            i++;
        }
        if (this.res != null) {
            i++;
        }
        messagePacker.packMapHeader(i);
        messagePacker.packString("action");
        messagePacker.packInt(this.action.getValue());
        if (this.channel != null) {
            messagePacker.packString(AppsFlyerProperties.CHANNEL);
            messagePacker.packString(this.channel);
        }
        if (this.msgSerial != null) {
            messagePacker.packString("msgSerial");
            messagePacker.packLong(this.msgSerial.longValue());
        }
        if (this.messages != null) {
            messagePacker.packString("messages");
            MessageSerializer.writeMsgpackArray(this.messages, messagePacker);
        }
        if (this.presence != null) {
            messagePacker.packString("presence");
            PresenceSerializer.writeMsgpackArray(this.presence, messagePacker);
        }
        if (this.auth != null) {
            messagePacker.packString("auth");
            this.auth.writeMsgpack(messagePacker);
        }
        if (this.flags != 0) {
            messagePacker.packString("flags");
            messagePacker.packInt(this.flags);
        }
        if (this.params != null) {
            messagePacker.packString("params");
            MessageSerializer.write(this.params, messagePacker);
        }
        if (this.channelSerial != null) {
            messagePacker.packString("channelSerial");
            messagePacker.packString(this.channelSerial);
        }
        if (this.annotations != null) {
            messagePacker.packString("annotations");
            AnnotationSerializer.writeMsgpackArray(this.annotations, messagePacker);
        }
        if (this.state != null) {
            ObjectsSerializer serializer = ObjectsHelper.getSerializer();
            if (serializer != null) {
                messagePacker.packString("state");
                serializer.writeMsgpackArray(this.state, messagePacker);
            } else {
                Log.w(TAG, "Skipping 'state' field msgpack serialization because ObjectsSerializer not found");
            }
        }
        if (this.res != null) {
            messagePacker.packString("res");
            PublishResult.writeMsgpackArray(this.res, messagePacker);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class AuthDetails {
        public String accessToken;

        public AuthDetails(String str) {
            this.accessToken = str;
        }

        public static AuthDetails fromMsgpack(MessageUnpacker messageUnpacker) {
            return new AuthDetails().readMsgpack(messageUnpacker);
        }

        public AuthDetails readMsgpack(MessageUnpacker messageUnpacker) {
            int unpackMapHeader = messageUnpacker.unpackMapHeader();
            for (int i = 0; i < unpackMapHeader; i++) {
                String intern = messageUnpacker.unpackString().intern();
                if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                    messageUnpacker.unpackNil();
                } else {
                    intern.getClass();
                    if (!intern.equals("accessToken")) {
                        Log.v(ProtocolMessage.access$000(), "Unexpected field: ".concat(intern));
                        messageUnpacker.skipValue();
                    } else {
                        this.accessToken = messageUnpacker.unpackString();
                    }
                }
            }
            return this;
        }

        public void writeMsgpack(MessagePacker messagePacker) {
            int i;
            if (this.accessToken != null) {
                i = 1;
            } else {
                i = 0;
            }
            messagePacker.packMapHeader(i);
            if (this.accessToken != null) {
                messagePacker.packString("accessToken");
                messagePacker.packString(this.accessToken);
            }
        }

        private AuthDetails() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class ActionSerializer implements JsonSerializer<Action>, JsonDeserializer<Action> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Action deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            return Action.findByValue(jsonElement.getAsInt());
        }

        /* renamed from: serialize, reason: avoid collision after fix types in other method */
        public JsonElement serialize2(Action action, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(Integer.valueOf(action.getValue()));
        }

        @Override // com.google.gson.JsonDeserializer
        public /* bridge */ /* synthetic */ Action deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            return deserialize(jsonElement, type, jsonDeserializationContext);
        }

        @Override // com.google.gson.JsonSerializer
        public /* bridge */ /* synthetic */ JsonElement serialize(Action action, Type type, JsonSerializationContext jsonSerializationContext) {
            return serialize2(action, type, jsonSerializationContext);
        }
    }

    public ProtocolMessage(Action action) {
        this.action = action;
    }

    public ProtocolMessage() {
    }
}
