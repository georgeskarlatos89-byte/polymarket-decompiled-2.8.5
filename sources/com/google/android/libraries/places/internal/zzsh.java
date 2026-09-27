package com.google.android.libraries.places.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import defpackage.gpc;
import defpackage.olb;
import defpackage.qd0;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzsh extends zzsc {
    private final zzrv zza;
    private final zzss zzb;
    private final zzul zzc;
    private Runnable zze;
    private final Handler zzd = new Handler(Looper.getMainLooper());
    private final gpc zzf = new olb();

    /* JADX WARN: Type inference failed for: r0v1, types: [olb, gpc] */
    public zzsh(zzrv zzrvVar, zzss zzssVar, zzul zzulVar) {
        this.zza = zzrvVar;
        this.zzb = zzssVar;
        this.zzc = zzulVar;
    }

    private final void zzp(zzrp zzrpVar) {
        gpc gpcVar = this.zzf;
        if (!zzrpVar.equals(gpcVar.d())) {
            gpcVar.l(zzrpVar);
        }
    }

    private static Status zzq(Exception exc) {
        if (exc instanceof qd0) {
            return ((qd0) exc).a;
        }
        return new Status(13, exc.getMessage(), null, null);
    }

    private static boolean zzr(Status status) {
        int i = status.a;
        if (i != 16 && i != 9012 && i != 9011) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dak
    public final void onCleared() {
        try {
            this.zza.zzc();
            this.zzd.removeCallbacks(this.zze);
            zzss zzssVar = this.zzb;
            zzssVar.zzw();
            this.zzc.zza(zzssVar);
        } catch (Error | RuntimeException e) {
            zzqv.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzsc
    public final olb zza() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzsc
    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            this.zzf.l(zzrp.zzh());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzsc
    public final void zzc(final String str, final int i) {
        this.zzb.zzC(str);
        Runnable runnable = this.zze;
        if (runnable != null) {
            this.zzd.removeCallbacks(runnable);
        }
        if (str.isEmpty()) {
            this.zza.zzc();
            zzp(zzrp.zzi());
        } else {
            Runnable runnable2 = new Runnable() { // from class: com.google.android.libraries.places.internal.zzsg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzsh.this.zzm(str, i);
                }
            };
            this.zze = runnable2;
            this.zzd.postDelayed(runnable2, 100L);
            zzp(zzrp.zzj());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzsc
    public final void zzd(final AutocompletePrediction autocompletePrediction, int i) {
        zzss zzssVar = this.zzb;
        zzssVar.zzu(i);
        zzrv zzrvVar = this.zza;
        if (zzrvVar.zzf() == zzqs.PLACES_UI_KIT) {
            Place.Builder builder = Place.builder();
            builder.setId(autocompletePrediction.getPlaceId());
            Place build = builder.build();
            zzssVar.zzA();
            zzp(zzrp.zzo(build));
            return;
        }
        if (zzrvVar.zzf() == zzqs.ONE_PLATFORM_AUTOCOMPLETE_WIDGET) {
            zzssVar.zzA();
            zzp(zzrp.zzp(autocompletePrediction, zzssVar.zzg()));
        } else {
            Task zzb = zzrvVar.zzb(autocompletePrediction);
            if (!zzb.n()) {
                zzp(zzrp.zzj());
            }
            zzb.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zzsf
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(Task task) {
                    zzsh.this.zzo(autocompletePrediction, task);
                }
            });
        }
    }

    @Override // com.google.android.libraries.places.internal.zzsc
    public final void zze() {
        this.zzb.zzE();
    }

    @Override // com.google.android.libraries.places.internal.zzsc
    public final void zzf() {
        this.zzb.zzD();
        zzc("", 0);
    }

    @Override // com.google.android.libraries.places.internal.zzsc
    public final void zzg(String str, int i) {
        this.zza.zzc();
        zzc(str, i);
        zzp(zzrp.zzk());
    }

    @Override // com.google.android.libraries.places.internal.zzsc
    public final void zzh() {
        this.zzb.zzF();
    }

    @Override // com.google.android.libraries.places.internal.zzsc
    public final void zzi() {
        this.zzb.zzG();
    }

    @Override // com.google.android.libraries.places.internal.zzsc
    public final void zzj() {
        this.zzb.zzv();
        zzp(zzrp.zzr());
    }

    @Override // com.google.android.libraries.places.internal.zzsc
    public final void zzl() {
        this.zza.zze();
    }

    public final /* synthetic */ void zzm(final String str, int i) {
        this.zza.zza(str, i).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zzse
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                zzsh.this.zzn(str, task);
            }
        });
    }

    public final /* synthetic */ void zzn(String str, Task task) {
        if (task.m()) {
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            this.zzb.zzx();
            List<AutocompletePrediction> autocompletePredictions = ((FindAutocompletePredictionsResponse) task.getResult()).getAutocompletePredictions();
            if (autocompletePredictions.isEmpty()) {
                zzp(zzrp.zzm(str));
                return;
            } else {
                zzp(zzrp.zzl(autocompletePredictions));
                return;
            }
        }
        String message = exception.getMessage();
        if (message != null && message.contains("Too many concurrent requests")) {
            this.zzb.zzz();
            return;
        }
        this.zzb.zzy();
        Status zzq = zzq(exception);
        if (zzr(zzq)) {
            zzp(zzrp.zzs(zzq));
        } else {
            zzp(zzrp.zzn(str, zzq));
        }
    }

    public final /* synthetic */ void zzo(AutocompletePrediction autocompletePrediction, Task task) {
        if (task.m()) {
            return;
        }
        Exception exception = task.getException();
        zzss zzssVar = this.zzb;
        if (exception == null) {
            zzssVar.zzA();
            zzp(zzrp.zzo(((FetchPlaceResponse) task.getResult()).getPlace()));
            return;
        }
        zzssVar.zzB();
        Status zzq = zzq(exception);
        if (zzr(zzq)) {
            zzp(zzrp.zzs(zzq));
        } else {
            zzp(zzrp.zzq(autocompletePrediction, zzq));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzsc
    public final void zzk() {
    }
}
