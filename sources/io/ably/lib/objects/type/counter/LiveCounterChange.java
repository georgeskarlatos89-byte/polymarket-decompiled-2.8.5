package io.ably.lib.objects.type.counter;

import io.ably.lib.objects.ObjectsSubscription;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface LiveCounterChange {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public interface Listener {
        void onUpdated(LiveCounterUpdate liveCounterUpdate);
    }

    ObjectsSubscription subscribe(Listener listener);

    void unsubscribe(Listener listener);

    void unsubscribeAll();
}
