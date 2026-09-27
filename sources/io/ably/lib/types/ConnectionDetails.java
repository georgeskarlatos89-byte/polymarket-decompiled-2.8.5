package io.ably.lib.types;

import io.ably.lib.realtime.Presence;
import io.ably.lib.transport.Defaults;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageUnpacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class ConnectionDetails {
    private static final String TAG = "io.ably.lib.types.ConnectionDetails";
    public String clientId;
    public String connectionKey;
    public Long maxFrameSize;
    public Long maxInboundRate;
    public int maxMessageSize;
    public Long maxOutboundRate;
    public Long objectsGCGracePeriod;
    public String serverId;
    public String siteCode;
    public Long maxIdleInterval = Long.valueOf(Defaults.maxIdleInterval);
    public Long connectionStateTtl = Long.valueOf(Defaults.connectionStateTtl);

    public static ConnectionDetails fromMsgpack(MessageUnpacker messageUnpacker) {
        return new ConnectionDetails().readMsgpack(messageUnpacker);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        switch(r5) {
            case 0: goto L66;
            case 1: goto L65;
            case 2: goto L64;
            case 3: goto L63;
            case 4: goto L62;
            case 5: goto L61;
            case 6: goto L60;
            case 7: goto L59;
            case 8: goto L58;
            case 9: goto L57;
            case 10: goto L56;
            default: goto L55;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        io.ably.lib.util.Log.v(io.ably.lib.types.ConnectionDetails.TAG, "Unexpected field: ".concat(r3));
        r7.skipValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        r6.maxOutboundRate = java.lang.Long.valueOf(r7.unpackLong());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
    
        r6.connectionStateTtl = java.lang.Long.valueOf(r7.unpackLong());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
    
        r6.maxMessageSize = r7.unpackInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        r6.serverId = r7.unpackString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e5, code lost:
    
        r6.maxInboundRate = java.lang.Long.valueOf(r7.unpackLong());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f0, code lost:
    
        r6.clientId = r7.unpackString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f7, code lost:
    
        r6.siteCode = r7.unpackString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fe, code lost:
    
        r6.connectionKey = r7.unpackString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0105, code lost:
    
        r6.objectsGCGracePeriod = java.lang.Long.valueOf(r7.unpackLong());
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0110, code lost:
    
        r6.maxFrameSize = java.lang.Long.valueOf(r7.unpackLong());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011b, code lost:
    
        r6.maxIdleInterval = java.lang.Long.valueOf(r7.unpackLong());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConnectionDetails readMsgpack(MessageUnpacker messageUnpacker) {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else {
                intern.getClass();
                char c = 65535;
                switch (intern.hashCode()) {
                    case -1280018371:
                        if (intern.equals("maxIdleInterval")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -878196214:
                        if (intern.equals("maxFrameSize")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -799059831:
                        if (intern.equals("objectsGCGracePeriod")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -513224031:
                        if (intern.equals("connectionKey")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 674694612:
                        if (intern.equals("siteCode")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 908408390:
                        if (intern.equals(Presence.GET_CLIENTID)) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1317696501:
                        if (intern.equals("maxInboundRate")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1379103678:
                        if (intern.equals("serverId")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1438151844:
                        if (intern.equals("maxMessageSize")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 1646990489:
                        if (intern.equals("connectionStateTtl")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 2112534388:
                        if (intern.equals("maxOutboundRate")) {
                            c = '\n';
                            break;
                        }
                        break;
                }
            }
        }
        return this;
    }
}
