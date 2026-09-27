package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.g5;
import defpackage.hxn;
import defpackage.rwl;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class LatLng extends g5 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new rwl(4);
    public final double a;
    public final double b;

    public LatLng(double d, double d2) {
        if (d2 >= -180.0d && d2 < 180.0d) {
            this.b = d2;
        } else {
            this.b = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(latLng.a) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(latLng.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(this.a);
        sb.append(",");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 2, 8);
        parcel.writeDouble(this.a);
        hxn.o(parcel, 3, 8);
        parcel.writeDouble(this.b);
        hxn.q(parcel, p);
    }
}
