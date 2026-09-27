package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import defpackage.dya;
import defpackage.gdj;
import defpackage.jdj;
import defpackage.kdj;
import defpackage.ldj;
import defpackage.lgf;
import defpackage.mdj;
import defpackage.sbj;
import defpackage.td7;
import defpackage.vw1;
import defpackage.zk7;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzmp implements zzmc {
    private lgf zza;
    private final lgf zzb;
    private final zzme zzc;

    public zzmp(Context context, zzme zzmeVar) {
        this.zzc = zzmeVar;
        vw1 vw1Var = vw1.e;
        mdj.b(context);
        final kdj c = mdj.a().c(vw1Var);
        if (vw1.d.contains(new td7("json"))) {
            this.zza = new dya(new lgf() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmm
                @Override // defpackage.lgf
                public final Object get() {
                    return ((kdj) jdj.this).a("FIREBASE_ML_SDK", new td7("json"), new sbj() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmo
                        @Override // defpackage.sbj
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new dya(new lgf() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmn
            @Override // defpackage.lgf
            public final Object get() {
                return ((kdj) jdj.this).a("FIREBASE_ML_SDK", new td7("proto"), new sbj() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzml
                    @Override // defpackage.sbj
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static zk7 zzb(zzme zzmeVar, zzmb zzmbVar) {
        return zk7.a(zzmbVar.zzd(zzmeVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zzmb zzmbVar) {
        if (this.zzc.zza() == 0) {
            lgf lgfVar = this.zza;
            if (lgfVar != null) {
                ((ldj) ((gdj) lgfVar.get())).a(zzb(this.zzc, zzmbVar));
                return;
            }
            return;
        }
        ((ldj) ((gdj) this.zzb.get())).a(zzb(this.zzc, zzmbVar));
    }
}
