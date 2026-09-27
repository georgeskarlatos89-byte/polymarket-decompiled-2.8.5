package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import io.sentry.android.core.f0;
import io.sentry.p0;
import io.sentry.q0;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.sentry.util.a aVar;
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.G(true);
                aVar = b.n;
                aVar.e();
                try {
                    b.o.clear();
                    aVar.close();
                    io.sentry.util.a aVar2 = b.l;
                    aVar2.e();
                    try {
                        b.m = null;
                        aVar2.close();
                        f0.e.p(bVar);
                        return;
                    } catch (Throwable th) {
                        try {
                            aVar2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } finally {
                    try {
                        aVar.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            case 1:
                bVar.o();
                return;
            case 2:
                bVar.G(false);
                return;
            default:
                bVar.K(null);
                p0 p = bVar.p();
                if (p == p0.DISCONNECTED) {
                    bVar.k.set(false);
                    aVar = b.n;
                    aVar.e();
                    try {
                        Iterator it = b.o.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                        }
                        aVar.close();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                io.sentry.util.a aVar3 = bVar.f;
                aVar3.e();
                try {
                    Iterator it2 = bVar.e.iterator();
                    while (it2.hasNext()) {
                        ((q0) it2.next()).e(p);
                    }
                    aVar3.close();
                    bVar.o();
                    return;
                } catch (Throwable th5) {
                    try {
                        aVar3.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
        }
    }
}
