package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.internal.zzawk;
import com.google.android.libraries.places.internal.zzawn;
import com.google.android.libraries.places.internal.zzawr;
import com.google.android.libraries.places.internal.zzaws;
import com.google.android.libraries.places.internal.zzaxy;
import com.google.android.libraries.places.internal.zzaxz;
import com.google.android.libraries.places.internal.zzaya;
import com.google.android.libraries.places.internal.zzayh;
import com.google.android.libraries.places.internal.zzbut;
import com.google.android.libraries.places.internal.zztg;
import com.google.android.libraries.places.internal.zzuk;
import com.google.android.libraries.places.internal.zzul;
import defpackage.pxl;
import defpackage.woa;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzt implements zzuk {
    public static final Parcelable.Creator<zzt> CREATOR = new zzs();
    private final zzawr zza;
    private final zzayh zzb;
    private final List zzc;
    private final int zzd;
    private Boolean zze;
    private zzaxy zzf;
    private zzaxy zzg;
    private boolean zzh;
    private boolean zzi;
    private zzul zzj;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ zzt(zzawr zzawrVar, zzayh zzayhVar, List list, int i, Boolean bool, zzaxy zzaxyVar, zzaxy zzaxyVar2, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(zzawrVar, zzayhVar, list, i, r7, null, null, r0 & z, false);
        Boolean bool2;
        boolean z3;
        if ((i2 & 16) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i2 & 128) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
    }

    private final void zzA(zzawk zzawkVar) {
        zzul zzulVar = this.zzj;
        if (zzulVar != null) {
            zzulVar.zzb((zzaws) zzawkVar.zzD());
        }
    }

    private final void zzB(Context context, int i) {
        zzawk zzz = zzz(context);
        zzz.zzk(i);
        zzA(zzz);
    }

    private final void zzC(Context context, int i, Integer num) {
        zzawk zzz = zzz(context);
        zzz.zzj(i);
        if (num != null) {
            zzz.zzc(num.intValue());
        }
        zzA(zzz);
    }

    private final zzawk zzz(Context context) {
        zzawk zza = zzaws.zza();
        zzawr zzawrVar = this.zza;
        zza.zza(zzawrVar);
        zza.zzf(this.zzb);
        zza.zzb(this.zzc);
        zza.zze(zztg.zza(context, this.zzd));
        zza.zzi(this.zzh);
        zza.zzh(this.zzi);
        Boolean bool = this.zze;
        if (bool != null) {
            zza.zzd(bool.booleanValue());
        }
        if (zzawrVar != zzawr.VARIANT_COMPACT_ADVANCED && zzawrVar != zzawr.VARIANT_FULL_ADVANCED) {
            return zza;
        }
        zzaxz zza2 = zzaya.zza();
        zza2.getClass();
        zzaxy zzaxyVar = this.zzf;
        if (zzaxyVar != null) {
            zza2.zzb(zzaxyVar);
        }
        zzaxy zzaxyVar2 = this.zzg;
        if (zzaxyVar2 != null) {
            zza2.zza(zzaxyVar2);
        }
        zza.zzg((zzaya) zza2.zzD());
        return zza;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.zza.name());
        parcel.writeString(this.zzb.name());
        Iterator s = woa.s(this.zzc, parcel);
        while (s.hasNext()) {
            parcel.writeString(((zzawn) s.next()).name());
        }
        parcel.writeInt(this.zzd);
        Boolean bool = this.zze;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            pxl.i(parcel, 1, bool);
        }
        zza.zzb(this.zzf, parcel, i);
        zza.zzb(this.zzg, parcel, i);
        parcel.writeInt(this.zzh ? 1 : 0);
        parcel.writeInt(this.zzi ? 1 : 0);
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final zzbut zza() {
        int ordinal = this.zza.ordinal();
        if (ordinal != 3 && ordinal != 4) {
            return zzbut.PLACE_DETAILS;
        }
        return zzbut.ADVANCED_PLACE_DETAILS;
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final zzul zzb() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzc(zzul zzulVar) {
        this.zzj = zzulVar;
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzd(zzaxy zzaxyVar) {
        this.zzf = zzaxyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zze(zzaxy zzaxyVar) {
        this.zzg = zzaxyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzf(Context context) {
        context.getClass();
        zzB(context, 6);
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzg(Context context) {
        context.getClass();
        zzB(context, 7);
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzh(Context context) {
        context.getClass();
        zzB(context, 8);
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzi(Context context) {
        context.getClass();
        zzB(context, 9);
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzj(Context context) {
        context.getClass();
        zzB(context, 10);
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzk(Context context) {
        context.getClass();
        zzB(context, 15);
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzl(Context context) {
        context.getClass();
        zzB(context, 16);
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzm(Context context) {
        context.getClass();
        zzB(context, 13);
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzn(Context context) {
        context.getClass();
        zzC(context, 3, null);
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzo(Context context) {
        context.getClass();
        zzC(context, 4, null);
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzp(int i, Context context) {
        context.getClass();
        zzC(context, 5, Integer.valueOf(i));
    }

    @Override // com.google.android.libraries.places.internal.zzuk
    public final void zzq(Context context) {
        context.getClass();
        zzC(context, 6, null);
    }

    public final void zzr(Boolean bool) {
        this.zze = bool;
    }

    public final void zzs(boolean z) {
        this.zzh = z;
    }

    public final void zzt(boolean z) {
        this.zzi = z;
    }

    public final void zzu(Context context) {
        context.getClass();
        zzB(context, 2);
    }

    public final void zzv(Context context) {
        context.getClass();
        zzB(context, 3);
    }

    public final void zzw(Context context) {
        context.getClass();
        zzB(context, 4);
    }

    public final void zzx(Context context) {
        context.getClass();
        zzB(context, 14);
    }

    public final void zzy(Context context) {
        context.getClass();
        zzC(context, 2, null);
    }

    public zzt(zzawr zzawrVar, zzayh zzayhVar, List list, int i, Boolean bool, zzaxy zzaxyVar, zzaxy zzaxyVar2, boolean z, boolean z2) {
        zzawrVar.getClass();
        zzayhVar.getClass();
        list.getClass();
        this.zza = zzawrVar;
        this.zzb = zzayhVar;
        this.zzc = list;
        this.zzd = i;
        this.zze = bool;
        this.zzf = zzaxyVar;
        this.zzg = zzaxyVar2;
        this.zzh = z;
        this.zzi = z2;
    }
}
