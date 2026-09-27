package com.google.android.libraries.places.internal;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzabj {
    private static final char[][] zzb = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);
    private final char[][] zza;

    private zzabj(char[][] cArr) {
        this.zza = cArr;
    }

    public static zzabj zza(Map map) {
        char[][] cArr;
        map.getClass();
        if (map.isEmpty()) {
            cArr = zzb;
        } else {
            char[][] cArr2 = new char[((Character) Collections.max(map.keySet())).charValue() + 1];
            for (Character ch : map.keySet()) {
                cArr2[ch.charValue()] = ((String) map.get(ch)).toCharArray();
            }
            cArr = cArr2;
        }
        return new zzabj(cArr);
    }

    public final char[][] zzb() {
        return this.zza;
    }
}
