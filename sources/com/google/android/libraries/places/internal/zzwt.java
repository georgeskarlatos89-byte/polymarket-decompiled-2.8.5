package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.widget.model.SearchMediaOptions;
import defpackage.u85;
import defpackage.zei;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function5;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzwt extends zei implements Function5 {
    /* synthetic */ Object zza;
    /* synthetic */ Object zzb;
    /* synthetic */ Object zzc;
    /* synthetic */ boolean zzd;

    public zzwt(Continuation continuation) {
        super(5, continuation);
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        zzwt zzwtVar = new zzwt((Continuation) obj5);
        zzwtVar.zza = (List) obj;
        zzwtVar.zzb = (List) obj2;
        zzwtVar.zzc = (SearchMediaOptions) obj3;
        zzwtVar.zzd = booleanValue;
        return zzwtVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        List list = (List) this.zza;
        List list2 = (List) this.zzb;
        SearchMediaOptions searchMediaOptions = (SearchMediaOptions) this.zzc;
        boolean z = this.zzd;
        if (!list.isEmpty() && searchMediaOptions != null && !z && ((list2 == null || !list2.isEmpty()) && list2 == null)) {
            return null;
        }
        return list;
    }
}
