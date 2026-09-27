package io.ably.lib.realtime;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public enum ChannelState {
    initialized(ChannelEvent.initialized),
    attaching(ChannelEvent.attaching),
    attached(ChannelEvent.attached),
    detaching(ChannelEvent.detaching),
    detached(ChannelEvent.detached),
    failed(ChannelEvent.failed),
    suspended(ChannelEvent.suspended);

    private final ChannelEvent event;

    ChannelState(ChannelEvent channelEvent) {
        this.event = channelEvent;
    }

    public ChannelEvent getChannelEvent() {
        return this.event;
    }

    public boolean isReattachable() {
        if (this != attaching && this != attached && this != suspended) {
            return false;
        }
        return true;
    }
}
