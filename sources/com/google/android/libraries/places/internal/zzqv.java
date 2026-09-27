package com.google.android.libraries.places.internal;

import android.content.Context;
import android.os.Build;
import android.os.DropBoxManager;
import android.util.Log;
import defpackage.di1;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzqv {
    private static DropBoxManager zza;
    private static final LinkedHashMap zzb = new zzqu(16, 0.75f, true);
    private static String zzc;

    public static synchronized void zza(Context context) {
        synchronized (zzqv.class) {
            if (zza == null) {
                zza = (DropBoxManager) context.getApplicationContext().getSystemService("dropbox");
                zzc = "com.google.android.libraries.places";
            }
        }
    }

    public static synchronized void zzb(Throwable th) {
        synchronized (zzqv.class) {
            try {
                long id = Thread.currentThread().getId();
                int hashCode = th.hashCode();
                Integer num = (Integer) zzb.get(Long.valueOf(id));
                if (num != null) {
                    if (num.intValue() != hashCode) {
                    }
                }
                DropBoxManager dropBoxManager = zza;
                if (dropBoxManager != null && dropBoxManager.isTagEnabled("system_app_crash")) {
                    DropBoxManager dropBoxManager2 = zza;
                    StringBuilder sb = new StringBuilder();
                    String str = zzc;
                    List d = di1.c('.').d("5.3.0");
                    long j = -1;
                    if (d.size() == 3) {
                        long j2 = 0;
                        for (int i = 0; i < d.size(); i++) {
                            try {
                                j2 = (j2 * 100) + Integer.parseInt((String) d.get(i));
                            } catch (NumberFormatException unused) {
                            }
                        }
                        j = j2;
                    }
                    sb.append(String.format("Package: %s v%d (%s)\n", str, Long.valueOf(j), "5.3.0"));
                    sb.append("Build: " + Build.FINGERPRINT + "\n");
                    sb.append("\n");
                    sb.append(Log.getStackTraceString(th));
                    dropBoxManager2.addText("system_app_crash", sb.toString());
                    zzb.put(Long.valueOf(id), Integer.valueOf(hashCode));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
