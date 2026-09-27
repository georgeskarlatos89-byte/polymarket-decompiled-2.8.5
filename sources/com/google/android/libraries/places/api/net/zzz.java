package com.google.android.libraries.places.api.net;

import defpackage.ix2;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzz extends zzam {
    private final List zza;

    public /* synthetic */ zzz(List list, byte[] bArr) {
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzam)) {
            return false;
        }
        zzam zzamVar = (zzam) obj;
        List list = this.zza;
        if (list == null) {
            if (zzamVar.zza() == null) {
                return true;
            }
            return false;
        }
        return list.equals(zzamVar.zza());
    }

    public final int hashCode() {
        int hashCode;
        List list = this.zza;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return ix2.p(new StringBuilder(valueOf.length() + 27), "SearchMediaResponse{media=", valueOf, "}");
    }

    @Override // com.google.android.libraries.places.api.net.zzam
    public final List zza() {
        return this.zza;
    }
}
