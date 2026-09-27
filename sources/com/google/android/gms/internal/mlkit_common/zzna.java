package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzna implements zzba {
    UNKNOWN_STATUS(0),
    EXPLICITLY_REQUESTED(1),
    IMPLICITLY_REQUESTED(2),
    MODEL_INFO_RETRIEVAL_SUCCEEDED(3),
    MODEL_INFO_RETRIEVAL_FAILED(4),
    SCHEDULED(5),
    DOWNLOADING(6),
    SUCCEEDED(7),
    FAILED(8),
    LIVE(9),
    UPDATE_AVAILABLE(10),
    DOWNLOADED(11),
    STARTED(12);

    private final int zzo;

    zzna(int i) {
        this.zzo = i;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
        return this.zzo;
    }
}
