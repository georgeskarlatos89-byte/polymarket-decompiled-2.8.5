package io.ably.lib.objects.type.map;

import io.ably.lib.objects.type.ObjectUpdate;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class LiveMapUpdate extends ObjectUpdate {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public enum Change {
        UPDATED,
        REMOVED
    }

    public LiveMapUpdate() {
        super(null);
    }

    public Map<String, Change> getUpdate() {
        return (Map) this.update;
    }

    public String toString() {
        if (this.update == null) {
            return "LiveMapUpdate{no change}";
        }
        return "LiveMapUpdate{changes=" + getUpdate() + "}";
    }

    public LiveMapUpdate(Map<String, Change> map) {
        super(map);
    }
}
