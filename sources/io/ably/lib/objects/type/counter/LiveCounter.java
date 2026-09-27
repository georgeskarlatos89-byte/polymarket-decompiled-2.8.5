package io.ably.lib.objects.type.counter;

import io.ably.lib.objects.ObjectsCallback;
import io.ably.lib.objects.type.ObjectLifecycleChange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface LiveCounter extends LiveCounterChange, ObjectLifecycleChange {
    void decrement(Number number);

    void decrementAsync(Number number, ObjectsCallback<Void> objectsCallback);

    void increment(Number number);

    void incrementAsync(Number number, ObjectsCallback<Void> objectsCallback);

    Double value();
}
