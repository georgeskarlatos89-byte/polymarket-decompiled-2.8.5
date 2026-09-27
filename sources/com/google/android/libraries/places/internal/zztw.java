package com.google.android.libraries.places.internal;

import defpackage.cw8;
import defpackage.ep5;
import defpackage.l23;
import defpackage.voi;
import kotlin.Result;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zztw {
    final /* synthetic */ l23 zza;

    public zztw(l23 l23Var) {
        this.zza = l23Var;
    }

    public final boolean onLoadFailed(cw8 cw8Var, Object obj, voi voiVar, boolean z) {
        l23 l23Var = this.zza;
        if (l23Var.isActive()) {
            Result.Companion companion = Result.INSTANCE;
            l23Var.resumeWith(Result.m882constructorimpl(Unit.INSTANCE));
            return false;
        }
        return false;
    }

    public final /* bridge */ boolean onResourceReady(Object obj, Object obj2, voi voiVar, ep5 ep5Var, boolean z) {
        l23 l23Var = this.zza;
        if (l23Var.isActive()) {
            Result.Companion companion = Result.INSTANCE;
            l23Var.resumeWith(Result.m882constructorimpl(Unit.INSTANCE));
            return false;
        }
        return false;
    }
}
