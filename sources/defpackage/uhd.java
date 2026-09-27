package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class uhd {
    private boolean isEnabled;
    private final List<thd> eventHandlers = new ArrayList();
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    public uhd(boolean z) {
        this.isEnabled = z;
    }

    public final void addCloseable$activity(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        this.closeables.add(autoCloseable);
    }

    public final thd createNavigationEventHandler$activity(m0d m0dVar) {
        m0dVar.getClass();
        thd thdVar = new thd(this, m0dVar);
        this.eventHandlers.add(thdVar);
        return thdVar;
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(m21 m21Var) {
        m21Var.getClass();
    }

    public void handleOnBackStarted(m21 m21Var) {
        m21Var.getClass();
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        boolean isTerminated;
        Iterator<AutoCloseable> it = this.closeables.iterator();
        it.getClass();
        while (it.hasNext()) {
            AutoCloseable next = it.next();
            if (next instanceof AutoCloseable) {
                next.close();
            } else if (next instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) next;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                omf.a();
                return;
            }
        }
        this.closeables.clear();
        Iterator<thd> it2 = this.eventHandlers.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        this.eventHandlers.clear();
    }

    public final void removeCloseable$activity(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        this.closeables.remove(autoCloseable);
    }

    public final void setEnabled(boolean z) {
        boolean z2;
        this.isEnabled = z;
        for (thd thdVar : this.eventHandlers) {
            if (thdVar.i && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            thdVar.g(z2);
        }
    }

    public void handleOnBackCancelled() {
    }
}
