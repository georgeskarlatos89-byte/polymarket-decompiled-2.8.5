package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class uwh extends j5 implements sqc, Flow, oq8 {
    public static final /* synthetic */ long f = oo4.a.objectFieldOffset(uwh.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    public uwh(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.oq8
    public final Flow a(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        if (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) {
            return ozm.c(this, coroutineContext, i, bufferOverflow);
        }
        return this;
    }

    @Override // defpackage.nqc
    public final boolean b(Object obj) {
        l(obj);
        return true;
    }

    @Override // defpackage.g3h
    public final List c() {
        return eb4.c(getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r12) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
    
        if (r12 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x006e, code lost:
    
        if (((defpackage.yai) r11).a(r0) == r1) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x0086, B:16:0x0090, B:19:0x0097, B:20:0x009b, B:24:0x009e, B:26:0x00bf, B:29:0x00cf, B:32:0x00a4, B:35:0x00ab, B:43:0x0047, B:45:0x0050, B:46:0x0077), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x0086, B:16:0x0090, B:19:0x0097, B:20:0x009b, B:24:0x009e, B:26:0x00bf, B:29:0x00cf, B:32:0x00a4, B:35:0x00ab, B:43:0x0047, B:45:0x0050, B:46:0x0077), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v0, types: [uwh, java.lang.Object, j5] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [k5] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7, types: [vwh] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ce -> B:14:0x0086). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00df -> B:14:0x0086). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(eb8 eb8Var, Continuation continuation) {
        twh twhVar;
        u85 u85Var;
        int i;
        vwh vwhVar;
        eb8 eb8Var2;
        jca jcaVar;
        Object obj;
        vwh vwhVar2;
        Object andSet;
        Object objectVolatile;
        Object obj2;
        try {
            if (continuation instanceof twh) {
                twhVar = (twh) continuation;
                int i2 = twhVar.r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    twhVar.r = i2 - Integer.MIN_VALUE;
                    Object obj3 = twhVar.p;
                    u85Var = u85.COROUTINE_SUSPENDED;
                    i = twhVar.r;
                    ?? r5 = 1;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    obj = twhVar.n;
                                    jcaVar = twhVar.m;
                                    vwh vwhVar3 = twhVar.l;
                                    eb8Var2 = twhVar.k;
                                    ResultKt.a(obj3);
                                    r5 = vwhVar3;
                                    objectVolatile = oo4.a.getObjectVolatile((Object) this, f);
                                    if (jcaVar != null && !jcaVar.isActive()) {
                                        throw jcaVar.z();
                                    }
                                    if (objectVolatile == xmm.a) {
                                        obj2 = null;
                                    } else {
                                        obj2 = objectVolatile;
                                    }
                                    twhVar.k = eb8Var2;
                                    twhVar.l = r5;
                                    twhVar.m = jcaVar;
                                    twhVar.n = null;
                                    twhVar.o = objectVolatile;
                                    twhVar.r = 2;
                                    if (eb8Var2.emit(obj2, twhVar) != u85Var) {
                                        obj = objectVolatile;
                                        vwhVar2 = r5;
                                        andSet = vwhVar2.a.getAndSet(n0n.a);
                                        andSet.getClass();
                                        if (andSet != n0n.b) {
                                            r5 = vwhVar2;
                                        } else {
                                            twhVar.k = eb8Var2;
                                            twhVar.l = vwhVar2;
                                            twhVar.m = jcaVar;
                                            twhVar.n = obj;
                                            twhVar.o = null;
                                            twhVar.r = 3;
                                            Object c = vwhVar2.c(twhVar);
                                            r5 = vwhVar2;
                                        }
                                        objectVolatile = oo4.a.getObjectVolatile((Object) this, f);
                                        if (jcaVar != null) {
                                            throw jcaVar.z();
                                        }
                                        if (objectVolatile == xmm.a) {
                                        }
                                        twhVar.k = eb8Var2;
                                        twhVar.l = r5;
                                        twhVar.m = jcaVar;
                                        twhVar.n = null;
                                        twhVar.o = objectVolatile;
                                        twhVar.r = 2;
                                        if (eb8Var2.emit(obj2, twhVar) != u85Var) {
                                        }
                                    } else {
                                        return u85Var;
                                    }
                                } else {
                                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                obj = twhVar.o;
                                jcaVar = twhVar.m;
                                vwh vwhVar4 = twhVar.l;
                                eb8Var2 = twhVar.k;
                                ResultKt.a(obj3);
                                vwhVar2 = vwhVar4;
                                andSet = vwhVar2.a.getAndSet(n0n.a);
                                andSet.getClass();
                                if (andSet != n0n.b) {
                                }
                                objectVolatile = oo4.a.getObjectVolatile((Object) this, f);
                                if (jcaVar != null) {
                                }
                                if (objectVolatile == xmm.a) {
                                }
                                twhVar.k = eb8Var2;
                                twhVar.l = r5;
                                twhVar.m = jcaVar;
                                twhVar.n = null;
                                twhVar.o = objectVolatile;
                                twhVar.r = 2;
                                if (eb8Var2.emit(obj2, twhVar) != u85Var) {
                                }
                            }
                        } else {
                            vwh vwhVar5 = twhVar.l;
                            eb8Var = twhVar.k;
                            ResultKt.a(obj3);
                            vwhVar = vwhVar5;
                        }
                    } else {
                        ResultKt.a(obj3);
                        vwh vwhVar6 = (vwh) e();
                        try {
                            if (eb8Var instanceof yai) {
                                twhVar.k = eb8Var;
                                twhVar.l = vwhVar6;
                                twhVar.r = 1;
                            }
                            vwhVar = vwhVar6;
                        } catch (Throwable th) {
                            th = th;
                            r5 = vwhVar6;
                            i(r5);
                            throw th;
                        }
                    }
                    eb8Var2 = eb8Var;
                    jcaVar = (jca) twhVar.getContext().get(jca.C0);
                    obj = null;
                    r5 = vwhVar;
                    objectVolatile = oo4.a.getObjectVolatile((Object) this, f);
                    if (jcaVar != null) {
                    }
                    if (objectVolatile == xmm.a) {
                    }
                    twhVar.k = eb8Var2;
                    twhVar.l = r5;
                    twhVar.m = jcaVar;
                    twhVar.n = null;
                    twhVar.o = objectVolatile;
                    twhVar.r = 2;
                    if (eb8Var2.emit(obj2, twhVar) != u85Var) {
                    }
                }
            }
            if (i == 0) {
            }
            eb8Var2 = eb8Var;
            jcaVar = (jca) twhVar.getContext().get(jca.C0);
            obj = null;
            r5 = vwhVar;
            objectVolatile = oo4.a.getObjectVolatile((Object) this, f);
            if (jcaVar != null) {
            }
            if (objectVolatile == xmm.a) {
            }
            twhVar.k = eb8Var2;
            twhVar.l = r5;
            twhVar.m = jcaVar;
            twhVar.n = null;
            twhVar.o = objectVolatile;
            twhVar.r = 2;
            if (eb8Var2.emit(obj2, twhVar) != u85Var) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        twhVar = new twh(this, continuation);
        Object obj32 = twhVar.p;
        u85Var = u85.COROUTINE_SUSPENDED;
        i = twhVar.r;
        ?? r52 = 1;
    }

    @Override // defpackage.nqc, defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        l(obj);
        return Unit.INSTANCE;
    }

    @Override // defpackage.j5
    public final k5 f() {
        return new vwh();
    }

    @Override // defpackage.nqc
    public final void g() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.swh
    public final Object getValue() {
        Object objectVolatile = oo4.a.getObjectVolatile(this, f);
        if (objectVolatile == xmm.a) {
            return null;
        }
        return objectVolatile;
    }

    @Override // defpackage.j5
    public final k5[] h() {
        return new vwh[2];
    }

    public final boolean k(Object obj, Object obj2) {
        uk ukVar = xmm.a;
        if (obj == null) {
            obj = ukVar;
        }
        if (obj2 == null) {
            obj2 = ukVar;
        }
        return m(obj, obj2);
    }

    public final void l(Object obj) {
        if (obj == null) {
            obj = xmm.a;
        }
        m(null, obj);
    }

    public final boolean m(Object obj, Object obj2) {
        int i;
        k5[] k5VarArr;
        uk ukVar;
        synchronized (this) {
            Unsafe unsafe = oo4.a;
            long j = f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !Intrinsics.areEqual(objectVolatile, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.e;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.e = i3;
                k5[] k5VarArr2 = this.a;
                while (true) {
                    vwh[] vwhVarArr = (vwh[]) k5VarArr2;
                    if (vwhVarArr != null) {
                        for (vwh vwhVar : vwhVarArr) {
                            if (vwhVar != null) {
                                AtomicReference atomicReference = vwhVar.a;
                                while (true) {
                                    Object obj3 = atomicReference.get();
                                    if (obj3 != null && obj3 != (ukVar = n0n.b)) {
                                        uk ukVar2 = n0n.a;
                                        if (obj3 == ukVar2) {
                                            while (!atomicReference.compareAndSet(obj3, ukVar)) {
                                                if (atomicReference.get() != obj3) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj3, ukVar2)) {
                                                if (atomicReference.get() != obj3) {
                                                    break;
                                                }
                                            }
                                            ((m23) obj3).resumeWith(Result.m882constructorimpl(Unit.INSTANCE));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.e;
                        if (i == i3) {
                            this.e = i3 + 1;
                            return true;
                        }
                        k5VarArr = this.a;
                    }
                    k5VarArr2 = k5VarArr;
                    i3 = i;
                }
            } else {
                this.e = i2 + 2;
                return true;
            }
        }
    }
}
