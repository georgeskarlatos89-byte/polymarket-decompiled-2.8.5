package com.google.android.libraries.places.widget.internal.placedetails;

import defpackage.iid;
import defpackage.l23;
import io.sentry.android.core.m0;
import kotlin.Result;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzdl implements iid {
    final /* synthetic */ l23 zza;

    public zzdl(l23 l23Var) {
        this.zza = l23Var;
    }

    @Override // defpackage.iid
    public final void onFailure(Exception exc) {
        exc.getClass();
        m0.q("RealPlacePhotosManager", "Failed to fetch URI", exc);
        this.zza.resumeWith(Result.m882constructorimpl(zzco.zza));
    }
}
