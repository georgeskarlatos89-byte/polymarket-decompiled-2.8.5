package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import io.sentry.p5;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ Window c;

    public /* synthetic */ k(p pVar, Window window, int i) {
        this.a = i;
        this.b = pVar;
        this.c = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                Window window = this.c;
                if (pVar.b.add(window)) {
                    try {
                        c cVar = pVar.i;
                        l lVar = pVar.j;
                        Handler handler = pVar.d;
                        cVar.getClass();
                        if (lVar != null) {
                            window.addOnFrameMetricsAvailableListener(lVar, handler);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        pVar.c.d(p5.ERROR, "Failed to add frameMetricsAvailableListener", th);
                        return;
                    }
                }
                return;
            default:
                p pVar2 = this.b;
                Window window2 = this.c;
                try {
                    if (pVar2.b.remove(window2)) {
                        c cVar2 = pVar2.i;
                        l lVar2 = pVar2.j;
                        cVar2.getClass();
                        if (lVar2 != null) {
                            window2.removeOnFrameMetricsAvailableListener(lVar2);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    pVar2.c.d(p5.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
                    return;
                }
        }
    }
}
