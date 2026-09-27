package com.google.android.libraries.places.internal;

import com.fingerprintjs.android.fpjs_pro.g;
import defpackage.jr9;
import defpackage.k84;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbee {
    public static zzbxg zza(final zzctp zzctpVar) {
        return new zzbed(new zzctp() { // from class: com.google.android.libraries.places.internal.zzbec
            @Override // com.google.android.libraries.places.internal.zzctp
            public final /* synthetic */ Object zzb() {
                return jr9.s(((zzgk) zzctp.this).zza());
            }
        }, 2, zzbsz.class, zzbsz.class);
    }

    public static /* synthetic */ void zzb(zzcax zzcaxVar, Class cls, boolean z) {
        zzcau zzg;
        Class cls2;
        boolean z2;
        String str;
        String str2;
        if (z) {
            zzg = zzcaxVar.zzf();
        } else {
            zzg = zzcaxVar.zzg();
        }
        try {
            cls2 = ((zzcaw) zzg).zzc();
            z2 = false;
        } catch (ClassCastException unused) {
            cls2 = Object.class;
            z2 = true;
        }
        if (!cls.isAssignableFrom(cls2)) {
            if (true != z) {
                str = "response";
            } else {
                str = "request";
            }
            zzccd zzccdVar = zzccd.zzh;
            String zzb = zzcaxVar.zzb();
            String name = cls2.getName();
            if (true != z2) {
                str2 = "";
            } else {
                str2 = ", assumed because method doesn't use ReflectableMarshaller";
            }
            String obj = cls.toString();
            StringBuilder sb = new StringBuilder(g.d(name.length() + g.d(str.length() + 52, 2, String.valueOf(zzb)), 24, str2) + obj.length());
            k84.q(sb, "AsyncClientInterceptor: The ", str, " message type of method ", zzb);
            k84.q(sb, " (", name, str2, ") must be a subclass of ");
            sb.append(obj);
            throw new zzcce(zzccdVar.zze(sb.toString()), null);
        }
    }
}
