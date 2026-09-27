package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class Money implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public Money build() {
            long longValue = getUnits().longValue();
            Integer nanos = getNanos();
            boolean z = false;
            if (longValue > 0) {
                if (nanos.intValue() >= 0) {
                    z = true;
                }
                brn.e(nanos, "Unit is positive and nano must be positive or zero, but was: %s.", z);
            } else if (longValue < 0) {
                if (nanos.intValue() <= 0) {
                    z = true;
                }
                brn.e(nanos, "Unit is negative and nano must be negative or zero, but was: %s.", z);
            }
            return zza();
        }

        public abstract Integer getNanos();

        public abstract Long getUnits();

        public abstract Builder setCurrencyCode(String str);

        public abstract Builder setNanos(Integer num);

        public abstract Builder setUnits(Long l);

        public abstract Money zza();
    }

    public static Money newInstance(String str, Long l, Integer num) {
        zzbg zzbgVar = new zzbg();
        zzbgVar.setCurrencyCode(str);
        zzbgVar.setUnits(l);
        zzbgVar.setNanos(num);
        return zzbgVar.build();
    }

    public abstract String getCurrencyCode();

    public abstract Integer getNanos();

    public abstract Long getUnits();
}
