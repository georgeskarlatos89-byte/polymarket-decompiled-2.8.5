package com.google.android.libraries.places.internal;

import android.os.StrictMode;
import defpackage.brn;
import java.util.Iterator;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzzg {
    static final zzzi zza;

    static {
        zzzi zzzeVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Iterator it = ServiceLoader.load(zzzi.class, zzzi.class.getClassLoader()).iterator();
            if (it.hasNext()) {
                zzzeVar = (zzzi) it.next();
                brn.r("Expected at most one FlagsService", !it.hasNext());
            } else {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                zzzeVar = new zzze();
            }
            zza = zzzeVar;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
