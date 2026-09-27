package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.internal.zzqk;
import defpackage.p23;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzak implements zzqk {
    public static zzai zzg(String str) {
        zzw zzwVar = new zzw();
        zzwVar.zza(str);
        return zzwVar;
    }

    @Override // com.google.android.libraries.places.internal.zzqk
    public abstract p23 getCancellationToken();

    public abstract String zza();

    public abstract String zzb();

    public abstract String zzc();

    public abstract List zzd();

    public abstract int zze();

    public abstract int zzf();
}
