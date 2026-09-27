package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzceo {
    private ArrayList zza = new ArrayList();
    private volatile zzbxv zzb = zzbxv.IDLE;

    public final void zza(zzbxv zzbxvVar) {
        brn.m(zzbxvVar, "newState");
        if (this.zzb != zzbxvVar && this.zzb != zzbxv.SHUTDOWN) {
            this.zzb = zzbxvVar;
            if (!this.zza.isEmpty()) {
                ArrayList arrayList = this.zza;
                this.zza = new ArrayList();
                if (arrayList.size() > 0) {
                    throw null;
                }
            }
        }
    }
}
