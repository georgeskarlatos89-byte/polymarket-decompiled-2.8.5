package com.google.android.libraries.places.internal;

import java.util.function.Function;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzko implements Function {
    static final /* synthetic */ zzko zza = new zzko();

    private /* synthetic */ zzko() {
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        String str = (String) obj;
        return str.substring(str.lastIndexOf("places/") + 7);
    }
}
