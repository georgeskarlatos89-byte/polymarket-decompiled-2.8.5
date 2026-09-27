package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zznf implements zzba {
    SOURCE_UNKNOWN(0),
    APP_ASSET(1),
    LOCAL(2),
    CLOUD(3),
    SDK_BUILT_IN(4),
    URI(5);

    private final int zzh;

    zznf(int i) {
        this.zzh = i;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
        return this.zzh;
    }
}
