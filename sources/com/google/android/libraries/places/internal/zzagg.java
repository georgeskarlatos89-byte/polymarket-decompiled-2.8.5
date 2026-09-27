package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzagg implements zzagf {
    private static final int zzc(StackTraceElement[] stackTraceElementArr, Class cls, int i) {
        String name = cls.getName();
        boolean z = false;
        for (int i2 = 3; i2 < stackTraceElementArr.length; i2++) {
            if (stackTraceElementArr[i2].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzagf
    public final StackTraceElement zza(Class cls, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int zzc = zzc(stackTrace, cls, 3);
        if (zzc != -1) {
            return stackTrace[zzc];
        }
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzagf
    public final StackTraceElement[] zzb(Class cls, int i, int i2) {
        boolean z = true;
        if (i != -1 && i <= 0) {
            z = false;
        }
        zzagc.zzb(z, "maxDepth must be > 0 or -1");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int zzc = zzc(stackTrace, cls, 3);
        if (zzc == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - zzc;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, zzc, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
