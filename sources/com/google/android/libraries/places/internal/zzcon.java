package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzcon implements zzcgg {
    SUBCHANNEL_SHUTDOWN("subchannel shutdown"),
    CONNECTION_RESET("connection reset"),
    CONNECTION_TIMED_OUT("connection timed out"),
    CONNECTION_ABORTED("connection aborted"),
    SOCKET_ERROR("socket error"),
    UNKNOWN("unknown");

    private final String zzg;

    zzcon(String str) {
        this.zzg = str;
    }

    @Override // com.google.android.libraries.places.internal.zzcgg
    public final String zza() {
        return this.zzg;
    }
}
