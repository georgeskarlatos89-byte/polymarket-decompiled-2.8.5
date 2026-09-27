package io.ably.lib.objects.type;

import io.ably.lib.objects.ObjectsSubscription;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface ObjectLifecycleChange {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @FunctionalInterface
    /* loaded from: classes5.dex */
    public interface Listener {
        void onLifecycleEvent(ObjectLifecycleEvent objectLifecycleEvent);
    }

    void off(Listener listener);

    void offAll();

    ObjectsSubscription on(ObjectLifecycleEvent objectLifecycleEvent, Listener listener);
}
