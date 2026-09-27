package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/LiveCaptureCameraImagePreview;", "", "pageText", "", "addPageButtonText", "submitButtonText", "reSubmitButtonText", "retakeButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPageText", "()Ljava/lang/String;", "getAddPageButtonText", "getSubmitButtonText", "getReSubmitButtonText", "getRetakeButtonText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class LiveCaptureCameraImagePreview {
    public static final int $stable = 0;
    private final String addPageButtonText;
    private final String pageText;
    private final String reSubmitButtonText;
    private final String retakeButtonText;
    private final String submitButtonText;

    public /* synthetic */ LiveCaptureCameraImagePreview(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ LiveCaptureCameraImagePreview copy$default(LiveCaptureCameraImagePreview liveCaptureCameraImagePreview, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveCaptureCameraImagePreview.pageText;
        }
        if ((i & 2) != 0) {
            str2 = liveCaptureCameraImagePreview.addPageButtonText;
        }
        if ((i & 4) != 0) {
            str3 = liveCaptureCameraImagePreview.submitButtonText;
        }
        if ((i & 8) != 0) {
            str4 = liveCaptureCameraImagePreview.reSubmitButtonText;
        }
        if ((i & 16) != 0) {
            str5 = liveCaptureCameraImagePreview.retakeButtonText;
        }
        String str6 = str5;
        String str7 = str3;
        return liveCaptureCameraImagePreview.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPageText() {
        return this.pageText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAddPageButtonText() {
        return this.addPageButtonText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReSubmitButtonText() {
        return this.reSubmitButtonText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRetakeButtonText() {
        return this.retakeButtonText;
    }

    public final LiveCaptureCameraImagePreview copy(String pageText, String addPageButtonText, String submitButtonText, String reSubmitButtonText, String retakeButtonText) {
        return new LiveCaptureCameraImagePreview(pageText, addPageButtonText, submitButtonText, reSubmitButtonText, retakeButtonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCaptureCameraImagePreview)) {
            return false;
        }
        LiveCaptureCameraImagePreview liveCaptureCameraImagePreview = (LiveCaptureCameraImagePreview) other;
        if (Intrinsics.areEqual(this.pageText, liveCaptureCameraImagePreview.pageText) && Intrinsics.areEqual(this.addPageButtonText, liveCaptureCameraImagePreview.addPageButtonText) && Intrinsics.areEqual(this.submitButtonText, liveCaptureCameraImagePreview.submitButtonText) && Intrinsics.areEqual(this.reSubmitButtonText, liveCaptureCameraImagePreview.reSubmitButtonText) && Intrinsics.areEqual(this.retakeButtonText, liveCaptureCameraImagePreview.retakeButtonText)) {
            return true;
        }
        return false;
    }

    public final String getAddPageButtonText() {
        return this.addPageButtonText;
    }

    public final String getPageText() {
        return this.pageText;
    }

    public final String getReSubmitButtonText() {
        return this.reSubmitButtonText;
    }

    public final String getRetakeButtonText() {
        return this.retakeButtonText;
    }

    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.pageText;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.addPageButtonText;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.submitButtonText;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.reSubmitButtonText;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.retakeButtonText;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        String str = this.pageText;
        String str2 = this.addPageButtonText;
        String str3 = this.submitButtonText;
        String str4 = this.reSubmitButtonText;
        String str5 = this.retakeButtonText;
        StringBuilder r = m51.r("LiveCaptureCameraImagePreview(pageText=", str, ", addPageButtonText=", str2, ", submitButtonText=");
        k84.q(r, str3, ", reSubmitButtonText=", str4, ", retakeButtonText=");
        return woa.r(r, str5, ")");
    }

    public LiveCaptureCameraImagePreview(String str, String str2, String str3, String str4, String str5) {
        this.pageText = str;
        this.addPageButtonText = str2;
        this.submitButtonText = str3;
        this.reSubmitButtonText = str4;
        this.retakeButtonText = str5;
    }

    public LiveCaptureCameraImagePreview() {
        this(null, null, null, null, null, 31, null);
    }
}
