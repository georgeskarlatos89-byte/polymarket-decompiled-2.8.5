package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.wca;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbyg {
    static final wca zza = new wca(String.valueOf(','));
    private static final zzbyg zzb = new zzbyg(zzbxp.zza, false, new zzbyg(new zzbxo(), true, new zzbyg()));
    private final Map zzc;
    private final byte[] zzd;

    private zzbyg(zzbye zzbyeVar, boolean z, zzbyg zzbygVar) {
        String zza2 = zzbyeVar.zza();
        brn.g("Comma is currently not allowed in message encoding", !zza2.contains(","));
        int size = zzbygVar.zzc.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zzbygVar.zzc.containsKey(zzbyeVar.zza()) ? size : size + 1);
        for (zzbyf zzbyfVar : zzbygVar.zzc.values()) {
            String zza3 = zzbyfVar.zza.zza();
            if (!zza3.equals(zza2)) {
                linkedHashMap.put(zza3, new zzbyf(zzbyfVar.zza, zzbyfVar.zzb));
            }
        }
        linkedHashMap.put(zza2, new zzbyf(zzbyeVar, z));
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.zzc = unmodifiableMap;
        wca wcaVar = zza;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((zzbyf) entry.getValue()).zzb) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.zzd = wcaVar.c(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    public static zzbyg zza() {
        return zzb;
    }

    public final byte[] zzb() {
        return this.zzd;
    }

    public final zzbye zzc(String str) {
        zzbyf zzbyfVar = (zzbyf) this.zzc.get(str);
        if (zzbyfVar != null) {
            return zzbyfVar.zza;
        }
        return null;
    }

    private zzbyg() {
        this.zzc = new LinkedHashMap(0);
        this.zzd = new byte[0];
    }
}
