package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzadb {
    public static final zzadb zzc = new zzacx();
    public static final zzadb zzd = new zzacx();

    public static zzadb zzc(zzadb zzadbVar, zzadb zzadbVar2) {
        zzadb zzadbVar3;
        zzadb zzadbVar4;
        if (zzadbVar == null) {
            return zzadbVar2;
        }
        if (zzadbVar2 != null && zzadbVar != (zzadbVar3 = zzc) && zzadbVar2 != (zzadbVar4 = zzd)) {
            if (zzadbVar2 != zzadbVar3 && zzadbVar != zzadbVar4) {
                return new zzacy(zzadbVar, zzadbVar2);
            }
            return zzadbVar2;
        }
        return zzadbVar;
    }

    public abstract void zzb();
}
