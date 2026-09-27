package com.google.android.libraries.places.internal;

import defpackage.iid;
import defpackage.l23;
import io.sentry.android.core.m0;
import kotlin.Result;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzyp implements iid {
    final /* synthetic */ l23 zza;

    public zzyp(l23 l23Var) {
        this.zza = l23Var;
    }

    @Override // defpackage.iid
    public final void onFailure(Exception exc) {
        exc.getClass();
        exc.printStackTrace();
        Unit unit = Unit.INSTANCE;
        new StringBuilder(String.valueOf(unit).length() + 38);
        m0.p("PlaceSearchViewModelImpl", "Failed to fetch photo URI with error: ".concat(String.valueOf(unit)));
        this.zza.resumeWith(Result.m882constructorimpl(com.google.android.libraries.places.widget.internal.placedetails.zzco.zza));
    }
}
