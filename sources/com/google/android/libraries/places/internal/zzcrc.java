package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcrc {
    private final Class zza;
    private final String zzb;
    private final Class[] zzc;

    public zzcrc(Class cls, String str, Class... clsArr) {
        this.zza = cls;
        this.zzb = str;
        this.zzc = clsArr;
    }

    private final Method zzd(Class cls) {
        Class cls2;
        Method zze = zze(cls, this.zzb, this.zzc);
        if (zze != null && (cls2 = this.zza) != null && !cls2.isAssignableFrom(zze.getReturnType())) {
            return null;
        }
        return zze;
    }

    private static Method zze(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return zze(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public final boolean zza(Object obj) {
        if (zzd(obj.getClass()) != null) {
            return true;
        }
        return false;
    }

    public final Object zzb(Object obj, Object... objArr) {
        try {
            Method zzd = zzd(obj.getClass());
            if (zzd == null) {
                return null;
            }
            try {
                return zzd.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
                return null;
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final Object zzc(Object obj, Object... objArr) {
        try {
            Method zzd = zzd(obj.getClass());
            if (zzd != null) {
                try {
                    return zzd.invoke(obj, objArr);
                } catch (IllegalAccessException e) {
                    AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(zzd.toString()));
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            String str = this.zzb;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 33 + valueOf.length());
            sb.append("Method ");
            sb.append(str);
            sb.append(" not supported for object ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }
}
