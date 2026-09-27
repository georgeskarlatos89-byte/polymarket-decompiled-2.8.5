package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k84;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class k0 implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new a(22);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;
    public final int f;
    public final List g;
    public final float h;

    public k0(boolean z, int i, int i2, int i3, List list, int i4, List list2, float f) {
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = list;
        this.f = i4;
        this.g = list2;
        this.h = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.a == k0Var.a && this.b == k0Var.b && this.c == k0Var.c && this.d == k0Var.d && Intrinsics.areEqual(this.e, k0Var.e) && this.f == k0Var.f && Intrinsics.areEqual(this.g, k0Var.g) && Float.compare(this.h, k0Var.h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + com.socure.docv.capturesdk.common.analytics.model.a.a(this.g, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.f, com.socure.docv.capturesdk.common.analytics.model.a.a(this.e, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.d, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.c, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiframeModel(enabled=");
        sb.append(this.a);
        sb.append(", numFrames=");
        sb.append(this.b);
        sb.append(", framePeriodMs=");
        k84.i(this.c, this.d, ", maxDimension=", ", allowedFormats=", sb);
        sb.append(this.e);
        sb.append(", maxTotalUploadSize=");
        sb.append(this.f);
        sb.append(", nonces=");
        sb.append(this.g);
        sb.append(", imageQuality=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeStringList(this.e);
        parcel.writeInt(this.f);
        parcel.writeStringList(this.g);
        parcel.writeFloat(this.h);
    }
}
