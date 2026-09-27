package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzafw extends zzaga {
    private static final zzaga zza = new zzafw();

    private zzafw() {
    }

    public static zzaga zza() {
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zzaga
    public final int zzb(zzafx zzafxVar, int i, String str, int i2, int i3, int i4) {
        boolean z;
        zzafs zza2;
        char charAt = str.charAt(i4);
        if ((charAt & ' ') == 0) {
            z = true;
        } else {
            z = false;
        }
        zzadl zzb = zzadl.zzb(str, i3, i4, z);
        zzadk zza3 = zzadk.zza(charAt);
        int i5 = i4 + 1;
        if (zza3 != null) {
            if (zzb.zzi(zza3)) {
                zza2 = zzafu.zza(i, zza3, zzb);
            } else {
                throw zzafz.zza("invalid format specifier", str, i2, i5);
            }
        } else if (charAt != 't' && charAt != 'T') {
            if (charAt != 'h' && charAt != 'H') {
                throw zzafz.zza("invalid format specification", str, i2, i5);
            }
            if (zzb.zzh(160, false)) {
                zza2 = new zzafv(zzb, i, zzb);
            } else {
                throw zzafz.zza("invalid format specification", str, i2, i5);
            }
        } else if (zzb.zzh(160, false)) {
            int i6 = i4 + 2;
            if (i6 <= str.length()) {
                zzafq zza4 = zzafq.zza(str.charAt(i5));
                if (zza4 != null) {
                    zza2 = zzafr.zza(zza4, zzb, i);
                    i5 = i6;
                } else {
                    throw zzafz.zzb("illegal date/time conversion", str, i5);
                }
            } else {
                throw zzafz.zzb("truncated format specifier", str, i2);
            }
        } else {
            throw zzafz.zza("invalid format specification", str, i2, i5);
        }
        zzafxVar.zzk(i2, i5, zza2);
        return i5;
    }
}
