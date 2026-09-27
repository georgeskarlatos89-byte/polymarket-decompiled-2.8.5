package com.google.android.libraries.places.internal;

import defpackage.b7h;
import defpackage.brn;
import defpackage.dmk;
import defpackage.tr9;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class zzaae {
    private static final zzaac zza = zzaac.zza(Boolean.class);
    private final zzaae zzb;
    private final b7h zzc;
    private boolean zzd = false;

    public /* synthetic */ zzaae(zzaae zzaaeVar, b7h b7hVar, byte[] bArr) {
        if (zzaaeVar != null) {
            brn.h(zzaaeVar.zzd);
        }
        this.zzb = zzaaeVar;
        this.zzc = b7hVar;
    }

    public static zzaae zza(zzaae zzaaeVar, zzaae zzaaeVar2) {
        boolean z;
        if (zzaaeVar.zzc()) {
            return zzaaeVar2;
        }
        if (zzaaeVar2.zzc()) {
            return zzaaeVar;
        }
        tr9<zzaae> q = tr9.q(zzaaeVar, zzaaeVar2);
        if (q.isEmpty()) {
            return zzaad.zza;
        }
        if (q.size() == 1) {
            return (zzaae) q.iterator().next();
        }
        int i = 0;
        for (zzaae zzaaeVar3 : q) {
            do {
                i += zzaaeVar3.zzc.c;
                zzaaeVar3 = zzaaeVar3.zzb;
            } while (zzaaeVar3 != null);
        }
        if (i == 0) {
            return zzaad.zza;
        }
        b7h b7hVar = new b7h(i);
        for (zzaae zzaaeVar4 : q) {
            do {
                int i2 = 0;
                while (true) {
                    b7h b7hVar2 = zzaaeVar4.zzc;
                    if (i2 >= b7hVar2.c) {
                        break;
                    }
                    if (b7hVar.put((zzaac) b7hVar2.f(i2), b7hVar2.j(i2)) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    brn.e(b7hVar2.f(i2), "Duplicate bindings: %s", z);
                    i2++;
                }
                zzaaeVar4 = zzaaeVar4.zzb;
            } while (zzaaeVar4 != null);
        }
        return new zzaad(null, b7hVar, null).zzb();
    }

    public static /* synthetic */ zzaac zzf() {
        return zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (zzaae zzaaeVar = this; zzaaeVar != null; zzaaeVar = zzaaeVar.zzb) {
            for (int i = 0; i < zzaaeVar.zzc.c; i++) {
                sb.append("[");
                sb.append(this.zzc.j(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }

    public final zzaae zzb() {
        if (!this.zzd) {
            this.zzd = true;
            zzaae zzaaeVar = this.zzb;
            if (zzaaeVar != null && this.zzc.isEmpty()) {
                return zzaaeVar;
            }
            return this;
        }
        dmk.n("Already frozen");
        return null;
    }

    public final boolean zzc() {
        if (this == zzaad.zza) {
            return true;
        }
        return false;
    }

    public final boolean zzd(zzaac zzaacVar) {
        if (this.zzc.containsKey(zzaacVar)) {
            return true;
        }
        zzaae zzaaeVar = this.zzb;
        if (zzaaeVar != null && zzaaeVar.zzd(zzaacVar)) {
            return true;
        }
        return false;
    }

    public final boolean zze() {
        return this.zzd;
    }

    public final /* synthetic */ b7h zzg() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzd;
    }
}
