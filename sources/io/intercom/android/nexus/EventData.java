package io.intercom.android.nexus;

import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class EventData extends HashMap<String, Object> {
    public EventData() {
    }

    public long optLong(String str, long j) {
        Object obj = get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return j;
    }

    public String optString(String str, String str2) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return str2;
    }

    public EventData(int i) {
        super(i);
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public long optLong(String str) {
        return optLong(str, -1L);
    }
}
