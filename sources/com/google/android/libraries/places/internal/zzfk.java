package com.google.android.libraries.places.internal;

import defpackage.epi;
import defpackage.pq8;
import defpackage.q23;
import defpackage.ujb;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzfk implements pq8 {
    final /* synthetic */ epi zza;
    final /* synthetic */ ujb zzb;
    final /* synthetic */ q23 zzc;

    public zzfk(epi epiVar, ujb ujbVar, q23 q23Var) {
        this.zza = epiVar;
        this.zzb = ujbVar;
        this.zzc = q23Var;
    }

    @Override // defpackage.pq8
    public final void onFailure(Throwable th) {
        if (this.zzb.isCancelled()) {
            this.zzc.a();
            return;
        }
        boolean z = th instanceof Exception;
        epi epiVar = this.zza;
        if (z) {
            epiVar.a((Exception) th);
        } else {
            epiVar.a(new ExecutionException(th));
        }
    }

    @Override // defpackage.pq8
    public final void onSuccess(Object obj) {
        this.zza.b(obj);
    }
}
