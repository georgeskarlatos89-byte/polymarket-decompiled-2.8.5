package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vyd {
    public final sr4 a;
    public final mr4 b;
    public final sr8 c;
    public final Function2 d;
    public final boolean e;
    public final dtj f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(xyd.InitialPending);
    public long i = tkm.b();
    public gig j;
    public final cd6 k;
    public final vrf l;

    public vyd(sr4 sr4Var, mr4 mr4Var, sr8 sr8Var, mqc mqcVar, Function2 function2, boolean z, dtj dtjVar, Object obj) {
        this.a = sr4Var;
        this.b = mr4Var;
        this.c = sr8Var;
        this.d = function2;
        this.e = z;
        this.f = dtjVar;
        this.g = obj;
        jqc jqcVar = hig.a;
        jqcVar.getClass();
        this.j = jqcVar;
        cd6 cd6Var = new cd6(1);
        cd6Var.j(mqcVar, sr8Var.E());
        this.k = cd6Var;
        this.l = new vrf(dtjVar.c);
    }

    public final void a() {
        AtomicReference atomicReference = this.h;
        try {
            switch (uyd.a[((xyd) atomicReference.get()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    b();
                    xyd xydVar = xyd.ApplyPending;
                    xyd xydVar2 = xyd.Applied;
                    while (!atomicReference.compareAndSet(xydVar, xydVar2)) {
                        if (atomicReference.get() != xydVar) {
                            f1f.b("Unexpected state change from: " + xydVar + " to: " + xydVar2 + '.');
                            return;
                        }
                    }
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(xyd.Invalid);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.d();
                    this.k.e();
                } finally {
                    this.k.c();
                    this.a.q = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        if (((xyd) this.h.get()).compareTo(xyd.ApplyPending) >= 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        AtomicReference atomicReference;
        xyd xydVar = xyd.RecomposePending;
        xyd xydVar2 = xyd.ApplyPending;
        do {
            atomicReference = this.h;
            if (atomicReference.compareAndSet(xydVar, xydVar2)) {
                return;
            }
        } while (atomicReference.get() == xydVar);
        f1f.b("Unexpected state change from: " + xydVar + " to: " + xydVar2 + '.');
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    public final boolean e(x5h x5hVar) {
        AtomicReference atomicReference = this.h;
        try {
            int i = uyd.a[((xyd) atomicReference.get()).ordinal()];
            sr4 sr4Var = this.a;
            mr4 mr4Var = this.b;
            switch (i) {
                case 1:
                    sr8 sr8Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        sr8Var.z = 0;
                        sr8Var.y = true;
                    }
                    try {
                        this.j = mr4Var.b(sr4Var, x5hVar, this.d);
                        xyd xydVar = xyd.InitialPending;
                        xyd xydVar2 = xyd.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(xydVar, xydVar2)) {
                                if (atomicReference.get() != xydVar) {
                                    f1f.b("Unexpected state change from: " + xydVar + " to: " + xydVar2 + '.');
                                }
                            }
                        }
                        if (this.j.b()) {
                            d();
                        }
                        return c();
                    } finally {
                        if (z) {
                            sr8Var.v();
                        }
                    }
                case 2:
                    xyd xydVar3 = xyd.RecomposePending;
                    xyd xydVar4 = xyd.Recomposing;
                    while (true) {
                        if (!atomicReference.compareAndSet(xydVar3, xydVar4)) {
                            if (atomicReference.get() != xydVar3) {
                                f1f.b("Unexpected state change from: " + xydVar3 + " to: " + xydVar4 + '.');
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = tkm.b();
                        this.j = mr4Var.q(sr4Var, x5hVar, this.j);
                        this.i = j;
                        xyd xydVar5 = xyd.Recomposing;
                        xyd xydVar6 = xyd.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(xydVar5, xydVar6)) {
                                if (atomicReference.get() != xydVar5) {
                                    f1f.b("Unexpected state change from: " + xydVar5 + " to: " + xydVar6 + '.');
                                }
                            }
                        }
                        if (this.j.b()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        xyd xydVar7 = xyd.Recomposing;
                        xyd xydVar8 = xyd.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(xydVar7, xydVar8)) {
                                if (atomicReference.get() != xydVar7) {
                                    f1f.b("Unexpected state change from: " + xydVar7 + " to: " + xydVar8 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 3:
                    uq4.b("Recursive call to resume()");
                    throw new RuntimeException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(xyd.Invalid);
            throw e;
        }
    }
}
