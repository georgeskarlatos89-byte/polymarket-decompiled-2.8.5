package com.google.android.libraries.places.internal;

import io.ably.lib.transport.Defaults;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcpp implements zzckg {
    final /* synthetic */ zzcpt zza;

    public /* synthetic */ zzcpp(zzcpt zzcptVar, byte[] bArr) {
        Objects.requireNonNull(zzcptVar);
        this.zza = zzcptVar;
    }

    @Override // com.google.android.libraries.places.internal.zzckg
    public final int zza() {
        this.zza.zzi();
        return Defaults.TLS_PORT;
    }
}
