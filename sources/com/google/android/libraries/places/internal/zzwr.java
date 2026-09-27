package com.google.android.libraries.places.internal;

import defpackage.eb8;
import defpackage.u85;
import defpackage.zei;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzwr extends zei implements Function2 {
    int zza;
    private /* synthetic */ Object zzb;

    public zzwr(Continuation continuation) {
        super(2, continuation);
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        zzwr zzwrVar = new zzwr(continuation);
        zzwrVar.zzb = obj;
        return zzwrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzwr) create((eb8) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        int i = this.zza;
        ResultKt.a(obj);
        if (i == 0) {
            eb8 eb8Var = (eb8) this.zzb;
            List emptyList = CollectionsKt.emptyList();
            this.zza = 1;
            if (eb8Var.emit(emptyList, this) == u85Var) {
                return u85Var;
            }
        }
        return Unit.INSTANCE;
    }
}
