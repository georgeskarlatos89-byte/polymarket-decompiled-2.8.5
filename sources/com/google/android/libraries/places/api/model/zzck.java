package com.google.android.libraries.places.api.model;

import defpackage.k84;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzck extends zzii {
    private final zzig zza;
    private final List zzb;

    public zzck(zzig zzigVar, List list) {
        this.zza = zzigVar;
        this.zzb = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzii) {
            zzii zziiVar = (zzii) obj;
            zzig zzigVar = this.zza;
            if (zzigVar != null ? zzigVar.equals(zziiVar.zza()) : zziiVar.zza() == null) {
                List list = this.zzb;
                if (list != null ? list.equals(zziiVar.zzb()) : zziiVar.zzb() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        zzig zzigVar = this.zza;
        int i = 0;
        if (zzigVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzigVar.hashCode();
        }
        List list = this.zzb;
        if (list != null) {
            i = list.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        List list = this.zzb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(list);
        StringBuilder sb = new StringBuilder(valueOf.length() + 45 + valueOf2.length() + 1);
        k84.q(sb, "ReviewPostAndMediaAssets{reviewPost=", valueOf, ", assets=", valueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.zzii
    public final zzig zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.zzii
    public final List zzb() {
        return this.zzb;
    }
}
