package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yxm implements gci {
    public static final /* synthetic */ yxm a = new Object();

    @Override // defpackage.gci
    public final Object get() {
        Object obj = zwm.j;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(i9.b);
        if (newSingleThreadScheduledExecutor instanceof lkb) {
            return (lkb) newSingleThreadScheduledExecutor;
        }
        return new wkc(newSingleThreadScheduledExecutor);
    }
}
