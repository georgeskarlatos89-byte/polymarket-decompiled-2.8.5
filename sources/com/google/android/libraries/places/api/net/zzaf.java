package com.google.android.libraries.places.api.net;

import com.fingerprintjs.android.fpjs_pro.g;
import defpackage.ix2;
import defpackage.k84;
import defpackage.p23;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaf extends zzao {
    private final String zza;
    private final String zzb;
    private final int zzc;

    public /* synthetic */ zzaf(String str, String str2, int i, String str3, p23 p23Var, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        String str;
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzao) {
            zzao zzaoVar = (zzao) obj;
            if (this.zza.equals(zzaoVar.zza()) && ((str = this.zzb) != null ? str.equals(zzaoVar.zzb()) : zzaoVar.zzb() == null) && ((i = this.zzc) != 0 ? i == zzaoVar.zzd() : zzaoVar.zzd() == 0)) {
                zzaoVar.zzc();
                if (zzaoVar.getCancellationToken() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.zzao, com.google.android.libraries.places.internal.zzqk
    public final p23 getCancellationToken() {
        return null;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        int i3 = this.zzc;
        if (i3 != 0) {
            i = i3;
        }
        return (i2 ^ i) * (-721379959);
    }

    public final String toString() {
        String str;
        int i = this.zzc;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "LOWEST_RATING";
                    }
                } else {
                    str = "HIGHEST_RATING";
                }
            } else {
                str = "NEWEST";
            }
        } else {
            str = "MOST_RELEVANT";
        }
        String str2 = this.zzb;
        String str3 = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + g.d(str3.length() + 51, 17, String.valueOf(str2)) + 42);
        k84.q(sb, "SearchReviewPostsRequest{placeResourceName=", str3, ", query=", str2);
        return ix2.p(sb, ", rankPreference=", str, ", regionCode=null, cancellationToken=null}");
    }

    @Override // com.google.android.libraries.places.api.net.zzao
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.zzao
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.zzao
    public final String zzc() {
        return null;
    }

    @Override // com.google.android.libraries.places.api.net.zzao
    public final int zzd() {
        return this.zzc;
    }
}
