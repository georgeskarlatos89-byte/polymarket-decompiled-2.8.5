package io.radar.sdk.model;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/radar/sdk/model/RadarCircleGeometry;", "Lio/radar/sdk/model/RadarGeofenceGeometry;", "center", "Lio/radar/sdk/model/RadarCoordinate;", "radius", "", "(Lio/radar/sdk/model/RadarCoordinate;D)V", "getCenter", "()Lio/radar/sdk/model/RadarCoordinate;", "getRadius", "()D", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarCircleGeometry extends RadarGeofenceGeometry {
    private final RadarCoordinate center;
    private final double radius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarCircleGeometry(RadarCoordinate radarCoordinate, double d) {
        super(null);
        radarCoordinate.getClass();
        this.center = radarCoordinate;
        this.radius = d;
    }

    public final RadarCoordinate getCenter() {
        return this.center;
    }

    public final double getRadius() {
        return this.radius;
    }
}
