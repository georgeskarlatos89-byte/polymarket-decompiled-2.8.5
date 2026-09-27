package io.radar.sdk.model;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001+B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003J\u000e\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0003J\u0006\u0010*\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014¨\u0006,"}, d2 = {"Lio/radar/sdk/model/RadarPlace;", "", RadarPlace.FIELD_ID, "", "name", RadarPlace.FIELD_CATEGORIES, "", RadarPlace.FIELD_CHAIN, "Lio/radar/sdk/model/RadarChain;", RadarPlace.FIELD_LOCATION, "Lio/radar/sdk/model/RadarCoordinate;", RadarPlace.FIELD_GROUP, "metadata", "Lorg/json/JSONObject;", "address", "Lio/radar/sdk/model/RadarAddress;", RadarPlace.FIELD_GEOMETRY_RADIUS, "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lio/radar/sdk/model/RadarChain;Lio/radar/sdk/model/RadarCoordinate;Ljava/lang/String;Lorg/json/JSONObject;Lio/radar/sdk/model/RadarAddress;Ljava/lang/Double;)V", "get_id", "()Ljava/lang/String;", "getAddress", "()Lio/radar/sdk/model/RadarAddress;", "getCategories", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getChain", "()Lio/radar/sdk/model/RadarChain;", "getGeometryRadius", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGroup", "getLocation", "()Lio/radar/sdk/model/RadarCoordinate;", "getMetadata", "()Lorg/json/JSONObject;", "getName", "hasCategory", "", "category", "isChain", "slug", "toJson", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarPlace {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_ADDRESS = "address";
    private static final String FIELD_CATEGORIES = "categories";
    private static final String FIELD_CHAIN = "chain";
    private static final String FIELD_COORDINATES = "coordinates";
    private static final String FIELD_GEOMETRY_RADIUS = "geometryRadius";
    private static final String FIELD_GROUP = "group";
    private static final String FIELD_ID = "_id";
    private static final String FIELD_LOCATION = "location";
    private static final String FIELD_METADATA = "metadata";
    private static final String FIELD_NAME = "name";
    private final String _id;
    private final RadarAddress address;
    private final String[] categories;
    private final RadarChain chain;
    private final Double geometryRadius;
    private final String group;
    private final RadarCoordinate location;
    private final JSONObject metadata;
    private final String name;

    public RadarPlace(String str, String str2, String[] strArr, RadarChain radarChain, RadarCoordinate radarCoordinate, String str3, JSONObject jSONObject, RadarAddress radarAddress, Double d) {
        str.getClass();
        str2.getClass();
        strArr.getClass();
        radarCoordinate.getClass();
        this._id = str;
        this.name = str2;
        this.categories = strArr;
        this.chain = radarChain;
        this.location = radarCoordinate;
        this.group = str3;
        this.metadata = jSONObject;
        this.address = radarAddress;
        this.geometryRadius = d;
    }

    public static final RadarPlace fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public final RadarAddress getAddress() {
        return this.address;
    }

    public final String[] getCategories() {
        return this.categories;
    }

    public final RadarChain getChain() {
        return this.chain;
    }

    public final Double getGeometryRadius() {
        return this.geometryRadius;
    }

    public final String getGroup() {
        return this.group;
    }

    public final RadarCoordinate getLocation() {
        return this.location;
    }

    public final JSONObject getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final String get_id() {
        return this._id;
    }

    public final boolean hasCategory(String category) {
        category.getClass();
        return ArraysKt.i(category, this.categories);
    }

    public final boolean isChain(String slug) {
        String str;
        slug.getClass();
        RadarChain radarChain = this.chain;
        if (radarChain != null) {
            str = radarChain.getSlug();
        } else {
            str = null;
        }
        return Intrinsics.areEqual(str, slug);
    }

    public final JSONObject toJson() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(FIELD_ID, this._id);
        jSONObject2.putOpt("name", this.name);
        JSONArray jSONArray = new JSONArray();
        for (String str : this.categories) {
            jSONArray.put(str);
        }
        jSONObject2.putOpt(FIELD_CATEGORIES, jSONArray);
        RadarChain radarChain = this.chain;
        JSONObject jSONObject3 = null;
        if (radarChain != null) {
            jSONObject = radarChain.toJson();
        } else {
            jSONObject = null;
        }
        jSONObject2.putOpt(FIELD_CHAIN, jSONObject);
        jSONObject2.putOpt(FIELD_GROUP, this.group);
        jSONObject2.putOpt("metadata", this.metadata);
        jSONObject2.putOpt(FIELD_LOCATION, this.location.toJson());
        RadarAddress radarAddress = this.address;
        if (radarAddress != null) {
            jSONObject3 = radarAddress.toJson();
        }
        jSONObject2.putOpt("address", jSONObject3);
        jSONObject2.putOpt(FIELD_GEOMETRY_RADIUS, this.geometryRadius);
        return jSONObject2;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lio/radar/sdk/model/RadarPlace$Companion;", "", "()V", "FIELD_ADDRESS", "", "FIELD_CATEGORIES", "FIELD_CHAIN", "FIELD_COORDINATES", "FIELD_GEOMETRY_RADIUS", "FIELD_GROUP", "FIELD_ID", "FIELD_LOCATION", "FIELD_METADATA", "FIELD_NAME", "fromJson", "", "Lio/radar/sdk/model/RadarPlace;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarPlace;", "obj", "Lorg/json/JSONObject;", "toJson", "places", "([Lio/radar/sdk/model/RadarPlace;)Lorg/json/JSONArray;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RadarPlace fromJson(JSONObject obj) {
            String str;
            String str2;
            String[] strArr;
            JSONArray jSONArray;
            double d;
            String str3;
            JSONObject jSONObject;
            RadarAddress radarAddress;
            Double d2 = null;
            if (obj == null) {
                return null;
            }
            String optString = obj.optString(RadarPlace.FIELD_ID);
            if (optString == null) {
                str = "";
            } else {
                str = optString;
            }
            String optString2 = obj.optString("name");
            if (optString2 == null) {
                str2 = "";
            } else {
                str2 = optString2;
            }
            JSONArray optJSONArray = obj.optJSONArray(RadarPlace.FIELD_CATEGORIES);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    String optString3 = optJSONArray.optString(i);
                    optString3.getClass();
                    strArr[i] = optString3;
                }
            } else {
                strArr = new String[0];
            }
            RadarChain fromJson = RadarChain.INSTANCE.fromJson(obj.optJSONObject(RadarPlace.FIELD_CHAIN));
            JSONObject optJSONObject = obj.optJSONObject(RadarPlace.FIELD_LOCATION);
            if (optJSONObject != null) {
                jSONArray = optJSONObject.optJSONArray(RadarPlace.FIELD_COORDINATES);
            } else {
                jSONArray = null;
            }
            double d3 = ConstantsKt.UNSET;
            if (jSONArray != null) {
                d = jSONArray.optDouble(1);
            } else {
                d = 0.0d;
            }
            if (jSONArray != null) {
                d3 = jSONArray.optDouble(0);
            }
            RadarCoordinate radarCoordinate = new RadarCoordinate(d, d3);
            String optString4 = obj.optString(RadarPlace.FIELD_GROUP);
            if (optString4 == null) {
                str3 = null;
            } else {
                str3 = optString4;
            }
            JSONObject optJSONObject2 = obj.optJSONObject("metadata");
            if (optJSONObject2 == null) {
                jSONObject = null;
            } else {
                jSONObject = optJSONObject2;
            }
            obj.optJSONObject("address");
            JSONObject optJSONObject3 = obj.optJSONObject("address");
            if (optJSONObject3 != null) {
                radarAddress = RadarAddress.INSTANCE.fromJson(optJSONObject3);
            } else {
                radarAddress = null;
            }
            if (obj.has(RadarPlace.FIELD_GEOMETRY_RADIUS)) {
                d2 = Double.valueOf(obj.optDouble(RadarPlace.FIELD_GEOMETRY_RADIUS));
            }
            return new RadarPlace(str, str2, strArr, fromJson, radarCoordinate, str3, jSONObject, radarAddress, d2);
        }

        public final JSONArray toJson(RadarPlace[] places) {
            if (places == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarPlace radarPlace : places) {
                jSONArray.put(radarPlace.toJson());
            }
            return jSONArray;
        }

        private Companion() {
        }

        public final RadarPlace[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarPlace[] radarPlaceArr = new RadarPlace[length];
            for (int i = 0; i < length; i++) {
                radarPlaceArr[i] = RadarPlace.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarPlace[]) ArraysKt.filterNotNull(radarPlaceArr).toArray(new RadarPlace[0]);
        }
    }

    public static final RadarPlace[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    public static final JSONArray toJson(RadarPlace[] radarPlaceArr) {
        return INSTANCE.toJson(radarPlaceArr);
    }
}
