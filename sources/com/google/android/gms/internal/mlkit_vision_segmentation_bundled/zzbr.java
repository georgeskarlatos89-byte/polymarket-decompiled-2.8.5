package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbr {
    public static int zza(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    public static boolean zzb(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzbj) {
            collection = ((zzbj) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        return zzc(set, collection.iterator());
    }

    public static boolean zzc(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
