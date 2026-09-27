package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzafx {
    private final zzaeq zza;
    private int zzb = 0;
    private int zzc = -1;

    public zzafx(zzaeq zzaeqVar) {
        zzagc.zza(zzaeqVar, "context");
        this.zza = zzaeqVar;
    }

    public abstract void zzb(int i, int i2, zzafs zzafsVar);

    public abstract Object zzg();

    public final zzafy zzh() {
        return this.zza.zza();
    }

    public final String zzi() {
        return this.zza.zzb();
    }

    public final int zzj() {
        return this.zzc + 1;
    }

    public final void zzk(int i, int i2, zzafs zzafsVar) {
        if (zzafsVar.zzc() < 32) {
            this.zzb |= 1 << zzafsVar.zzc();
        }
        this.zzc = Math.max(this.zzc, zzafsVar.zzc());
        zzb(i, i2, zzafsVar);
    }

    public final Object zzl() {
        zzaeq zzaeqVar = this.zza;
        zzaeqVar.zza().zzc(this);
        int i = this.zzb;
        if (((i + 1) & i) == 0 && (this.zzc <= 31 || i == -1)) {
            return zzg();
        }
        throw zzafz.zzd(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i))), zzaeqVar.zzb());
    }
}
