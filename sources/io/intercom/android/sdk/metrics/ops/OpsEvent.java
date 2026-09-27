package io.intercom.android.sdk.metrics.ops;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class OpsEvent {
    private final String eventType;
    private final String name;
    private final long timestamp;

    public OpsEvent(String str, String str2, long j) {
        this.eventType = str;
        this.name = str2;
        this.timestamp = j;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getName() {
        return this.name;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
