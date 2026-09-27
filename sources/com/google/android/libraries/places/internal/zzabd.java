package com.google.android.libraries.places.internal;

import defpackage.eb8;
import defpackage.u85;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzabd implements Flow {
    final /* synthetic */ Flow zza;

    public zzabd(Flow flow) {
        this.zza = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(eb8 eb8Var, Continuation continuation) {
        Object collect = this.zza.collect(new zzabc(eb8Var), continuation);
        if (collect == u85.COROUTINE_SUSPENDED) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
