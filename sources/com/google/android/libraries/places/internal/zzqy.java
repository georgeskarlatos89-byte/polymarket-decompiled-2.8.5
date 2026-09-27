package com.google.android.libraries.places.internal;

import android.content.Context;
import defpackage.ahh;
import defpackage.f6f;
import defpackage.gdj;
import defpackage.ldj;
import defpackage.mdj;
import defpackage.my0;
import defpackage.pql;
import defpackage.pt6;
import defpackage.td7;
import defpackage.tw0;
import defpackage.vx0;
import defpackage.ysk;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzqy implements zzra {
    private static final Integer zza = 79508299;
    private final gdj zzb;
    private final zzfw zzc;

    public zzqy(gdj gdjVar, zzfw zzfwVar) {
        this.zzb = gdjVar;
        this.zzc = zzfwVar;
    }

    public static gdj zza(Context context) {
        mdj.b(context.getApplicationContext());
        mdj a = mdj.a();
        a.getClass();
        Set singleton = Collections.singleton(new td7("proto"));
        ysk a2 = my0.a();
        a2.b = "cct";
        my0 l = a2.l();
        td7 td7Var = new td7("proto");
        zzqx zzqxVar = zzqx.zza;
        if (singleton.contains(td7Var)) {
            return new ldj(l, "LE", td7Var, zzqxVar, a);
        }
        ahh.m("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{td7Var, singleton});
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final void zzb(zzaza zzazaVar) {
        pql.a(this.zzc.zza(), new zzqw(this, zzazaVar), pt6.INSTANCE);
    }

    public final void zzc(zzaza zzazaVar) {
        zzazh zzazhVar = (zzazh) zzazaVar.zzD();
        zzago zza2 = zzagq.zza();
        zza2.zzb(1);
        zza2.zza(zzazhVar);
        ((ldj) this.zzb).a(new tw0((zzagq) zza2.zzD(), f6f.DEFAULT, new vx0(zza)));
    }
}
