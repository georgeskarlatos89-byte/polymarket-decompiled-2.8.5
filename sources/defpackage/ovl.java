package defpackage;

import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
import com.google.mlkit.vision.barcode.internal.zze;
import com.google.mlkit.vision.barcode.internal.zzh;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ovl extends AtomicReference implements Runnable {
    public static final mb7 c = new mb7(4);
    public static final mb7 d = new mb7(4);
    public final /* synthetic */ uvl a;
    public final f91 b;

    public ovl(uvl uvlVar, f91 f91Var) {
        this.a = uvlVar;
        this.b = f91Var;
    }

    public final void a(gul gulVar) {
        Object prlVar;
        uvl uvlVar = this.a;
        gulVar.getClass();
        if (uvlVar.a == null) {
            boolean z = false;
            while (true) {
                try {
                    try {
                        prlVar = gulVar.get();
                        break;
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (Error | Exception e) {
                    prlVar = new prl(e);
                } catch (CancellationException e2) {
                    prlVar = new prl(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(gulVar)), e2));
                } catch (ExecutionException e3) {
                    prlVar = new prl(e3.getCause());
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            if (prlVar == null) {
                prlVar = wrl.g;
            }
            if (wrl.f.s(uvlVar, null, prlVar)) {
                wrl.d(uvlVar);
            }
        }
    }

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        qul qulVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof qul;
            mb7 mb7Var = d;
            if (!z2) {
                if (runnable != mb7Var) {
                    break;
                }
            } else {
                qulVar = (qul) runnable;
            }
            i++;
            if (i > 1000) {
                if (runnable == mb7Var || compareAndSet(runnable, mb7Var)) {
                    if (Thread.interrupted() || z) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LockSupport.park(qulVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        gul gulVar = null;
        if (compareAndSet(null, currentThread)) {
            uvl uvlVar = this.a;
            boolean isDone = uvlVar.isDone();
            mb7 mb7Var = c;
            if (!isDone) {
                try {
                    f91 f91Var = this.b;
                    l0o l0oVar = (l0o) f91Var.b;
                    float f = f91Var.a;
                    zze zzeVar = l0oVar.r;
                    float f2 = l0oVar.k;
                    if (f < 1.0f) {
                        f = 1.0f;
                    }
                    float f3 = 0.0f;
                    if (f2 <= 0.0f || f <= f2) {
                        f2 = f;
                    }
                    ZoomSuggestionOptions zoomSuggestionOptions = zzeVar.zza;
                    int i = zzh.zzc;
                    if (true == zoomSuggestionOptions.zzb().setZoom(f2)) {
                        f3 = f2;
                    }
                    gulVar = new gul(Float.valueOf(f3));
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, mb7Var)) {
                            b(currentThread);
                        }
                        if (wrl.f.s(uvlVar, null, new prl(th))) {
                            wrl.d(uvlVar);
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        if (!compareAndSet(currentThread, mb7Var)) {
                            b(currentThread);
                        }
                        a(null);
                        throw null;
                    }
                }
            }
            if (!compareAndSet(currentThread, mb7Var)) {
                b(currentThread);
            }
            if (!isDone) {
                a(gulVar);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == c) {
            str = "running=[DONE]";
        } else if (runnable instanceof qul) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = sv6.n("running=[RUNNING ON ", ((Thread) runnable).getName(), "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return sv6.n(str, ", ", this.b.toString());
    }
}
