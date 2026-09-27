package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzss implements Parcelable {
    public static final Parcelable.Creator<zzss> CREATOR = new zzsr();
    private final zztf zza;
    private final AutocompleteUiCustomization zzb;
    private zzsq zzc;
    private final zzsx zzd;
    private final AutocompleteActivityMode zze;
    private final AutocompleteSessionToken zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;
    private int zzt;
    private long zzu;
    private final zzfd zzv;

    public zzss(Parcel parcel, byte[] bArr) {
        this.zza = (zztf) parcel.readParcelable(zztf.class.getClassLoader());
        this.zzb = (AutocompleteUiCustomization) parcel.readParcelable(AutocompleteUiCustomization.class.getClassLoader());
        this.zzc = (zzsq) parcel.readParcelable(zzsq.class.getClassLoader());
        this.zzd = (zzsx) parcel.readParcelable(zzsx.class.getClassLoader());
        this.zze = (AutocompleteActivityMode) parcel.readParcelable(AutocompleteActivityMode.class.getClassLoader());
        this.zzf = (AutocompleteSessionToken) parcel.readParcelable(AutocompleteSessionToken.class.getClassLoader());
        this.zzn = zzH(parcel);
        this.zzg = zzH(parcel);
        this.zzh = zzH(parcel);
        this.zzm = parcel.readInt();
        this.zzi = parcel.readInt();
        this.zzj = parcel.readInt();
        this.zzk = parcel.readInt();
        this.zzo = zzH(parcel);
        this.zzl = parcel.readInt();
        String readString = parcel.readString();
        this.zzp = readString == null ? "" : readString;
        this.zzq = parcel.readInt();
        this.zzr = parcel.readInt();
        this.zzs = zzH(parcel);
        this.zzt = parcel.readInt();
        this.zzu = parcel.readLong();
        this.zzv = new zzfg();
    }

    private static boolean zzH(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzI() {
        if (this.zzu != -1) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeParcelable(this.zzb, i);
        parcel.writeParcelable(this.zzc, i);
        parcel.writeParcelable(this.zzd, i);
        parcel.writeParcelable(this.zze, i);
        parcel.writeParcelable(this.zzf, i);
        parcel.writeInt(this.zzn ? 1 : 0);
        parcel.writeInt(this.zzg ? 1 : 0);
        parcel.writeInt(this.zzh ? 1 : 0);
        parcel.writeInt(this.zzm);
        parcel.writeInt(this.zzi);
        parcel.writeInt(this.zzj);
        parcel.writeInt(this.zzk);
        parcel.writeInt(this.zzo ? 1 : 0);
        parcel.writeInt(this.zzl);
        parcel.writeString(this.zzp);
        parcel.writeInt(this.zzq);
        parcel.writeInt(this.zzr);
        parcel.writeInt(this.zzs ? 1 : 0);
        parcel.writeInt(this.zzt);
        parcel.writeLong(this.zzu);
    }

    public final void zzA() {
        this.zzo = true;
    }

    public final void zzB() {
        this.zzl++;
    }

    public final void zzC(String str) {
        this.zzq++;
        this.zzp = str;
    }

    public final void zzD() {
        this.zzr++;
    }

    public final void zzE() {
        this.zzs = true;
    }

    public final void zzF() {
        if (!zzI()) {
            this.zzu = this.zzv.zzb();
        }
    }

    public final void zzG() {
        if (zzI()) {
            this.zzt += (int) (this.zzv.zzb() - this.zzu);
            this.zzu = -1L;
        }
    }

    public final zztf zza() {
        return this.zza;
    }

    public final AutocompleteUiCustomization zzb() {
        return this.zzb;
    }

    public final zzsq zzc() {
        return this.zzc;
    }

    public final void zzd(zzsq zzsqVar) {
        this.zzc = zzsqVar;
    }

    public final zzsx zze() {
        return this.zzd;
    }

    public final AutocompleteActivityMode zzf() {
        return this.zze;
    }

    public final AutocompleteSessionToken zzg() {
        return this.zzf;
    }

    public final boolean zzh() {
        return this.zzn;
    }

    public final boolean zzi() {
        return this.zzg;
    }

    public final boolean zzj() {
        return this.zzh;
    }

    public final int zzk() {
        return this.zzm;
    }

    public final int zzl() {
        return this.zzi;
    }

    public final int zzm() {
        return this.zzj;
    }

    public final int zzn() {
        return this.zzk;
    }

    public final int zzo() {
        return this.zzl;
    }

    public final String zzp() {
        return this.zzp;
    }

    public final int zzq() {
        return this.zzq;
    }

    public final int zzr() {
        return this.zzr;
    }

    public final boolean zzs() {
        return this.zzs;
    }

    public final int zzt() {
        return this.zzt;
    }

    public final void zzu(int i) {
        this.zzn = true;
        this.zzm = i;
    }

    public final void zzv() {
        this.zzg = true;
    }

    public final void zzw() {
        if (!this.zzg && !this.zzo) {
            this.zzh = true;
        }
    }

    public final void zzx() {
        this.zzi++;
    }

    public final void zzy() {
        this.zzj++;
    }

    public final void zzz() {
        this.zzk++;
    }

    public zzss(zztf zztfVar, AutocompleteUiCustomization autocompleteUiCustomization, zzsx zzsxVar, AutocompleteActivityMode autocompleteActivityMode, String str, AutocompleteSessionToken autocompleteSessionToken, zzfd zzfdVar) {
        this.zza = zztfVar;
        this.zzb = autocompleteUiCustomization;
        this.zzd = zzsxVar;
        this.zze = autocompleteActivityMode;
        if (autocompleteSessionToken == null) {
            this.zzf = AutocompleteSessionToken.newInstance();
        } else {
            this.zzf = autocompleteSessionToken;
        }
        AutocompleteSessionToken.newInstance();
        this.zzp = str == null ? "" : str;
        this.zzm = -1;
        this.zzu = -1L;
        this.zzv = zzfdVar;
    }
}
