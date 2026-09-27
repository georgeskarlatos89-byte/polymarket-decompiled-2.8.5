package com.google.android.libraries.places.internal;

import defpackage.j2g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
final class zztx implements Function1 {
    final /* synthetic */ j2g zza;
    final /* synthetic */ zzuc zzb;

    public zztx(j2g j2gVar, zzuc zzucVar) {
        this.zza = j2gVar;
        this.zzb = zzucVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.zza.a(this.zzb);
        return Unit.INSTANCE;
    }
}
