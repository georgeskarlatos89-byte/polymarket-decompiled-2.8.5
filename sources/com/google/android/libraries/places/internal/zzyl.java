package com.google.android.libraries.places.internal;

import defpackage.iid;
import defpackage.l23;
import io.sentry.android.core.m0;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzyl implements iid {
    final /* synthetic */ String zza;
    final /* synthetic */ l23 zzb;

    public zzyl(String str, l23 l23Var) {
        this.zza = str;
        this.zzb = l23Var;
    }

    @Override // defpackage.iid
    public final void onFailure(Exception exc) {
        exc.getClass();
        m0.e("PlaceSearchViewModelImpl", "Failed fetching placeId=".concat(String.valueOf(this.zza)), exc);
        l23 l23Var = this.zzb;
        Result.Companion companion = Result.INSTANCE;
        l23Var.resumeWith(Result.m882constructorimpl(ResultKt.createFailure(exc)));
    }
}
