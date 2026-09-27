package io.intercom.android.sdk.models;

import com.fingerprintjs.android.fpjs_pro.g;
import defpackage.hdi;
import defpackage.m51;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/models/InlineSource;", "", "dataEntityId", "", "dataEntityType", "dataSourceIndex", "href", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDataEntityId", "()Ljava/lang/String;", "getDataEntityType", "getDataSourceIndex", "getHref", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InlineSource {
    public static final int $stable = 0;
    private final String dataEntityId;
    private final String dataEntityType;
    private final String dataSourceIndex;
    private final String href;
    private final String title;

    public InlineSource(String str, String str2, String str3, String str4, String str5) {
        g.x(str, str3, str4);
        this.dataEntityId = str;
        this.dataEntityType = str2;
        this.dataSourceIndex = str3;
        this.href = str4;
        this.title = str5;
    }

    public static /* synthetic */ InlineSource copy$default(InlineSource inlineSource, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inlineSource.dataEntityId;
        }
        if ((i & 2) != 0) {
            str2 = inlineSource.dataEntityType;
        }
        if ((i & 4) != 0) {
            str3 = inlineSource.dataSourceIndex;
        }
        if ((i & 8) != 0) {
            str4 = inlineSource.href;
        }
        if ((i & 16) != 0) {
            str5 = inlineSource.title;
        }
        String str6 = str5;
        String str7 = str3;
        return inlineSource.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDataEntityId() {
        return this.dataEntityId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDataEntityType() {
        return this.dataEntityType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDataSourceIndex() {
        return this.dataSourceIndex;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHref() {
        return this.href;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final InlineSource copy(String dataEntityId, String dataEntityType, String dataSourceIndex, String href, String title) {
        dataEntityId.getClass();
        dataSourceIndex.getClass();
        href.getClass();
        return new InlineSource(dataEntityId, dataEntityType, dataSourceIndex, href, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InlineSource)) {
            return false;
        }
        InlineSource inlineSource = (InlineSource) other;
        if (Intrinsics.areEqual(this.dataEntityId, inlineSource.dataEntityId) && Intrinsics.areEqual(this.dataEntityType, inlineSource.dataEntityType) && Intrinsics.areEqual(this.dataSourceIndex, inlineSource.dataSourceIndex) && Intrinsics.areEqual(this.href, inlineSource.href) && Intrinsics.areEqual(this.title, inlineSource.title)) {
            return true;
        }
        return false;
    }

    public final String getDataEntityId() {
        return this.dataEntityId;
    }

    public final String getDataEntityType() {
        return this.dataEntityType;
    }

    public final String getDataSourceIndex() {
        return this.dataSourceIndex;
    }

    public final String getHref() {
        return this.href;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.dataEntityId.hashCode() * 31;
        String str = this.dataEntityType;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e = hdi.e(hdi.e((hashCode2 + hashCode) * 31, 31, this.dataSourceIndex), 31, this.href);
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return e + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InlineSource(dataEntityId=");
        sb.append(this.dataEntityId);
        sb.append(", dataEntityType=");
        sb.append(this.dataEntityType);
        sb.append(", dataSourceIndex=");
        sb.append(this.dataSourceIndex);
        sb.append(", href=");
        sb.append(this.href);
        sb.append(", title=");
        return m51.m(sb, this.title, ')');
    }
}
