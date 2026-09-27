package com.google.android.libraries.places.internal;

import defpackage.coc;
import defpackage.eb8;
import defpackage.i7f;
import defpackage.j7f;
import defpackage.u85;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzabf implements eb8 {
    final /* synthetic */ j7f zza;
    final /* synthetic */ Function2 zzb;

    public zzabf(j7f j7fVar, Function2 function2) {
        this.zza = j7fVar;
        this.zzb = function2;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        j7f j7fVar = this.zza;
        Object n = ((i7f) j7fVar).e.n(coc.a(j7fVar, null, null, new zzabe(this.zzb, obj, null), 3), continuation);
        if (n == u85.COROUTINE_SUSPENDED) {
            return n;
        }
        return Unit.INSTANCE;
    }
}
