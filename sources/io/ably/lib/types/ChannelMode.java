package io.ably.lib.types;

import io.ably.lib.types.ProtocolMessage;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public enum ChannelMode {
    presence(ProtocolMessage.Flag.presence),
    publish(ProtocolMessage.Flag.publish),
    subscribe(ProtocolMessage.Flag.subscribe),
    presence_subscribe(ProtocolMessage.Flag.presence_subscribe),
    object_publish(ProtocolMessage.Flag.object_publish),
    object_subscribe(ProtocolMessage.Flag.object_subscribe),
    annotation_publish(ProtocolMessage.Flag.annotation_publish),
    annotation_subscribe(ProtocolMessage.Flag.annotation_subscribe);

    private final int mask;

    ChannelMode(ProtocolMessage.Flag flag) {
        this.mask = flag.getMask();
    }

    public static Set<ChannelMode> toSet(int i) {
        HashSet hashSet = new HashSet();
        for (ChannelMode channelMode : values()) {
            int mask = channelMode.getMask();
            if ((i & mask) == mask) {
                hashSet.add(channelMode);
            }
        }
        return hashSet;
    }

    public int getMask() {
        return this.mask;
    }
}
