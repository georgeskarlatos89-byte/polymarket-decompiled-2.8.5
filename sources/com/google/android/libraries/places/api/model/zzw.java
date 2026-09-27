package com.google.android.libraries.places.api.model;

import android.os.ParcelUuid;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzw extends AutocompleteSessionToken {
    private final ParcelUuid zza;

    public zzw(ParcelUuid parcelUuid) {
        if (parcelUuid != null) {
            this.zza = parcelUuid;
        } else {
            dmk.s("Null UUID");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompleteSessionToken) {
            return this.zza.equals(((AutocompleteSessionToken) obj).zza());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompleteSessionToken
    public final ParcelUuid zza() {
        return this.zza;
    }
}
