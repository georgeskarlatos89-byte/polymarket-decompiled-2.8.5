package io.radar.sdk.model;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.dmk;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 $2\u00020\u0001:\u0001$B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u0006\u0010#\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013¨\u0006%"}, d2 = {"Lio/radar/sdk/model/RadarGeofence;", "", RadarGeofence.FIELD_ID, "", RadarGeofence.FIELD_DESCRIPTION, RadarGeofence.FIELD_TAG, "externalId", "metadata", "Lorg/json/JSONObject;", RadarGeofence.FIELD_OPERATING_HOURS, "Lio/radar/sdk/model/RadarOperatingHours;", RadarGeofence.FIELD_GEOMETRY, "Lio/radar/sdk/model/RadarGeofenceGeometry;", RadarGeofence.FIELD_DWELL_THRESHOLD, "", RadarGeofence.FIELD_STOP_DETECTION, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lio/radar/sdk/model/RadarOperatingHours;Lio/radar/sdk/model/RadarGeofenceGeometry;Ljava/lang/Double;Ljava/lang/Boolean;)V", "get_id", "()Ljava/lang/String;", "getDescription", "getDwellThreshold", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getExternalId", "getGeometry", "()Lio/radar/sdk/model/RadarGeofenceGeometry;", "getMetadata", "()Lorg/json/JSONObject;", "getOperatingHours", "()Lio/radar/sdk/model/RadarOperatingHours;", "getStopDetection", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTag", "toJson", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarGeofence {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_COORDINATES = "coordinates";
    private static final String FIELD_DESCRIPTION = "description";
    private static final String FIELD_DWELL_THRESHOLD = "dwellThreshold";
    private static final String FIELD_EXTERNAL_ID = "externalId";
    private static final String FIELD_GEOMETRY = "geometry";
    private static final String FIELD_GEOMETRY_CENTER = "geometryCenter";
    private static final String FIELD_GEOMETRY_RADIUS = "geometryRadius";
    private static final String FIELD_ID = "_id";
    private static final String FIELD_METADATA = "metadata";
    private static final String FIELD_OPERATING_HOURS = "operatingHours";
    private static final String FIELD_STOP_DETECTION = "stopDetection";
    private static final String FIELD_TAG = "tag";
    private static final String FIELD_TYPE = "type";
    private static final String TYPE_CIRCLE = "circle";
    private static final String TYPE_GEOMETRY_CIRCLE = "Circle";
    private static final String TYPE_GEOMETRY_POLYGON = "Polygon";
    private static final String TYPE_ISOCHRONE = "isochrone";
    private static final String TYPE_POLYGON = "polygon";
    private final String _id;
    private final String description;
    private final Double dwellThreshold;
    private final String externalId;
    private final RadarGeofenceGeometry geometry;
    private final JSONObject metadata;
    private final RadarOperatingHours operatingHours;
    private final Boolean stopDetection;
    private final String tag;

    public RadarGeofence(String str, String str2, String str3, String str4, JSONObject jSONObject, RadarOperatingHours radarOperatingHours, RadarGeofenceGeometry radarGeofenceGeometry, Double d, Boolean bool) {
        str.getClass();
        str2.getClass();
        this._id = str;
        this.description = str2;
        this.tag = str3;
        this.externalId = str4;
        this.metadata = jSONObject;
        this.operatingHours = radarOperatingHours;
        this.geometry = radarGeofenceGeometry;
        this.dwellThreshold = d;
        this.stopDetection = bool;
    }

    public static final RadarGeofence fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Double getDwellThreshold() {
        return this.dwellThreshold;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final RadarGeofenceGeometry getGeometry() {
        return this.geometry;
    }

    public final JSONObject getMetadata() {
        return this.metadata;
    }

    public final RadarOperatingHours getOperatingHours() {
        return this.operatingHours;
    }

    public final Boolean getStopDetection() {
        return this.stopDetection;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String get_id() {
        return this._id;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(FIELD_ID, this._id);
        jSONObject2.putOpt(FIELD_TAG, this.tag);
        jSONObject2.putOpt("externalId", this.externalId);
        jSONObject2.putOpt(FIELD_DESCRIPTION, this.description);
        jSONObject2.putOpt("metadata", this.metadata);
        RadarOperatingHours radarOperatingHours = this.operatingHours;
        if (radarOperatingHours == null || (jSONObject = radarOperatingHours.toJson()) == null) {
            jSONObject = null;
        }
        jSONObject2.putOpt(FIELD_OPERATING_HOURS, jSONObject);
        RadarGeofenceGeometry radarGeofenceGeometry = this.geometry;
        if (radarGeofenceGeometry != null) {
            if (radarGeofenceGeometry instanceof RadarCircleGeometry) {
                RadarCircleGeometry radarCircleGeometry = (RadarCircleGeometry) radarGeofenceGeometry;
                jSONObject2.putOpt(FIELD_GEOMETRY_CENTER, radarCircleGeometry.getCenter().toJson());
                jSONObject2.putOpt(FIELD_GEOMETRY_RADIUS, Double.valueOf(radarCircleGeometry.getRadius()));
                jSONObject2.putOpt("type", TYPE_GEOMETRY_CIRCLE);
            } else if (radarGeofenceGeometry instanceof RadarPolygonGeometry) {
                RadarPolygonGeometry radarPolygonGeometry = (RadarPolygonGeometry) radarGeofenceGeometry;
                jSONObject2.putOpt(FIELD_GEOMETRY_CENTER, radarPolygonGeometry.getCenter().toJson());
                jSONObject2.putOpt(FIELD_GEOMETRY_RADIUS, Double.valueOf(radarPolygonGeometry.getRadius()));
                if (radarPolygonGeometry.getCoordinates() != null) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(Companion.access$toJson(INSTANCE, radarPolygonGeometry.getCoordinates()));
                    jSONObject2.putOpt(FIELD_COORDINATES, jSONArray);
                }
                jSONObject2.putOpt("type", TYPE_GEOMETRY_POLYGON);
            } else {
                dmk.a();
                return null;
            }
        }
        Double d = this.dwellThreshold;
        if (d != null) {
            jSONObject2.put(FIELD_DWELL_THRESHOLD, d.doubleValue());
        }
        Boolean bool = this.stopDetection;
        if (bool != null) {
            jSONObject2.put(FIELD_STOP_DETECTION, bool.booleanValue());
        }
        return jSONObject2;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0017H\u0003¢\u0006\u0002\u0010!J\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010#R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lio/radar/sdk/model/RadarGeofence$Companion;", "", "()V", "FIELD_COORDINATES", "", "FIELD_DESCRIPTION", "FIELD_DWELL_THRESHOLD", "FIELD_EXTERNAL_ID", "FIELD_GEOMETRY", "FIELD_GEOMETRY_CENTER", "FIELD_GEOMETRY_RADIUS", "FIELD_ID", "FIELD_METADATA", "FIELD_OPERATING_HOURS", "FIELD_STOP_DETECTION", "FIELD_TAG", "FIELD_TYPE", "TYPE_CIRCLE", "TYPE_GEOMETRY_CIRCLE", "TYPE_GEOMETRY_POLYGON", "TYPE_ISOCHRONE", "TYPE_POLYGON", "fromJson", "", "Lio/radar/sdk/model/RadarGeofence;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarGeofence;", "obj", "Lorg/json/JSONObject;", "toJson", RadarGeofence.FIELD_COORDINATES, "Lio/radar/sdk/model/RadarCoordinate;", "([Lio/radar/sdk/model/RadarCoordinate;)Lorg/json/JSONArray;", "geofences", "([Lio/radar/sdk/model/RadarGeofence;)Lorg/json/JSONArray;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ JSONArray access$toJson(Companion companion, RadarCoordinate[] radarCoordinateArr) {
            return companion.toJson(radarCoordinateArr);
        }

        private final JSONArray toJson(RadarCoordinate[] coordinates) {
            if (coordinates == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarCoordinate radarCoordinate : coordinates) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(radarCoordinate.getLongitude());
                jSONArray2.put(radarCoordinate.getLatitude());
                jSONArray.put(jSONArray2);
            }
            return jSONArray;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final RadarGeofence fromJson(JSONObject obj) {
            String str;
            String str2;
            String str3;
            String str4;
            JSONObject jSONObject;
            RadarOperatingHours radarOperatingHours;
            RadarCoordinate radarCoordinate;
            String str5;
            String str6;
            String str7;
            String str8;
            RadarGeofenceGeometry radarGeofenceGeometry;
            RadarGeofenceGeometry radarGeofenceGeometry2;
            Double d;
            Boolean bool;
            JSONArray jSONArray;
            JSONArray jSONArray2;
            String str9;
            String str10;
            String str11;
            String str12;
            boolean z;
            RadarCoordinate radarCoordinate2;
            JSONArray optJSONArray;
            if (obj == null) {
                return null;
            }
            String optString = obj.optString(RadarGeofence.FIELD_ID);
            if (optString == null) {
                str = "";
            } else {
                str = optString;
            }
            String optString2 = obj.optString(RadarGeofence.FIELD_DESCRIPTION);
            if (optString2 == null) {
                str2 = "";
            } else {
                str2 = optString2;
            }
            String optString3 = obj.optString(RadarGeofence.FIELD_TAG);
            if (optString3 == null) {
                str3 = null;
            } else {
                str3 = optString3;
            }
            String optString4 = obj.optString("externalId");
            if (optString4 == null) {
                str4 = null;
            } else {
                str4 = optString4;
            }
            JSONObject optJSONObject = obj.optJSONObject("metadata");
            if (optJSONObject == null) {
                jSONObject = null;
            } else {
                jSONObject = optJSONObject;
            }
            JSONObject optJSONObject2 = obj.optJSONObject(RadarGeofence.FIELD_OPERATING_HOURS);
            if (optJSONObject2 != null) {
                radarOperatingHours = RadarOperatingHours.INSTANCE.fromJson(optJSONObject2);
            } else {
                radarOperatingHours = null;
            }
            JSONObject optJSONObject3 = obj.optJSONObject(RadarGeofence.FIELD_GEOMETRY_CENTER);
            int i = 1;
            if (optJSONObject3 != null && (optJSONArray = optJSONObject3.optJSONArray(RadarGeofence.FIELD_COORDINATES)) != null) {
                radarCoordinate = new RadarCoordinate(optJSONArray.optDouble(1), optJSONArray.optDouble(0));
            } else {
                radarCoordinate = new RadarCoordinate(ConstantsKt.UNSET, ConstantsKt.UNSET);
            }
            double optDouble = obj.optDouble(RadarGeofence.FIELD_GEOMETRY_RADIUS);
            String optString5 = obj.optString("type");
            if (optString5 != null) {
                int hashCode = optString5.hashCode();
                if (hashCode != -1360216880) {
                    if (hashCode == -397519558 ? optString5.equals(RadarGeofence.TYPE_POLYGON) : hashCode == 418067294 && optString5.equals(RadarGeofence.TYPE_ISOCHRONE)) {
                        JSONObject optJSONObject4 = obj.optJSONObject(RadarGeofence.FIELD_GEOMETRY);
                        if (optJSONObject4 != null) {
                            jSONArray = optJSONObject4.optJSONArray(RadarGeofence.FIELD_COORDINATES);
                        } else {
                            jSONArray = null;
                        }
                        if (jSONArray != null) {
                            JSONArray optJSONArray2 = jSONArray.optJSONArray(0);
                            if (optJSONArray2 != null) {
                                int length = optJSONArray2.length();
                                RadarCoordinate[] radarCoordinateArr = new RadarCoordinate[length];
                                int i2 = 0;
                                while (i2 < length) {
                                    JSONArray optJSONArray3 = optJSONArray2.optJSONArray(i2);
                                    if (optJSONArray3 != null) {
                                        jSONArray2 = optJSONArray2;
                                        str9 = str;
                                        str10 = str2;
                                        double optDouble2 = optJSONArray3.optDouble(i);
                                        str11 = str3;
                                        str12 = str4;
                                        z = false;
                                        radarCoordinate2 = new RadarCoordinate(optDouble2, optJSONArray3.optDouble(0));
                                    } else {
                                        jSONArray2 = optJSONArray2;
                                        str9 = str;
                                        str10 = str2;
                                        str11 = str3;
                                        str12 = str4;
                                        z = false;
                                        radarCoordinate2 = new RadarCoordinate(ConstantsKt.UNSET, ConstantsKt.UNSET);
                                    }
                                    int i3 = i2;
                                    radarCoordinateArr[i3] = radarCoordinate2;
                                    i2 = i3 + 1;
                                    str3 = str11;
                                    optJSONArray2 = jSONArray2;
                                    str = str9;
                                    str2 = str10;
                                    str4 = str12;
                                    i = 1;
                                }
                                str5 = str;
                                str6 = str2;
                                str7 = str3;
                                str8 = str4;
                                radarGeofenceGeometry2 = new RadarPolygonGeometry(radarCoordinateArr, radarCoordinate, optDouble);
                            } else {
                                str5 = str;
                                str6 = str2;
                                str7 = str3;
                                str8 = str4;
                                radarGeofenceGeometry2 = null;
                            }
                            radarGeofenceGeometry = null;
                        } else {
                            str5 = str;
                            str6 = str2;
                            str7 = str3;
                            str8 = str4;
                            radarGeofenceGeometry = null;
                            radarGeofenceGeometry2 = new RadarPolygonGeometry(null, radarCoordinate, optDouble);
                        }
                    }
                } else {
                    str5 = str;
                    str6 = str2;
                    str7 = str3;
                    str8 = str4;
                    radarGeofenceGeometry = null;
                    if (optString5.equals(RadarGeofence.TYPE_CIRCLE)) {
                        radarGeofenceGeometry2 = new RadarCircleGeometry(radarCoordinate, optDouble);
                    }
                    radarGeofenceGeometry2 = radarGeofenceGeometry;
                }
                if (radarGeofenceGeometry2 == null) {
                    radarGeofenceGeometry2 = new RadarCircleGeometry(new RadarCoordinate(ConstantsKt.UNSET, ConstantsKt.UNSET), ConstantsKt.UNSET);
                }
                RadarGeofenceGeometry radarGeofenceGeometry3 = radarGeofenceGeometry2;
                if (!obj.has(RadarGeofence.FIELD_DWELL_THRESHOLD) && !obj.isNull(RadarGeofence.FIELD_DWELL_THRESHOLD)) {
                    d = Double.valueOf(obj.optDouble(RadarGeofence.FIELD_DWELL_THRESHOLD));
                } else {
                    d = radarGeofenceGeometry;
                }
                if (!obj.has(RadarGeofence.FIELD_STOP_DETECTION) && !obj.isNull(RadarGeofence.FIELD_STOP_DETECTION)) {
                    bool = Boolean.valueOf(obj.optBoolean(RadarGeofence.FIELD_STOP_DETECTION));
                } else {
                    bool = radarGeofenceGeometry;
                }
                return new RadarGeofence(str5, str6, str7, str8, jSONObject, radarOperatingHours, radarGeofenceGeometry3, d, bool);
            }
            str5 = str;
            str6 = str2;
            str7 = str3;
            str8 = str4;
            radarGeofenceGeometry = null;
            radarGeofenceGeometry2 = radarGeofenceGeometry;
            if (radarGeofenceGeometry2 == null) {
            }
            RadarGeofenceGeometry radarGeofenceGeometry32 = radarGeofenceGeometry2;
            if (!obj.has(RadarGeofence.FIELD_DWELL_THRESHOLD)) {
            }
            d = radarGeofenceGeometry;
            if (!obj.has(RadarGeofence.FIELD_STOP_DETECTION)) {
            }
            bool = radarGeofenceGeometry;
            return new RadarGeofence(str5, str6, str7, str8, jSONObject, radarOperatingHours, radarGeofenceGeometry32, d, bool);
        }

        private Companion() {
        }

        public final JSONArray toJson(RadarGeofence[] geofences) {
            if (geofences == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarGeofence radarGeofence : geofences) {
                jSONArray.put(radarGeofence.toJson());
            }
            return jSONArray;
        }

        public final RadarGeofence[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarGeofence[] radarGeofenceArr = new RadarGeofence[length];
            for (int i = 0; i < length; i++) {
                radarGeofenceArr[i] = RadarGeofence.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarGeofence[]) ArraysKt.filterNotNull(radarGeofenceArr).toArray(new RadarGeofence[0]);
        }
    }

    public static final RadarGeofence[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    public /* synthetic */ RadarGeofence(String str, String str2, String str3, String str4, JSONObject jSONObject, RadarOperatingHours radarOperatingHours, RadarGeofenceGeometry radarGeofenceGeometry, Double d, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, jSONObject, radarOperatingHours, radarGeofenceGeometry, (i & 128) != 0 ? null : d, (i & 256) != 0 ? null : bool);
    }

    public static final JSONArray toJson(RadarGeofence[] radarGeofenceArr) {
        return INSTANCE.toJson(radarGeofenceArr);
    }

    private static final JSONArray toJson(RadarCoordinate[] radarCoordinateArr) {
        return Companion.access$toJson(INSTANCE, radarCoordinateArr);
    }
}
