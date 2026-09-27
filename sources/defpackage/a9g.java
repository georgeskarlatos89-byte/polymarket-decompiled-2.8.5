package defpackage;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a9g extends olb {
    public final j9g l;
    public final ss9 m;
    public final p9g n;
    public final AtomicBoolean o;
    public final AtomicBoolean p;
    public final AtomicBoolean q;
    public final CoroutineContext r;
    public final Callable s;

    public a9g(j9g j9gVar, ss9 ss9Var, boolean z, String[] strArr, Callable callable) {
        CoroutineContext coroutineContext;
        ss9Var.getClass();
        this.l = j9gVar;
        this.m = ss9Var;
        this.n = new p9g(strArr, this);
        this.o = new AtomicBoolean(true);
        this.p = new AtomicBoolean(false);
        this.q = new AtomicBoolean(false);
        if (j9gVar.inCompatibilityMode$room_runtime_release()) {
            if (z) {
                coroutineContext = j9gVar.getTransactionContext$room_runtime_release();
            } else {
                coroutineContext = j9gVar.getQueryContext();
            }
        } else {
            coroutineContext = g.a;
        }
        this.r = coroutineContext;
        this.s = callable;
    }

    @Override // defpackage.olb
    public final void g() {
        ss9 ss9Var = this.m;
        ss9Var.getClass();
        ((Set) ss9Var.c).add(this);
        coc.c(this.l.getCoroutineScope(), this.r, null, new o9g(this, null, 1), 2);
    }

    @Override // defpackage.olb
    public final void h() {
        ss9 ss9Var = this.m;
        ss9Var.getClass();
        ((Set) ss9Var.c).remove(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[Catch: all -> 0x002d, Exception -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x0029, B:15:0x0077), top: B:10:0x0029, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:11:0x0029, B:13:0x006f, B:15:0x0077, B:24:0x0092, B:37:0x0088, B:38:0x008f), top: B:10:0x0029, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006d -> B:12:0x006f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a1 -> B:23:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(q55 q55Var) {
        q9g q9gVar;
        int i;
        a9g a9gVar;
        if (q55Var instanceof q9g) {
            q9gVar = (q9g) q55Var;
            int i2 = q9gVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q9gVar.o = i2 - Integer.MIN_VALUE;
                Object obj = q9gVar.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = q9gVar.o;
                if (i == 0) {
                    if (i == 1) {
                        int i3 = q9gVar.l;
                        a9gVar = q9gVar.k;
                        try {
                            try {
                                ResultKt.a(obj);
                                while (a9gVar.o.compareAndSet(true, false)) {
                                    q9gVar.k = a9gVar;
                                    q9gVar.l = 1;
                                    q9gVar.o = 1;
                                    obj = a9gVar.s.call();
                                    if (obj == u85Var) {
                                        return u85Var;
                                    }
                                    i3 = 1;
                                }
                                if (i3 != 0) {
                                    a9gVar.i(obj);
                                }
                                if (i3 == 0 && a9gVar.o.get()) {
                                    this = a9gVar;
                                    a9gVar = this;
                                    if (!this.p.compareAndSet(false, true)) {
                                        obj = null;
                                        i3 = 0;
                                        while (a9gVar.o.compareAndSet(true, false)) {
                                        }
                                        if (i3 != 0) {
                                        }
                                        if (i3 == 0) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    i3 = 0;
                                    if (i3 == 0) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return Unit.INSTANCE;
                            } catch (Exception e) {
                                throw new RuntimeException("Exception while computing database live data.", e);
                            }
                        } finally {
                            a9gVar.p.set(false);
                        }
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.a(obj);
                if (this.q.compareAndSet(false, true)) {
                    k8a invalidationTracker = this.l.getInvalidationTracker();
                    invalidationTracker.getClass();
                    p9g p9gVar = this.n;
                    p9gVar.getClass();
                    if (invalidationTracker.a(new ygk(invalidationTracker, p9gVar))) {
                        qwn.b(new j8a(invalidationTracker, null, 0));
                    }
                }
                a9gVar = this;
                if (!this.p.compareAndSet(false, true)) {
                }
            }
        }
        q9gVar = new q9g(this, q55Var);
        Object obj2 = q9gVar.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = q9gVar.o;
        if (i == 0) {
        }
    }
}
