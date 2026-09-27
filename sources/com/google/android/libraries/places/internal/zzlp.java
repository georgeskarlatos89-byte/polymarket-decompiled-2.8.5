package com.google.android.libraries.places.internal;

import android.net.Uri;
import com.google.android.libraries.places.api.model.Leg;
import com.google.android.libraries.places.api.model.RoutingSummary;
import java.time.Duration;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzlp {
    public static final RoutingSummary zza(zzbny zzbnyVar) {
        ArrayList arrayList = new ArrayList();
        for (zzbnx zzbnxVar : zzbnyVar.zza()) {
            arrayList.add(Leg.newInstance(Duration.ofSeconds(zzbnxVar.zza().zzc(), r3.zze()), zzbnxVar.zzc()));
        }
        RoutingSummary.Builder builder = RoutingSummary.builder(arrayList);
        String zzc = zzbnyVar.zzc();
        if (!zzc.isEmpty()) {
            builder.setDirectionsUri(Uri.parse(zzc));
        }
        return builder.build();
    }
}
