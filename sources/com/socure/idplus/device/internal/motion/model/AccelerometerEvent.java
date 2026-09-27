package com.socure.idplus.device.internal.motion.model;

import com.google.gson.annotations.SerializedName;
import defpackage.ace;
import defpackage.hdi;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010\r¨\u0006\""}, d2 = {"Lcom/socure/idplus/device/internal/motion/model/AccelerometerEvent;", "", "", "clientTime", "", "x", "y", "z", "<init>", "(JDDD)V", "component1", "()J", "component2", "()D", "component3", "component4", "copy", "(JDDD)Lcom/socure/idplus/device/internal/motion/model/AccelerometerEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getClientTime", "D", "getX", "getY", "getZ", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AccelerometerEvent {

    @SerializedName("clientTime")
    private final long clientTime;

    @SerializedName("x")
    private final double x;

    @SerializedName("y")
    private final double y;

    @SerializedName("z")
    private final double z;

    public AccelerometerEvent(long j, double d, double d2, double d3) {
        this.clientTime = j;
        this.x = d;
        this.y = d2;
        this.z = d3;
    }

    public static /* synthetic */ AccelerometerEvent copy$default(AccelerometerEvent accelerometerEvent, long j, double d, double d2, double d3, int i, Object obj) {
        double d4;
        if ((i & 1) != 0) {
            j = accelerometerEvent.clientTime;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            d = accelerometerEvent.x;
        }
        double d5 = d;
        if ((i & 4) != 0) {
            d2 = accelerometerEvent.y;
        }
        double d6 = d2;
        if ((i & 8) != 0) {
            d4 = accelerometerEvent.z;
        } else {
            d4 = d3;
        }
        return accelerometerEvent.copy(j2, d5, d6, d4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getClientTime() {
        return this.clientTime;
    }

    /* renamed from: component2, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component3, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* renamed from: component4, reason: from getter */
    public final double getZ() {
        return this.z;
    }

    public final AccelerometerEvent copy(long clientTime, double x, double y, double z) {
        return new AccelerometerEvent(clientTime, x, y, z);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccelerometerEvent)) {
            return false;
        }
        AccelerometerEvent accelerometerEvent = (AccelerometerEvent) other;
        if (this.clientTime == accelerometerEvent.clientTime && Double.compare(this.x, accelerometerEvent.x) == 0 && Double.compare(this.y, accelerometerEvent.y) == 0 && Double.compare(this.z, accelerometerEvent.z) == 0) {
            return true;
        }
        return false;
    }

    public long getClientTime() {
        return this.clientTime;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public final double getZ() {
        return this.z;
    }

    public int hashCode() {
        return Double.hashCode(this.z) + hdi.c(hdi.c(Long.hashCode(this.clientTime) * 31, 31, this.x), 31, this.y);
    }

    public String toString() {
        long j = this.clientTime;
        double d = this.x;
        double d2 = this.y;
        double d3 = this.z;
        StringBuilder p = ace.p(j, "AccelerometerEvent(clientTime=", ", x=");
        p.append(d);
        p.append(", y=");
        p.append(d2);
        p.append(", z=");
        p.append(d3);
        p.append(")");
        return p.toString();
    }
}
