package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/models/FooterNotice;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "subtitle", "avatarDetails", "Lio/intercom/android/sdk/models/AvatarDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/AvatarDetails;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAvatarDetails", "()Lio/intercom/android/sdk/models/AvatarDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FooterNotice {
    public static final int $stable = 8;

    @SerializedName("avatar_details")
    private final AvatarDetails avatarDetails;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE)
    private final String title;

    public FooterNotice(String str, String str2, AvatarDetails avatarDetails) {
        str.getClass();
        this.title = str;
        this.subtitle = str2;
        this.avatarDetails = avatarDetails;
    }

    public static /* synthetic */ FooterNotice copy$default(FooterNotice footerNotice, String str, String str2, AvatarDetails avatarDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = footerNotice.title;
        }
        if ((i & 2) != 0) {
            str2 = footerNotice.subtitle;
        }
        if ((i & 4) != 0) {
            avatarDetails = footerNotice.avatarDetails;
        }
        return footerNotice.copy(str, str2, avatarDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final AvatarDetails getAvatarDetails() {
        return this.avatarDetails;
    }

    public final FooterNotice copy(String title, String subtitle, AvatarDetails avatarDetails) {
        title.getClass();
        return new FooterNotice(title, subtitle, avatarDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FooterNotice)) {
            return false;
        }
        FooterNotice footerNotice = (FooterNotice) other;
        if (Intrinsics.areEqual(this.title, footerNotice.title) && Intrinsics.areEqual(this.subtitle, footerNotice.subtitle) && Intrinsics.areEqual(this.avatarDetails, footerNotice.avatarDetails)) {
            return true;
        }
        return false;
    }

    public final AvatarDetails getAvatarDetails() {
        return this.avatarDetails;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.title.hashCode() * 31;
        String str = this.subtitle;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        AvatarDetails avatarDetails = this.avatarDetails;
        if (avatarDetails != null) {
            i = avatarDetails.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "FooterNotice(title=" + this.title + ", subtitle=" + this.subtitle + ", avatarDetails=" + this.avatarDetails + ')';
    }
}
