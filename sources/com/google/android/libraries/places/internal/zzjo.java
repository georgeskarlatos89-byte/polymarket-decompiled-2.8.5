package com.google.android.libraries.places.internal;

import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse;
import defpackage.epi;
import defpackage.xbi;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzjo implements xbi {
    static final /* synthetic */ zzjo zza = new zzjo();

    private /* synthetic */ zzjo() {
    }

    @Override // defpackage.xbi
    public final Task then(Object obj) {
        epi epiVar = new epi();
        epiVar.b(FetchResolvedPhotoUriResponse.newInstance(Uri.parse(((zzblg) obj).zza())));
        return epiVar.a;
    }
}
