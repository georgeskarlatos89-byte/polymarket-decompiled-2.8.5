package io.ably.lib.realtime;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public enum ConnectionState {
    initialized(ConnectionEvent.initialized),
    connecting(ConnectionEvent.connecting),
    connected(ConnectionEvent.connected),
    disconnected(ConnectionEvent.disconnected),
    suspended(ConnectionEvent.suspended),
    closing(ConnectionEvent.closing),
    closed(ConnectionEvent.closed),
    failed(ConnectionEvent.failed);

    private final ConnectionEvent event;

    ConnectionState(ConnectionEvent connectionEvent) {
        this.event = connectionEvent;
    }

    public ConnectionEvent getConnectionEvent() {
        return this.event;
    }
}
