package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzaee {
    private static final zzaea zza = new zzaec();
    private static final zzadz zzb = new zzaed();

    public static zzadx zza(Set set) {
        zzadx zzadxVar = new zzadx(zza, null);
        zzadxVar.zza(zzb);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzadxVar.zzb((zzacw) it.next());
        }
        return zzadxVar;
    }
}
