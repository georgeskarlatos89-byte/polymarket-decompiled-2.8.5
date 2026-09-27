package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl4 implements lgf {
    public final /* synthetic */ int a;

    public /* synthetic */ hl4(int i) {
        this.a = i;
    }

    @Override // defpackage.lgf
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                dya dyaVar = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new ck6(Executors.newFixedThreadPool(4, new ih5("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 2:
                dya dyaVar2 = ExecutorsRegistrar.a;
                return new ck6(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ih5("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                dya dyaVar3 = ExecutorsRegistrar.a;
                return new ck6(Executors.newCachedThreadPool(new ih5("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                dya dyaVar4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new ih5("Firebase Scheduler", 0, null));
            case 5:
            default:
                return null;
        }
    }
}
