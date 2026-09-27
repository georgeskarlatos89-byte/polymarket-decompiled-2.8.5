package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Period;
import com.google.android.libraries.places.api.model.Place;
import defpackage.dwm;
import defpackage.jnf;
import defpackage.mr9;
import defpackage.vt1;
import defpackage.zk5;
import io.sentry.android.core.m0;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzia {
    public static final /* synthetic */ int zza = 0;
    private static final mr9 zzb;
    private static final LocalTime zzc;

    static {
        vt1 a = mr9.a();
        a.w(java.time.DayOfWeek.SUNDAY, DayOfWeek.SUNDAY);
        a.w(java.time.DayOfWeek.MONDAY, DayOfWeek.MONDAY);
        a.w(java.time.DayOfWeek.TUESDAY, DayOfWeek.TUESDAY);
        a.w(java.time.DayOfWeek.WEDNESDAY, DayOfWeek.WEDNESDAY);
        a.w(java.time.DayOfWeek.THURSDAY, DayOfWeek.THURSDAY);
        a.w(java.time.DayOfWeek.FRIDAY, DayOfWeek.FRIDAY);
        a.w(java.time.DayOfWeek.SATURDAY, DayOfWeek.SATURDAY);
        zzb = a.f(true);
        zzc = LocalTime.newInstance(23, 59);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (defpackage.jnf.a(java.lang.Long.valueOf(zzb(r1, r5, 0, 0)), java.lang.Long.valueOf(zzb(r1, r4, 23, 59))).b(java.lang.Long.valueOf(r12)) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Boolean zza(Place place, long j) {
        ZoneOffset zzc2;
        Place.BusinessStatus businessStatus = place.getBusinessStatus();
        Integer utcOffsetMinutes = place.getUtcOffsetMinutes();
        if (businessStatus != null && businessStatus != Place.BusinessStatus.OPERATIONAL) {
            return Boolean.FALSE;
        }
        if (utcOffsetMinutes != null && (zzc2 = zzc(utcOffsetMinutes.intValue())) != null) {
            OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
            if (currentOpeningHours != null) {
                ArrayList arrayList = new ArrayList(currentOpeningHours.getPeriods());
                if (!arrayList.isEmpty()) {
                    try {
                        Collections.sort(arrayList, zzhz.zza);
                        TimeOfWeek open = ((Period) arrayList.get(0)).getOpen();
                        open.getClass();
                        LocalDate date = open.getDate();
                        TimeOfWeek close = ((Period) dwm.g(arrayList)).getClose();
                        close.getClass();
                        LocalDate date2 = close.getDate();
                        if (date != null && date2 != null) {
                        }
                    } catch (NullPointerException unused) {
                    }
                }
            }
            currentOpeningHours = place.getOpeningHours();
            if (currentOpeningHours != null) {
                List<Period> periods = currentOpeningHours.getPeriods();
                if (!periods.isEmpty()) {
                    if (periods.size() == 1) {
                        Period period = periods.get(0);
                        TimeOfWeek open2 = period.getOpen();
                        if (period.getClose() == null && open2 != null && open2.getDay() == DayOfWeek.SUNDAY && open2.getTime().getHours() == 0 && open2.getTime().getMinutes() == 0) {
                            return Boolean.TRUE;
                        }
                    }
                    for (Period period2 : periods) {
                        if (period2.getOpen() != null && period2.getClose() != null) {
                        }
                    }
                    OffsetDateTime atOffset = Instant.ofEpochMilli(j).atOffset(zzc2);
                    DayOfWeek dayOfWeek = (DayOfWeek) zzb.get(atOffset.getDayOfWeek());
                    LocalTime newInstance = LocalTime.newInstance(atOffset.getHour(), atOffset.getMinute());
                    EnumMap enumMap = new EnumMap(DayOfWeek.class);
                    if (!periods.isEmpty()) {
                        Period period3 = periods.get(0);
                        int i = 0;
                        while (period3 != null) {
                            TimeOfWeek open3 = period3.getOpen();
                            TimeOfWeek close2 = period3.getClose();
                            if (open3 != null && close2 != null) {
                                DayOfWeek day = open3.getDay();
                                LocalTime time = open3.getTime();
                                if (open3.getDay() != close2.getDay()) {
                                    LocalTime localTime = zzc;
                                    List list = (List) enumMap.getOrDefault(day, new ArrayList());
                                    list.add(jnf.a(time, localTime));
                                    enumMap.put((EnumMap) day, (DayOfWeek) list);
                                    TimeOfWeek newInstance2 = TimeOfWeek.newInstance(DayOfWeek.values()[(day.ordinal() + 1) % 7], LocalTime.newInstance(0, 0));
                                    TimeOfWeek close3 = period3.getClose();
                                    Period.Builder builder = Period.builder();
                                    builder.setOpen(newInstance2);
                                    builder.setClose(close3);
                                    period3 = builder.build();
                                } else {
                                    i++;
                                    LocalTime time2 = close2.getTime();
                                    List list2 = (List) enumMap.getOrDefault(day, new ArrayList());
                                    jnf jnfVar = jnf.c;
                                    time.getClass();
                                    zk5 zk5Var = new zk5(time, 2);
                                    time2.getClass();
                                    list2.add(new jnf(zk5Var, new zk5(time2, 2)));
                                    enumMap.put((EnumMap) day, (DayOfWeek) list2);
                                    if (i >= periods.size()) {
                                        period3 = null;
                                    } else {
                                        period3 = periods.get(i);
                                    }
                                }
                            } else {
                                i++;
                                if (i >= periods.size()) {
                                    period3 = null;
                                } else {
                                    period3 = periods.get(i);
                                }
                            }
                        }
                    }
                    List list3 = (List) enumMap.get(dayOfWeek);
                    if (list3 == null) {
                        return Boolean.FALSE;
                    }
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (((jnf) it.next()).b(newInstance)) {
                            return Boolean.TRUE;
                        }
                    }
                    return Boolean.FALSE;
                }
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public static long zzb(ZoneOffset zoneOffset, LocalDate localDate, int i, int i2) {
        return OffsetDateTime.of(java.time.LocalDate.of(localDate.getYear(), localDate.getMonth(), localDate.getDay()), java.time.LocalTime.of(i, i2), zoneOffset).toInstant().toEpochMilli();
    }

    private static ZoneOffset zzc(int i) {
        try {
            return ZoneOffset.ofTotalSeconds(i * 60);
        } catch (DateTimeException unused) {
            m0.p("Places OpeningHoursUtil", String.format("Cannot find timezone that associates with utcOffsetMinutes %d from Place object.", Integer.valueOf(i)));
            return null;
        }
    }
}
