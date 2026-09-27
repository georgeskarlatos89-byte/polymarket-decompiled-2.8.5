package com.google.android.libraries.places.api.model;

import java.util.Comparator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzhz implements Comparator {
    static final /* synthetic */ zzhz zza = new zzhz();

    private /* synthetic */ zzhz() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = zzia.zza;
        TimeOfWeek open = ((Period) obj).getOpen();
        open.getClass();
        TimeOfWeek open2 = ((Period) obj2).getOpen();
        open2.getClass();
        LocalDate date = open.getDate();
        date.getClass();
        LocalDate date2 = open2.getDate();
        date2.getClass();
        return date.compareTo2(date2);
    }
}
