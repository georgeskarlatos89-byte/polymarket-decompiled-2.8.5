package com.google.android.libraries.places.internal;

import defpackage.j7f;
import defpackage.u85;
import defpackage.zei;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzabg extends zei implements Function2 {
    int zza;
    final /* synthetic */ Flow zzb;
    final /* synthetic */ Function2 zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzabg(Flow flow, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.zzb = flow;
        this.zzc = function2;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        zzabg zzabgVar = new zzabg(this.zzb, this.zzc, continuation);
        zzabgVar.zzd = obj;
        return zzabgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzabg) create((j7f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        int i = this.zza;
        ResultKt.a(obj);
        if (i == 0) {
            j7f j7fVar = (j7f) this.zzd;
            Flow flow = this.zzb;
            zzabf zzabfVar = new zzabf(j7fVar, this.zzc);
            this.zza = 1;
            if (flow.collect(zzabfVar, this) == u85Var) {
                return u85Var;
            }
        }
        return Unit.INSTANCE;
    }
}
