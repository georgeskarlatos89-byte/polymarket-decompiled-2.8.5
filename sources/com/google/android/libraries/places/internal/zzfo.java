package com.google.android.libraries.places.internal;

import defpackage.dzi;
import defpackage.lkb;
import defpackage.wkc;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzfo implements zzbwm {
    public static zzfo zza() {
        return zzfn.zza;
    }

    public static lkb zzc() {
        lkb wkcVar;
        Locale locale = Locale.ROOT;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(4, new dzi(Executors.defaultThreadFactory(), "Maps Platform Background-%d", new AtomicLong(0L), null, 10));
        if (newScheduledThreadPool instanceof lkb) {
            wkcVar = (lkb) newScheduledThreadPool;
        } else {
            wkcVar = new wkc(newScheduledThreadPool);
        }
        zzbwo.zza(wkcVar);
        return wkcVar;
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
