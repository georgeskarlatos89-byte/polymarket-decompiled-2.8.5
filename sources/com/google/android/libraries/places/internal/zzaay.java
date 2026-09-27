package com.google.android.libraries.places.internal;

import defpackage.q55;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzaay extends q55 {
    /* synthetic */ Object zza;
    int zzb;
    Object zzc;
    final /* synthetic */ zzaaz zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaay(zzaaz zzaazVar, Continuation continuation) {
        super(continuation);
        this.zzd = zzaazVar;
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= Integer.MIN_VALUE;
        return this.zzd.emit(null, this);
    }
}
