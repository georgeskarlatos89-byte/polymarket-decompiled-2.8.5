package io.intercom.android.sdk.survey.model;

import com.google.gson.annotations.SerializedName;
import com.socure.docv.capturesdk.api.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/survey/model/SurveySenderData;", "", "firstName", "", Keys.KEY_NAME, "initials", "avatar", "Lio/intercom/android/sdk/survey/model/SurveySenderAvatar;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/survey/model/SurveySenderAvatar;)V", "getFirstName", "()Ljava/lang/String;", "getName", "getInitials", "getAvatar", "()Lio/intercom/android/sdk/survey/model/SurveySenderAvatar;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SurveySenderData {
    public static final int $stable = 0;

    @SerializedName("avatar")
    private final SurveySenderAvatar avatar;

    @SerializedName("first_name")
    private final String firstName;

    @SerializedName("initial")
    private final String initials;

    @SerializedName(Keys.KEY_NAME)
    private final String name;

    public /* synthetic */ SurveySenderData(String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : surveySenderAvatar);
    }

    public static /* synthetic */ SurveySenderData copy$default(SurveySenderData surveySenderData, String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveySenderData.firstName;
        }
        if ((i & 2) != 0) {
            str2 = surveySenderData.name;
        }
        if ((i & 4) != 0) {
            str3 = surveySenderData.initials;
        }
        if ((i & 8) != 0) {
            surveySenderAvatar = surveySenderData.avatar;
        }
        return surveySenderData.copy(str, str2, str3, surveySenderAvatar);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInitials() {
        return this.initials;
    }

    /* renamed from: component4, reason: from getter */
    public final SurveySenderAvatar getAvatar() {
        return this.avatar;
    }

    public final SurveySenderData copy(String firstName, String name, String initials, SurveySenderAvatar avatar) {
        return new SurveySenderData(firstName, name, initials, avatar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveySenderData)) {
            return false;
        }
        SurveySenderData surveySenderData = (SurveySenderData) other;
        if (Intrinsics.areEqual(this.firstName, surveySenderData.firstName) && Intrinsics.areEqual(this.name, surveySenderData.name) && Intrinsics.areEqual(this.initials, surveySenderData.initials) && Intrinsics.areEqual(this.avatar, surveySenderData.avatar)) {
            return true;
        }
        return false;
    }

    public final SurveySenderAvatar getAvatar() {
        return this.avatar;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getInitials() {
        return this.initials;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.firstName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.name;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.initials;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        SurveySenderAvatar surveySenderAvatar = this.avatar;
        if (surveySenderAvatar != null) {
            i = surveySenderAvatar.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        return "SurveySenderData(firstName=" + this.firstName + ", name=" + this.name + ", initials=" + this.initials + ", avatar=" + this.avatar + ')';
    }

    public SurveySenderData(String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar) {
        this.firstName = str;
        this.name = str2;
        this.initials = str3;
        this.avatar = surveySenderAvatar;
    }

    public SurveySenderData() {
        this(null, null, null, null, 15, null);
    }
}
