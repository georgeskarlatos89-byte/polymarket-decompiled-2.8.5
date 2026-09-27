package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import defpackage.cdk;
import defpackage.epi;
import defpackage.hp9;
import defpackage.k3d;
import defpackage.m2g;
import defpackage.p23;
import defpackage.qd0;
import defpackage.w4g;
import defpackage.wid;
import defpackage.x4g;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zznk {
    private final m2g zza;

    public zznk(m2g m2gVar) {
        this.zza = m2gVar;
    }

    public static /* synthetic */ void zza(epi epiVar, cdk cdkVar) {
        zzd(epiVar, cdkVar);
    }

    public static /* synthetic */ void zzc(zzmi zzmiVar, epi epiVar, Bitmap bitmap) {
        zze(zzmiVar, epiVar, bitmap);
    }

    private static void zzd(epi epiVar, cdk cdkVar) {
        qd0 zza;
        try {
            k3d k3dVar = cdkVar.a;
            if (k3dVar != null) {
                int i = k3dVar.a;
                if (i != 400) {
                    if (i == 403) {
                        zza = new qd0(new Status(PlacesStatusCodes.REQUEST_DENIED, "The provided API key is invalid.", null, null));
                    }
                } else {
                    zza = new qd0(new Status(PlacesStatusCodes.INVALID_REQUEST, "The provided parameters are invalid (did you include a max width or height?).", null, null));
                }
                epiVar.c(zza);
            }
            zza = zzgy.zza(cdkVar);
            epiVar.c(zza);
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    private static /* synthetic */ void zze(zzmi zzmiVar, epi epiVar, Bitmap bitmap) {
        try {
            zzmiVar.zzb(bitmap);
            epiVar.d(zzmiVar.zza());
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    public final Task zzb(zznm zznmVar, final zzmi zzmiVar) {
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
        final zzng zzngVar = new zzng(this, zzf, new x4g() { // from class: com.google.android.libraries.places.internal.zzni
            @Override // defpackage.x4g
            public final /* synthetic */ void onResponse(Object obj) {
                zznk.zzc(zzmi.this, epiVar2, (Bitmap) obj);
            }
        }, 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new w4g() { // from class: com.google.android.libraries.places.internal.zznh
            @Override // defpackage.w4g
            public final /* synthetic */ void onErrorResponse(cdk cdkVar) {
                zznk.zza(epi.this, cdkVar);
            }
        }, zze);
        if (zzd != null) {
            zzd.b(new wid() { // from class: com.google.android.libraries.places.internal.zznj
                @Override // defpackage.wid
                public final /* synthetic */ void onCanceled() {
                    hp9.this.cancel();
                }
            });
        }
        this.zza.a(zzngVar);
        return epiVar2.a;
    }
}
