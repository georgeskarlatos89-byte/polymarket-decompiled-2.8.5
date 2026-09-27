package com.google.android.libraries.places.api.model;

import defpackage.k84;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzg extends AddressDescriptor {
    private final List zza;
    private final List zzb;

    public zzg(List list, List list2) {
        this.zza = list;
        this.zzb = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddressDescriptor) {
            AddressDescriptor addressDescriptor = (AddressDescriptor) obj;
            List list = this.zza;
            if (list != null ? list.equals(addressDescriptor.getLandmarks()) : addressDescriptor.getLandmarks() == null) {
                List list2 = this.zzb;
                if (list2 != null ? list2.equals(addressDescriptor.getAreas()) : addressDescriptor.getAreas() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.AddressDescriptor
    public final List<Area> getAreas() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressDescriptor
    public final List<Landmark> getLandmarks() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode;
        List list = this.zza;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        List list2 = this.zzb;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        List list = this.zzb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(list);
        StringBuilder sb = new StringBuilder(valueOf.length() + 36 + valueOf2.length() + 1);
        k84.q(sb, "AddressDescriptor{landmarks=", valueOf, ", areas=", valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
