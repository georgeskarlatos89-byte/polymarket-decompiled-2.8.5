package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import defpackage.cdk;
import defpackage.dfa;
import defpackage.epi;
import defpackage.m2g;
import defpackage.p23;
import defpackage.qd0;
import defpackage.w4g;
import defpackage.wid;
import defpackage.x4g;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzne {
    private final m2g zza;
    private final zznp zzb;

    public zzne(m2g m2gVar, zznp zznpVar) {
        this.zza = m2gVar;
        this.zzb = zznpVar;
    }

    public static /* synthetic */ void zzc(epi epiVar, cdk cdkVar) {
        zzd(epiVar, cdkVar);
    }

    private static /* synthetic */ void zzd(epi epiVar, cdk cdkVar) {
        try {
            epiVar.c(zzgy.zza(cdkVar));
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    private final void zze(Class cls, epi epiVar, JSONObject jSONObject) {
        try {
            try {
                epiVar.d((zznn) this.zzb.zza(jSONObject.toString(), cls));
            } catch (Error | RuntimeException e) {
                zzqv.zzb(e);
                throw e;
            }
        } catch (zzno e2) {
            epiVar.c(new qd0(new Status(8, e2.getMessage(), null, null)));
        }
    }

    public final Task zza(zznm zznmVar, final Class cls) {
        epi epiVar;
        String zzf = zznmVar.zzf();
        Map zze = zznmVar.zze();
        p23 zzd = zznmVar.zzd();
        if (zzd != null) {
            epiVar = new epi(zzd);
        } else {
            epiVar = new epi();
        }
        final epi epiVar2 = epiVar;
        final zzna zznaVar = new zzna(this, 0, zzf, null, new x4g() { // from class: com.google.android.libraries.places.internal.zznc
            @Override // defpackage.x4g
            public final /* synthetic */ void onResponse(Object obj) {
                zzne.this.zzb(cls, epiVar2, (JSONObject) obj);
            }
        }, new w4g() { // from class: com.google.android.libraries.places.internal.zznb
            @Override // defpackage.w4g
            public final /* synthetic */ void onErrorResponse(cdk cdkVar) {
                zzne.zzc(epi.this, cdkVar);
            }
        }, zze);
        if (zzd != null) {
            zzd.b(new wid() { // from class: com.google.android.libraries.places.internal.zznd
                @Override // defpackage.wid
                public final /* synthetic */ void onCanceled() {
                    dfa.this.cancel();
                }
            });
        }
        this.zza.a(zznaVar);
        return epiVar2.a;
    }

    public final /* synthetic */ void zzb(Class cls, epi epiVar, JSONObject jSONObject) {
        zze(cls, epiVar, jSONObject);
    }
}
