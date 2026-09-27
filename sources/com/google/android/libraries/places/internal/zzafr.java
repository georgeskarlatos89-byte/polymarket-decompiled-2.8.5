package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzafr extends zzafs {
    private final zzafq zza;

    private zzafr(zzadl zzadlVar, int i, zzafq zzafqVar) {
        super(zzadlVar, i);
        char c;
        this.zza = zzafqVar;
        StringBuilder sb = new StringBuilder("%");
        zzadlVar.zzl(sb);
        if (true != zzadlVar.zzk()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb.append(c);
        sb.append(zzafqVar.zzb());
    }

    public static zzafs zza(zzafq zzafqVar, zzadl zzadlVar, int i) {
        return new zzafr(zzadlVar, i, zzafqVar);
    }

    @Override // com.google.android.libraries.places.internal.zzafs
    public final void zzb(zzaft zzaftVar, Object obj) {
        zzaftVar.zzd(obj, this.zza, zzd());
    }
}
