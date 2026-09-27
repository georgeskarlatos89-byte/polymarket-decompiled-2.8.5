package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/LiveCaptureCameraCapture;", "", "pageHeaderText", "", "helpHeaderText", "helpDescriptionText", "backButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPageHeaderText", "()Ljava/lang/String;", "getHelpHeaderText", "getHelpDescriptionText", "getBackButtonText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class LiveCaptureCameraCapture {
    public static final int $stable = 0;
    private final String backButtonText;
    private final String helpDescriptionText;
    private final String helpHeaderText;
    private final String pageHeaderText;

    public /* synthetic */ LiveCaptureCameraCapture(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ LiveCaptureCameraCapture copy$default(LiveCaptureCameraCapture liveCaptureCameraCapture, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveCaptureCameraCapture.pageHeaderText;
        }
        if ((i & 2) != 0) {
            str2 = liveCaptureCameraCapture.helpHeaderText;
        }
        if ((i & 4) != 0) {
            str3 = liveCaptureCameraCapture.helpDescriptionText;
        }
        if ((i & 8) != 0) {
            str4 = liveCaptureCameraCapture.backButtonText;
        }
        return liveCaptureCameraCapture.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPageHeaderText() {
        return this.pageHeaderText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHelpHeaderText() {
        return this.helpHeaderText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHelpDescriptionText() {
        return this.helpDescriptionText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackButtonText() {
        return this.backButtonText;
    }

    public final LiveCaptureCameraCapture copy(String pageHeaderText, String helpHeaderText, String helpDescriptionText, String backButtonText) {
        return new LiveCaptureCameraCapture(pageHeaderText, helpHeaderText, helpDescriptionText, backButtonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCaptureCameraCapture)) {
            return false;
        }
        LiveCaptureCameraCapture liveCaptureCameraCapture = (LiveCaptureCameraCapture) other;
        if (Intrinsics.areEqual(this.pageHeaderText, liveCaptureCameraCapture.pageHeaderText) && Intrinsics.areEqual(this.helpHeaderText, liveCaptureCameraCapture.helpHeaderText) && Intrinsics.areEqual(this.helpDescriptionText, liveCaptureCameraCapture.helpDescriptionText) && Intrinsics.areEqual(this.backButtonText, liveCaptureCameraCapture.backButtonText)) {
            return true;
        }
        return false;
    }

    public final String getBackButtonText() {
        return this.backButtonText;
    }

    public final String getHelpDescriptionText() {
        return this.helpDescriptionText;
    }

    public final String getHelpHeaderText() {
        return this.helpHeaderText;
    }

    public final String getPageHeaderText() {
        return this.pageHeaderText;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.pageHeaderText;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.helpHeaderText;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.helpDescriptionText;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.backButtonText;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        String str = this.pageHeaderText;
        String str2 = this.helpHeaderText;
        return sv6.p(m51.r("LiveCaptureCameraCapture(pageHeaderText=", str, ", helpHeaderText=", str2, ", helpDescriptionText="), this.helpDescriptionText, ", backButtonText=", this.backButtonText, ")");
    }

    public LiveCaptureCameraCapture(String str, String str2, String str3, String str4) {
        this.pageHeaderText = str;
        this.helpHeaderText = str2;
        this.helpDescriptionText = str3;
        this.backButtonText = str4;
    }

    public LiveCaptureCameraCapture() {
        this(null, null, null, null, 15, null);
    }
}
