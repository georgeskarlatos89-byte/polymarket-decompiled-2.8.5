package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vwg implements Executor {
    public final Executor b;
    public final ArrayDeque a = new ArrayDeque();
    public final in8 c = new in8(this, 18);
    public swg d = swg.IDLE;
    public long e = 0;

    public vwg(Executor executor) {
        executor.getClass();
        this.b = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0065 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void execute(Runnable runnable) {
        swg swgVar;
        boolean z;
        runnable.getClass();
        synchronized (this.a) {
            swg swgVar2 = this.d;
            if (swgVar2 != swg.RUNNING && swgVar2 != (swgVar = swg.QUEUED)) {
                long j = this.e;
                h9 h9Var = new h9(runnable, 4);
                this.a.add(h9Var);
                swg swgVar3 = swg.QUEUING;
                this.d = swgVar3;
                try {
                    this.b.execute(this.c);
                    if (this.d == swgVar3) {
                        synchronized (this.a) {
                            try {
                                if (this.e == j && this.d == swgVar3) {
                                    this.d = swgVar;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.a) {
                        try {
                            swg swgVar4 = this.d;
                            if (swgVar4 != swg.IDLE) {
                                if (swgVar4 == swg.QUEUING) {
                                }
                                z = false;
                                if (!(e instanceof RejectedExecutionException) && !z) {
                                    return;
                                } else {
                                    throw e;
                                }
                            }
                            if (this.a.removeLastOccurrence(h9Var)) {
                                z = true;
                                if (!(e instanceof RejectedExecutionException)) {
                                }
                                throw e;
                            }
                            z = false;
                            if (!(e instanceof RejectedExecutionException)) {
                            }
                            throw e;
                        } finally {
                        }
                    }
                }
            }
            this.a.add(runnable);
        }
    }
}
