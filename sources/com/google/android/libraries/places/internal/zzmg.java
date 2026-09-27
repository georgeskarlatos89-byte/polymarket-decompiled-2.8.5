package com.google.android.libraries.places.internal;

import defpackage.jr9;
import defpackage.we8;
import defpackage.wwf;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzmg {
    private String description;
    private Integer distanceMeters;
    private zzb[] matchedSubstrings;
    private String placeId;
    private zza structuredFormatting;
    private String[] types;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    class zza {
        private String mainText;
        private zzb[] mainTextMatchedSubstrings;
        private String secondaryText;
        private zzb[] secondaryTextMatchedSubstrings;

        public final String zza() {
            return this.mainText;
        }

        public final String zzb() {
            return this.secondaryText;
        }

        public final jr9 zzc() {
            zzb[] zzbVarArr = this.mainTextMatchedSubstrings;
            if (zzbVarArr != null) {
                return jr9.n(zzbVarArr);
            }
            we8 we8Var = jr9.b;
            return wwf.e;
        }

        public final jr9 zzd() {
            zzb[] zzbVarArr = this.secondaryTextMatchedSubstrings;
            if (zzbVarArr != null) {
                return jr9.n(zzbVarArr);
            }
            we8 we8Var = jr9.b;
            return wwf.e;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    class zzb {
        Integer length;
        Integer offset;
    }

    public final String zza() {
        return this.description;
    }

    public final Integer zzb() {
        return this.distanceMeters;
    }

    public final String zzc() {
        return this.placeId;
    }

    public final zza zzd() {
        return this.structuredFormatting;
    }

    public final jr9 zze() {
        String[] strArr = this.types;
        if (strArr != null) {
            return jr9.n(strArr);
        }
        we8 we8Var = jr9.b;
        return wwf.e;
    }

    public final jr9 zzf() {
        zzb[] zzbVarArr = this.matchedSubstrings;
        if (zzbVarArr != null) {
            return jr9.n(zzbVarArr);
        }
        we8 we8Var = jr9.b;
        return wwf.e;
    }
}
