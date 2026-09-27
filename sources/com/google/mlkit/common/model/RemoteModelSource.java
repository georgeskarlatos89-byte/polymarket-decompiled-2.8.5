package com.google.mlkit.common.model;

import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;
import defpackage.dkn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class RemoteModelSource {
    private final String zza;

    public RemoteModelSource(String str) {
        this.zza = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                return dkn.b(this.zza, ((RemoteModelSource) obj).zza);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public String toString() {
        zzq zzb = zzr.zzb("RemoteModelSource");
        zzb.zza("firebaseModelName", this.zza);
        return zzb.toString();
    }

    public final String zza() {
        return this.zza;
    }
}
