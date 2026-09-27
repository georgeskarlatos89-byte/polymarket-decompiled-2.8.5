package io.radar.sdk.model;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\f"}, d2 = {"Lio/radar/sdk/model/RadarSegment;", "", RadarSegment.FIELD_DESCRIPTION, "", "externalId", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getExternalId", "toJson", "Lorg/json/JSONObject;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarSegment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_DESCRIPTION = "description";
    private static final String FIELD_EXTERNAL_ID = "externalId";
    private final String description;
    private final String externalId;

    public RadarSegment(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.description = str;
        this.externalId = str2;
    }

    public static final RadarSegment fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(FIELD_DESCRIPTION, this.description);
        jSONObject.putOpt("externalId", this.externalId);
        return jSONObject;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0006\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u001f\u0010\u000e\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lio/radar/sdk/model/RadarSegment$Companion;", "", "()V", "FIELD_DESCRIPTION", "", "FIELD_EXTERNAL_ID", "fromJson", "", "Lio/radar/sdk/model/RadarSegment;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarSegment;", "obj", "Lorg/json/JSONObject;", "toJson", "segments", "([Lio/radar/sdk/model/RadarSegment;)Lorg/json/JSONArray;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RadarSegment[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarSegment[] radarSegmentArr = new RadarSegment[length];
            for (int i = 0; i < length; i++) {
                radarSegmentArr[i] = RadarSegment.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarSegment[]) ArraysKt.filterNotNull(radarSegmentArr).toArray(new RadarSegment[0]);
        }

        public final JSONArray toJson(RadarSegment[] segments) {
            if (segments == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarSegment radarSegment : segments) {
                jSONArray.put(radarSegment.toJson());
            }
            return jSONArray;
        }

        private Companion() {
        }

        public final RadarSegment fromJson(JSONObject obj) {
            if (obj == null) {
                return null;
            }
            String optString = obj.optString(RadarSegment.FIELD_DESCRIPTION);
            if (optString == null) {
                optString = "";
            }
            String optString2 = obj.optString("externalId");
            return new RadarSegment(optString, optString2 != null ? optString2 : "");
        }
    }

    public static final RadarSegment[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    public static final JSONArray toJson(RadarSegment[] radarSegmentArr) {
        return INSTANCE.toJson(radarSegmentArr);
    }
}
