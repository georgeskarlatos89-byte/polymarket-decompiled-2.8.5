package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class zzabi extends zzabk {
    private final char[][] zza;
    private final int zzb;

    public zzabi(zzabj zzabjVar, char c, char c2) {
        zzabjVar.getClass();
        char[][] zzb = zzabjVar.zzb();
        this.zza = zzb;
        this.zzb = zzb.length;
    }

    @Override // com.google.android.libraries.places.internal.zzabk, com.google.android.libraries.places.internal.zzabm
    public final String zza(String str) {
        str.getClass();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < this.zzb && this.zza[charAt] != null) {
                return zzc(str, i);
            }
        }
        return str;
    }

    @Override // com.google.android.libraries.places.internal.zzabk
    public final char[] zzb(char c) {
        char[] cArr;
        if (c < this.zzb && (cArr = this.zza[c]) != null) {
            return cArr;
        }
        return null;
    }
}
