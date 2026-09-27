package io.sentry.android.core.internal.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class e {
    public static final e c = new e();
    public final io.sentry.util.a a = new Object();
    public final ArrayList b = new ArrayList();

    public final ArrayList a() {
        ArrayList arrayList = this.b;
        io.sentry.util.a aVar = this.a;
        aVar.e();
        try {
            if (!arrayList.isEmpty()) {
                aVar.close();
                return arrayList;
            }
            File[] listFiles = new File("/sys/devices/system/cpu").listFiles();
            if (listFiles == null) {
                ArrayList arrayList2 = new ArrayList();
                aVar.close();
                return arrayList2;
            }
            for (File file : listFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String s = io.sentry.util.b.s(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (s != null) {
                            arrayList.add(Integer.valueOf((int) (Long.parseLong(s.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            aVar.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
