package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/LiveCaptureCameraLoading;", "", "headerText", "", "descriptionText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHeaderText", "()Ljava/lang/String;", "getDescriptionText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class LiveCaptureCameraLoading {
    public static final int $stable = 0;
    private final String descriptionText;
    private final String headerText;

    public /* synthetic */ LiveCaptureCameraLoading(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ LiveCaptureCameraLoading copy$default(LiveCaptureCameraLoading liveCaptureCameraLoading, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveCaptureCameraLoading.headerText;
        }
        if ((i & 2) != 0) {
            str2 = liveCaptureCameraLoading.descriptionText;
        }
        return liveCaptureCameraLoading.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    public final LiveCaptureCameraLoading copy(String headerText, String descriptionText) {
        return new LiveCaptureCameraLoading(headerText, descriptionText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCaptureCameraLoading)) {
            return false;
        }
        LiveCaptureCameraLoading liveCaptureCameraLoading = (LiveCaptureCameraLoading) other;
        if (Intrinsics.areEqual(this.headerText, liveCaptureCameraLoading.headerText) && Intrinsics.areEqual(this.descriptionText, liveCaptureCameraLoading.descriptionText)) {
            return true;
        }
        return false;
    }

    public final String getDescriptionText() {
        return this.descriptionText;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public int hashCode() {
        int hashCode;
        String str = this.headerText;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.descriptionText;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return hdi.p("LiveCaptureCameraLoading(headerText=", this.headerText, ", descriptionText=", this.descriptionText, ")");
    }

    public LiveCaptureCameraLoading(String str, String str2) {
        this.headerText = str;
        this.descriptionText = str2;
    }

    public LiveCaptureCameraLoading() {
        this(null, null, 3, null);
    }
}
