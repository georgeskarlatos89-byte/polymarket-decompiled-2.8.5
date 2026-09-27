package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/socure/docv/capturesdk/models/SecondaryDocModuleModel$CameraCapture", "Landroid/os/Parcelable;", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class SecondaryDocModuleModel$CameraCapture implements Parcelable {
    public static final Parcelable.Creator<SecondaryDocModuleModel$CameraCapture> CREATOR = new a(23);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public SecondaryDocModuleModel$CameraCapture(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecondaryDocModuleModel$CameraCapture)) {
            return false;
        }
        SecondaryDocModuleModel$CameraCapture secondaryDocModuleModel$CameraCapture = (SecondaryDocModuleModel$CameraCapture) obj;
        if (Intrinsics.areEqual(this.a, secondaryDocModuleModel$CameraCapture.a) && Intrinsics.areEqual(this.b, secondaryDocModuleModel$CameraCapture.b) && Intrinsics.areEqual(this.c, secondaryDocModuleModel$CameraCapture.c) && Intrinsics.areEqual(this.d, secondaryDocModuleModel$CameraCapture.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
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
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return sv6.p(m51.r("CameraCapture(pageHeaderText=", this.a, ", helpHeaderText=", this.b, ", helpDescriptionText="), this.c, ", backButtonText=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
