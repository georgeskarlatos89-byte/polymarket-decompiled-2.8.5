package com.google.android.libraries.places.internal;

import defpackage.t85;
import defpackage.u85;
import defpackage.zei;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzabe extends zei implements Function2 {
    int zza;
    final /* synthetic */ Function2 zzb;
    final /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzabe(Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.zzb = function2;
        this.zzc = obj;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzabe(this.zzb, this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzabe) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        int i = this.zza;
        ResultKt.a(obj);
        if (i != 0) {
            return obj;
        }
        Function2 function2 = this.zzb;
        Object obj2 = this.zzc;
        this.zza = 1;
        Object invoke = function2.invoke(obj2, this);
        if (invoke == u85Var) {
            return u85Var;
        }
        return invoke;
    }
}
