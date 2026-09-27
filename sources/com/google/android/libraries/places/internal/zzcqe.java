package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcqe extends LinkedHashMap {
    public /* synthetic */ zzcqe(byte[] bArr) {
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 100) {
            return true;
        }
        return false;
    }

    private zzcqe() {
        throw null;
    }
}
