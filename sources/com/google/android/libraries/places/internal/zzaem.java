package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaem {
    private static final zzaeo zza = zzb(zzaeo.zzo());

    public static /* synthetic */ zzaeo zza() {
        return zza;
    }

    private static zzaeo zzb(String[] strArr) {
        zzaeu zzaeuVar;
        try {
            zzaeuVar = zzaev.zza;
        } catch (NoClassDefFoundError unused) {
            zzaeuVar = null;
        }
        if (zzaeuVar != null) {
            return zzaeuVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzaeo) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
