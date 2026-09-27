package com.google.android.libraries.places.internal;

import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class zzbsm extends IOException {
    private boolean zza;

    public zzbsm(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public final void zza() {
        this.zza = true;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public zzbsm(String str) {
        super(str);
    }

    public zzbsm(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
