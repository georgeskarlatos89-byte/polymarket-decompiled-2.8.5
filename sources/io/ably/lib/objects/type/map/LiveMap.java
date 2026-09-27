package io.ably.lib.objects.type.map;

import io.ably.lib.objects.ObjectsCallback;
import io.ably.lib.objects.type.ObjectLifecycleChange;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface LiveMap extends LiveMapChange, ObjectLifecycleChange {
    Iterable<Map.Entry<String, LiveMapValue>> entries();

    LiveMapValue get(String str);

    Iterable<String> keys();

    void remove(String str);

    void removeAsync(String str, ObjectsCallback<Void> objectsCallback);

    void set(String str, LiveMapValue liveMapValue);

    void setAsync(String str, LiveMapValue liveMapValue, ObjectsCallback<Void> objectsCallback);

    Long size();

    Iterable<LiveMapValue> values();
}
