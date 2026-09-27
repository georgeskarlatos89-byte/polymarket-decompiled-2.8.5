package io.radar.sdk.model;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0011"}, d2 = {"Lio/radar/sdk/model/RadarChain;", "", RadarChain.FIELD_SLUG, "", "name", "externalId", "metadata", "Lorg/json/JSONObject;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "getExternalId", "()Ljava/lang/String;", "getMetadata", "()Lorg/json/JSONObject;", "getName", "getSlug", "toJson", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarChain {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_EXTERNAL_ID = "externalId";
    private static final String FIELD_METADATA = "metadata";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_SLUG = "slug";
    private final String externalId;
    private final JSONObject metadata;
    private final String name;
    private final String slug;

    public RadarChain(String str, String str2, String str3, JSONObject jSONObject) {
        str.getClass();
        str2.getClass();
        this.slug = str;
        this.name = str2;
        this.externalId = str3;
        this.metadata = jSONObject;
    }

    public static final RadarChain fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final JSONObject getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(FIELD_SLUG, this.slug);
        jSONObject.putOpt("name", this.name);
        jSONObject.putOpt("externalId", this.externalId);
        jSONObject.putOpt("metadata", this.metadata);
        return jSONObject;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\rJ\u0014\u0010\b\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u001f\u0010\u0010\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lio/radar/sdk/model/RadarChain$Companion;", "", "()V", "FIELD_EXTERNAL_ID", "", "FIELD_METADATA", "FIELD_NAME", "FIELD_SLUG", "fromJson", "", "Lio/radar/sdk/model/RadarChain;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarChain;", "obj", "Lorg/json/JSONObject;", "toJson", "chains", "([Lio/radar/sdk/model/RadarChain;)Lorg/json/JSONArray;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RadarChain fromJson(JSONObject obj) {
            String str = null;
            if (obj == null) {
                return null;
            }
            String optString = obj.optString(RadarChain.FIELD_SLUG);
            String str2 = "";
            if (optString == null) {
                optString = "";
            }
            String optString2 = obj.optString("name");
            if (optString2 != null) {
                str2 = optString2;
            }
            String optString3 = obj.optString("externalId");
            if (optString3 != null) {
                str = optString3;
            }
            return new RadarChain(optString, str2, str, obj.optJSONObject("metadata"));
        }

        public final JSONArray toJson(RadarChain[] chains) {
            if (chains == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarChain radarChain : chains) {
                jSONArray.put(radarChain.toJson());
            }
            return jSONArray;
        }

        private Companion() {
        }

        public final RadarChain[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarChain[] radarChainArr = new RadarChain[length];
            for (int i = 0; i < length; i++) {
                radarChainArr[i] = RadarChain.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarChain[]) ArraysKt.filterNotNull(radarChainArr).toArray(new RadarChain[0]);
        }
    }

    public static final RadarChain[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    public static final JSONArray toJson(RadarChain[] radarChainArr) {
        return INSTANCE.toJson(radarChainArr);
    }
}
