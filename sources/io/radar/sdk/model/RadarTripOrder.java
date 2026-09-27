package io.radar.sdk.model;

import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarUtils;
import java.util.Date;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u001c\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012¨\u0006 "}, d2 = {"Lio/radar/sdk/model/RadarTripOrder;", "", "_id", "", RadarTripOrder.FIELD_GUID, RadarTripOrder.FIELD_HANDOFF_MODE, RadarTripOrder.FIELD_STATUS, "Lio/radar/sdk/model/RadarTripOrder$RadarTripOrderStatus;", RadarTripOrder.FIELD_FIRED_AT, "Ljava/util/Date;", RadarTripOrder.FIELD_FIRED_ATTEMPTS, "", RadarTripOrder.FIELD_FIRED_REASON, RadarTripOrder.FIELD_UPDATED_AT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/radar/sdk/model/RadarTripOrder$RadarTripOrderStatus;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;)V", "get_id", "()Ljava/lang/String;", "getFiredAt", "()Ljava/util/Date;", "getFiredAttempts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFiredReason", "getGuid", "getHandoffMode", "getStatus", "()Lio/radar/sdk/model/RadarTripOrder$RadarTripOrderStatus;", "getUpdatedAt", "toJson", "Lorg/json/JSONObject;", "Companion", "RadarTripOrderStatus", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarTripOrder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_FIRED_AT = "firedAt";
    private static final String FIELD_FIRED_ATTEMPTS = "firedAttempts";
    private static final String FIELD_FIRED_REASON = "firedReason";
    private static final String FIELD_GUID = "guid";
    private static final String FIELD_HANDOFF_MODE = "handoffMode";
    private static final String FIELD_ID = "id";
    private static final String FIELD_STATUS = "status";
    private static final String FIELD_UPDATED_AT = "updatedAt";
    private final String _id;
    private final Date firedAt;
    private final Integer firedAttempts;
    private final String firedReason;
    private final String guid;
    private final String handoffMode;
    private final RadarTripOrderStatus status;
    private final Date updatedAt;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/radar/sdk/model/RadarTripOrder$RadarTripOrderStatus;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "PENDING", "FIRED", "CANCELED", "COMPLETED", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RadarTripOrderStatus {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ RadarTripOrderStatus[] $VALUES;
        public static final RadarTripOrderStatus UNKNOWN = new RadarTripOrderStatus("UNKNOWN", 0);
        public static final RadarTripOrderStatus PENDING = new RadarTripOrderStatus("PENDING", 1);
        public static final RadarTripOrderStatus FIRED = new RadarTripOrderStatus("FIRED", 2);
        public static final RadarTripOrderStatus CANCELED = new RadarTripOrderStatus("CANCELED", 3);
        public static final RadarTripOrderStatus COMPLETED = new RadarTripOrderStatus("COMPLETED", 4);

        private static final /* synthetic */ RadarTripOrderStatus[] $values() {
            return new RadarTripOrderStatus[]{UNKNOWN, PENDING, FIRED, CANCELED, COMPLETED};
        }

        static {
            RadarTripOrderStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
        }

        private RadarTripOrderStatus(String str, int i) {
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static RadarTripOrderStatus valueOf(String str) {
            return (RadarTripOrderStatus) Enum.valueOf(RadarTripOrderStatus.class, str);
        }

        public static RadarTripOrderStatus[] values() {
            return (RadarTripOrderStatus[]) $VALUES.clone();
        }
    }

    public /* synthetic */ RadarTripOrder(String str, String str2, String str3, RadarTripOrderStatus radarTripOrderStatus, Date date, Integer num, String str4, Date date2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? RadarTripOrderStatus.UNKNOWN : radarTripOrderStatus, (i & 16) != 0 ? null : date, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str4, date2);
    }

    public static final RadarTripOrder fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public static final String stringForStatus(RadarTripOrderStatus radarTripOrderStatus) {
        return INSTANCE.stringForStatus(radarTripOrderStatus);
    }

    public final Date getFiredAt() {
        return this.firedAt;
    }

    public final Integer getFiredAttempts() {
        return this.firedAttempts;
    }

    public final String getFiredReason() {
        return this.firedReason;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getHandoffMode() {
        return this.handoffMode;
    }

    public final RadarTripOrderStatus getStatus() {
        return this.status;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final String get_id() {
        return this._id;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("id", this._id);
        jSONObject.putOpt(FIELD_GUID, this.guid);
        jSONObject.putOpt(FIELD_HANDOFF_MODE, this.handoffMode);
        jSONObject.putOpt(FIELD_STATUS, INSTANCE.stringForStatus(this.status));
        RadarUtils radarUtils = RadarUtils.INSTANCE;
        jSONObject.putOpt(FIELD_FIRED_AT, radarUtils.dateToISOString$sdk_release(this.firedAt));
        jSONObject.putOpt(FIELD_FIRED_ATTEMPTS, this.firedAttempts);
        jSONObject.putOpt(FIELD_FIRED_REASON, this.firedReason);
        jSONObject.putOpt(FIELD_UPDATED_AT, radarUtils.dateToISOString$sdk_release(this.updatedAt));
        return jSONObject;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u0014\u0010\f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lio/radar/sdk/model/RadarTripOrder$Companion;", "", "()V", "FIELD_FIRED_AT", "", "FIELD_FIRED_ATTEMPTS", "FIELD_FIRED_REASON", "FIELD_GUID", "FIELD_HANDOFF_MODE", "FIELD_ID", "FIELD_STATUS", "FIELD_UPDATED_AT", "fromJson", "", "Lio/radar/sdk/model/RadarTripOrder;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarTripOrder;", "obj", "Lorg/json/JSONObject;", "stringForStatus", RadarTripOrder.FIELD_STATUS, "Lio/radar/sdk/model/RadarTripOrder$RadarTripOrderStatus;", "toJson", "orders", "([Lio/radar/sdk/model/RadarTripOrder;)Lorg/json/JSONArray;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarTripOrderStatus.values().length];
                try {
                    iArr[RadarTripOrderStatus.PENDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarTripOrderStatus.FIRED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarTripOrderStatus.CANCELED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RadarTripOrderStatus.COMPLETED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final RadarTripOrder fromJson(JSONObject obj) {
            String optString;
            String str;
            String str2;
            RadarTripOrderStatus radarTripOrderStatus;
            Integer num;
            String optString2;
            String str3;
            Date isoStringToDate$sdk_release;
            if (obj != null && (optString = obj.optString("id")) != null && optString.length() != 0) {
                String optString3 = obj.optString(RadarTripOrder.FIELD_GUID);
                optString3.getClass();
                if (optString3.length() > 0) {
                    str = optString3;
                } else {
                    str = null;
                }
                String optString4 = obj.optString(RadarTripOrder.FIELD_HANDOFF_MODE);
                optString4.getClass();
                if (optString4.length() > 0) {
                    str2 = optString4;
                } else {
                    str2 = null;
                }
                String optString5 = obj.optString(RadarTripOrder.FIELD_STATUS);
                if (optString5 != null) {
                    switch (optString5.hashCode()) {
                        case -1402931637:
                            if (optString5.equals(MetricTracker.Action.COMPLETED)) {
                                radarTripOrderStatus = RadarTripOrderStatus.COMPLETED;
                                break;
                            }
                            break;
                        case -682587753:
                            if (optString5.equals("pending")) {
                                radarTripOrderStatus = RadarTripOrderStatus.PENDING;
                                break;
                            }
                            break;
                        case -123173735:
                            if (optString5.equals("canceled")) {
                                radarTripOrderStatus = RadarTripOrderStatus.CANCELED;
                                break;
                            }
                            break;
                        case 97439982:
                            if (optString5.equals("fired")) {
                                radarTripOrderStatus = RadarTripOrderStatus.FIRED;
                                break;
                            }
                            break;
                    }
                    RadarTripOrderStatus radarTripOrderStatus2 = radarTripOrderStatus;
                    RadarUtils radarUtils = RadarUtils.INSTANCE;
                    Date isoStringToDate$sdk_release2 = radarUtils.isoStringToDate$sdk_release(obj.optString(RadarTripOrder.FIELD_FIRED_AT));
                    if (!obj.has(RadarTripOrder.FIELD_FIRED_ATTEMPTS) && !obj.isNull(RadarTripOrder.FIELD_FIRED_ATTEMPTS)) {
                        num = Integer.valueOf(obj.optInt(RadarTripOrder.FIELD_FIRED_ATTEMPTS));
                    } else {
                        num = null;
                    }
                    optString2 = obj.optString(RadarTripOrder.FIELD_FIRED_REASON);
                    optString2.getClass();
                    if (optString2.length() <= 0) {
                        str3 = optString2;
                    } else {
                        str3 = null;
                    }
                    isoStringToDate$sdk_release = radarUtils.isoStringToDate$sdk_release(obj.optString(RadarTripOrder.FIELD_UPDATED_AT));
                    if (isoStringToDate$sdk_release != null) {
                        return new RadarTripOrder(optString, str, str2, radarTripOrderStatus2, isoStringToDate$sdk_release2, num, str3, isoStringToDate$sdk_release);
                    }
                }
                radarTripOrderStatus = RadarTripOrderStatus.UNKNOWN;
                RadarTripOrderStatus radarTripOrderStatus22 = radarTripOrderStatus;
                RadarUtils radarUtils2 = RadarUtils.INSTANCE;
                Date isoStringToDate$sdk_release22 = radarUtils2.isoStringToDate$sdk_release(obj.optString(RadarTripOrder.FIELD_FIRED_AT));
                if (!obj.has(RadarTripOrder.FIELD_FIRED_ATTEMPTS)) {
                }
                num = null;
                optString2 = obj.optString(RadarTripOrder.FIELD_FIRED_REASON);
                optString2.getClass();
                if (optString2.length() <= 0) {
                }
                isoStringToDate$sdk_release = radarUtils2.isoStringToDate$sdk_release(obj.optString(RadarTripOrder.FIELD_UPDATED_AT));
                if (isoStringToDate$sdk_release != null) {
                }
            }
            return null;
        }

        public final String stringForStatus(RadarTripOrderStatus status) {
            status.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return "unknown";
                        }
                        return MetricTracker.Action.COMPLETED;
                    }
                    return "canceled";
                }
                return "fired";
            }
            return "pending";
        }

        public final JSONArray toJson(RadarTripOrder[] orders) {
            if (orders == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarTripOrder radarTripOrder : orders) {
                jSONArray.put(radarTripOrder.toJson());
            }
            return jSONArray;
        }

        private Companion() {
        }

        public final RadarTripOrder[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarTripOrder[] radarTripOrderArr = new RadarTripOrder[length];
            for (int i = 0; i < length; i++) {
                radarTripOrderArr[i] = RadarTripOrder.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarTripOrder[]) ArraysKt.filterNotNull(radarTripOrderArr).toArray(new RadarTripOrder[0]);
        }
    }

    public static final RadarTripOrder[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    public RadarTripOrder(String str, String str2, String str3, RadarTripOrderStatus radarTripOrderStatus, Date date, Integer num, String str4, Date date2) {
        str.getClass();
        radarTripOrderStatus.getClass();
        date2.getClass();
        this._id = str;
        this.guid = str2;
        this.handoffMode = str3;
        this.status = radarTripOrderStatus;
        this.firedAt = date;
        this.firedAttempts = num;
        this.firedReason = str4;
        this.updatedAt = date2;
    }

    public static final JSONArray toJson(RadarTripOrder[] radarTripOrderArr) {
        return INSTANCE.toJson(radarTripOrderArr);
    }
}
