package com.google.android.libraries.places.internal;

import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzcca {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);

    private final int zzr;
    private final byte[] zzs;

    zzcca(int i) {
        this.zzr = i;
        this.zzs = Integer.toString(i).getBytes(StandardCharsets.US_ASCII);
    }

    public final int zza() {
        return this.zzr;
    }

    public final zzccd zzb() {
        return (zzccd) zzccd.zzl().get(this.zzr);
    }

    public final /* synthetic */ byte[] zzc() {
        return this.zzs;
    }
}
