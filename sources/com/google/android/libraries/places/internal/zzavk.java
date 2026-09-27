package com.google.android.libraries.places.internal;

import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzavk implements zzbsc {
    static final zzbsc zza = new zzavk();

    private zzavk() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsc
    public final boolean zza(int i) {
        if (i != 0) {
            switch (i) {
                case 1000:
                case WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY /* 1001 */:
                case 1002:
                case 1003:
                    return true;
                default:
                    return false;
            }
        }
        return true;
    }
}
