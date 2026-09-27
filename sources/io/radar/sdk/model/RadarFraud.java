package io.radar.sdk.model;

import com.google.mlkit.vision.barcode.common.Barcode;
import defpackage.hdi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\u0006\u0010(\u001a\u00020)J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006-"}, d2 = {"Lio/radar/sdk/model/RadarFraud;", "", RadarFraud.PASSED, "", RadarFraud.BYPASSED, RadarFraud.VERIFIED, RadarFraud.PROXY, RadarFraud.MOCKED, RadarFraud.COMPROMISED, RadarFraud.JUMPED, RadarFraud.SHARING, RadarFraud.INACCURATE, RadarFraud.BLOCKED, "(ZZZZZZZZZZ)V", "getBlocked", "()Z", "getBypassed", "getCompromised", "getInaccurate", "getJumped", "getMocked", "getPassed", "getProxy", "getSharing", "getVerified", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RadarFraud {
    private static final String BLOCKED = "blocked";
    private static final String BYPASSED = "bypassed";
    private static final String COMPROMISED = "compromised";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String INACCURATE = "inaccurate";
    private static final String JUMPED = "jumped";
    private static final String MOCKED = "mocked";
    private static final String PASSED = "passed";
    private static final String PROXY = "proxy";
    private static final String SHARING = "sharing";
    private static final String VERIFIED = "verified";
    private final boolean blocked;
    private final boolean bypassed;
    private final boolean compromised;
    private final boolean inaccurate;
    private final boolean jumped;
    private final boolean mocked;
    private final boolean passed;
    private final boolean proxy;
    private final boolean sharing;
    private final boolean verified;

    public RadarFraud(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.passed = z;
        this.bypassed = z2;
        this.verified = z3;
        this.proxy = z4;
        this.mocked = z5;
        this.compromised = z6;
        this.jumped = z7;
        this.sharing = z8;
        this.inaccurate = z9;
        this.blocked = z10;
    }

    public static /* synthetic */ RadarFraud copy$default(RadarFraud radarFraud, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, Object obj) {
        if ((i & 1) != 0) {
            z = radarFraud.passed;
        }
        if ((i & 2) != 0) {
            z2 = radarFraud.bypassed;
        }
        if ((i & 4) != 0) {
            z3 = radarFraud.verified;
        }
        if ((i & 8) != 0) {
            z4 = radarFraud.proxy;
        }
        if ((i & 16) != 0) {
            z5 = radarFraud.mocked;
        }
        if ((i & 32) != 0) {
            z6 = radarFraud.compromised;
        }
        if ((i & 64) != 0) {
            z7 = radarFraud.jumped;
        }
        if ((i & 128) != 0) {
            z8 = radarFraud.sharing;
        }
        if ((i & 256) != 0) {
            z9 = radarFraud.inaccurate;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            z10 = radarFraud.blocked;
        }
        boolean z11 = z9;
        boolean z12 = z10;
        boolean z13 = z7;
        boolean z14 = z8;
        boolean z15 = z5;
        boolean z16 = z6;
        return radarFraud.copy(z, z2, z3, z4, z15, z16, z13, z14, z11, z12);
    }

    public static final RadarFraud fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPassed() {
        return this.passed;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getBlocked() {
        return this.blocked;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getBypassed() {
        return this.bypassed;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getVerified() {
        return this.verified;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getProxy() {
        return this.proxy;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getMocked() {
        return this.mocked;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCompromised() {
        return this.compromised;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getJumped() {
        return this.jumped;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSharing() {
        return this.sharing;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getInaccurate() {
        return this.inaccurate;
    }

    public final RadarFraud copy(boolean passed, boolean bypassed, boolean verified, boolean proxy, boolean mocked, boolean compromised, boolean jumped, boolean sharing, boolean inaccurate, boolean blocked) {
        return new RadarFraud(passed, bypassed, verified, proxy, mocked, compromised, jumped, sharing, inaccurate, blocked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadarFraud)) {
            return false;
        }
        RadarFraud radarFraud = (RadarFraud) other;
        if (this.passed == radarFraud.passed && this.bypassed == radarFraud.bypassed && this.verified == radarFraud.verified && this.proxy == radarFraud.proxy && this.mocked == radarFraud.mocked && this.compromised == radarFraud.compromised && this.jumped == radarFraud.jumped && this.sharing == radarFraud.sharing && this.inaccurate == radarFraud.inaccurate && this.blocked == radarFraud.blocked) {
            return true;
        }
        return false;
    }

    public final boolean getBlocked() {
        return this.blocked;
    }

    public final boolean getBypassed() {
        return this.bypassed;
    }

    public final boolean getCompromised() {
        return this.compromised;
    }

    public final boolean getInaccurate() {
        return this.inaccurate;
    }

    public final boolean getJumped() {
        return this.jumped;
    }

    public final boolean getMocked() {
        return this.mocked;
    }

    public final boolean getPassed() {
        return this.passed;
    }

    public final boolean getProxy() {
        return this.proxy;
    }

    public final boolean getSharing() {
        return this.sharing;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    public int hashCode() {
        return Boolean.hashCode(this.blocked) + hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(hdi.g(Boolean.hashCode(this.passed) * 31, 31, this.bypassed), 31, this.verified), 31, this.proxy), 31, this.mocked), 31, this.compromised), 31, this.jumped), 31, this.sharing), 31, this.inaccurate);
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(PASSED, Boolean.valueOf(this.passed));
        jSONObject.putOpt(BYPASSED, Boolean.valueOf(this.bypassed));
        jSONObject.putOpt(VERIFIED, Boolean.valueOf(this.verified));
        jSONObject.putOpt(PROXY, Boolean.valueOf(this.proxy));
        jSONObject.putOpt(MOCKED, Boolean.valueOf(this.mocked));
        jSONObject.putOpt(COMPROMISED, Boolean.valueOf(this.compromised));
        jSONObject.putOpt(JUMPED, Boolean.valueOf(this.jumped));
        jSONObject.putOpt(SHARING, Boolean.valueOf(this.sharing));
        jSONObject.putOpt(INACCURATE, Boolean.valueOf(this.inaccurate));
        jSONObject.putOpt(BLOCKED, Boolean.valueOf(this.blocked));
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RadarFraud(passed=");
        sb.append(this.passed);
        sb.append(", bypassed=");
        sb.append(this.bypassed);
        sb.append(", verified=");
        sb.append(this.verified);
        sb.append(", proxy=");
        sb.append(this.proxy);
        sb.append(", mocked=");
        sb.append(this.mocked);
        sb.append(", compromised=");
        sb.append(this.compromised);
        sb.append(", jumped=");
        sb.append(this.jumped);
        sb.append(", sharing=");
        sb.append(this.sharing);
        sb.append(", inaccurate=");
        sb.append(this.inaccurate);
        sb.append(", blocked=");
        return hdi.t(sb, this.blocked, ')');
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lio/radar/sdk/model/RadarFraud$Companion;", "", "()V", "BLOCKED", "", "BYPASSED", "COMPROMISED", "INACCURATE", "JUMPED", "MOCKED", "PASSED", "PROXY", "SHARING", "VERIFIED", "fromJson", "Lio/radar/sdk/model/RadarFraud;", "json", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RadarFraud fromJson(JSONObject json) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10 = false;
            if (json != null) {
                z = json.optBoolean(RadarFraud.PASSED, false);
            } else {
                z = false;
            }
            if (json != null) {
                z2 = json.optBoolean(RadarFraud.BYPASSED, false);
            } else {
                z2 = false;
            }
            if (json != null) {
                z3 = json.optBoolean(RadarFraud.VERIFIED, false);
            } else {
                z3 = false;
            }
            if (json != null) {
                z4 = json.optBoolean(RadarFraud.PROXY, false);
            } else {
                z4 = false;
            }
            if (json != null) {
                z5 = json.optBoolean(RadarFraud.MOCKED, false);
            } else {
                z5 = false;
            }
            if (json != null) {
                z6 = json.optBoolean(RadarFraud.COMPROMISED, false);
            } else {
                z6 = false;
            }
            if (json != null) {
                z7 = json.optBoolean(RadarFraud.JUMPED, false);
            } else {
                z7 = false;
            }
            if (json != null) {
                z8 = json.optBoolean(RadarFraud.SHARING, false);
            } else {
                z8 = false;
            }
            if (json != null) {
                z9 = json.optBoolean(RadarFraud.INACCURATE, false);
            } else {
                z9 = false;
            }
            if (json != null) {
                z10 = json.optBoolean(RadarFraud.BLOCKED, false);
            }
            return new RadarFraud(z, z2, z3, z4, z5, z6, z7, z8, z9, z10);
        }

        private Companion() {
        }
    }
}
