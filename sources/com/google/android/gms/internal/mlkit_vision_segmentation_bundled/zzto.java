package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import android.content.Context;
import defpackage.dya;
import defpackage.f6f;
import defpackage.gdj;
import defpackage.jdj;
import defpackage.kdj;
import defpackage.ldj;
import defpackage.lgf;
import defpackage.mdj;
import defpackage.sbj;
import defpackage.td7;
import defpackage.tw0;
import defpackage.vw1;
import defpackage.zk7;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzto implements zzsw {
    private lgf zza;
    private final lgf zzb;
    private final zzsy zzc;

    public zzto(Context context, zzsy zzsyVar) {
        this.zzc = zzsyVar;
        vw1 vw1Var = vw1.e;
        mdj.b(context);
        final kdj c = mdj.a().c(vw1Var);
        if (vw1.d.contains(new td7("json"))) {
            this.zza = new dya(new lgf() { // from class: com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zztl
                @Override // defpackage.lgf
                public final Object get() {
                    return ((kdj) jdj.this).a("FIREBASE_ML_SDK", new td7("json"), new sbj() { // from class: com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zztn
                        @Override // defpackage.sbj
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new dya(new lgf() { // from class: com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zztm
            @Override // defpackage.lgf
            public final Object get() {
                return ((kdj) jdj.this).a("FIREBASE_ML_SDK", new td7("proto"), new sbj() { // from class: com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zztk
                    @Override // defpackage.sbj
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static zk7 zzb(zzsy zzsyVar, zzsv zzsvVar) {
        int zza = zzsyVar.zza();
        if (zzsvVar.zza() != 0) {
            return new tw0(zzsvVar.zze(zza, false), f6f.DEFAULT, null);
        }
        return zk7.a(zzsvVar.zze(zza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzsw
    public final void zza(zzsv zzsvVar) {
        if (this.zzc.zza() == 0) {
            lgf lgfVar = this.zza;
            if (lgfVar != null) {
                ((ldj) ((gdj) lgfVar.get())).a(zzb(this.zzc, zzsvVar));
                return;
            }
            return;
        }
        ((ldj) ((gdj) this.zzb.get())).a(zzb(this.zzc, zzsvVar));
    }
}
