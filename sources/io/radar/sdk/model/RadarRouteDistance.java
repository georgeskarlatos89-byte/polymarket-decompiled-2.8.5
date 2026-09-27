package io.radar.sdk.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/model/RadarRouteDistance;", "", RadarRouteDistance.FIELD_VALUE, "", "text", "", "(DLjava/lang/String;)V", "getText", "()Ljava/lang/String;", "getValue", "()D", "toJson", "Lorg/json/JSONObject;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarRouteDistance {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_TEXT = "text";
    private static final String FIELD_VALUE = "value";
    private final String text;
    private final double value;

    public RadarRouteDistance(double d, String str) {
        str.getClass();
        this.value = d;
        this.text = str;
    }

    public static final RadarRouteDistance fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public final String getText() {
        return this.text;
    }

    public final double getValue() {
        return this.value;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(FIELD_VALUE, Double.valueOf(this.value));
        jSONObject.putOpt("text", this.text);
        return jSONObject;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/radar/sdk/model/RadarRouteDistance$Companion;", "", "()V", "FIELD_TEXT", "", "FIELD_VALUE", "fromJson", "Lio/radar/sdk/model/RadarRouteDistance;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RadarRouteDistance fromJson(JSONObject obj) {
            if (obj == null) {
                return null;
            }
            double optDouble = obj.optDouble(RadarRouteDistance.FIELD_VALUE);
            String optString = obj.optString("text");
            if (optString == null) {
                optString = "";
            }
            return new RadarRouteDistance(optDouble, optString);
        }

        private Companion() {
        }
    }
}
