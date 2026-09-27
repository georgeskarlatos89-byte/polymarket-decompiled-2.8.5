package com.google.android.libraries.places.internal;

import defpackage.gci;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcbz {
    public static List zza(Class cls, Iterator it, gci gciVar, zzcby zzcbyVar) {
        if (!(it instanceof ListIterator)) {
            if (zzb(cls.getClassLoader())) {
                Iterable<Class> iterable = (Iterable) gciVar.get();
                ArrayList arrayList = new ArrayList();
                for (Class cls2 : iterable) {
                    Object obj = null;
                    try {
                        obj = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                    } catch (ClassCastException unused) {
                    } catch (Throwable th) {
                        throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                    }
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
                it = arrayList.iterator();
            } else if (!it.hasNext()) {
                it = ServiceLoader.load(cls).iterator();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (it.hasNext()) {
            Object next = it.next();
            zzcbyVar.zzb(next);
            arrayList2.add(next);
        }
        Collections.sort(arrayList2, Collections.reverseOrder(new zzcbx(zzcbyVar)));
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean zzb(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
