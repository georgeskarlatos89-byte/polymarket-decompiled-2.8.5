package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/socure/docv/capturesdk/models/SecondaryDocModuleModel$ErrorDetail", "Landroid/os/Parcelable;", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class SecondaryDocModuleModel$ErrorDetail implements Parcelable {
    public static final Parcelable.Creator<SecondaryDocModuleModel$ErrorDetail> CREATOR = new a(27);
    public final String a;
    public final String b;

    public SecondaryDocModuleModel$ErrorDetail(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecondaryDocModuleModel$ErrorDetail)) {
            return false;
        }
        SecondaryDocModuleModel$ErrorDetail secondaryDocModuleModel$ErrorDetail = (SecondaryDocModuleModel$ErrorDetail) obj;
        if (Intrinsics.areEqual(this.a, secondaryDocModuleModel$ErrorDetail.a) && Intrinsics.areEqual(this.b, secondaryDocModuleModel$ErrorDetail.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return hdi.p("ErrorDetail(headerText=", this.a, ", descriptionText=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
