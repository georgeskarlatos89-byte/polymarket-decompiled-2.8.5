package com.google.android.libraries.places.internal;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzfm {
    private static final zzacd zza = zzacd.zzf("com/google/android/libraries/mapsplatform/common/api/configs/AuxLibConfigs");
    private static final Set zzb = new HashSet();

    public static void zza(String str) {
        if (str.length() > 50) {
            ((zzaca) ((zzaca) zza.zzb()).zzn("com/google/android/libraries/mapsplatform/common/api/configs/AuxLibConfigs", "addInternalUsageAttributionId", 25, "AuxLibConfigs.java")).zzp("Internal Usage Attribution Id is too long: %s", str);
            return;
        }
        Set set = zzb;
        if (set.size() >= 10) {
            ((zzaca) ((zzaca) zza.zzb()).zzn("com/google/android/libraries/mapsplatform/common/api/configs/AuxLibConfigs", "addInternalUsageAttributionId", 31, "AuxLibConfigs.java")).zzo("Internal Usage Attribution Ids list is full.");
        } else {
            set.add(str);
        }
    }

    public static Set zzb() {
        return zzb;
    }
}
