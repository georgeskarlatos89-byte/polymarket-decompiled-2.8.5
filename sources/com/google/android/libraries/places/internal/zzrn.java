package com.google.android.libraries.places.internal;

import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import defpackage.jr9;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzrn implements Parcelable {
    public static zzrm zzs(AutocompleteActivityMode autocompleteActivityMode, List list, zzsx zzsxVar) {
        zzrg zzrgVar = new zzrg();
        zzrgVar.zzj(new ArrayList());
        zzrgVar.zzk(new ArrayList());
        zzrgVar.zzb(autocompleteActivityMode);
        zzrgVar.zzc(list);
        zzrgVar.zzd(zzsxVar);
        zzrgVar.zzl(0);
        zzrgVar.zzm(0);
        zzrgVar.zzp(false);
        zzrgVar.zza(zztf.PABLO);
        return zzrgVar;
    }

    public static zzrm zzt(zztf zztfVar) {
        zzrg zzrgVar = new zzrg();
        zzrgVar.zzj(new ArrayList());
        zzrgVar.zzk(new ArrayList());
        zzrgVar.zzc(new ArrayList());
        zzrgVar.zzl(0);
        zzrgVar.zzm(0);
        zzrgVar.zzb(AutocompleteActivityMode.FULLSCREEN);
        zzrgVar.zzd(zzsx.INTENT);
        zzrgVar.zza(zztfVar);
        zzrgVar.zzp(false);
        return zzrgVar;
    }

    public abstract zztf zza();

    public abstract AutocompleteActivityMode zzb();

    public abstract jr9 zzc();

    public abstract zzsx zzd();

    public abstract LatLng zze();

    public abstract String zzf();

    public abstract String zzg();

    public abstract LocationBias zzh();

    public abstract LocationRestriction zzi();

    public abstract jr9 zzj();

    public abstract jr9 zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract String zzn();

    public abstract AutocompleteUiCustomization zzo();

    public abstract boolean zzp();

    public abstract AutocompleteSessionToken zzq();

    public abstract zzrm zzr();
}
