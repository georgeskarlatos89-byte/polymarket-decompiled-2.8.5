package io.sentry;

import java.util.Iterator;
import java.util.TimerTask;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class o extends TimerTask {
    public final /* synthetic */ r a;

    public o(r rVar) {
        this.a = rVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Iterator it = this.a.d.iterator();
        while (it.hasNext()) {
            ((a1) it.next()).a();
        }
    }
}
