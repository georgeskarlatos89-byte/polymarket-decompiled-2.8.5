package io.radar.sdk.model;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ug7;
import defpackage.ww4;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b(\u0018\u0000 H2\u00020\u0001:\u0002HIB½\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"¢\u0006\u0002\u0010#J\u0006\u0010G\u001a\u00020\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u001b\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010%R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010%¨\u0006J"}, d2 = {"Lio/radar/sdk/model/RadarAddress;", "", "coordinate", "Lio/radar/sdk/model/RadarCoordinate;", RadarAddress.FIELD_FORMATTED_ADDRESS, "", "country", RadarAddress.FIELD_COUNTRY_CODE, RadarAddress.FIELD_COUNTRY_FLAG, RadarAddress.FIELD_DMA, RadarAddress.FIELD_DMA_CODE, RadarAddress.FIELD_STATE, RadarAddress.FIELD_STATE_CODE, RadarAddress.FIELD_POSTAL_CODE, RadarAddress.FIELD_CITY, RadarAddress.FIELD_BOROUGH, RadarAddress.FIELD_COUNTY, "neighborhood", RadarAddress.FIELD_STREET, "number", RadarAddress.FIELD_ADDRESS_LABEL, RadarAddress.FIELD_PLACE_LABEL, RadarAddress.FIELD_UNIT, RadarAddress.FIELD_PLUS4, RadarAddress.FIELD_DISTANCE, "", RadarAddress.FIELD_LAYER, "metadata", "Lorg/json/JSONObject;", RadarAddress.FIELD_CONFIDENCE, "Lio/radar/sdk/model/RadarAddress$RadarAddressConfidence;", RadarAddress.FIELD_TIME_ZONE, "Lio/radar/sdk/model/RadarTimeZone;", RadarAddress.FIELD_CATEGORIES, "", "(Lio/radar/sdk/model/RadarCoordinate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/json/JSONObject;Lio/radar/sdk/model/RadarAddress$RadarAddressConfidence;Lio/radar/sdk/model/RadarTimeZone;[Ljava/lang/String;)V", "getAddressLabel", "()Ljava/lang/String;", "getBorough", "getCategories", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getCity", "getConfidence", "()Lio/radar/sdk/model/RadarAddress$RadarAddressConfidence;", "getCoordinate", "()Lio/radar/sdk/model/RadarCoordinate;", "getCountry", "getCountryCode", "getCountryFlag", "getCounty", "getDistance", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDma", "getDmaCode", "getFormattedAddress", "getLayer", "getMetadata", "()Lorg/json/JSONObject;", "getNeighborhood", "getNumber", "getPlaceLabel", "getPlus4", "getPostalCode", "getState", "getStateCode", "getStreet", "getTimeZone", "()Lio/radar/sdk/model/RadarTimeZone;", "getUnit", "toJson", "Companion", "RadarAddressConfidence", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarAddress {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_ADDRESS_LABEL = "addressLabel";
    private static final String FIELD_BOROUGH = "borough";
    private static final String FIELD_CATEGORIES = "categories";
    private static final String FIELD_CITY = "city";
    private static final String FIELD_CONFIDENCE = "confidence";
    private static final String FIELD_COUNTRY = "country";
    private static final String FIELD_COUNTRY_CODE = "countryCode";
    private static final String FIELD_COUNTRY_FLAG = "countryFlag";
    private static final String FIELD_COUNTY = "county";
    private static final String FIELD_DISTANCE = "distance";
    private static final String FIELD_DMA = "dma";
    private static final String FIELD_DMA_CODE = "dmaCode";
    private static final String FIELD_FORMATTED_ADDRESS = "formattedAddress";
    private static final String FIELD_LATITUDE = "latitude";
    private static final String FIELD_LAYER = "layer";
    private static final String FIELD_LONGITUDE = "longitude";
    private static final String FIELD_METADATA = "metadata";
    private static final String FIELD_NEIGHBORHOOD = "neighborhood";
    private static final String FIELD_NUMBER = "number";
    private static final String FIELD_PLACE_LABEL = "placeLabel";
    private static final String FIELD_PLUS4 = "plus4";
    private static final String FIELD_POSTAL_CODE = "postalCode";
    private static final String FIELD_STATE = "state";
    private static final String FIELD_STATE_CODE = "stateCode";
    private static final String FIELD_STREET = "street";
    private static final String FIELD_TIME_ZONE = "timeZone";
    private static final String FIELD_UNIT = "unit";
    private final String addressLabel;
    private final String borough;
    private final String[] categories;
    private final String city;
    private final RadarAddressConfidence confidence;
    private final RadarCoordinate coordinate;
    private final String country;
    private final String countryCode;
    private final String countryFlag;
    private final String county;
    private final Integer distance;
    private final String dma;
    private final String dmaCode;
    private final String formattedAddress;
    private final String layer;
    private final JSONObject metadata;
    private final String neighborhood;
    private final String number;
    private final String placeLabel;
    private final String plus4;
    private final String postalCode;
    private final String state;
    private final String stateCode;
    private final String street;
    private final RadarTimeZone timeZone;
    private final String unit;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/radar/sdk/model/RadarAddress$RadarAddressConfidence;", "", "(Ljava/lang/String;I)V", "EXACT", "INTERPOLATED", "FALLBACK", "NONE", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RadarAddressConfidence {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ RadarAddressConfidence[] $VALUES;
        public static final RadarAddressConfidence EXACT = new RadarAddressConfidence("EXACT", 0);
        public static final RadarAddressConfidence INTERPOLATED = new RadarAddressConfidence("INTERPOLATED", 1);
        public static final RadarAddressConfidence FALLBACK = new RadarAddressConfidence("FALLBACK", 2);
        public static final RadarAddressConfidence NONE = new RadarAddressConfidence("NONE", 3);

        private static final /* synthetic */ RadarAddressConfidence[] $values() {
            return new RadarAddressConfidence[]{EXACT, INTERPOLATED, FALLBACK, NONE};
        }

        static {
            RadarAddressConfidence[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
        }

        private RadarAddressConfidence(String str, int i) {
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static RadarAddressConfidence valueOf(String str) {
            return (RadarAddressConfidence) Enum.valueOf(RadarAddressConfidence.class, str);
        }

        public static RadarAddressConfidence[] values() {
            return (RadarAddressConfidence[]) $VALUES.clone();
        }
    }

    public /* synthetic */ RadarAddress(RadarCoordinate radarCoordinate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Integer num, String str20, JSONObject jSONObject, RadarAddressConfidence radarAddressConfidence, RadarTimeZone radarTimeZone, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(radarCoordinate, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & Barcode.FORMAT_UPC_A) != 0 ? null : str9, (i & Barcode.FORMAT_UPC_E) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17, (i & 262144) != 0 ? null : str18, (i & 524288) != 0 ? null : str19, (i & 1048576) != 0 ? null : num, (i & 2097152) != 0 ? null : str20, (i & 4194304) != 0 ? null : jSONObject, (i & 8388608) != 0 ? RadarAddressConfidence.NONE : radarAddressConfidence, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : radarTimeZone, (i & 33554432) != 0 ? null : strArr);
    }

    public static final RadarAddress fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public static final String stringForConfidence(RadarAddressConfidence radarAddressConfidence) {
        return INSTANCE.stringForConfidence(radarAddressConfidence);
    }

    public final String getAddressLabel() {
        return this.addressLabel;
    }

    public final String getBorough() {
        return this.borough;
    }

    public final String[] getCategories() {
        return this.categories;
    }

    public final String getCity() {
        return this.city;
    }

    public final RadarAddressConfidence getConfidence() {
        return this.confidence;
    }

    public final RadarCoordinate getCoordinate() {
        return this.coordinate;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryFlag() {
        return this.countryFlag;
    }

    public final String getCounty() {
        return this.county;
    }

    public final Integer getDistance() {
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

    public final String getLayer() {
        return this.layer;
    }

    public final JSONObject getMetadata() {
        return this.metadata;
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

    public final String getPlus4() {
        return this.plus4;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getStreet() {
        return this.street;
    }

    public final RadarTimeZone getTimeZone() {
        return this.timeZone;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject;
        double latitude = this.coordinate.getLatitude();
        double longitude = this.coordinate.getLongitude();
        if (Double.isNaN(latitude) || Double.isNaN(longitude)) {
            latitude = ConstantsKt.UNSET;
            longitude = 0.0d;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(FIELD_LATITUDE, Double.valueOf(latitude));
        jSONObject2.putOpt(FIELD_LONGITUDE, Double.valueOf(longitude));
        jSONObject2.putOpt(FIELD_FORMATTED_ADDRESS, this.formattedAddress);
        jSONObject2.putOpt("country", this.country);
        jSONObject2.putOpt(FIELD_COUNTRY_CODE, this.countryCode);
        jSONObject2.putOpt(FIELD_COUNTRY_FLAG, this.countryFlag);
        jSONObject2.putOpt(FIELD_DMA, this.dma);
        jSONObject2.putOpt(FIELD_DMA_CODE, this.dmaCode);
        jSONObject2.putOpt(FIELD_STATE, this.state);
        jSONObject2.putOpt(FIELD_STATE_CODE, this.stateCode);
        jSONObject2.putOpt(FIELD_POSTAL_CODE, this.postalCode);
        jSONObject2.putOpt(FIELD_CITY, this.city);
        jSONObject2.putOpt(FIELD_BOROUGH, this.borough);
        jSONObject2.putOpt(FIELD_COUNTY, this.county);
        jSONObject2.putOpt("neighborhood", this.neighborhood);
        jSONObject2.putOpt(FIELD_STREET, this.street);
        jSONObject2.putOpt("number", this.number);
        jSONObject2.putOpt(FIELD_ADDRESS_LABEL, this.addressLabel);
        jSONObject2.putOpt(FIELD_PLACE_LABEL, this.placeLabel);
        jSONObject2.putOpt(FIELD_UNIT, this.unit);
        jSONObject2.putOpt(FIELD_PLUS4, this.plus4);
        jSONObject2.putOpt(FIELD_DISTANCE, this.distance);
        jSONObject2.putOpt(FIELD_LAYER, this.layer);
        jSONObject2.putOpt("metadata", this.metadata);
        jSONObject2.putOpt(FIELD_CONFIDENCE, INSTANCE.stringForConfidence(this.confidence));
        RadarTimeZone radarTimeZone = this.timeZone;
        JSONArray jSONArray = null;
        if (radarTimeZone != null) {
            jSONObject = radarTimeZone.toJson();
        } else {
            jSONObject = null;
        }
        jSONObject2.putOpt(FIELD_TIME_ZONE, jSONObject);
        String[] strArr = this.categories;
        if (strArr != null) {
            jSONArray = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
        }
        jSONObject2.putOpt(FIELD_CATEGORIES, jSONArray);
        return jSONObject2;
    }

    public RadarAddress(RadarCoordinate radarCoordinate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Integer num, String str20, JSONObject jSONObject, RadarAddressConfidence radarAddressConfidence, RadarTimeZone radarTimeZone, String[] strArr) {
        radarCoordinate.getClass();
        radarAddressConfidence.getClass();
        this.coordinate = radarCoordinate;
        this.formattedAddress = str;
        this.country = str2;
        this.countryCode = str3;
        this.countryFlag = str4;
        this.dma = str5;
        this.dmaCode = str6;
        this.state = str7;
        this.stateCode = str8;
        this.postalCode = str9;
        this.city = str10;
        this.borough = str11;
        this.county = str12;
        this.neighborhood = str13;
        this.street = str14;
        this.number = str15;
        this.addressLabel = str16;
        this.placeLabel = str17;
        this.unit = str18;
        this.plus4 = str19;
        this.distance = num;
        this.layer = str20;
        this.metadata = jSONObject;
        this.confidence = radarAddressConfidence;
        this.timeZone = radarTimeZone;
        this.categories = strArr;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0002\u0010$J\u0014\u0010\u001f\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)H\u0007J\u001f\u0010*\u001a\u0004\u0018\u00010#2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0007¢\u0006\u0002\u0010,R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lio/radar/sdk/model/RadarAddress$Companion;", "", "()V", "FIELD_ADDRESS_LABEL", "", "FIELD_BOROUGH", "FIELD_CATEGORIES", "FIELD_CITY", "FIELD_CONFIDENCE", "FIELD_COUNTRY", "FIELD_COUNTRY_CODE", "FIELD_COUNTRY_FLAG", "FIELD_COUNTY", "FIELD_DISTANCE", "FIELD_DMA", "FIELD_DMA_CODE", "FIELD_FORMATTED_ADDRESS", "FIELD_LATITUDE", "FIELD_LAYER", "FIELD_LONGITUDE", "FIELD_METADATA", "FIELD_NEIGHBORHOOD", "FIELD_NUMBER", "FIELD_PLACE_LABEL", "FIELD_PLUS4", "FIELD_POSTAL_CODE", "FIELD_STATE", "FIELD_STATE_CODE", "FIELD_STREET", "FIELD_TIME_ZONE", "FIELD_UNIT", "fromJson", "", "Lio/radar/sdk/model/RadarAddress;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarAddress;", "obj", "Lorg/json/JSONObject;", "stringForConfidence", RadarAddress.FIELD_CONFIDENCE, "Lio/radar/sdk/model/RadarAddress$RadarAddressConfidence;", "toJson", "addresses", "([Lio/radar/sdk/model/RadarAddress;)Lorg/json/JSONArray;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarAddressConfidence.values().length];
                try {
                    iArr[RadarAddressConfidence.EXACT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarAddressConfidence.INTERPOLATED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarAddressConfidence.FALLBACK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01a2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final RadarAddress fromJson(JSONObject obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            JSONObject jSONObject;
            RadarCoordinate radarCoordinate;
            RadarAddressConfidence radarAddressConfidence;
            JSONArray optJSONArray;
            RadarAddressConfidence radarAddressConfidence2;
            String[] strArr;
            if (obj == null) {
                return null;
            }
            RadarCoordinate radarCoordinate2 = new RadarCoordinate(obj.optDouble(RadarAddress.FIELD_LATITUDE), obj.optDouble(RadarAddress.FIELD_LONGITUDE));
            String optString = obj.optString(RadarAddress.FIELD_FORMATTED_ADDRESS);
            if (optString == null) {
                str = null;
            } else {
                str = optString;
            }
            String optString2 = obj.optString("country");
            if (optString2 == null) {
                str2 = null;
            } else {
                str2 = optString2;
            }
            String optString3 = obj.optString(RadarAddress.FIELD_COUNTRY_CODE);
            if (optString3 == null) {
                str3 = null;
            } else {
                str3 = optString3;
            }
            String optString4 = obj.optString(RadarAddress.FIELD_COUNTRY_FLAG);
            if (optString4 == null) {
                str4 = null;
            } else {
                str4 = optString4;
            }
            String optString5 = obj.optString(RadarAddress.FIELD_DMA);
            if (optString5 == null) {
                str5 = null;
            } else {
                str5 = optString5;
            }
            String optString6 = obj.optString(RadarAddress.FIELD_DMA_CODE);
            if (optString6 == null) {
                str6 = null;
            } else {
                str6 = optString6;
            }
            String optString7 = obj.optString(RadarAddress.FIELD_STATE);
            if (optString7 == null) {
                str7 = null;
            } else {
                str7 = optString7;
            }
            String optString8 = obj.optString(RadarAddress.FIELD_STATE_CODE);
            if (optString8 == null) {
                str8 = null;
            } else {
                str8 = optString8;
            }
            String optString9 = obj.optString(RadarAddress.FIELD_POSTAL_CODE);
            if (optString9 == null) {
                str9 = null;
            } else {
                str9 = optString9;
            }
            String optString10 = obj.optString(RadarAddress.FIELD_CITY);
            if (optString10 == null) {
                str10 = null;
            } else {
                str10 = optString10;
            }
            String optString11 = obj.optString(RadarAddress.FIELD_BOROUGH);
            if (optString11 == null) {
                str11 = null;
            } else {
                str11 = optString11;
            }
            String optString12 = obj.optString(RadarAddress.FIELD_COUNTY);
            if (optString12 == null) {
                str12 = null;
            } else {
                str12 = optString12;
            }
            String optString13 = obj.optString("neighborhood");
            if (optString13 == null) {
                str13 = null;
            } else {
                str13 = optString13;
            }
            String optString14 = obj.optString(RadarAddress.FIELD_STREET);
            if (optString14 == null) {
                str14 = null;
            } else {
                str14 = optString14;
            }
            String optString15 = obj.optString("number");
            if (optString15 == null) {
                str15 = null;
            } else {
                str15 = optString15;
            }
            String optString16 = obj.optString(RadarAddress.FIELD_ADDRESS_LABEL);
            if (optString16 == null) {
                str16 = null;
            } else {
                str16 = optString16;
            }
            String optString17 = obj.optString(RadarAddress.FIELD_PLACE_LABEL);
            if (optString17 == null) {
                str17 = null;
            } else {
                str17 = optString17;
            }
            String optString18 = obj.optString(RadarAddress.FIELD_UNIT);
            if (optString18 == null) {
                str18 = null;
            } else {
                str18 = optString18;
            }
            String optString19 = obj.optString(RadarAddress.FIELD_PLUS4);
            if (optString19 == null) {
                str19 = null;
            } else {
                str19 = optString19;
            }
            int optInt = obj.optInt(RadarAddress.FIELD_DISTANCE);
            String optString20 = obj.optString(RadarAddress.FIELD_LAYER);
            if (optString20 == null) {
                str20 = null;
            } else {
                str20 = optString20;
            }
            JSONObject optJSONObject = obj.optJSONObject("metadata");
            if (optJSONObject == null) {
                jSONObject = null;
            } else {
                jSONObject = optJSONObject;
            }
            String optString21 = obj.optString(RadarAddress.FIELD_CONFIDENCE);
            if (optString21 != null) {
                int hashCode = optString21.hashCode();
                radarCoordinate = radarCoordinate2;
                if (hashCode != 96946943) {
                    if (hashCode != 761243362) {
                        if (hashCode == 2096252803 && optString21.equals("interpolated")) {
                            radarAddressConfidence = RadarAddressConfidence.INTERPOLATED;
                        }
                    } else if (optString21.equals("fallback")) {
                        radarAddressConfidence = RadarAddressConfidence.FALLBACK;
                    }
                } else if (optString21.equals("exact")) {
                    radarAddressConfidence = RadarAddressConfidence.EXACT;
                }
                RadarTimeZone fromJson = RadarTimeZone.INSTANCE.fromJson(obj.optJSONObject(RadarAddress.FIELD_TIME_ZONE));
                optJSONArray = obj.optJSONArray(RadarAddress.FIELD_CATEGORIES);
                if (optJSONArray == null) {
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    radarAddressConfidence2 = radarAddressConfidence;
                    int i = 0;
                    while (i < length) {
                        int i2 = length;
                        String optString22 = optJSONArray.optString(i);
                        if (optString22 != null && optString22.length() != 0) {
                            arrayList.add(optString22);
                        }
                        i++;
                        length = i2;
                    }
                    strArr = (String[]) arrayList.toArray(new String[0]);
                } else {
                    radarAddressConfidence2 = radarAddressConfidence;
                    strArr = null;
                }
                return new RadarAddress(radarCoordinate, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, Integer.valueOf(optInt), str20, jSONObject, radarAddressConfidence2, fromJson, strArr);
            }
            radarCoordinate = radarCoordinate2;
            radarAddressConfidence = RadarAddressConfidence.NONE;
            RadarTimeZone fromJson2 = RadarTimeZone.INSTANCE.fromJson(obj.optJSONObject(RadarAddress.FIELD_TIME_ZONE));
            optJSONArray = obj.optJSONArray(RadarAddress.FIELD_CATEGORIES);
            if (optJSONArray == null) {
            }
            return new RadarAddress(radarCoordinate, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, Integer.valueOf(optInt), str20, jSONObject, radarAddressConfidence2, fromJson2, strArr);
        }

        public final String stringForConfidence(RadarAddressConfidence confidence) {
            confidence.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[confidence.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return "none";
                    }
                    return "fallback";
                }
                return "interpolated";
            }
            return "exact";
        }

        public final JSONArray toJson(RadarAddress[] addresses) {
            if (addresses == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarAddress radarAddress : addresses) {
                jSONArray.put(radarAddress.toJson());
            }
            return jSONArray;
        }

        private Companion() {
        }

        public final RadarAddress[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarAddress[] radarAddressArr = new RadarAddress[length];
            for (int i = 0; i < length; i++) {
                radarAddressArr[i] = RadarAddress.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarAddress[]) ArraysKt.filterNotNull(radarAddressArr).toArray(new RadarAddress[0]);
        }
    }

    public static final RadarAddress[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    public static final JSONArray toJson(RadarAddress[] radarAddressArr) {
        return INSTANCE.toJson(radarAddressArr);
    }
}
