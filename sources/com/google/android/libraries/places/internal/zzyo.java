package com.google.android.libraries.places.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse;
import defpackage.l23;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzyo implements Function1 {
    final /* synthetic */ l23 zza;

    public zzyo(l23 l23Var) {
        this.zza = l23Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Uri uri = ((FetchResolvedPhotoUriResponse) obj).getUri();
        if (uri == null) {
            Log.i("PlaceSearchViewModelImpl", "No URI returned, falling back to placeholder image.");
            this.zza.resumeWith(Result.m882constructorimpl(com.google.android.libraries.places.widget.internal.placedetails.zzcs.zza));
        } else {
            this.zza.resumeWith(Result.m882constructorimpl(new com.google.android.libraries.places.widget.internal.placedetails.zzcp(uri)));
            Log.i("PlaceSearchViewModelImpl", "Successfully resolved photo URI.");
        }
        return Unit.INSTANCE;
    }
}
