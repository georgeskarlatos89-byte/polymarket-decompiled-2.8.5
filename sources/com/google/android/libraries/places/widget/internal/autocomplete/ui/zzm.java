package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzqv;
import defpackage.ts6;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzm extends ts6 {
    public zzm(byte[] bArr) {
    }

    public static final boolean zza(AutocompletePrediction autocompletePrediction, AutocompletePrediction autocompletePrediction2) {
        try {
            return autocompletePrediction.getPlaceId().equals(autocompletePrediction2.getPlaceId());
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    @Override // defpackage.ts6
    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        return ((AutocompletePrediction) obj).equals((AutocompletePrediction) obj2);
    }

    @Override // defpackage.ts6
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        return zza((AutocompletePrediction) obj, (AutocompletePrediction) obj2);
    }

    private zzm() {
        throw null;
    }
}
