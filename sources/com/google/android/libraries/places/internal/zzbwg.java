package com.google.android.libraries.places.internal;

import defpackage.dmk;
import defpackage.sv6;
import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbwg {
    public static Object zza(Object obj, Class cls) {
        if (obj instanceof zzbwh) {
            if (obj instanceof zzbwj) {
                Annotation[] annotations = cls.getAnnotations();
                int length = annotations.length;
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                        z = true;
                        break;
                    }
                    i++;
                }
                String canonicalName = cls.getCanonicalName();
                if (z) {
                    dmk.n(sv6.n("Interface, ", canonicalName, ", annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()"));
                    return null;
                }
            }
            return cls.cast(obj);
        }
        if (obj instanceof zzbwi) {
            return zza(((zzbwi) obj).zza(), cls);
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + zzbwh.class + " or " + zzbwi.class);
    }
}
