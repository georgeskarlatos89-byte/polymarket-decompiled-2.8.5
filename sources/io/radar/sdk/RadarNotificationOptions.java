package io.radar.sdk;

import defpackage.m51;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003J\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003J\b\u0010 \u001a\u0004\u0018\u00010\u0003J\b\u0010!\u001a\u0004\u0018\u00010\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0006\u0010$\u001a\u00020%J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006("}, d2 = {"Lio/radar/sdk/RadarNotificationOptions;", "", "iconString", "", "iconColor", RadarNotificationOptions.KEY_FOREGROUNDSERVICE_ICON_STRING, RadarNotificationOptions.KEY_FOREGROUNDSERVICE_ICON_COLOR, RadarNotificationOptions.KEY_EVENT_ICON_STRING, RadarNotificationOptions.KEY_EVENT_ICON_COLOR, "deepLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeepLink", "()Ljava/lang/String;", "getEventIconColor", "getEventIconString", "getForegroundServiceIconColor", "getForegroundServiceIconString", "getIconColor", "getIconString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "getEventColor", "getEventIcon", "getForegroundServiceColor", "getForegroundServiceIcon", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RadarNotificationOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String KEY_DEEPLINK = "deepLink";
    public static final String KEY_EVENT_ICON_COLOR = "eventIconColor";
    public static final String KEY_EVENT_ICON_STRING = "eventIconString";
    public static final String KEY_FOREGROUNDSERVICE_ICON_COLOR = "foregroundServiceIconColor";
    public static final String KEY_FOREGROUNDSERVICE_ICON_STRING = "foregroundServiceIconString";
    public static final String KEY_ICON_COLOR = "iconColor";
    public static final String KEY_ICON_STRING = "iconString";
    private final String deepLink;
    private final String eventIconColor;
    private final String eventIconString;
    private final String foregroundServiceIconColor;
    private final String foregroundServiceIconString;
    private final String iconColor;
    private final String iconString;

    public /* synthetic */ RadarNotificationOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }

    public static /* synthetic */ RadarNotificationOptions copy$default(RadarNotificationOptions radarNotificationOptions, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = radarNotificationOptions.iconString;
        }
        if ((i & 2) != 0) {
            str2 = radarNotificationOptions.iconColor;
        }
        if ((i & 4) != 0) {
            str3 = radarNotificationOptions.foregroundServiceIconString;
        }
        if ((i & 8) != 0) {
            str4 = radarNotificationOptions.foregroundServiceIconColor;
        }
        if ((i & 16) != 0) {
            str5 = radarNotificationOptions.eventIconString;
        }
        if ((i & 32) != 0) {
            str6 = radarNotificationOptions.eventIconColor;
        }
        if ((i & 64) != 0) {
            str7 = radarNotificationOptions.deepLink;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return radarNotificationOptions.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final RadarNotificationOptions fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIconString() {
        return this.iconString;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getForegroundServiceIconString() {
        return this.foregroundServiceIconString;
    }

    /* renamed from: component4, reason: from getter */
    public final String getForegroundServiceIconColor() {
        return this.foregroundServiceIconColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEventIconString() {
        return this.eventIconString;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEventIconColor() {
        return this.eventIconColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDeepLink() {
        return this.deepLink;
    }

    public final RadarNotificationOptions copy(String iconString, String iconColor, String foregroundServiceIconString, String foregroundServiceIconColor, String eventIconString, String eventIconColor, String deepLink) {
        return new RadarNotificationOptions(iconString, iconColor, foregroundServiceIconString, foregroundServiceIconColor, eventIconString, eventIconColor, deepLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadarNotificationOptions)) {
            return false;
        }
        RadarNotificationOptions radarNotificationOptions = (RadarNotificationOptions) other;
        if (Intrinsics.areEqual(this.iconString, radarNotificationOptions.iconString) && Intrinsics.areEqual(this.iconColor, radarNotificationOptions.iconColor) && Intrinsics.areEqual(this.foregroundServiceIconString, radarNotificationOptions.foregroundServiceIconString) && Intrinsics.areEqual(this.foregroundServiceIconColor, radarNotificationOptions.foregroundServiceIconColor) && Intrinsics.areEqual(this.eventIconString, radarNotificationOptions.eventIconString) && Intrinsics.areEqual(this.eventIconColor, radarNotificationOptions.eventIconColor) && Intrinsics.areEqual(this.deepLink, radarNotificationOptions.deepLink)) {
            return true;
        }
        return false;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getEventColor() {
        String str = this.eventIconColor;
        if (str == null) {
            return this.iconColor;
        }
        return str;
    }

    public final String getEventIcon() {
        String str = this.eventIconString;
        if (str == null) {
            return this.iconString;
        }
        return str;
    }

    public final String getEventIconColor() {
        return this.eventIconColor;
    }

    public final String getEventIconString() {
        return this.eventIconString;
    }

    public final String getForegroundServiceColor() {
        String str = this.foregroundServiceIconColor;
        if (str == null) {
            return this.iconColor;
        }
        return str;
    }

    public final String getForegroundServiceIcon() {
        String str = this.foregroundServiceIconString;
        if (str == null) {
            return this.iconString;
        }
        return str;
    }

    public final String getForegroundServiceIconColor() {
        return this.foregroundServiceIconColor;
    }

    public final String getForegroundServiceIconString() {
        return this.foregroundServiceIconString;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final String getIconString() {
        return this.iconString;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.iconString;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.iconColor;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.foregroundServiceIconString;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.foregroundServiceIconColor;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.eventIconString;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.eventIconColor;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.deepLink;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return i7 + i;
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("iconString", this.iconString);
        jSONObject.put("iconColor", this.iconColor);
        jSONObject.put(KEY_FOREGROUNDSERVICE_ICON_STRING, this.foregroundServiceIconString);
        jSONObject.put(KEY_FOREGROUNDSERVICE_ICON_COLOR, this.foregroundServiceIconColor);
        jSONObject.put(KEY_EVENT_ICON_STRING, this.eventIconString);
        jSONObject.put(KEY_EVENT_ICON_COLOR, this.eventIconColor);
        jSONObject.put("deepLink", this.deepLink);
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RadarNotificationOptions(iconString=");
        sb.append(this.iconString);
        sb.append(", iconColor=");
        sb.append(this.iconColor);
        sb.append(", foregroundServiceIconString=");
        sb.append(this.foregroundServiceIconString);
        sb.append(", foregroundServiceIconColor=");
        sb.append(this.foregroundServiceIconColor);
        sb.append(", eventIconString=");
        sb.append(this.eventIconString);
        sb.append(", eventIconColor=");
        sb.append(this.eventIconColor);
        sb.append(", deepLink=");
        return m51.m(sb, this.deepLink, ')');
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/radar/sdk/RadarNotificationOptions$Companion;", "", "()V", "KEY_DEEPLINK", "", "KEY_EVENT_ICON_COLOR", "KEY_EVENT_ICON_STRING", "KEY_FOREGROUNDSERVICE_ICON_COLOR", "KEY_FOREGROUNDSERVICE_ICON_STRING", "KEY_ICON_COLOR", "KEY_ICON_STRING", "fromJson", "Lio/radar/sdk/RadarNotificationOptions;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RadarNotificationOptions fromJson(JSONObject obj) {
            String optString;
            String optString2;
            String optString3;
            String optString4;
            String optString5;
            String optString6;
            obj.getClass();
            String str = null;
            if (obj.isNull("iconString")) {
                optString = null;
            } else {
                optString = obj.optString("iconString");
            }
            if (obj.isNull("iconColor")) {
                optString2 = null;
            } else {
                optString2 = obj.optString("iconColor");
            }
            if (obj.isNull(RadarNotificationOptions.KEY_FOREGROUNDSERVICE_ICON_STRING)) {
                optString3 = null;
            } else {
                optString3 = obj.optString(RadarNotificationOptions.KEY_FOREGROUNDSERVICE_ICON_STRING);
            }
            if (obj.isNull(RadarNotificationOptions.KEY_FOREGROUNDSERVICE_ICON_COLOR)) {
                optString4 = null;
            } else {
                optString4 = obj.optString(RadarNotificationOptions.KEY_FOREGROUNDSERVICE_ICON_COLOR);
            }
            if (obj.isNull(RadarNotificationOptions.KEY_EVENT_ICON_STRING)) {
                optString5 = null;
            } else {
                optString5 = obj.optString(RadarNotificationOptions.KEY_EVENT_ICON_STRING);
            }
            if (obj.isNull(RadarNotificationOptions.KEY_EVENT_ICON_COLOR)) {
                optString6 = null;
            } else {
                optString6 = obj.optString(RadarNotificationOptions.KEY_EVENT_ICON_COLOR);
            }
            if (!obj.isNull("deepLink")) {
                str = obj.optString("deepLink");
            }
            return new RadarNotificationOptions(optString, optString2, optString3, optString4, optString5, optString6, str);
        }

        private Companion() {
        }
    }

    public RadarNotificationOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.iconString = str;
        this.iconColor = str2;
        this.foregroundServiceIconString = str3;
        this.foregroundServiceIconColor = str4;
        this.eventIconString = str5;
        this.eventIconColor = str6;
        this.deepLink = str7;
    }

    public RadarNotificationOptions() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
