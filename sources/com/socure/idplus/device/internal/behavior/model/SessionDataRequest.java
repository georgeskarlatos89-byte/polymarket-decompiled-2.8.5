package com.socure.idplus.device.internal.behavior.model;

import com.google.gson.annotations.SerializedName;
import defpackage.k84;
import defpackage.woa;
import io.radar.sdk.RadarTripOptions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, d2 = {"Lcom/socure/idplus/device/internal/behavior/model/SessionDataRequest;", "", RadarTripOptions.KEY_METADATA, "Lcom/socure/idplus/device/internal/behavior/model/Metadata;", "sessionId", "", "pageId", "sessionDataIndex", "", "sessionData", "Lcom/socure/idplus/device/internal/behavior/model/SessionData;", "(Lcom/socure/idplus/device/internal/behavior/model/Metadata;Ljava/lang/String;Ljava/lang/String;ILcom/socure/idplus/device/internal/behavior/model/SessionData;)V", "getMetadata", "()Lcom/socure/idplus/device/internal/behavior/model/Metadata;", "getPageId", "()Ljava/lang/String;", "getSessionData", "()Lcom/socure/idplus/device/internal/behavior/model/SessionData;", "getSessionDataIndex", "()I", "getSessionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SessionDataRequest {

    @SerializedName(RadarTripOptions.KEY_METADATA)
    private final Metadata metadata;

    @SerializedName("pageId")
    private final String pageId;

    @SerializedName("sessionData")
    private final SessionData sessionData;

    @SerializedName("sessionDataIndex")
    private final int sessionDataIndex;

    @SerializedName("sessionId")
    private final String sessionId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SessionDataRequest(Metadata metadata, String str, String str2, int i, SessionData sessionData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(metadata, (i2 & 2) != 0 ? null : str, str2, i, sessionData);
        if ((i2 & 1) != 0) {
            NavigationContext.Companion.getClass();
            metadata = new Metadata(null, null, null, new NavigationContext(NavigationContext.UNSET, 0L, null, 4, null), 7, null);
        }
    }

    public static /* synthetic */ SessionDataRequest copy$default(SessionDataRequest sessionDataRequest, Metadata metadata, String str, String str2, int i, SessionData sessionData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            metadata = sessionDataRequest.metadata;
        }
        if ((i2 & 2) != 0) {
            str = sessionDataRequest.sessionId;
        }
        if ((i2 & 4) != 0) {
            str2 = sessionDataRequest.pageId;
        }
        if ((i2 & 8) != 0) {
            i = sessionDataRequest.sessionDataIndex;
        }
        if ((i2 & 16) != 0) {
            sessionData = sessionDataRequest.sessionData;
        }
        SessionData sessionData2 = sessionData;
        String str3 = str2;
        return sessionDataRequest.copy(metadata, str, str3, i, sessionData2);
    }

    /* renamed from: component1, reason: from getter */
    public final Metadata getMetadata() {
        return this.metadata;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSessionDataIndex() {
        return this.sessionDataIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final SessionData getSessionData() {
        return this.sessionData;
    }

    public final SessionDataRequest copy(Metadata metadata, String sessionId, String pageId, int sessionDataIndex, SessionData sessionData) {
        metadata.getClass();
        pageId.getClass();
        sessionData.getClass();
        return new SessionDataRequest(metadata, sessionId, pageId, sessionDataIndex, sessionData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDataRequest)) {
            return false;
        }
        SessionDataRequest sessionDataRequest = (SessionDataRequest) other;
        if (Intrinsics.areEqual(this.metadata, sessionDataRequest.metadata) && Intrinsics.areEqual(this.sessionId, sessionDataRequest.sessionId) && Intrinsics.areEqual(this.pageId, sessionDataRequest.pageId) && this.sessionDataIndex == sessionDataRequest.sessionDataIndex && Intrinsics.areEqual(this.sessionData, sessionDataRequest.sessionData)) {
            return true;
        }
        return false;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final SessionData getSessionData() {
        return this.sessionData;
    }

    public final int getSessionDataIndex() {
        return this.sessionDataIndex;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.metadata.hashCode() * 31;
        String str = this.sessionId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.sessionData.hashCode() + woa.b(this.sessionDataIndex, a.a(this.pageId, (hashCode2 + hashCode) * 31, 31), 31);
    }

    public String toString() {
        Metadata metadata = this.metadata;
        String str = this.sessionId;
        String str2 = this.pageId;
        int i = this.sessionDataIndex;
        SessionData sessionData = this.sessionData;
        StringBuilder sb = new StringBuilder("SessionDataRequest(metadata=");
        sb.append(metadata);
        sb.append(", sessionId=");
        sb.append(str);
        sb.append(", pageId=");
        k84.l(i, str2, ", sessionDataIndex=", ", sessionData=", sb);
        sb.append(sessionData);
        sb.append(")");
        return sb.toString();
    }

    public SessionDataRequest(Metadata metadata, String str, String str2, int i, SessionData sessionData) {
        metadata.getClass();
        str2.getClass();
        sessionData.getClass();
        this.metadata = metadata;
        this.sessionId = str;
        this.pageId = str2;
        this.sessionDataIndex = i;
        this.sessionData = sessionData;
    }
}
