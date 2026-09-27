package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzsz implements zzsw {
    final List zza;

    public zzsz(Context context, zzsy zzsyVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzsyVar.zzc()) {
            arrayList.add(new zzto(context, zzsyVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzsw
    public final void zza(zzsv zzsvVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzsw) it.next()).zza(zzsvVar);
        }
    }
}
