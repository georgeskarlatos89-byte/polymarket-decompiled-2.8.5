package io.ably.lib.objects;

import io.ably.lib.objects.state.ObjectsStateChange;
import io.ably.lib.objects.type.counter.LiveCounter;
import io.ably.lib.objects.type.map.LiveMap;
import io.ably.lib.objects.type.map.LiveMapValue;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface RealtimeObjects extends ObjectsStateChange {
    LiveCounter createCounter();

    LiveCounter createCounter(Number number);

    void createCounterAsync(ObjectsCallback<LiveCounter> objectsCallback);

    void createCounterAsync(Number number, ObjectsCallback<LiveCounter> objectsCallback);

    LiveMap createMap();

    LiveMap createMap(Map<String, LiveMapValue> map);

    void createMapAsync(ObjectsCallback<LiveMap> objectsCallback);

    void createMapAsync(Map<String, LiveMapValue> map, ObjectsCallback<LiveMap> objectsCallback);

    LiveMap getRoot();

    void getRootAsync(ObjectsCallback<LiveMap> objectsCallback);
}
