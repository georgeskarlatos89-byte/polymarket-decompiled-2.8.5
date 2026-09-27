package com.google.android.libraries.places.widget.internal.placedetails;

import android.app.Application;
import com.google.android.libraries.places.internal.zzbut;
import com.google.android.libraries.places.internal.zzpp;
import com.google.android.libraries.places.internal.zzpr;
import com.google.android.libraries.places.internal.zzqj;
import com.google.android.libraries.places.internal.zzqt;
import defpackage.l70;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcw extends l70 {
    private volatile zzpr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(Application application) {
        super(application);
        application.getClass();
    }

    public final zzpr zza(zzqt zzqtVar, zzqj zzqjVar, zzbut zzbutVar) {
        zzpr zzprVar;
        zzqtVar.getClass();
        zzpr zzprVar2 = this.zza;
        if (zzprVar2 == null) {
            synchronized (this) {
                zzprVar = this.zza;
                if (zzprVar == null) {
                    zzprVar = zzpp.zza(getApplication(), zzqtVar, zzbutVar, zzqjVar);
                    this.zza = zzprVar;
                }
            }
            return zzprVar;
        }
        return zzprVar2;
    }
}
