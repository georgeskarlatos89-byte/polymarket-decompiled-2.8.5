package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzmh extends zzns {
    public zzmh(FetchPhotoRequest fetchPhotoRequest, String str, zzrd zzrdVar) {
        super(fetchPhotoRequest, null, str, zzrdVar);
    }

    @Override // com.google.android.libraries.places.internal.zzns
    public final Map zza() {
        FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) zzc();
        PhotoMetadata photoMetadata = fetchPhotoRequest.getPhotoMetadata();
        HashMap hashMap = new HashMap();
        zzns.zzg(hashMap, "maxheight", fetchPhotoRequest.getMaxHeight(), null);
        zzns.zzg(hashMap, "maxwidth", fetchPhotoRequest.getMaxWidth(), null);
        hashMap.put("photoreference", photoMetadata.zza());
        return hashMap;
    }

    @Override // com.google.android.libraries.places.internal.zzns
    public final String zzb() {
        return "photo";
    }
}
