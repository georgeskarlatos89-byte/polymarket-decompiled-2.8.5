package com.socure.idplus.device.internal.motion.model;

import com.google.gson.annotations.SerializedName;
import defpackage.ace;
import defpackage.hdi;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010\r¨\u0006\""}, d2 = {"Lcom/socure/idplus/device/internal/motion/model/OrientationEvent;", "", "", "clientTime", "", "azimuth", "pitch", "roll", "<init>", "(JDDD)V", "component1", "()J", "component2", "()D", "component3", "component4", "copy", "(JDDD)Lcom/socure/idplus/device/internal/motion/model/OrientationEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getClientTime", "D", "getAzimuth", "getPitch", "getRoll", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OrientationEvent {

    @SerializedName("azimuth")
    private final double azimuth;

    @SerializedName("clientTime")
    private final long clientTime;

    @SerializedName("pitch")
    private final double pitch;

    @SerializedName("roll")
    private final double roll;

    public OrientationEvent(long j, double d, double d2, double d3) {
        this.clientTime = j;
        this.azimuth = d;
        this.pitch = d2;
        this.roll = d3;
    }

    public static /* synthetic */ OrientationEvent copy$default(OrientationEvent orientationEvent, long j, double d, double d2, double d3, int i, Object obj) {
        double d4;
        if ((i & 1) != 0) {
            j = orientationEvent.clientTime;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            d = orientationEvent.azimuth;
        }
        double d5 = d;
        if ((i & 4) != 0) {
            d2 = orientationEvent.pitch;
        }
        double d6 = d2;
        if ((i & 8) != 0) {
            d4 = orientationEvent.roll;
        } else {
            d4 = d3;
        }
        return orientationEvent.copy(j2, d5, d6, d4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getClientTime() {
        return this.clientTime;
    }

    /* renamed from: component2, reason: from getter */
    public final double getAzimuth() {
        return this.azimuth;
    }

    /* renamed from: component3, reason: from getter */
    public final double getPitch() {
        return this.pitch;
    }

    /* renamed from: component4, reason: from getter */
    public final double getRoll() {
        return this.roll;
    }

    public final OrientationEvent copy(long clientTime, double azimuth, double pitch, double roll) {
        return new OrientationEvent(clientTime, azimuth, pitch, roll);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrientationEvent)) {
            return false;
        }
        OrientationEvent orientationEvent = (OrientationEvent) other;
        if (this.clientTime == orientationEvent.clientTime && Double.compare(this.azimuth, orientationEvent.azimuth) == 0 && Double.compare(this.pitch, orientationEvent.pitch) == 0 && Double.compare(this.roll, orientationEvent.roll) == 0) {
            return true;
        }
        return false;
    }

    public final double getAzimuth() {
        return this.azimuth;
    }

    public long getClientTime() {
        return this.clientTime;
    }

    public final double getPitch() {
        return this.pitch;
    }

    public final double getRoll() {
        return this.roll;
    }

    public int hashCode() {
        return Double.hashCode(this.roll) + hdi.c(hdi.c(Long.hashCode(this.clientTime) * 31, 31, this.azimuth), 31, this.pitch);
    }

    public String toString() {
        long j = this.clientTime;
        double d = this.azimuth;
        double d2 = this.pitch;
        double d3 = this.roll;
        StringBuilder p = ace.p(j, "OrientationEvent(clientTime=", ", azimuth=");
        p.append(d);
        p.append(", pitch=");
        p.append(d2);
        p.append(", roll=");
        p.append(d3);
        p.append(")");
        return p.toString();
    }
}
