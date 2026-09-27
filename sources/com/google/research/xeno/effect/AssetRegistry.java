package com.google.research.xeno.effect;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class AssetRegistry {
    public final long a = nativeCreateAssetRegistry();

    public AssetRegistry(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            nativeRegisterAsset(this.a, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    private native long nativeCreateAssetRegistry();

    private native void nativeRegisterAsset(long j, String str, String str2);
}
