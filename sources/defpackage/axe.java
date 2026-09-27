package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class axe {
    public final int a;
    public final Function0 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final sw4[] f;
    public final vug g;
    public final w24 h;

    /* JADX WARN: Type inference failed for: r1v4, types: [uug, vug] */
    public axe(Function0 function0, int i) {
        this.a = i;
        this.b = function0;
        this.f = new sw4[i];
        int i2 = wug.a;
        this.g = new uug(i);
        this.h = new w24(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:13:0x0047, B:15:0x004b, B:17:0x0051, B:20:0x0058, B:21:0x0072, B:23:0x0078, B:27:0x008e, B:28:0x0093, B:29:0x0094, B:30:0x009b), top: B:12:0x0047, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:13:0x0047, B:15:0x004b, B:17:0x0051, B:20:0x0058, B:21:0x0072, B:23:0x0078, B:27:0x008e, B:28:0x0093, B:29:0x0094, B:30:0x009b), top: B:12:0x0047, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q55 q55Var) {
        xwe xweVar;
        int i;
        ReentrantLock reentrantLock;
        try {
            try {
                if (q55Var instanceof xwe) {
                    xweVar = (xwe) q55Var;
                    int i2 = xweVar.n;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        xweVar.n = i2 - Integer.MIN_VALUE;
                        Object obj = xweVar.l;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = xweVar.n;
                        if (i == 0) {
                            if (i == 1) {
                                this = xweVar.k;
                                ResultKt.a(obj);
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ResultKt.a(obj);
                            xweVar.k = this;
                            xweVar.n = 1;
                            if (this.g.a(xweVar) == u85Var) {
                                return u85Var;
                            }
                        }
                        reentrantLock = this.c;
                        w24 w24Var = this.h;
                        reentrantLock.lock();
                        if (this.e) {
                            if (w24Var.b == w24Var.c && this.d < this.a) {
                                sw4 sw4Var = new sw4((fcg) this.b.invoke());
                                sw4[] sw4VarArr = this.f;
                                int i3 = this.d;
                                this.d = i3 + 1;
                                sw4VarArr[i3] = sw4Var;
                                w24Var.a(sw4Var);
                            }
                            int i4 = w24Var.b;
                            if (i4 != w24Var.c) {
                                Object[] objArr = w24Var.a;
                                Object obj2 = objArr[i4];
                                objArr[i4] = null;
                                w24Var.b = (i4 + 1) & w24Var.d;
                                return (sw4) obj2;
                            }
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        swn.d(21, "Connection pool is closed");
                        throw null;
                    }
                }
                if (this.e) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.c;
            w24 w24Var2 = this.h;
            reentrantLock.lock();
        } catch (Throwable th) {
            this.g.d();
            throw th;
        }
        xweVar = new xwe(this, q55Var);
        Object obj3 = xweVar.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = xweVar.n;
        if (i == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:13|14|(1:(1:33)(2:30|(1:32)))(1:16)|17|18|19|20|(1:22)(10:24|12|13|14|(0)(0)|17|18|19|20|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        r7 = r11;
        r11 = r12;
        r9 = r9;
        r8 = r8;
        r2 = r0;
        r0 = r2;
        r12 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077 A[Catch: all -> 0x007b, TryCatch #2 {all -> 0x007b, blocks: (B:14:0x0073, B:16:0x0077, B:30:0x007f, B:33:0x0087), top: B:13:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r11v8, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:12:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, ok1 ok1Var, q55 q55Var) {
        ywe yweVar;
        int i;
        ok1 ok1Var2;
        Ref.ObjectRef objectRef;
        ywe yweVar2;
        Throwable th;
        ok1 ok1Var3;
        zwe zweVar;
        ok1 ok1Var4;
        if (q55Var instanceof ywe) {
            yweVar = (ywe) q55Var;
            int i2 = yweVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yweVar.q = i2 - Integer.MIN_VALUE;
                Object obj = yweVar.o;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = yweVar.q;
                if (i == 0) {
                    if (i == 1) {
                        long j2 = yweVar.n;
                        Ref.ObjectRef objectRef2 = yweVar.m;
                        ?? r11 = yweVar.l;
                        axe axeVar = yweVar.k;
                        try {
                            ResultKt.a(obj);
                            ok1Var4 = r11;
                        } catch (Throwable th2) {
                            objectRef = objectRef2;
                            j = j2;
                            this = axeVar;
                            yweVar2 = yweVar;
                            th = th2;
                            ok1Var3 = r11;
                        }
                        ok1Var3 = ok1Var4;
                        objectRef = objectRef2;
                        j = j2;
                        this = axeVar;
                        yweVar2 = yweVar;
                        th = null;
                        try {
                            if (th instanceof c3j) {
                                ok1Var3.invoke();
                            } else if (th == null) {
                                Object obj2 = objectRef.a;
                                if (obj2 != null) {
                                    return obj2;
                                }
                            } else {
                                throw th;
                            }
                            ok1Var2 = ok1Var3;
                            yweVar = yweVar2;
                            ?? obj3 = new Object();
                            zweVar = new zwe(obj3, this, null);
                            yweVar.k = this;
                            yweVar.l = ok1Var2;
                            yweVar.m = obj3;
                            yweVar.n = j;
                            yweVar.q = 1;
                            if (g3j.b(lvn.h(j), zweVar, yweVar) == u85Var) {
                                return u85Var;
                            }
                            axeVar = this;
                            j2 = j;
                            objectRef2 = obj3;
                            ok1Var4 = ok1Var2;
                            ok1Var3 = ok1Var4;
                            objectRef = objectRef2;
                            j = j2;
                            this = axeVar;
                            yweVar2 = yweVar;
                            th = null;
                            if (th instanceof c3j) {
                            }
                            ok1Var2 = ok1Var3;
                            yweVar = yweVar2;
                            ?? obj32 = new Object();
                            zweVar = new zwe(obj32, this, null);
                            yweVar.k = this;
                            yweVar.l = ok1Var2;
                            yweVar.m = obj32;
                            yweVar.n = j;
                            yweVar.q = 1;
                            if (g3j.b(lvn.h(j), zweVar, yweVar) == u85Var) {
                            }
                        } catch (Throwable th3) {
                            sw4 sw4Var = (sw4) objectRef.a;
                            if (sw4Var != null) {
                                this.e(sw4Var);
                            }
                            throw th3;
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    ok1Var2 = ok1Var;
                    ?? obj322 = new Object();
                    zweVar = new zwe(obj322, this, null);
                    yweVar.k = this;
                    yweVar.l = ok1Var2;
                    yweVar.m = obj322;
                    yweVar.n = j;
                    yweVar.q = 1;
                    if (g3j.b(lvn.h(j), zweVar, yweVar) == u85Var) {
                    }
                }
            }
        }
        yweVar = new ywe(this, q55Var);
        Object obj4 = yweVar.o;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = yweVar.q;
        if (i == 0) {
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (sw4 sw4Var : this.f) {
                if (sw4Var != null) {
                    sw4Var.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        String str;
        w24 w24Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            rib b = eb4.b();
            int i = (w24Var.c - w24Var.b) & w24Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = w24Var.c;
                    int i4 = w24Var.b;
                    int i5 = w24Var.d;
                    if (i2 < ((i3 - i4) & i5)) {
                        Object obj = w24Var.a[(i4 + i2) & i5];
                        obj.getClass();
                        b.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            rib a = eb4.a(b);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + this.g.c() + ", ");
            sb.append("queue=(size=" + a.a() + ")[" + CollectionsKt.N(a, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            int i6 = 0;
            for (sw4 sw4Var : this.f) {
                i6++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i6);
                sb2.append("] - ");
                if (sw4Var != null) {
                    str = sw4Var.a.toString();
                } else {
                    str = null;
                }
                sb2.append(str);
                sb.append(sb2.toString());
                sb.append('\n');
                if (sw4Var != null) {
                    sw4Var.p(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(sw4 sw4Var) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.a(sw4Var);
            reentrantLock.unlock();
            this.g.d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
