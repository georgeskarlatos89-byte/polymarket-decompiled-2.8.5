package io.radar.sdk.model;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\f"}, d2 = {"Lio/radar/sdk/model/RadarCoordinate;", "", "latitude", "", "longitude", "(DD)V", "getLatitude", "()D", "getLongitude", "toJson", "Lorg/json/JSONObject;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarCoordinate {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_COORDINATES = "coordinates";
    private static final String FIELD_TYPE = "type";
    private final double latitude;
    private final double longitude;

    public RadarCoordinate(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public static final RadarCoordinate fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("type", "Point");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.longitude);
        jSONArray.put(this.latitude);
        jSONObject.putOpt(FIELD_COORDINATES, jSONArray);
        return jSONObject;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0006\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/model/RadarCoordinate$Companion;", "", "()V", "FIELD_COORDINATES", "", "FIELD_TYPE", "fromJson", "", "Lio/radar/sdk/model/RadarCoordinate;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarCoordinate;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RadarCoordinate[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarCoordinate[] radarCoordinateArr = new RadarCoordinate[length];
            for (int i = 0; i < length; i++) {
                radarCoordinateArr[i] = RadarCoordinate.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarCoordinate[]) ArraysKt.filterNotNull(radarCoordinateArr).toArray(new RadarCoordinate[0]);
        }

        private Companion() {
        }

        public final RadarCoordinate fromJson(JSONObject obj) {
            if (obj == null) {
                return null;
            }
            JSONArray optJSONArray = obj.optJSONArray(RadarCoordinate.FIELD_COORDINATES);
            double d = ConstantsKt.UNSET;
            double optDouble = optJSONArray != null ? optJSONArray.optDouble(0) : 0.0d;
            if (optJSONArray != null) {
                d = optJSONArray.optDouble(1);
            }
            return new RadarCoordinate(d, optDouble);
        }
    }

    public static final RadarCoordinate[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }
}
