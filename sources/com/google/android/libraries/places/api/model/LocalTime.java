package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import defpackage.brn;
import defpackage.jnf;
import defpackage.xbc;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class LocalTime implements Parcelable, Comparable<LocalTime> {
    public static LocalTime newInstance(int i, int i2) {
        try {
            zzbc zzbcVar = new zzbc();
            zzbcVar.zza(i);
            zzbcVar.zzb(i2);
            LocalTime zzc = zzbcVar.zzc();
            int hours = zzc.getHours();
            brn.p(hours, "Hours must not be out-of-range: 0 to 23, but was: %s.", jnf.a(0, 23).b(Integer.valueOf(hours)));
            int minutes = zzc.getMinutes();
            brn.p(minutes, "Minutes must not be out-of-range: 0 to 59, but was: %s.", jnf.a(0, 59).b(Integer.valueOf(minutes)));
            return zzc;
        } catch (IllegalStateException e) {
            xbc.s(e);
            return null;
        }
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(LocalTime localTime) {
        int hours;
        int hours2;
        brn.m(localTime, "compare must not be null.");
        if (this == localTime) {
            return 0;
        }
        if (getHours() == localTime.getHours()) {
            hours = getMinutes();
            hours2 = localTime.getMinutes();
        } else {
            hours = getHours();
            hours2 = localTime.getHours();
        }
        return hours - hours2;
    }

    public abstract int getHours();

    public abstract int getMinutes();

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(LocalTime localTime) {
        return compareTo2(localTime);
    }
}
