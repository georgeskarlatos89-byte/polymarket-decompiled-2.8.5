package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import defpackage.brn;
import defpackage.jnf;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class LocalDate implements Parcelable, Comparable<LocalDate> {
    public static LocalDate newInstance(int i, int i2, int i3) {
        int i4;
        zzba zzbaVar = new zzba();
        zzbaVar.zza(i);
        zzbaVar.zzb(i2);
        zzbaVar.zzc(i3);
        LocalDate zzd = zzbaVar.zzd();
        int month = zzd.getMonth();
        jnf a = jnf.a(1, 12);
        Integer valueOf = Integer.valueOf(month);
        brn.c(month, "Month must not be out of range of 1 to 12, but was: %s.", a.b(valueOf));
        int day = zzd.getDay();
        jnf a2 = jnf.a(1, 31);
        Integer valueOf2 = Integer.valueOf(day);
        brn.c(day, "Day must not be out of range of 1 to 31, but was: %s.", a2.b(valueOf2));
        if (Arrays.asList(4, 6, 9, 11).contains(valueOf)) {
            brn.f("%s is not a valid day for month %s.", day, month, jnf.a(1, 30).b(valueOf2));
        }
        if (month == 2) {
            int year = zzd.getYear();
            if (year % 4 == 0) {
                i4 = 29;
            } else {
                i4 = 28;
            }
            brn.i(jnf.a(1, Integer.valueOf(i4)).b(valueOf2), "%s is not a valid day for month %s in year %s.", valueOf2, 2, Integer.valueOf(year));
        }
        return zzd;
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(LocalDate localDate) {
        int day;
        int day2;
        brn.m(localDate, "dateToCompare must not be null.");
        if (this == localDate) {
            return 0;
        }
        if (getYear() != localDate.getYear()) {
            day = getYear();
            day2 = localDate.getYear();
        } else if (getMonth() != localDate.getMonth()) {
            day = getMonth();
            day2 = localDate.getMonth();
        } else {
            day = getDay();
            day2 = localDate.getDay();
        }
        return day - day2;
    }

    public abstract int getDay();

    public abstract int getMonth();

    public abstract int getYear();

    public final String toString() {
        String format = String.format(Locale.getDefault(), "%02d", Integer.valueOf(getMonth()));
        String format2 = String.format(Locale.getDefault(), "%02d", Integer.valueOf(getDay()));
        Locale.getDefault();
        return getYear() + "-" + format + "-" + format2;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(LocalDate localDate) {
        return compareTo2(localDate);
    }
}
