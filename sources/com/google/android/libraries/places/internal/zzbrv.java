package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbrv extends zzbrf {
    final zzbsz zza;
    final zzbru zzb;

    public zzbrv(zzbsz zzbszVar, Object obj, zzbsz zzbszVar2, zzbru zzbruVar, Class cls) {
        if (zzbszVar != null) {
            if (zzbruVar.zzb == zzbul.zzk && zzbszVar2 == null) {
                dmk.v("Null messageDefaultInstance");
                throw null;
            }
            this.zza = zzbszVar2;
            this.zzb = zzbruVar;
            return;
        }
        dmk.v("Null containingTypeDefaultInstance");
        throw null;
    }
}
