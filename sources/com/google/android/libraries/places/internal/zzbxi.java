package com.google.android.libraries.places.internal;

import com.appsflyer.AppsFlyerProperties;
import defpackage.brn;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbxi {
    public static zzbxb zza(zzbxb zzbxbVar, List list) {
        brn.m(zzbxbVar, AppsFlyerProperties.CHANNEL);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbxbVar = new zzbxh(zzbxbVar, (zzbxg) it.next(), null);
        }
        return zzbxbVar;
    }
}
