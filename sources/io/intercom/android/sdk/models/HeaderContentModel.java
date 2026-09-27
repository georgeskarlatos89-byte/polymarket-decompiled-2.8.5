package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.hdi;
import defpackage.m51;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010'\u001a\u00020(H×\u0001J\t\u0010)\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/models/HeaderContentModel;", "", "logoUrl", "", "logoDarkUrl", "showAvatars", "", "greeting", "Lio/intercom/android/sdk/models/HeaderTextModel;", "intro", "closeButton", "Lio/intercom/android/sdk/models/CloseButtonModel;", "textColorType", "textColorTypeDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/HeaderTextModel;Lio/intercom/android/sdk/models/HeaderTextModel;Lio/intercom/android/sdk/models/CloseButtonModel;Ljava/lang/String;Ljava/lang/String;)V", "getLogoUrl", "()Ljava/lang/String;", "getLogoDarkUrl", "getShowAvatars", "()Z", "getGreeting", "()Lio/intercom/android/sdk/models/HeaderTextModel;", "getIntro", "getCloseButton", "()Lio/intercom/android/sdk/models/CloseButtonModel;", "getTextColorType", "getTextColorTypeDark", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HeaderContentModel {
    public static final int $stable = 0;

    @SerializedName("close_button")
    private final CloseButtonModel closeButton;

    @SerializedName("greeting")
    private final HeaderTextModel greeting;

    @SerializedName("introduction")
    private final HeaderTextModel intro;

    @SerializedName("logo_dark_url")
    private final String logoDarkUrl;

    @SerializedName("logo_url")
    private final String logoUrl;

    @SerializedName("show_avatars")
    private final boolean showAvatars;

    @SerializedName("text_color_type")
    private final String textColorType;

    @SerializedName("text_color_type_dark")
    private final String textColorTypeDark;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HeaderContentModel(String str, String str2, boolean z, HeaderTextModel headerTextModel, HeaderTextModel headerTextModel2, CloseButtonModel closeButtonModel, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r1, r3, r5, r6, r7, r4, r23);
        String str5;
        boolean z2;
        HeaderTextModel headerTextModel3;
        HeaderTextModel headerTextModel4;
        CloseButtonModel closeButtonModel2;
        String str6;
        String str7;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i & 8) != 0) {
            headerTextModel3 = new HeaderTextModel(null, 0.0f, null, null, 15, null);
        } else {
            headerTextModel3 = headerTextModel;
        }
        if ((i & 16) != 0) {
            headerTextModel4 = new HeaderTextModel(null, 0.0f, null, null, 15, null);
        } else {
            headerTextModel4 = headerTextModel2;
        }
        if ((i & 32) != 0) {
            closeButtonModel2 = new CloseButtonModel(null, 0.0f, null, 7, null);
        } else {
            closeButtonModel2 = closeButtonModel;
        }
        if ((i & 64) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 128) != 0) {
            str7 = null;
        } else {
            str7 = str4;
        }
    }

    public static /* synthetic */ HeaderContentModel copy$default(HeaderContentModel headerContentModel, String str, String str2, boolean z, HeaderTextModel headerTextModel, HeaderTextModel headerTextModel2, CloseButtonModel closeButtonModel, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headerContentModel.logoUrl;
        }
        if ((i & 2) != 0) {
            str2 = headerContentModel.logoDarkUrl;
        }
        if ((i & 4) != 0) {
            z = headerContentModel.showAvatars;
        }
        if ((i & 8) != 0) {
            headerTextModel = headerContentModel.greeting;
        }
        if ((i & 16) != 0) {
            headerTextModel2 = headerContentModel.intro;
        }
        if ((i & 32) != 0) {
            closeButtonModel = headerContentModel.closeButton;
        }
        if ((i & 64) != 0) {
            str3 = headerContentModel.textColorType;
        }
        if ((i & 128) != 0) {
            str4 = headerContentModel.textColorTypeDark;
        }
        String str5 = str3;
        String str6 = str4;
        HeaderTextModel headerTextModel3 = headerTextModel2;
        CloseButtonModel closeButtonModel2 = closeButtonModel;
        return headerContentModel.copy(str, str2, z, headerTextModel, headerTextModel3, closeButtonModel2, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLogoDarkUrl() {
        return this.logoDarkUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowAvatars() {
        return this.showAvatars;
    }

    /* renamed from: component4, reason: from getter */
    public final HeaderTextModel getGreeting() {
        return this.greeting;
    }

    /* renamed from: component5, reason: from getter */
    public final HeaderTextModel getIntro() {
        return this.intro;
    }

    /* renamed from: component6, reason: from getter */
    public final CloseButtonModel getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTextColorType() {
        return this.textColorType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTextColorTypeDark() {
        return this.textColorTypeDark;
    }

    public final HeaderContentModel copy(String logoUrl, String logoDarkUrl, boolean showAvatars, HeaderTextModel greeting, HeaderTextModel intro, CloseButtonModel closeButton, String textColorType, String textColorTypeDark) {
        logoUrl.getClass();
        greeting.getClass();
        intro.getClass();
        closeButton.getClass();
        return new HeaderContentModel(logoUrl, logoDarkUrl, showAvatars, greeting, intro, closeButton, textColorType, textColorTypeDark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderContentModel)) {
            return false;
        }
        HeaderContentModel headerContentModel = (HeaderContentModel) other;
        if (Intrinsics.areEqual(this.logoUrl, headerContentModel.logoUrl) && Intrinsics.areEqual(this.logoDarkUrl, headerContentModel.logoDarkUrl) && this.showAvatars == headerContentModel.showAvatars && Intrinsics.areEqual(this.greeting, headerContentModel.greeting) && Intrinsics.areEqual(this.intro, headerContentModel.intro) && Intrinsics.areEqual(this.closeButton, headerContentModel.closeButton) && Intrinsics.areEqual(this.textColorType, headerContentModel.textColorType) && Intrinsics.areEqual(this.textColorTypeDark, headerContentModel.textColorTypeDark)) {
            return true;
        }
        return false;
    }

    public final CloseButtonModel getCloseButton() {
        return this.closeButton;
    }

    public final HeaderTextModel getGreeting() {
        return this.greeting;
    }

    public final HeaderTextModel getIntro() {
        return this.intro;
    }

    public final String getLogoDarkUrl() {
        return this.logoDarkUrl;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final boolean getShowAvatars() {
        return this.showAvatars;
    }

    public final String getTextColorType() {
        return this.textColorType;
    }

    public final String getTextColorTypeDark() {
        return this.textColorTypeDark;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.logoUrl.hashCode() * 31;
        String str = this.logoDarkUrl;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (this.closeButton.hashCode() + ((this.intro.hashCode() + ((this.greeting.hashCode() + hdi.g((hashCode3 + hashCode) * 31, 31, this.showAvatars)) * 31)) * 31)) * 31;
        String str2 = this.textColorType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode4 + hashCode2) * 31;
        String str3 = this.textColorTypeDark;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HeaderContentModel(logoUrl=");
        sb.append(this.logoUrl);
        sb.append(", logoDarkUrl=");
        sb.append(this.logoDarkUrl);
        sb.append(", showAvatars=");
        sb.append(this.showAvatars);
        sb.append(", greeting=");
        sb.append(this.greeting);
        sb.append(", intro=");
        sb.append(this.intro);
        sb.append(", closeButton=");
        sb.append(this.closeButton);
        sb.append(", textColorType=");
        sb.append(this.textColorType);
        sb.append(", textColorTypeDark=");
        return m51.m(sb, this.textColorTypeDark, ')');
    }

    public HeaderContentModel(String str, String str2, boolean z, HeaderTextModel headerTextModel, HeaderTextModel headerTextModel2, CloseButtonModel closeButtonModel, String str3, String str4) {
        str.getClass();
        headerTextModel.getClass();
        headerTextModel2.getClass();
        closeButtonModel.getClass();
        this.logoUrl = str;
        this.logoDarkUrl = str2;
        this.showAvatars = z;
        this.greeting = headerTextModel;
        this.intro = headerTextModel2;
        this.closeButton = closeButtonModel;
        this.textColorType = str3;
        this.textColorTypeDark = str4;
    }

    public HeaderContentModel() {
        this(null, null, false, null, null, null, null, null, 255, null);
    }
}
