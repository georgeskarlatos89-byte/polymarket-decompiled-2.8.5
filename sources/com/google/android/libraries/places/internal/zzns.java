package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzns extends zznm {
    private final Locale zza;
    private final String zzb;
    private final zzrd zzc;

    public zzns(zzqk zzqkVar, Locale locale, String str, zzrd zzrdVar) {
        super(zzqkVar);
        this.zza = locale;
        this.zzb = str;
        this.zzc = zzrdVar;
    }

    public static void zzg(Map map, String str, Object obj, Object obj2) {
        String str2;
        if (obj != null) {
            str2 = obj.toString();
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public abstract Map zza();

    public abstract String zzb();

    @Override // com.google.android.libraries.places.internal.zznm
    public final Map zze() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zzc.zza());
        hashMap.put("X-Places-Android-Sdk", "5.3.0");
        return hashMap;
    }

    @Override // com.google.android.libraries.places.internal.zznm
    public final String zzf() {
        zzoe zzoeVar = new zzoe(zzb(), this.zzb);
        zzoeVar.zza(this.zza);
        zzoeVar.zzb(zza());
        return zzoeVar.zzc();
    }
}
