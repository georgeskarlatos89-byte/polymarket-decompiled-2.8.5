package com.google.android.libraries.places.internal;

import defpackage.hdi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcti extends zzcte {
    private final AtomicInteger zzi;
    private zzbzy zzj;

    public zzcti(zzbzr zzbzrVar) {
        super(zzbzrVar);
        this.zzi = new AtomicInteger(hdi.a());
        this.zzj = new zzbzq(zzbzt.zzd());
    }

    private final void zzl(zzbxv zzbxvVar, zzbzy zzbzyVar) {
        if (zzbxvVar == this.zzh && zzbzyVar.equals(this.zzj)) {
            return;
        }
        zzg().zzb(zzbxvVar, zzbzyVar);
        this.zzh = zzbxvVar;
        this.zzj = zzbzyVar;
    }

    private final zzbzy zzm(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzctc) it.next()).zze());
        }
        return new zzcth(arrayList, this.zzi);
    }

    @Override // com.google.android.libraries.places.internal.zzcte
    public final void zze() {
        List zzi = zzi();
        if (zzi.isEmpty()) {
            Iterator it = zzh().iterator();
            while (it.hasNext()) {
                zzbxv zzf = ((zzctc) it.next()).zzf();
                zzbxv zzbxvVar = zzbxv.CONNECTING;
                if (zzf == zzbxvVar || zzf == zzbxv.IDLE) {
                    zzl(zzbxvVar, new zzbzq(zzbzt.zzd()));
                    return;
                }
            }
            zzl(zzbxv.TRANSIENT_FAILURE, zzm(zzh()));
            return;
        }
        zzl(zzbxv.READY, zzm(zzi));
    }

    @Override // com.google.android.libraries.places.internal.zzcte
    public final zzctc zzf(Object obj) {
        return new zzctg(this, obj, this.zzg);
    }
}
