package defpackage;

import android.os.SystemClock;
import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class xy3 {
    public final long a;
    public final long b;
    public final qqc c;
    public final xp3 d;
    public final z70 e;

    public xy3(long j, long j2, qqc qqcVar, xp3 xp3Var) {
        z70 a;
        qqcVar.getClass();
        this.a = j;
        this.b = j2;
        this.c = qqcVar;
        this.d = xp3Var;
        gz3 gz3Var = (gz3) qqcVar.getValue();
        if (!(gz3Var instanceof cz3) && !(gz3Var instanceof fz3)) {
            if (gz3Var instanceof dz3) {
                a = go5.a(lnf.d(((dz3) gz3Var).a, 0.0f, 1.0f));
            } else {
                if (!(gz3Var instanceof ez3) && !(gz3Var instanceof bz3)) {
                    dmk.a();
                    throw null;
                }
                a = go5.a(1.0f);
            }
        } else {
            a = go5.a(0.0f);
        }
        this.e = a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, gz3 gz3Var, q55 q55Var) {
        uy3 uy3Var;
        int i;
        if (q55Var instanceof uy3) {
            uy3Var = (uy3) q55Var;
            int i2 = uy3Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uy3Var.n = i2 - Integer.MIN_VALUE;
                Object obj = uy3Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = uy3Var.n;
                if (i == 0) {
                    if (i == 1) {
                        gz3Var = uy3Var.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    if (j2 < 0) {
                        return Unit.INSTANCE;
                    }
                    long e = d47.e(j) - (SystemClock.elapsedRealtime() - j2);
                    if (e > 0) {
                        long h = h47.h(e, m47.MILLISECONDS);
                        uy3Var.k = gz3Var;
                        uy3Var.n = 1;
                        if (lvn.c(h, uy3Var) == u85Var) {
                            return u85Var;
                        }
                    }
                }
                this.c.setValue(gz3Var);
                return Unit.INSTANCE;
            }
        }
        uy3Var = new uy3(this, q55Var);
        Object obj2 = uy3Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = uy3Var.n;
        if (i == 0) {
        }
        this.c.setValue(gz3Var);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c2, code lost:
    
        if (r1.a(r1.b, r4, defpackage.bz3.a, r7) == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (r12 == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if (r1.a(r12.a, r4, r6, r7) == r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q55 q55Var) {
        wy3 wy3Var;
        int i;
        qqc qqcVar;
        xy3 xy3Var;
        gz3 gz3Var;
        if (q55Var instanceof wy3) {
            wy3Var = (wy3) q55Var;
            int i2 = wy3Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wy3Var.m = i2 - Integer.MIN_VALUE;
                wy3 wy3Var2 = wy3Var;
                Object obj = wy3Var2.k;
                Object obj2 = u85.COROUTINE_SUSPENDED;
                i = wy3Var2.m;
                qqcVar = this.c;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.a(obj);
                                xy3Var = this;
                                xy3Var.d.invoke();
                                return Unit.INSTANCE;
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.a(obj);
                        xy3Var = this;
                        gz3Var = (gz3) qqcVar.getValue();
                        if (gz3Var instanceof ez3) {
                            long j = ((ez3) gz3Var).a;
                            wy3Var2.m = 3;
                        }
                        xy3Var.d.invoke();
                        return Unit.INSTANCE;
                    }
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    if (((gz3) qqcVar.getValue()) instanceof bz3) {
                        return Unit.INSTANCE;
                    }
                    if (((gz3) qqcVar.getValue()) instanceof cz3) {
                        qqcVar.setValue(new fz3(SystemClock.elapsedRealtime()));
                    }
                    gz3 gz3Var2 = (gz3) qqcVar.getValue();
                    if (gz3Var2 instanceof fz3) {
                        long j2 = ((fz3) gz3Var2).a;
                        dz3 dz3Var = new dz3(0.0f);
                        wy3Var2.m = 1;
                        xy3Var = this;
                    }
                }
                xy3Var = this;
                if (((gz3) qqcVar.getValue()) instanceof dz3) {
                    wy3Var2.m = 2;
                    Object f = qsn.f(new bw2(xy3Var, null, 11), wy3Var2);
                    if (f != obj2) {
                        f = Unit.INSTANCE;
                    }
                }
                gz3Var = (gz3) qqcVar.getValue();
                if (gz3Var instanceof ez3) {
                }
                xy3Var.d.invoke();
                return Unit.INSTANCE;
            }
        }
        wy3Var = new wy3(this, q55Var);
        wy3 wy3Var22 = wy3Var;
        Object obj3 = wy3Var22.k;
        Object obj22 = u85.COROUTINE_SUSPENDED;
        i = wy3Var22.m;
        qqcVar = this.c;
        if (i == 0) {
        }
        xy3Var = this;
        if (((gz3) qqcVar.getValue()) instanceof dz3) {
        }
        gz3Var = (gz3) qqcVar.getValue();
        if (gz3Var instanceof ez3) {
        }
        xy3Var.d.invoke();
        return Unit.INSTANCE;
    }
}
