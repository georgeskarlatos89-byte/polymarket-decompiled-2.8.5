package com.google.android.libraries.places.internal;

import defpackage.k84;
import defpackage.woa;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class zzacw {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final long zze;

    private zzacw(String str, Class cls, boolean z, boolean z2) {
        zzagc.zzd(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        this.zzd = z2;
        int identityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i = 0; i < 5; i++) {
            j |= 1 << (identityHashCode & 63);
            identityHashCode >>>= 6;
        }
        this.zze = j;
    }

    public static zzacw zzc(String str, Class cls) {
        return new zzacw(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        String name2 = cls.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        k84.q(sb, name, AgentHeaderCreator.AGENT_DIVIDER, str, "[");
        return woa.r(sb, name2, "]");
    }

    public void zza(Iterator it, zzacv zzacvVar) {
        while (it.hasNext()) {
            zzb(it.next(), zzacvVar);
        }
    }

    public void zzb(Object obj, zzacv zzacvVar) {
        zzacvVar.zza(this.zza, obj);
    }

    public final String zzd() {
        return this.zza;
    }

    public final Object zze(Object obj) {
        return this.zzb.cast(obj);
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final void zzg(Object obj, zzacv zzacvVar) {
        if (this.zzd && zzaeo.zza() > 20) {
            zzacvVar.zza(this.zza, obj);
        } else {
            zzb(obj, zzacvVar);
        }
    }

    public final void zzh(Iterator it, zzacv zzacvVar) {
        zzagc.zzc(this.zzc, "non repeating key");
        if (this.zzd && zzaeo.zza() > 20) {
            while (it.hasNext()) {
                zzacvVar.zza(this.zza, it.next());
            }
        } else {
            zza(it, zzacvVar);
        }
    }

    public final long zzi() {
        return this.zze;
    }

    public zzacw(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }
}
