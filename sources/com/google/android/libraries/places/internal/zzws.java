package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.widget.model.SearchMediaOptions;
import defpackage.u85;
import defpackage.zei;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function5;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzws extends zei implements Function5 {
    /* synthetic */ Object zza;
    /* synthetic */ Object zzb;
    /* synthetic */ Object zzc;
    /* synthetic */ boolean zzd;

    public zzws(Continuation continuation) {
        super(5, continuation);
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        zzws zzwsVar = new zzws((Continuation) obj5);
        zzwsVar.zza = (List) obj;
        zzwsVar.zzb = (List) obj2;
        zzwsVar.zzc = (SearchMediaOptions) obj3;
        zzwsVar.zzd = booleanValue;
        return zzwsVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        List list = (List) this.zza;
        List list2 = (List) this.zzb;
        SearchMediaOptions searchMediaOptions = (SearchMediaOptions) this.zzc;
        boolean z = this.zzd;
        if (searchMediaOptions != null && !z) {
            if (list2 != null) {
                return list2;
            }
            return CollectionsKt.emptyList();
        }
        return list;
    }
}
