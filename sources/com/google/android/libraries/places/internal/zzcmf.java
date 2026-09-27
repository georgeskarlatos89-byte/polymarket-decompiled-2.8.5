package com.google.android.libraries.places.internal;

import defpackage.qp7;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcmf implements zzciu {
    private static final Logger zza = Logger.getLogger(zzcmf.class.getName());
    private static final Constructor zzb;
    private static final Method zzc;
    private static final RuntimeException zzd;
    private static final Object[] zzf;
    private final Object zze;

    static {
        Throwable th;
        Method method;
        Method method2;
        Constructor<?> constructor;
        Class<?> cls;
        try {
            cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method2 = cls.getMethod("add", Long.TYPE);
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        try {
            cls.getMethod("sum", null);
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    constructor = null;
                    break;
                }
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
            method = method2;
            zza.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            method2 = method;
            constructor = null;
            if (th != null) {
            }
            zzb = null;
            zzc = null;
            zzd = new RuntimeException(th);
            zzf = new Object[]{1L};
        }
        if (th != null && constructor != null) {
            zzb = constructor;
            zzc = method2;
            zzd = null;
        } else {
            zzb = null;
            zzc = null;
            zzd = new RuntimeException(th);
        }
        zzf = new Object[]{1L};
    }

    public zzcmf() {
        RuntimeException runtimeException = zzd;
        if (runtimeException == null) {
            try {
                this.zze = zzb.newInstance(null);
                return;
            } catch (IllegalAccessException e) {
                qp7.n(e);
                throw null;
            } catch (InstantiationException e2) {
                qp7.n(e2);
                throw null;
            } catch (InvocationTargetException e3) {
                qp7.n(e3);
                throw null;
            }
        }
        throw runtimeException;
    }

    public static boolean zzb() {
        if (zzd == null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzciu
    public final void zza(long j) {
        try {
            zzc.invoke(this.zze, zzf);
        } catch (IllegalAccessException e) {
            qp7.n(e);
        } catch (InvocationTargetException e2) {
            qp7.n(e2);
        }
    }
}
