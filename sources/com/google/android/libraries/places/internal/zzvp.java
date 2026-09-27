package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.FuelPrice;
import java.util.Comparator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzvp implements Comparator {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i;
        FuelPrice.FuelType type;
        FuelPrice.FuelType type2 = ((FuelPrice) obj).getType();
        int i2 = 2;
        if (type2 != null) {
            int ordinal = type2.ordinal();
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            i = 3;
                        }
                    } else {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
            } else {
                i = 4;
            }
            Integer valueOf = Integer.valueOf(i);
            type = ((FuelPrice) obj2).getType();
            if (type != null) {
                int ordinal2 = type.ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 != 3) {
                        if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                i2 = 3;
                            }
                        }
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = 4;
                }
                return valueOf.compareTo(Integer.valueOf(i2));
            }
            i2 = 5;
            return valueOf.compareTo(Integer.valueOf(i2));
        }
        i = 5;
        Integer valueOf2 = Integer.valueOf(i);
        type = ((FuelPrice) obj2).getType();
        if (type != null) {
        }
        i2 = 5;
        return valueOf2.compareTo(Integer.valueOf(i2));
    }
}
