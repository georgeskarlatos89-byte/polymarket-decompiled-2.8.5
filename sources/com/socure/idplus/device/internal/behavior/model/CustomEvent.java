package com.socure.idplus.device.internal.behavior.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011¨\u0006#"}, d2 = {"Lcom/socure/idplus/device/internal/behavior/model/CustomEvent;", "", "", "clientTime", "", "eventName", "eventKey", "", "properties", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/Map;", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/socure/idplus/device/internal/behavior/model/CustomEvent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getClientTime", "Ljava/lang/String;", "getEventName", "getEventKey", "Ljava/util/Map;", "getProperties", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CustomEvent {

    @SerializedName("clientTime")
    private final long clientTime;

    @SerializedName("eventKey")
    private final String eventKey;

    @SerializedName("eventName")
    private final String eventName;

    @SerializedName("properties")
    private final Map<String, String> properties;

    public CustomEvent(long j, String str, String str2, Map<String, String> map) {
        str.getClass();
        this.clientTime = j;
        this.eventName = str;
        this.eventKey = str2;
        this.properties = map;
    }

    public static /* synthetic */ CustomEvent copy$default(CustomEvent customEvent, long j, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            j = customEvent.clientTime;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = customEvent.eventName;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = customEvent.eventKey;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            map = customEvent.properties;
        }
        return customEvent.copy(j2, str3, str4, map);
    }

    /* renamed from: component1, reason: from getter */
    public final long getClientTime() {
        return this.clientTime;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEventKey() {
        return this.eventKey;
    }

    public final Map<String, String> component4() {
        return this.properties;
    }

    public final CustomEvent copy(long clientTime, String eventName, String eventKey, Map<String, String> properties) {
        eventName.getClass();
        return new CustomEvent(clientTime, eventName, eventKey, properties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomEvent)) {
            return false;
        }
        CustomEvent customEvent = (CustomEvent) other;
        if (this.clientTime == customEvent.clientTime && Intrinsics.areEqual(this.eventName, customEvent.eventName) && Intrinsics.areEqual(this.eventKey, customEvent.eventKey) && Intrinsics.areEqual(this.properties, customEvent.properties)) {
            return true;
        }
        return false;
    }

    public long getClientTime() {
        return this.clientTime;
    }

    public final String getEventKey() {
        return this.eventKey;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Map<String, String> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        int hashCode;
        int a = a.a(this.eventName, Long.hashCode(this.clientTime) * 31, 31);
        String str = this.eventKey;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        Map<String, String> map = this.properties;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "CustomEvent(clientTime=" + this.clientTime + ", eventName=" + this.eventName + ", eventKey=" + this.eventKey + ", properties=" + this.properties + ")";
    }
}
