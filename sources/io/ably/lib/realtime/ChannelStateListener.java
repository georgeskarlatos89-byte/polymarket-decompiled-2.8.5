package io.ably.lib.realtime;

import defpackage.hdi;
import io.ably.lib.types.ErrorInfo;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface ChannelStateListener {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class Filter implements ChannelStateListener {
        ChannelStateListener listener;
        ChannelState state;

        public Filter(ChannelState channelState, ChannelStateListener channelStateListener) {
            this.state = channelState;
            this.listener = channelStateListener;
        }

        @Override // io.ably.lib.realtime.ChannelStateListener
        public void onChannelStateChanged(ChannelStateChange channelStateChange) {
            if (channelStateChange.current == this.state) {
                this.listener.onChannelStateChanged(channelStateChange);
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class Multicaster extends io.ably.lib.util.Multicaster<ChannelStateListener> implements ChannelStateListener {
        public Multicaster() {
            super(new ChannelStateListener[0]);
        }

        @Override // io.ably.lib.realtime.ChannelStateListener
        public void onChannelStateChanged(ChannelStateChange channelStateChange) {
            Iterator<ChannelStateListener> it = getMembers().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onChannelStateChanged(channelStateChange);
                } catch (Throwable unused) {
                }
            }
        }
    }

    void onChannelStateChanged(ChannelStateChange channelStateChange);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class ChannelStateChange {
        public final ChannelState current;
        public final ChannelEvent event;
        public final ChannelState previous;
        public final ErrorInfo reason;
        public final boolean resumed;

        public ChannelStateChange(ChannelState channelState, ChannelState channelState2, ErrorInfo errorInfo, boolean z) {
            this.event = channelState.getChannelEvent();
            this.current = channelState;
            this.previous = channelState2;
            this.reason = errorInfo;
            this.resumed = z;
        }

        public static ChannelStateChange createUpdateEvent(ErrorInfo errorInfo, boolean z) {
            return new ChannelStateChange(errorInfo, z);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{event=");
            sb.append(this.event);
            sb.append(", current=");
            sb.append(this.current);
            sb.append(", previous=");
            sb.append(this.previous);
            sb.append(", reason=");
            sb.append(this.reason);
            sb.append(", resumed=");
            return hdi.t(sb, this.resumed, '}');
        }

        private ChannelStateChange(ErrorInfo errorInfo, boolean z) {
            this.event = ChannelEvent.update;
            ChannelState channelState = ChannelState.attached;
            this.previous = channelState;
            this.current = channelState;
            this.reason = errorInfo;
            this.resumed = z;
        }
    }
}
