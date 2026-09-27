package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/socure/docv/capturesdk/models/SecondaryDocModuleModel$ErrorLabels", "Landroid/os/Parcelable;", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class SecondaryDocModuleModel$ErrorLabels implements Parcelable {
    public static final Parcelable.Creator<SecondaryDocModuleModel$ErrorLabels> CREATOR = new a(28);
    public final String a;
    public final SecondaryDocModuleModel$ErrorDetail b;
    public final SecondaryDocModuleModel$ErrorDetail c;
    public final SecondaryDocModuleModel$ErrorDetail d;
    public final SecondaryDocModuleModel$ErrorDetail e;
    public final SecondaryDocModuleModel$ErrorDetail f;

    public SecondaryDocModuleModel$ErrorLabels(String str, SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail, SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail2, SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail3, SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail4, SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail5) {
        this.a = str;
        this.b = secondaryDocModuleModel$ErrorDetail;
        this.c = secondaryDocModuleModel$ErrorDetail2;
        this.d = secondaryDocModuleModel$ErrorDetail3;
        this.e = secondaryDocModuleModel$ErrorDetail4;
        this.f = secondaryDocModuleModel$ErrorDetail5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecondaryDocModuleModel$ErrorLabels)) {
            return false;
        }
        SecondaryDocModuleModel$ErrorLabels secondaryDocModuleModel$ErrorLabels = (SecondaryDocModuleModel$ErrorLabels) obj;
        if (Intrinsics.areEqual(this.a, secondaryDocModuleModel$ErrorLabels.a) && Intrinsics.areEqual(this.b, secondaryDocModuleModel$ErrorLabels.b) && Intrinsics.areEqual(this.c, secondaryDocModuleModel$ErrorLabels.c) && Intrinsics.areEqual(this.d, secondaryDocModuleModel$ErrorLabels.d) && Intrinsics.areEqual(this.e, secondaryDocModuleModel$ErrorLabels.e) && Intrinsics.areEqual(this.f, secondaryDocModuleModel$ErrorLabels.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail = this.b;
        if (secondaryDocModuleModel$ErrorDetail == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = secondaryDocModuleModel$ErrorDetail.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail2 = this.c;
        if (secondaryDocModuleModel$ErrorDetail2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = secondaryDocModuleModel$ErrorDetail2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail3 = this.d;
        if (secondaryDocModuleModel$ErrorDetail3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = secondaryDocModuleModel$ErrorDetail3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail4 = this.e;
        if (secondaryDocModuleModel$ErrorDetail4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = secondaryDocModuleModel$ErrorDetail4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail5 = this.f;
        if (secondaryDocModuleModel$ErrorDetail5 != null) {
            i = secondaryDocModuleModel$ErrorDetail5.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        return "ErrorLabels(errorText=" + this.a + ", networkError=" + this.b + ", unknownError=" + this.c + ", fileCountError=" + this.d + ", fileSizeError=" + this.e + ", fileTypeError=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail = this.b;
        if (secondaryDocModuleModel$ErrorDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            secondaryDocModuleModel$ErrorDetail.writeToParcel(parcel, i);
        }
        SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail2 = this.c;
        if (secondaryDocModuleModel$ErrorDetail2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            secondaryDocModuleModel$ErrorDetail2.writeToParcel(parcel, i);
        }
        SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail3 = this.d;
        if (secondaryDocModuleModel$ErrorDetail3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            secondaryDocModuleModel$ErrorDetail3.writeToParcel(parcel, i);
        }
        SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail4 = this.e;
        if (secondaryDocModuleModel$ErrorDetail4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            secondaryDocModuleModel$ErrorDetail4.writeToParcel(parcel, i);
        }
        SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail5 = this.f;
        if (secondaryDocModuleModel$ErrorDetail5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            secondaryDocModuleModel$ErrorDetail5.writeToParcel(parcel, i);
        }
    }
}
