package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/socure/docv/capturesdk/models/SecondaryDocModuleModel$LiveCaptureLabels", "Landroid/os/Parcelable;", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class SecondaryDocModuleModel$LiveCaptureLabels implements Parcelable {
    public static final Parcelable.Creator<SecondaryDocModuleModel$LiveCaptureLabels> CREATOR = new m0(1);
    public final SecondaryDocModuleModel$CameraLoading a;
    public final SecondaryDocModuleModel$CameraCapture b;
    public final SecondaryDocModuleModel$CameraImagePreview c;

    public SecondaryDocModuleModel$LiveCaptureLabels(SecondaryDocModuleModel$CameraLoading secondaryDocModuleModel$CameraLoading, SecondaryDocModuleModel$CameraCapture secondaryDocModuleModel$CameraCapture, SecondaryDocModuleModel$CameraImagePreview secondaryDocModuleModel$CameraImagePreview) {
        this.a = secondaryDocModuleModel$CameraLoading;
        this.b = secondaryDocModuleModel$CameraCapture;
        this.c = secondaryDocModuleModel$CameraImagePreview;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecondaryDocModuleModel$LiveCaptureLabels)) {
            return false;
        }
        SecondaryDocModuleModel$LiveCaptureLabels secondaryDocModuleModel$LiveCaptureLabels = (SecondaryDocModuleModel$LiveCaptureLabels) obj;
        if (Intrinsics.areEqual(this.a, secondaryDocModuleModel$LiveCaptureLabels.a) && Intrinsics.areEqual(this.b, secondaryDocModuleModel$LiveCaptureLabels.b) && Intrinsics.areEqual(this.c, secondaryDocModuleModel$LiveCaptureLabels.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        SecondaryDocModuleModel$CameraLoading secondaryDocModuleModel$CameraLoading = this.a;
        if (secondaryDocModuleModel$CameraLoading == null) {
            hashCode = 0;
        } else {
            hashCode = secondaryDocModuleModel$CameraLoading.hashCode();
        }
        int i2 = hashCode * 31;
        SecondaryDocModuleModel$CameraCapture secondaryDocModuleModel$CameraCapture = this.b;
        if (secondaryDocModuleModel$CameraCapture == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = secondaryDocModuleModel$CameraCapture.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        SecondaryDocModuleModel$CameraImagePreview secondaryDocModuleModel$CameraImagePreview = this.c;
        if (secondaryDocModuleModel$CameraImagePreview != null) {
            i = secondaryDocModuleModel$CameraImagePreview.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "LiveCaptureLabels(cameraLoading=" + this.a + ", cameraCapture=" + this.b + ", cameraImagePreview=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        SecondaryDocModuleModel$CameraLoading secondaryDocModuleModel$CameraLoading = this.a;
        if (secondaryDocModuleModel$CameraLoading == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            secondaryDocModuleModel$CameraLoading.writeToParcel(parcel, i);
        }
        SecondaryDocModuleModel$CameraCapture secondaryDocModuleModel$CameraCapture = this.b;
        if (secondaryDocModuleModel$CameraCapture == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            secondaryDocModuleModel$CameraCapture.writeToParcel(parcel, i);
        }
        SecondaryDocModuleModel$CameraImagePreview secondaryDocModuleModel$CameraImagePreview = this.c;
        if (secondaryDocModuleModel$CameraImagePreview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            secondaryDocModuleModel$CameraImagePreview.writeToParcel(parcel, i);
        }
    }
}
