package com.google.android.gms.internal.mlkit_common;

import defpackage.dfd;
import defpackage.n3k;
import defpackage.qd7;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbg implements qd7 {
    public static final /* synthetic */ int zza = 0;
    private static final dfd zzb = new dfd() { // from class: com.google.android.gms.internal.mlkit_common.zzbf
        @Override // defpackage.nd7
        public final void encode(Object obj, Object obj2) {
            int i = zzbg.zza;
            throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final dfd zze = zzb;

    @Override // defpackage.qd7
    public final /* bridge */ /* synthetic */ qd7 registerEncoder(Class cls, dfd dfdVar) {
        this.zzc.put(cls, dfdVar);
        this.zzd.remove(cls);
        return this;
    }

    public final zzbh zza() {
        return new zzbh(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    public final /* bridge */ /* synthetic */ qd7 registerEncoder(Class cls, n3k n3kVar) {
        this.zzd.put(cls, n3kVar);
        this.zzc.remove(cls);
        return this;
    }
}
