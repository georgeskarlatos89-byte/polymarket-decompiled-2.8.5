package io.intercom.android.sdk.helpcenter.articles;

import defpackage.m51;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ArticleMetadata {
    public static final int $stable = 0;
    private final String id;
    private final String title;

    public ArticleMetadata(String str, String str2) {
        str.getClass();
        this.id = str;
        this.title = str2;
    }

    public static /* synthetic */ ArticleMetadata copy$default(ArticleMetadata articleMetadata, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = articleMetadata.id;
        }
        if ((i & 2) != 0) {
            str2 = articleMetadata.title;
        }
        return articleMetadata.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ArticleMetadata copy(String id, String title) {
        id.getClass();
        return new ArticleMetadata(id, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleMetadata)) {
            return false;
        }
        ArticleMetadata articleMetadata = (ArticleMetadata) other;
        if (Intrinsics.areEqual(this.id, articleMetadata.id) && Intrinsics.areEqual(this.title, articleMetadata.title)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.id.hashCode() * 31;
        String str = this.title;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ArticleMetadata(id=");
        sb.append(this.id);
        sb.append(", title=");
        return m51.m(sb, this.title, ')');
    }

    public /* synthetic */ ArticleMetadata(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
