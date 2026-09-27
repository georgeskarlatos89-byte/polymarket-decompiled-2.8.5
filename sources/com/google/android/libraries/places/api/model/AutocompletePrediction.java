package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import defpackage.jr9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class AutocompletePrediction implements Parcelable {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public AutocompletePrediction build() {
            AutocompletePrediction zze = zze();
            setTypes(jr9.m(zze.getTypes()));
            zzb(jr9.m(zze.zzd()));
            zzc(jr9.m(zze.zze()));
            zzd(jr9.m(zze.zzf()));
            return zze();
        }

        public abstract Integer getDistanceMeters();

        public abstract String getFullText();

        public abstract String getPrimaryText();

        public abstract String getSecondaryText();

        public abstract List<String> getTypes();

        public abstract Builder setDistanceMeters(Integer num);

        public abstract Builder setFullText(String str);

        public abstract Builder setPrimaryText(String str);

        public abstract Builder setSecondaryText(String str);

        public abstract Builder setTypes(List<String> list);

        public abstract Builder zza(String str);

        public abstract Builder zzb(List list);

        public abstract Builder zzc(List list);

        public abstract Builder zzd(List list);

        public abstract AutocompletePrediction zze();
    }

    public static Builder builder(String str) {
        zzs zzsVar = new zzs();
        zzsVar.zzb(new ArrayList());
        zzsVar.zza(str);
        zzsVar.zzc(new ArrayList());
        zzsVar.zzd(new ArrayList());
        zzsVar.setTypes(new ArrayList());
        zzsVar.setFullText("");
        zzsVar.setPrimaryText("");
        zzsVar.setSecondaryText("");
        return zzsVar;
    }

    private static final SpannableString zzg(String str, List list, CharacterStyle characterStyle) {
        SpannableString spannableString = new SpannableString(str);
        if (str.length() != 0 && characterStyle != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzhq zzhqVar = (zzhq) it.next();
                spannableString.setSpan(CharacterStyle.wrap(characterStyle), zzhqVar.zza(), zzhqVar.zzb() + zzhqVar.zza(), 0);
            }
        }
        return spannableString;
    }

    public abstract Integer getDistanceMeters();

    public SpannableString getFullText(CharacterStyle characterStyle) {
        return zzg(zza(), zzd(), characterStyle);
    }

    public abstract String getPlaceId();

    public SpannableString getPrimaryText(CharacterStyle characterStyle) {
        return zzg(zzb(), zze(), characterStyle);
    }

    public SpannableString getSecondaryText(CharacterStyle characterStyle) {
        return zzg(zzc(), zzf(), characterStyle);
    }

    public abstract List<String> getTypes();

    public abstract String zza();

    public abstract String zzb();

    public abstract String zzc();

    public abstract List zzd();

    public abstract List zze();

    public abstract List zzf();
}
