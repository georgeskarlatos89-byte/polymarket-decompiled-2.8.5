package com.google.android.libraries.places.api.model;

import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class AutocompleteSessionToken implements Parcelable {
    public static AutocompleteSessionToken newInstance() {
        return new zzeg(new ParcelUuid(UUID.randomUUID()));
    }

    public final String toString() {
        return zza().toString();
    }

    public abstract ParcelUuid zza();
}
