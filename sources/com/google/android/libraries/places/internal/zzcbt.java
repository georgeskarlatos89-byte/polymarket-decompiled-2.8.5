package com.google.android.libraries.places.internal;

import com.fingerprintjs.android.fpjs_pro.g;
import defpackage.jr9;
import defpackage.sv6;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class zzcbt implements zzcay {
    protected final int zza;
    protected final String zzb;
    protected final List zzc;
    protected final List zzd;

    public zzcbt(int i, String str, String str2, String str3, List list, List list2, boolean z) {
        this.zza = i;
        this.zzb = str;
        this.zzc = jr9.m(list);
        this.zzd = jr9.m(list2);
    }

    public final String toString() {
        String name = getClass().getName();
        int length = name.length();
        String str = this.zzb;
        return sv6.p(new StringBuilder(g.d(length + 1, 1, str)), name, "(", str, ")");
    }

    public final int zza() {
        return this.zza;
    }
}
