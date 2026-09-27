package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzadx {
    private static final zzaea zza = new zzadv();
    private static final zzadz zzb = new zzadw();
    private final zzaea zze;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzadz zzf = null;

    public /* synthetic */ zzadx(zzaea zzaeaVar, byte[] bArr) {
        this.zze = zzaeaVar;
    }

    public final zzadx zza(zzadz zzadzVar) {
        this.zzf = zzadzVar;
        return this;
    }

    public final void zzb(zzacw zzacwVar) {
        zzagc.zza(zzacwVar, "key");
        if (zzacwVar.zzf()) {
            zzadz zzadzVar = zzb;
            zzagc.zza(zzacwVar, "key");
            zzagc.zzb(zzacwVar.zzf(), "key must be repeating");
            this.zzc.remove(zzacwVar);
            this.zzd.put(zzacwVar, zzadzVar);
            return;
        }
        zzaea zzaeaVar = zza;
        zzagc.zza(zzacwVar, "key");
        this.zzd.remove(zzacwVar);
        this.zzc.put(zzacwVar, zzaeaVar);
    }

    public final zzaeb zzc() {
        return new zzady(this, null);
    }

    public final /* synthetic */ Map zzd() {
        return this.zzc;
    }

    public final /* synthetic */ Map zze() {
        return this.zzd;
    }

    public final /* synthetic */ zzaea zzf() {
        return this.zze;
    }

    public final /* synthetic */ zzadz zzg() {
        return this.zzf;
    }
}
