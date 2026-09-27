package com.google.android.libraries.places.internal;

import defpackage.omf;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbxy {
    static final zzbxz zza;

    static {
        zzbxz zzccmVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            zzccmVar = (zzbxz) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(zzbxz.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            zzccmVar = new zzccm();
        } catch (Exception e2) {
            omf.m("Storage override failed to initialize", e2);
            return;
        }
        zza = zzccmVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            zzbya.zza.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
