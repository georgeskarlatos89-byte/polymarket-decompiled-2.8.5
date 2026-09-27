package io.radar.sdk.model;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.models.AttributeType;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 \"2\u00020\u0001:\b!\"#$%&'(BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010 \u001a\u00020\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u0006)"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", RadarRevealRiskToken.FIELD_RISK, "Lio/radar/sdk/model/RadarRevealRiskToken$Risk;", RadarRevealRiskToken.FIELD_NETWORK, "Lio/radar/sdk/model/RadarRevealRiskToken$Network;", RadarRevealRiskToken.FIELD_DEVICE, "Lio/radar/sdk/model/RadarRevealRiskToken$Device;", RadarRevealRiskToken.FIELD_TOKEN, RadarRevealRiskToken.FIELD_EXPIRES_AT, RadarRevealRiskToken.FIELD_EXPIRES_IN, "", "fullJson", "Lorg/json/JSONObject;", "(Ljava/lang/String;Lio/radar/sdk/model/RadarRevealRiskToken$Risk;Lio/radar/sdk/model/RadarRevealRiskToken$Network;Lio/radar/sdk/model/RadarRevealRiskToken$Device;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lorg/json/JSONObject;)V", "getDevice", "()Lio/radar/sdk/model/RadarRevealRiskToken$Device;", "getExpiresAt", "()Ljava/lang/String;", "getExpiresIn", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFullJson", "()Lorg/json/JSONObject;", "getId", "getNetwork", "()Lio/radar/sdk/model/RadarRevealRiskToken$Network;", "getRisk", "()Lio/radar/sdk/model/RadarRevealRiskToken$Risk;", "getToken", "toJson", "Asn", "Companion", "Device", "IpAddress", "Network", "Privacy", "Risk", "RiskLevel", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarRevealRiskToken {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_DEVICE = "device";
    private static final String FIELD_EXPIRES_AT = "expiresAt";
    private static final String FIELD_EXPIRES_IN = "expiresIn";
    private static final String FIELD_ID = "_id";
    private static final String FIELD_NETWORK = "network";
    private static final String FIELD_RISK = "risk";
    private static final String FIELD_TOKEN = "token";
    private final Device device;
    private final String expiresAt;
    private final Integer expiresIn;
    private final JSONObject fullJson;
    private final String id;
    private final Network network;
    private final Risk risk;
    private final String token;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b0\u0018\u0000 T2\u00020\u0001:\u0001TB¯\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010)R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u001b\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010%¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010+R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010+R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010@\u001a\u0004\bF\u0010?R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010+R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010@\u001a\u0004\bH\u0010?R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010+R\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010+R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010+R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u00108\u001a\u0004\bO\u00107R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010+R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010+R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010+R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010+¨\u0006U"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$IpAddress;", "", "ip", "", "addressLabel", "borough", "city", "confidence", "country", "countryCode", "countryFlag", "county", "distance", "", "formattedAddress", "geometry", "latitude", "longitude", PlaceTypes.NEIGHBORHOOD, AttributeType.NUMBER, "placeLabel", "postalCode", "state", "stateCode", "dma", "dmaCode", "street", "debug", "layer", "stateAllowed", "", "countryAllowed", "timeZone", "connectionType", "stateConfidence", "countryConfidence", "categories", "", "chainSlug", "ssid", "bssid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressLabel", "()Ljava/lang/String;", "getBorough", "getBssid", "getCategories", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getChainSlug", "getCity", "getConfidence", "getConnectionType", "getCountry", "getCountryAllowed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCountryCode", "getCountryConfidence", "getCountryFlag", "getCounty", "getDebug", "getDistance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDma", "getDmaCode", "getFormattedAddress", "getGeometry", "getIp", "getLatitude", "getLayer", "getLongitude", "getNeighborhood", "getNumber", "getPlaceLabel", "getPostalCode", "getSsid", "getState", "getStateAllowed", "getStateCode", "getStateConfidence", "getStreet", "getTimeZone", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class IpAddress {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String addressLabel;
        private final String borough;
        private final String bssid;
        private final String[] categories;
        private final String chainSlug;
        private final String city;
        private final String confidence;
        private final String connectionType;
        private final String country;
        private final Boolean countryAllowed;
        private final String countryCode;
        private final String countryConfidence;
        private final String countryFlag;
        private final String county;
        private final String debug;
        private final Double distance;
        private final String dma;
        private final String dmaCode;
        private final String formattedAddress;
        private final String geometry;
        private final String ip;
        private final Double latitude;
        private final String layer;
        private final Double longitude;
        private final String neighborhood;
        private final String number;
        private final String placeLabel;
        private final String postalCode;
        private final String ssid;
        private final String state;
        private final Boolean stateAllowed;
        private final String stateCode;
        private final String stateConfidence;
        private final String street;
        private final String timeZone;

        public /* synthetic */ IpAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d, String str10, String str11, Double d2, Double d3, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Boolean bool, Boolean bool2, String str23, String str24, String str25, String str26, String[] strArr, String str27, String str28, String str29, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & Barcode.FORMAT_UPC_A) != 0 ? null : d, (i & Barcode.FORMAT_UPC_E) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : d2, (i & 8192) != 0 ? null : d3, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str12, (i & 32768) != 0 ? null : str13, (i & 65536) != 0 ? null : str14, (i & 131072) != 0 ? null : str15, (i & 262144) != 0 ? null : str16, (i & 524288) != 0 ? null : str17, (i & 1048576) != 0 ? null : str18, (i & 2097152) != 0 ? null : str19, (i & 4194304) != 0 ? null : str20, (i & 8388608) != 0 ? null : str21, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str22, (i & 33554432) != 0 ? null : bool, (i & 67108864) != 0 ? null : bool2, (i & 134217728) != 0 ? null : str23, (i & 268435456) != 0 ? null : str24, (i & 536870912) != 0 ? null : str25, (i & 1073741824) != 0 ? null : str26, (i & Integer.MIN_VALUE) != 0 ? null : strArr, (i2 & 1) != 0 ? null : str27, (i2 & 2) != 0 ? null : str28, (i2 & 4) != 0 ? null : str29);
        }

        public final String getAddressLabel() {
            return this.addressLabel;
        }

        public final String getBorough() {
            return this.borough;
        }

        public final String getBssid() {
            return this.bssid;
        }

        public final String[] getCategories() {
            return this.categories;
        }

        public final String getChainSlug() {
            return this.chainSlug;
        }

        public final String getCity() {
            return this.city;
        }

        public final String getConfidence() {
            return this.confidence;
        }

        public final String getConnectionType() {
            return this.connectionType;
        }

        public final String getCountry() {
            return this.country;
        }

        public final Boolean getCountryAllowed() {
            return this.countryAllowed;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final String getCountryConfidence() {
            return this.countryConfidence;
        }

        public final String getCountryFlag() {
            return this.countryFlag;
        }

        public final String getCounty() {
            return this.county;
        }

        public final String getDebug() {
            return this.debug;
        }

        public final Double getDistance() {
            return this.distance;
        }

        public final String getDma() {
            return this.dma;
        }

        public final String getDmaCode() {
            return this.dmaCode;
        }

        public final String getFormattedAddress() {
            return this.formattedAddress;
        }

        public final String getGeometry() {
            return this.geometry;
        }

        public final String getIp() {
            return this.ip;
        }

        public final Double getLatitude() {
            return this.latitude;
        }

        public final String getLayer() {
            return this.layer;
        }

        public final Double getLongitude() {
            return this.longitude;
        }

        public final String getNeighborhood() {
            return this.neighborhood;
        }

        public final String getNumber() {
            return this.number;
        }

        public final String getPlaceLabel() {
            return this.placeLabel;
        }

        public final String getPostalCode() {
            return this.postalCode;
        }

        public final String getSsid() {
            return this.ssid;
        }

        public final String getState() {
            return this.state;
        }

        public final Boolean getStateAllowed() {
            return this.stateAllowed;
        }

        public final String getStateCode() {
            return this.stateCode;
        }

        public final String getStateConfidence() {
            return this.stateConfidence;
        }

        public final String getStreet() {
            return this.street;
        }

        public final String getTimeZone() {
            return this.timeZone;
        }

        public IpAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d, String str10, String str11, Double d2, Double d3, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Boolean bool, Boolean bool2, String str23, String str24, String str25, String str26, String[] strArr, String str27, String str28, String str29) {
            this.ip = str;
            this.addressLabel = str2;
            this.borough = str3;
            this.city = str4;
            this.confidence = str5;
            this.country = str6;
            this.countryCode = str7;
            this.countryFlag = str8;
            this.county = str9;
            this.distance = d;
            this.formattedAddress = str10;
            this.geometry = str11;
            this.latitude = d2;
            this.longitude = d3;
            this.neighborhood = str12;
            this.number = str13;
            this.placeLabel = str14;
            this.postalCode = str15;
            this.state = str16;
            this.stateCode = str17;
            this.dma = str18;
            this.dmaCode = str19;
            this.street = str20;
            this.debug = str21;
            this.layer = str22;
            this.stateAllowed = bool;
            this.countryAllowed = bool2;
            this.timeZone = str23;
            this.connectionType = str24;
            this.stateConfidence = str25;
            this.countryConfidence = str26;
            this.categories = strArr;
            this.chainSlug = str27;
            this.ssid = str28;
            this.bssid = str29;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$IpAddress$Companion;", "", "()V", "fromJson", "Lio/radar/sdk/model/RadarRevealRiskToken$IpAddress;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final IpAddress fromJson(JSONObject obj) {
                if (obj == null) {
                    return null;
                }
                Companion companion = RadarRevealRiskToken.INSTANCE;
                return new IpAddress(Companion.access$optStringOrNull(companion, obj, "ip"), Companion.access$optStringOrNull(companion, obj, "addressLabel"), Companion.access$optStringOrNull(companion, obj, "borough"), Companion.access$optStringOrNull(companion, obj, "city"), Companion.access$optStringOrNull(companion, obj, "confidence"), Companion.access$optStringOrNull(companion, obj, "country"), Companion.access$optStringOrNull(companion, obj, "countryCode"), Companion.access$optStringOrNull(companion, obj, "countryFlag"), Companion.access$optStringOrNull(companion, obj, "county"), Companion.access$optDoubleOrNull(companion, obj, "distance"), Companion.access$optStringOrNull(companion, obj, "formattedAddress"), Companion.access$optStringOrNull(companion, obj, "geometry"), Companion.access$optDoubleOrNull(companion, obj, "latitude"), Companion.access$optDoubleOrNull(companion, obj, "longitude"), Companion.access$optStringOrNull(companion, obj, PlaceTypes.NEIGHBORHOOD), Companion.access$optStringOrNull(companion, obj, AttributeType.NUMBER), Companion.access$optStringOrNull(companion, obj, "placeLabel"), Companion.access$optStringOrNull(companion, obj, "postalCode"), Companion.access$optStringOrNull(companion, obj, "state"), Companion.access$optStringOrNull(companion, obj, "stateCode"), Companion.access$optStringOrNull(companion, obj, "dma"), Companion.access$optStringOrNull(companion, obj, "dmaCode"), Companion.access$optStringOrNull(companion, obj, "street"), Companion.access$optStringOrNull(companion, obj, "debug"), Companion.access$optStringOrNull(companion, obj, "layer"), Companion.access$optBooleanOrNull(companion, obj, "stateAllowed"), Companion.access$optBooleanOrNull(companion, obj, "countryAllowed"), Companion.access$optStringOrNull(companion, obj, "timeZone"), Companion.access$optStringOrNull(companion, obj, "connectionType"), Companion.access$optStringOrNull(companion, obj, "stateConfidence"), Companion.access$optStringOrNull(companion, obj, "countryConfidence"), Companion.access$stringArrayFromJson(companion, obj.optJSONArray("categories")), Companion.access$optStringOrNull(companion, obj, "chainSlug"), Companion.access$optStringOrNull(companion, obj, "ssid"), Companion.access$optStringOrNull(companion, obj, "bssid"));
            }

            private Companion() {
            }
        }

        public IpAddress() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$RiskLevel;", "", "(Ljava/lang/String;I)V", "NONE", "LOW", "MEDIUM", "HIGH", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RiskLevel {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ RiskLevel[] $VALUES;
        public static final RiskLevel NONE = new RiskLevel("NONE", 0);
        public static final RiskLevel LOW = new RiskLevel("LOW", 1);
        public static final RiskLevel MEDIUM = new RiskLevel("MEDIUM", 2);
        public static final RiskLevel HIGH = new RiskLevel("HIGH", 3);

        private static final /* synthetic */ RiskLevel[] $values() {
            return new RiskLevel[]{NONE, LOW, MEDIUM, HIGH};
        }

        static {
            RiskLevel[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
        }

        private RiskLevel(String str, int i) {
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static RiskLevel valueOf(String str) {
            return (RiskLevel) Enum.valueOf(RiskLevel.class, str);
        }

        public static RiskLevel[] values() {
            return (RiskLevel[]) $VALUES.clone();
        }
    }

    public RadarRevealRiskToken(String str, Risk risk, Network network, Device device, String str2, String str3, Integer num, JSONObject jSONObject) {
        str.getClass();
        risk.getClass();
        network.getClass();
        device.getClass();
        jSONObject.getClass();
        this.id = str;
        this.risk = risk;
        this.network = network;
        this.device = device;
        this.token = str2;
        this.expiresAt = str3;
        this.expiresIn = num;
        this.fullJson = jSONObject;
    }

    public static final RadarRevealRiskToken fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public final Device getDevice() {
        return this.device;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final Integer getExpiresIn() {
        return this.expiresIn;
    }

    public final JSONObject getFullJson() {
        return this.fullJson;
    }

    public final String getId() {
        return this.id;
    }

    public final Network getNetwork() {
        return this.network;
    }

    public final Risk getRisk() {
        return this.risk;
    }

    public final String getToken() {
        return this.token;
    }

    public final JSONObject toJson() {
        return this.fullJson;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$Asn;", "", "asn", "", Keys.KEY_NAME, "domain", PlaceTypes.ROUTE, "type", "country", RadarRevealRiskToken.FIELD_NETWORK, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAsn", "()Ljava/lang/String;", "getCountry", "getDomain", "getName", "getNetwork", "getRoute", "getType", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Asn {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String asn;
        private final String country;
        private final String domain;
        private final String name;
        private final String network;
        private final String route;
        private final String type;

        public /* synthetic */ Asn(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
        }

        public final String getAsn() {
            return this.asn;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getDomain() {
            return this.domain;
        }

        public final String getName() {
            return this.name;
        }

        public final String getNetwork() {
            return this.network;
        }

        public final String getRoute() {
            return this.route;
        }

        public final String getType() {
            return this.type;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$Asn$Companion;", "", "()V", "fromJson", "Lio/radar/sdk/model/RadarRevealRiskToken$Asn;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Asn fromJson(JSONObject obj) {
                if (obj == null) {
                    return null;
                }
                Companion companion = RadarRevealRiskToken.INSTANCE;
                return new Asn(Companion.access$optStringOrNull(companion, obj, "asn"), Companion.access$optStringOrNull(companion, obj, Keys.KEY_NAME), Companion.access$optStringOrNull(companion, obj, "domain"), Companion.access$optStringOrNull(companion, obj, PlaceTypes.ROUTE), Companion.access$optStringOrNull(companion, obj, "type"), Companion.access$optStringOrNull(companion, obj, "country"), Companion.access$optStringOrNull(companion, obj, RadarRevealRiskToken.FIELD_NETWORK));
            }

            private Companion() {
            }
        }

        public Asn(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.asn = str;
            this.name = str2;
            this.domain = str3;
            this.route = str4;
            this.type = str5;
            this.country = str6;
            this.network = str7;
        }

        public Asn() {
            this(null, null, null, null, null, null, null, 127, null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\u0018\u0000 )2\u00020\u0001:\u0001)BÝ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017¨\u0006*"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$Device;", "", "deviceId", "", "deviceType", "deviceMake", "deviceModel", "deviceOSName", "deviceOSVersion", "sdkVersion", "xPlatformType", "installId", "appId", "appName", "appVersion", "appBuild", "userAgent", "browserName", "browserVersion", "browserEngine", "browserEngineVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppBuild", "()Ljava/lang/String;", "getAppId", "getAppName", "getAppVersion", "getBrowserEngine", "getBrowserEngineVersion", "getBrowserName", "getBrowserVersion", "getDeviceId", "getDeviceMake", "getDeviceModel", "getDeviceOSName", "getDeviceOSVersion", "getDeviceType", "getInstallId", "getSdkVersion", "getUserAgent", "getXPlatformType", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Device {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String appBuild;
        private final String appId;
        private final String appName;
        private final String appVersion;
        private final String browserEngine;
        private final String browserEngineVersion;
        private final String browserName;
        private final String browserVersion;
        private final String deviceId;
        private final String deviceMake;
        private final String deviceModel;
        private final String deviceOSName;
        private final String deviceOSVersion;
        private final String deviceType;
        private final String installId;
        private final String sdkVersion;
        private final String userAgent;
        private final String xPlatformType;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Device(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r38);
            String str19;
            String str20;
            String str21;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            String str27;
            String str28;
            String str29;
            String str30;
            String str31;
            String str32;
            String str33;
            String str34;
            String str35;
            String str36;
            if ((i & 1) != 0) {
                str19 = null;
            } else {
                str19 = str;
            }
            if ((i & 2) != 0) {
                str20 = null;
            } else {
                str20 = str2;
            }
            if ((i & 4) != 0) {
                str21 = null;
            } else {
                str21 = str3;
            }
            if ((i & 8) != 0) {
                str22 = null;
            } else {
                str22 = str4;
            }
            if ((i & 16) != 0) {
                str23 = null;
            } else {
                str23 = str5;
            }
            if ((i & 32) != 0) {
                str24 = null;
            } else {
                str24 = str6;
            }
            if ((i & 64) != 0) {
                str25 = null;
            } else {
                str25 = str7;
            }
            if ((i & 128) != 0) {
                str26 = null;
            } else {
                str26 = str8;
            }
            if ((i & 256) != 0) {
                str27 = null;
            } else {
                str27 = str9;
            }
            if ((i & Barcode.FORMAT_UPC_A) != 0) {
                str28 = null;
            } else {
                str28 = str10;
            }
            if ((i & Barcode.FORMAT_UPC_E) != 0) {
                str29 = null;
            } else {
                str29 = str11;
            }
            if ((i & 2048) != 0) {
                str30 = null;
            } else {
                str30 = str12;
            }
            if ((i & 4096) != 0) {
                str31 = null;
            } else {
                str31 = str13;
            }
            if ((i & 8192) != 0) {
                str32 = null;
            } else {
                str32 = str14;
            }
            if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                str33 = null;
            } else {
                str33 = str15;
            }
            if ((i & 32768) != 0) {
                str34 = null;
            } else {
                str34 = str16;
            }
            if ((i & 65536) != 0) {
                str35 = null;
            } else {
                str35 = str17;
            }
            if ((i & 131072) != 0) {
                str36 = null;
            } else {
                str36 = str18;
            }
        }

        public final String getAppBuild() {
            return this.appBuild;
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getAppName() {
            return this.appName;
        }

        public final String getAppVersion() {
            return this.appVersion;
        }

        public final String getBrowserEngine() {
            return this.browserEngine;
        }

        public final String getBrowserEngineVersion() {
            return this.browserEngineVersion;
        }

        public final String getBrowserName() {
            return this.browserName;
        }

        public final String getBrowserVersion() {
            return this.browserVersion;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final String getDeviceMake() {
            return this.deviceMake;
        }

        public final String getDeviceModel() {
            return this.deviceModel;
        }

        public final String getDeviceOSName() {
            return this.deviceOSName;
        }

        public final String getDeviceOSVersion() {
            return this.deviceOSVersion;
        }

        public final String getDeviceType() {
            return this.deviceType;
        }

        public final String getInstallId() {
            return this.installId;
        }

        public final String getSdkVersion() {
            return this.sdkVersion;
        }

        public final String getUserAgent() {
            return this.userAgent;
        }

        public final String getXPlatformType() {
            return this.xPlatformType;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$Device$Companion;", "", "()V", "fromJson", "Lio/radar/sdk/model/RadarRevealRiskToken$Device;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Device fromJson(JSONObject obj) {
                if (obj == null) {
                    return null;
                }
                Companion companion = RadarRevealRiskToken.INSTANCE;
                return new Device(Companion.access$optStringOrNull(companion, obj, "deviceId"), Companion.access$optStringOrNull(companion, obj, "deviceType"), Companion.access$optStringOrNull(companion, obj, "deviceMake"), Companion.access$optStringOrNull(companion, obj, "deviceModel"), Companion.access$optStringOrNull(companion, obj, "deviceOSName"), Companion.access$optStringOrNull(companion, obj, "deviceOSVersion"), Companion.access$optStringOrNull(companion, obj, "sdkVersion"), Companion.access$optStringOrNull(companion, obj, "xPlatformType"), Companion.access$optStringOrNull(companion, obj, "installId"), Companion.access$optStringOrNull(companion, obj, "appId"), Companion.access$optStringOrNull(companion, obj, "appName"), Companion.access$optStringOrNull(companion, obj, "appVersion"), Companion.access$optStringOrNull(companion, obj, "appBuild"), Companion.access$optStringOrNull(companion, obj, "userAgent"), Companion.access$optStringOrNull(companion, obj, "browserName"), Companion.access$optStringOrNull(companion, obj, "browserVersion"), Companion.access$optStringOrNull(companion, obj, "browserEngine"), Companion.access$optStringOrNull(companion, obj, "browserEngineVersion"));
            }

            private Companion() {
            }
        }

        public Device(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
            this.deviceId = str;
            this.deviceType = str2;
            this.deviceMake = str3;
            this.deviceModel = str4;
            this.deviceOSName = str5;
            this.deviceOSVersion = str6;
            this.sdkVersion = str7;
            this.xPlatformType = str8;
            this.installId = str9;
            this.appId = str10;
            this.appName = str11;
            this.appVersion = str12;
            this.appBuild = str13;
            this.userAgent = str14;
            this.browserName = str15;
            this.browserVersion = str16;
            this.browserEngine = str17;
            this.browserEngineVersion = str18;
        }

        public Device() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$Network;", "", Network.FIELD_IP_ADDRESS, "Lio/radar/sdk/model/RadarRevealRiskToken$IpAddress;", Network.FIELD_PRIVACY, "Lio/radar/sdk/model/RadarRevealRiskToken$Privacy;", Network.FIELD_ASN, "Lio/radar/sdk/model/RadarRevealRiskToken$Asn;", "(Lio/radar/sdk/model/RadarRevealRiskToken$IpAddress;Lio/radar/sdk/model/RadarRevealRiskToken$Privacy;Lio/radar/sdk/model/RadarRevealRiskToken$Asn;)V", "getAsn", "()Lio/radar/sdk/model/RadarRevealRiskToken$Asn;", "getIpAddress", "()Lio/radar/sdk/model/RadarRevealRiskToken$IpAddress;", "getPrivacy", "()Lio/radar/sdk/model/RadarRevealRiskToken$Privacy;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Network {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String FIELD_ASN = "asn";
        private static final String FIELD_IP_ADDRESS = "ipAddress";
        private static final String FIELD_PRIVACY = "privacy";
        private final Asn asn;
        private final IpAddress ipAddress;
        private final Privacy privacy;

        public /* synthetic */ Network(IpAddress ipAddress, Privacy privacy, Asn asn, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ipAddress, (i & 2) != 0 ? null : privacy, (i & 4) != 0 ? null : asn);
        }

        public final Asn getAsn() {
            return this.asn;
        }

        public final IpAddress getIpAddress() {
            return this.ipAddress;
        }

        public final Privacy getPrivacy() {
            return this.privacy;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$Network$Companion;", "", "()V", "FIELD_ASN", "", "FIELD_IP_ADDRESS", "FIELD_PRIVACY", "fromJson", "Lio/radar/sdk/model/RadarRevealRiskToken$Network;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Network fromJson(JSONObject obj) {
                if (obj == null) {
                    return null;
                }
                return new Network(IpAddress.INSTANCE.fromJson(obj.optJSONObject(Network.FIELD_IP_ADDRESS)), Privacy.INSTANCE.fromJson(obj.optJSONObject(Network.FIELD_PRIVACY)), Asn.INSTANCE.fromJson(obj.optJSONObject(Network.FIELD_ASN)));
            }

            private Companion() {
            }
        }

        public Network(IpAddress ipAddress, Privacy privacy, Asn asn) {
            this.ipAddress = ipAddress;
            this.privacy = privacy;
            this.asn = asn;
        }

        public Network() {
            this(null, null, null, 7, null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\r¨\u0006\u0017"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$Privacy;", "", "vpn", "", "proxy", "tor", "relay", "hosting", "service", "", "residentialProxy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "getHosting", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProxy", "getRelay", "getResidentialProxy", "getService", "()Ljava/lang/String;", "getTor", "getVpn", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Privacy {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Boolean hosting;
        private final Boolean proxy;
        private final Boolean relay;
        private final Boolean residentialProxy;
        private final String service;
        private final Boolean tor;
        private final Boolean vpn;

        public /* synthetic */ Privacy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, Boolean bool6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : bool6);
        }

        public final Boolean getHosting() {
            return this.hosting;
        }

        public final Boolean getProxy() {
            return this.proxy;
        }

        public final Boolean getRelay() {
            return this.relay;
        }

        public final Boolean getResidentialProxy() {
            return this.residentialProxy;
        }

        public final String getService() {
            return this.service;
        }

        public final Boolean getTor() {
            return this.tor;
        }

        public final Boolean getVpn() {
            return this.vpn;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$Privacy$Companion;", "", "()V", "fromJson", "Lio/radar/sdk/model/RadarRevealRiskToken$Privacy;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Privacy fromJson(JSONObject obj) {
                if (obj == null) {
                    return null;
                }
                Companion companion = RadarRevealRiskToken.INSTANCE;
                return new Privacy(Companion.access$optBooleanOrNull(companion, obj, "vpn"), Companion.access$optBooleanOrNull(companion, obj, "proxy"), Companion.access$optBooleanOrNull(companion, obj, "tor"), Companion.access$optBooleanOrNull(companion, obj, "relay"), Companion.access$optBooleanOrNull(companion, obj, "hosting"), Companion.access$optStringOrNull(companion, obj, "service"), Companion.access$optBooleanOrNull(companion, obj, "residentialProxy"));
            }

            private Companion() {
            }
        }

        public Privacy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, Boolean bool6) {
            this.vpn = bool;
            this.proxy = bool2;
            this.tor = bool3;
            this.relay = bool4;
            this.hosting = bool5;
            this.service = str;
            this.residentialProxy = bool6;
        }

        public Privacy() {
            this(null, null, null, null, null, null, null, 127, null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$Risk;", "", Risk.FIELD_LEVEL, "Lio/radar/sdk/model/RadarRevealRiskToken$RiskLevel;", Risk.FIELD_REASONS, "", "", "(Lio/radar/sdk/model/RadarRevealRiskToken$RiskLevel;[Ljava/lang/String;)V", "getLevel", "()Lio/radar/sdk/model/RadarRevealRiskToken$RiskLevel;", "getReasons", "()[Ljava/lang/String;", "[Ljava/lang/String;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Risk {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String FIELD_LEVEL = "level";
        private static final String FIELD_REASONS = "reasons";
        private final RiskLevel level;
        private final String[] reasons;

        public Risk(RiskLevel riskLevel, String[] strArr) {
            riskLevel.getClass();
            strArr.getClass();
            this.level = riskLevel;
            this.reasons = strArr;
        }

        public final RiskLevel getLevel() {
            return this.level;
        }

        public final String[] getReasons() {
            return this.reasons;
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$Risk$Companion;", "", "()V", "FIELD_LEVEL", "", "FIELD_REASONS", "fromJson", "Lio/radar/sdk/model/RadarRevealRiskToken$Risk;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Risk fromJson(JSONObject obj) {
                RiskLevel riskLevel;
                String[] access$stringArrayFromJson;
                if (obj == null) {
                    return null;
                }
                String optString = obj.optString(Risk.FIELD_LEVEL);
                if (optString != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -1078030475) {
                        if (hashCode != 107348) {
                            if (hashCode == 3202466 && optString.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH_STR)) {
                                riskLevel = RiskLevel.HIGH;
                            }
                        } else if (optString.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.LOW_STR)) {
                            riskLevel = RiskLevel.LOW;
                        }
                    } else if (optString.equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.MEDIUM_STR)) {
                        riskLevel = RiskLevel.MEDIUM;
                    }
                    access$stringArrayFromJson = Companion.access$stringArrayFromJson(RadarRevealRiskToken.INSTANCE, obj.optJSONArray(Risk.FIELD_REASONS));
                    if (access$stringArrayFromJson == null) {
                        access$stringArrayFromJson = new String[0];
                    }
                    return new Risk(riskLevel, access$stringArrayFromJson);
                }
                riskLevel = RiskLevel.NONE;
                access$stringArrayFromJson = Companion.access$stringArrayFromJson(RadarRevealRiskToken.INSTANCE, obj.optJSONArray(Risk.FIELD_REASONS));
                if (access$stringArrayFromJson == null) {
                }
                return new Risk(riskLevel, access$stringArrayFromJson);
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0017J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0004*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lio/radar/sdk/model/RadarRevealRiskToken$Companion;", "", "()V", "FIELD_DEVICE", "", "FIELD_EXPIRES_AT", "FIELD_EXPIRES_IN", "FIELD_ID", "FIELD_NETWORK", "FIELD_RISK", "FIELD_TOKEN", "fromJson", "Lio/radar/sdk/model/RadarRevealRiskToken;", "obj", "Lorg/json/JSONObject;", "stringArrayFromJson", "", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Ljava/lang/String;", "optBooleanOrNull", "", Keys.KEY_NAME, "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "optDoubleOrNull", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "optStringOrNull", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ Boolean access$optBooleanOrNull(Companion companion, JSONObject jSONObject, String str) {
            return companion.optBooleanOrNull(jSONObject, str);
        }

        public static final /* synthetic */ Double access$optDoubleOrNull(Companion companion, JSONObject jSONObject, String str) {
            return companion.optDoubleOrNull(jSONObject, str);
        }

        public static final /* synthetic */ String access$optStringOrNull(Companion companion, JSONObject jSONObject, String str) {
            return companion.optStringOrNull(jSONObject, str);
        }

        public static final /* synthetic */ String[] access$stringArrayFromJson(Companion companion, JSONArray jSONArray) {
            return companion.stringArrayFromJson(jSONArray);
        }

        private final Boolean optBooleanOrNull(JSONObject jSONObject, String str) {
            if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                return Boolean.valueOf(jSONObject.optBoolean(str));
            }
            return null;
        }

        private final Double optDoubleOrNull(JSONObject jSONObject, String str) {
            if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                return Double.valueOf(jSONObject.optDouble(str));
            }
            return null;
        }

        private final String optStringOrNull(JSONObject jSONObject, String str) {
            if (jSONObject.has(str) && !jSONObject.isNull(str)) {
                return jSONObject.optString(str);
            }
            return null;
        }

        private final String[] stringArrayFromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                String optString = arr.optString(i);
                optString.getClass();
                strArr[i] = optString;
            }
            return strArr;
        }

        public final RadarRevealRiskToken fromJson(JSONObject obj) {
            Network fromJson;
            Device fromJson2;
            Integer num = null;
            if (obj != null) {
                String optString = obj.optString(RadarRevealRiskToken.FIELD_ID);
                Risk fromJson3 = Risk.INSTANCE.fromJson(obj.optJSONObject(RadarRevealRiskToken.FIELD_RISK));
                if (fromJson3 != null && (fromJson = Network.INSTANCE.fromJson(obj.optJSONObject(RadarRevealRiskToken.FIELD_NETWORK))) != null && (fromJson2 = Device.INSTANCE.fromJson(obj.optJSONObject(RadarRevealRiskToken.FIELD_DEVICE))) != null) {
                    String optStringOrNull = optStringOrNull(obj, RadarRevealRiskToken.FIELD_TOKEN);
                    String optStringOrNull2 = optStringOrNull(obj, RadarRevealRiskToken.FIELD_EXPIRES_AT);
                    if (obj.has(RadarRevealRiskToken.FIELD_EXPIRES_IN) && !obj.isNull(RadarRevealRiskToken.FIELD_EXPIRES_IN)) {
                        num = Integer.valueOf(obj.optInt(RadarRevealRiskToken.FIELD_EXPIRES_IN));
                    }
                    obj.remove("meta");
                    optString.getClass();
                    return new RadarRevealRiskToken(optString, fromJson3, fromJson, fromJson2, optStringOrNull, optStringOrNull2, num, obj);
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RadarRevealRiskToken(String str, Risk risk, Network network, Device device, String str2, String str3, Integer num, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, risk, network, device, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num, jSONObject);
    }
}
