package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface zzcot {
    public static final zzcot zza;

    static {
        zzcot zzcelVar;
        try {
            Class.forName("java.time.Instant");
            zzcelVar = new zzchu();
        } catch (ClassNotFoundException unused) {
            zzcelVar = new zzcel();
        }
        zza = zzcelVar;
    }

    long zza();
}
