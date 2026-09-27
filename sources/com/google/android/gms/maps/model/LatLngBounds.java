package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.arn;
import defpackage.g5;
import defpackage.hxn;
import defpackage.ofl;
import defpackage.ss9;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class LatLngBounds extends g5 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new ofl(29);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        boolean z;
        arn.i(latLng, "southwest must not be null.");
        arn.i(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d2 = latLng.a;
        if (d >= d2) {
            z = true;
        } else {
            z = false;
        }
        arn.c(z, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(d));
        this.a = latLng;
        this.b = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ss9 ss9Var = new ss9(this);
        ss9Var.R(this.a, "southwest");
        ss9Var.R(this.b, "northeast");
        return ss9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.i(parcel, 2, this.a, i);
        hxn.i(parcel, 3, this.b, i);
        hxn.q(parcel, p);
    }
}
