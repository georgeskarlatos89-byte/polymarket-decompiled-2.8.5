package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbto extends zzbts {
    public zzbto() {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.zzbts
    public final void zza() {
        if (!zzb()) {
            for (int i = 0; i < zzc(); i++) {
                ((zzbtp) zzd(i)).zza().zzd();
            }
            Iterator it = zze().iterator();
            while (it.hasNext()) {
                ((zzbrl) ((Map.Entry) it.next()).getKey()).zzd();
            }
        }
        super.zza();
    }
}
