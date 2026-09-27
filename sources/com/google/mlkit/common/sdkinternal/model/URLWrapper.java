package com.google.mlkit.common.sdkinternal.model;

import java.net.URL;
import java.net.URLConnection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class URLWrapper {
    private final URL zza;

    public URLWrapper(String str) {
        this.zza = new URL(str);
    }

    public URLConnection openConnection() {
        return this.zza.openConnection();
    }
}
