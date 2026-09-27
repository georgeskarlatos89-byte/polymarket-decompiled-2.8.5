package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbrh {
    static final zzbrh zza = new zzbrh(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile int zze = 1;
    private final Map zzd;

    public zzbrh() {
        this.zzd = new HashMap();
    }

    public static boolean zza() {
        return false;
    }

    public static zzbrh zzb() {
        int i = zzbqe.zza;
        return zza;
    }

    public final zzbrv zzc(zzbsz zzbszVar, int i) {
        return (zzbrv) this.zzd.get(new zzbrg(zzbszVar, i));
    }

    public zzbrh(boolean z) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
