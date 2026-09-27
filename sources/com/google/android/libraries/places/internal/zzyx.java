package com.google.android.libraries.places.internal;

import defpackage.iid;
import defpackage.l23;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzyx implements iid {
    final /* synthetic */ l23 zza;

    public zzyx(l23 l23Var) {
        this.zza = l23Var;
    }

    @Override // defpackage.iid
    public final void onFailure(Exception exc) {
        exc.getClass();
        l23 l23Var = this.zza;
        Result.Companion companion = Result.INSTANCE;
        l23Var.resumeWith(Result.m882constructorimpl(ResultKt.createFailure(exc)));
    }
}
