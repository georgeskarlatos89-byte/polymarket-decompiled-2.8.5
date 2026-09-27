package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzchs {
    private final Set zza = Collections.newSetFromMap(new IdentityHashMap());

    public final void zza(Object obj, boolean z) {
        Set set = this.zza;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                zzd();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            zze();
        }
    }

    public final boolean zzb() {
        if (!this.zza.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean zzc(Object... objArr) {
        for (int i = 0; i < 2; i++) {
            if (this.zza.contains(objArr[i])) {
                return true;
            }
        }
        return false;
    }

    public abstract void zzd();

    public abstract void zze();
}
