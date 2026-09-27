package com.google.android.libraries.places.internal;

import defpackage.eb8;
import defpackage.u85;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzaba implements Flow {
    final /* synthetic */ Flow zza;
    final /* synthetic */ Function2 zzb;

    public zzaba(Flow flow, Function2 function2) {
        this.zza = flow;
        this.zzb = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(eb8 eb8Var, Continuation continuation) {
        Object collect = this.zza.collect(new zzaaz(eb8Var, this.zzb), continuation);
        if (collect == u85.COROUTINE_SUSPENDED) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
