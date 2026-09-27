package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzgt implements Comparator {
    static final /* synthetic */ zzgt zza = new zzgt();

    private /* synthetic */ zzgt() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((ScanResult) obj2).level - ((ScanResult) obj).level;
    }
}
