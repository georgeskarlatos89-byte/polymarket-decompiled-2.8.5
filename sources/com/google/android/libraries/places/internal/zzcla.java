package com.google.android.libraries.places.internal;

import defpackage.jr9;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcla implements zzcba {
    private final List zza;
    private final zzcaz zzb;

    public zzcla(List list, zzcaz zzcazVar) {
        this.zza = jr9.m(list);
        this.zzb = zzcazVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcba
    public final void zza(zzcag zzcagVar, long j, List list, List list2) {
        super.zza(zzcagVar, 1L, list, list2);
        for (zzcbb zzcbbVar : this.zza) {
            if (zzcbbVar.zza() <= zzcagVar.zza()) {
                this.zzb.zzb();
                zzcbbVar.zzb();
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcba
    public final void zzb(zzcah zzcahVar, long j, List list, List list2) {
        super.zzb(zzcahVar, j, list, list2);
        for (zzcbb zzcbbVar : this.zza) {
            if (zzcbbVar.zza() <= zzcahVar.zza()) {
                this.zzb.zzb();
                zzcbbVar.zzb();
            }
        }
    }
}
