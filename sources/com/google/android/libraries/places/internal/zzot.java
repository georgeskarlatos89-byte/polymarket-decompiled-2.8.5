package com.google.android.libraries.places.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.epi;
import defpackage.fzn;
import defpackage.p23;
import defpackage.p55;
import defpackage.qd0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzot {
    private final Map zza = new HashMap();

    public zzot(zzon zzonVar) {
    }

    public final Task zza(Task task, p23 p23Var, long j, String str) {
        final epi epiVar;
        if (p23Var == null) {
            epiVar = new epi();
        } else {
            epiVar = new epi(p23Var);
        }
        Map map = this.zza;
        if (!map.containsKey(epiVar)) {
            HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
            handlerThread.start();
            map.put(epiVar, handlerThread);
            final String str2 = "Location timeout.";
            new Handler(handlerThread.getLooper()).postDelayed(new Runnable(str2) { // from class: com.google.android.libraries.places.internal.zzos
                @Override // java.lang.Runnable
                public final void run() {
                    epi.this.c(new qd0(new Status(15, "Location timeout.", null, null)));
                }
            }, j);
        }
        task.j(new p55(this) { // from class: com.google.android.libraries.places.internal.zzoq
            @Override // defpackage.p55
            public final Object then(Task task2) {
                epi epiVar2 = epiVar;
                Exception exception = task2.getException();
                if (task2.isSuccessful()) {
                    epiVar2.b(task2.getResult());
                } else if (!task2.m() && exception != null) {
                    epiVar2.a(exception);
                }
                return epiVar2.a;
            }
        });
        OnCompleteListener onCompleteListener = new OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zzor
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                zzot.this.zzb(epiVar, task2);
            }
        };
        fzn fznVar = epiVar.a;
        fznVar.addOnCompleteListener(onCompleteListener);
        return fznVar;
    }

    public final /* synthetic */ void zzb(epi epiVar, Task task) {
        HandlerThread handlerThread = (HandlerThread) this.zza.remove(epiVar);
        if (handlerThread == null) {
            return;
        }
        handlerThread.quit();
    }
}
