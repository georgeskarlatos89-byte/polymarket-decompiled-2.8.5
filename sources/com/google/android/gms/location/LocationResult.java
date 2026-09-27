package com.google.android.gms.location;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.g5;
import defpackage.hxn;
import defpackage.o4l;
import defpackage.tul;
import defpackage.xcl;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class LocationResult extends g5 implements ReflectedParcelable {
    public final List a;
    public static final List b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new o4l(23);

    public LocationResult(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            return this.a.equals(((LocationResult) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String str;
        String l;
        StringBuilder sb = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = xcl.a;
        List<Location> list = this.a;
        sb.ensureCapacity(list.size() * 100);
        sb.append("[");
        boolean z = false;
        for (Location location : list) {
            DecimalFormat decimalFormat2 = xcl.b;
            sb.ensureCapacity(100);
            String str2 = null;
            if (location == null) {
                sb.append((String) null);
            } else {
                sb.append("{");
                sb.append(location.getProvider());
                sb.append(", ");
                if (location.isMock()) {
                    sb.append("mock, ");
                }
                DecimalFormat decimalFormat3 = xcl.a;
                sb.append(decimalFormat3.format(location.getLatitude()));
                sb.append(",");
                sb.append(decimalFormat3.format(location.getLongitude()));
                if (location.hasAccuracy()) {
                    sb.append("±");
                    sb.append(decimalFormat2.format(location.getAccuracy()));
                    sb.append("m");
                }
                if (location.hasAltitude()) {
                    sb.append(", alt=");
                    sb.append(decimalFormat2.format(location.getAltitude()));
                    if (location.hasVerticalAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getVerticalAccuracyMeters()));
                    }
                    sb.append("m");
                }
                if (location.hasSpeed()) {
                    sb.append(", spd=");
                    sb.append(decimalFormat2.format(location.getSpeed()));
                    if (location.hasSpeedAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getSpeedAccuracyMetersPerSecond()));
                    }
                    sb.append("m/s");
                }
                if (location.hasBearing()) {
                    sb.append(", brg=");
                    sb.append(decimalFormat2.format(location.getBearing()));
                    if (location.hasBearingAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getBearingAccuracyDegrees()));
                    }
                    sb.append("°");
                }
                Bundle extras = location.getExtras();
                if (extras != null) {
                    str = extras.getString("floorLabel");
                } else {
                    str = null;
                }
                if (str != null) {
                    sb.append(", fl=");
                    sb.append(str);
                }
                Bundle extras2 = location.getExtras();
                if (extras2 != null) {
                    str2 = extras2.getString("levelId");
                }
                if (str2 != null) {
                    sb.append(", lv=");
                    sb.append(str2);
                }
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb.append(", ert=");
                long elapsedRealtimeNanos = (location.getElapsedRealtimeNanos() / 1000000) + currentTimeMillis;
                if (elapsedRealtimeNanos >= 0) {
                    l = tul.a.format(new Date(elapsedRealtimeNanos));
                } else {
                    SimpleDateFormat simpleDateFormat = tul.a;
                    l = Long.toString(elapsedRealtimeNanos);
                }
                sb.append(l);
                sb.append('}');
            }
            sb.append(", ");
            z = true;
        }
        if (z) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.n(parcel, 1, this.a);
        hxn.q(parcel, p);
    }
}
