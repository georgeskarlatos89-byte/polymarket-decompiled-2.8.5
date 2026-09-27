package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/socure/docv/capturesdk/models/SecondaryDocModuleModel$CameraImagePreview", "Landroid/os/Parcelable;", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class SecondaryDocModuleModel$CameraImagePreview implements Parcelable {
    public static final Parcelable.Creator<SecondaryDocModuleModel$CameraImagePreview> CREATOR = new a(24);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public SecondaryDocModuleModel$CameraImagePreview(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecondaryDocModuleModel$CameraImagePreview)) {
            return false;
        }
        SecondaryDocModuleModel$CameraImagePreview secondaryDocModuleModel$CameraImagePreview = (SecondaryDocModuleModel$CameraImagePreview) obj;
        if (Intrinsics.areEqual(this.a, secondaryDocModuleModel$CameraImagePreview.a) && Intrinsics.areEqual(this.b, secondaryDocModuleModel$CameraImagePreview.b) && Intrinsics.areEqual(this.c, secondaryDocModuleModel$CameraImagePreview.c) && Intrinsics.areEqual(this.d, secondaryDocModuleModel$CameraImagePreview.d) && Intrinsics.areEqual(this.e, secondaryDocModuleModel$CameraImagePreview.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("CameraImagePreview(pageText=", this.a, ", addPageButtonText=", this.b, ", submitButtonText=");
        k84.q(r, this.c, ", reSubmitButtonText=", this.d, ", retakeButtonText=");
        return woa.r(r, this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
