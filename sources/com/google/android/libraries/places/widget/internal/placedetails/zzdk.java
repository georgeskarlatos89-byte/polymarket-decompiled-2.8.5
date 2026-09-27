package com.google.android.libraries.places.widget.internal.placedetails;

import android.net.Uri;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse;
import defpackage.l23;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzdk implements Function1 {
    final /* synthetic */ l23 zza;

    public zzdk(l23 l23Var) {
        this.zza = l23Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object zzcpVar;
        Uri uri = ((FetchResolvedPhotoUriResponse) obj).getUri();
        l23 l23Var = this.zza;
        Result.Companion companion = Result.INSTANCE;
        if (uri == null) {
            zzcpVar = zzcs.zza;
        } else {
            zzcpVar = new zzcp(uri);
        }
        l23Var.resumeWith(Result.m882constructorimpl(zzcpVar));
        return Unit.INSTANCE;
    }
}
