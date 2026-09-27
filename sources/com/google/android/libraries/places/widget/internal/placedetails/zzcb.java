package com.google.android.libraries.places.widget.internal.placedetails;

import android.app.Application;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.internal.zzfd;
import com.google.android.libraries.places.internal.zztv;
import com.google.android.libraries.places.internal.zzul;
import defpackage.l70;
import defpackage.olb;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzcb extends l70 {
    private boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcb(Application application) {
        super(application);
        application.getClass();
    }

    public abstract olb zzD();

    public abstract olb zzE();

    public abstract zzcv zzF();

    public abstract void zzG();

    public abstract zzul zzH();

    public abstract zztv zzI();

    public abstract zzfd zzJ();

    public final boolean zzK() {
        return this.zza;
    }

    public final void zzL(boolean z) {
        this.zza = z;
    }

    public abstract olb zzb();

    public abstract olb zzg();

    public abstract void zzj(String str, zzca zzcaVar);

    public abstract void zzk(LatLng latLng, zzca zzcaVar);
}
