package io.radar.sdk.model;

import defpackage.m51;
import io.radar.sdk.model.RadarMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lio/radar/sdk/model/RadarConfig;", "", RadarConfig.META, "Lio/radar/sdk/model/RadarMeta;", "googlePlayProjectNumber", "", RadarConfig.NONCE, "", "(Lio/radar/sdk/model/RadarMeta;Ljava/lang/Long;Ljava/lang/String;)V", "getGooglePlayProjectNumber", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMeta", "()Lio/radar/sdk/model/RadarMeta;", "getNonce", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Lio/radar/sdk/model/RadarMeta;Ljava/lang/Long;Ljava/lang/String;)Lio/radar/sdk/model/RadarConfig;", "equals", "", "other", "hashCode", "", "toString", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RadarConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String GOOGLE_CLOUD_PROJECT_NUMBER = "googleCloudProjectNumber";
    private static final String META = "meta";
    private static final String NONCE = "nonce";
    private final Long googlePlayProjectNumber;
    private final RadarMeta meta;
    private final String nonce;

    public RadarConfig(RadarMeta radarMeta, Long l, String str) {
        radarMeta.getClass();
        this.meta = radarMeta;
        this.googlePlayProjectNumber = l;
        this.nonce = str;
    }

    public static /* synthetic */ RadarConfig copy$default(RadarConfig radarConfig, RadarMeta radarMeta, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            radarMeta = radarConfig.meta;
        }
        if ((i & 2) != 0) {
            l = radarConfig.googlePlayProjectNumber;
        }
        if ((i & 4) != 0) {
            str = radarConfig.nonce;
        }
        return radarConfig.copy(radarMeta, l, str);
    }

    /* renamed from: component1, reason: from getter */
    public final RadarMeta getMeta() {
        return this.meta;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getGooglePlayProjectNumber() {
        return this.googlePlayProjectNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    public final RadarConfig copy(RadarMeta meta, Long googlePlayProjectNumber, String nonce) {
        meta.getClass();
        return new RadarConfig(meta, googlePlayProjectNumber, nonce);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadarConfig)) {
            return false;
        }
        RadarConfig radarConfig = (RadarConfig) other;
        if (Intrinsics.areEqual(this.meta, radarConfig.meta) && Intrinsics.areEqual(this.googlePlayProjectNumber, radarConfig.googlePlayProjectNumber) && Intrinsics.areEqual(this.nonce, radarConfig.nonce)) {
            return true;
        }
        return false;
    }

    public final Long getGooglePlayProjectNumber() {
        return this.googlePlayProjectNumber;
    }

    public final RadarMeta getMeta() {
        return this.meta;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.meta.hashCode() * 31;
        Long l = this.googlePlayProjectNumber;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.nonce;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RadarConfig(meta=");
        sb.append(this.meta);
        sb.append(", googlePlayProjectNumber=");
        sb.append(this.googlePlayProjectNumber);
        sb.append(", nonce=");
        return m51.m(sb, this.nonce, ')');
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/radar/sdk/model/RadarConfig$Companion;", "", "()V", "GOOGLE_CLOUD_PROJECT_NUMBER", "", "META", "NONCE", "fromJson", "Lio/radar/sdk/model/RadarConfig;", "res", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RadarConfig fromJson(JSONObject res) {
            JSONObject jSONObject;
            Long l;
            RadarMeta.Companion companion = RadarMeta.INSTANCE;
            String str = null;
            if (res != null) {
                jSONObject = res.optJSONObject(RadarConfig.META);
            } else {
                jSONObject = null;
            }
            RadarMeta fromJson = companion.fromJson(jSONObject);
            if (res != null) {
                l = Long.valueOf(res.optLong(RadarConfig.GOOGLE_CLOUD_PROJECT_NUMBER));
            } else {
                l = null;
            }
            if (res != null) {
                str = res.optString(RadarConfig.NONCE);
            }
            return new RadarConfig(fromJson, l, str);
        }

        private Companion() {
        }
    }
}
