package defpackage;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pf7 implements m1d {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5j b;

    public /* synthetic */ pf7(y5j y5jVar, int i) {
        this.a = i;
        this.b = y5jVar;
    }

    @Override // defpackage.m1d
    public final long M(int i, long j, long j2) {
        int i2 = this.a;
        y5j y5jVar = this.b;
        switch (i2) {
            case 0:
                qf7 qf7Var = (qf7) y5jVar;
                z5j z5jVar = qf7Var.a;
                if (((Boolean) qf7Var.d.invoke()).booleanValue()) {
                    int i3 = (int) (j & 4294967295L);
                    z5jVar.b.z(Float.intBitsToFloat(i3) + z5jVar.b.y());
                    z5jVar.b(Float.intBitsToFloat(i3) + z5jVar.c.y());
                }
                return 0L;
            default:
                wq7 wq7Var = (wq7) y5jVar;
                z5j z5jVar2 = wq7Var.a;
                if (!((Boolean) wq7Var.d.invoke()).booleanValue()) {
                    return 0L;
                }
                int i4 = (int) (j & 4294967295L);
                z5jVar2.b.z(Float.intBitsToFloat(i4) + z5jVar2.b.y());
                int i5 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i5) >= 0.0f && Float.intBitsToFloat(i4) >= 0.0f) {
                    if (Float.intBitsToFloat(i5) <= 0.0f) {
                        return 0L;
                    }
                    float y = z5jVar2.c.y();
                    z5jVar2.b(Float.intBitsToFloat(i5) + z5jVar2.c.y());
                    float y2 = z5jVar2.c.y() - y;
                    return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(y2) & 4294967295L);
                }
                float y3 = z5jVar2.c.y();
                z5jVar2.b(Float.intBitsToFloat(i4) + z5jVar2.c.y());
                float y4 = z5jVar2.c.y() - y3;
                return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(y4) & 4294967295L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r1 == r8) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    @Override // defpackage.m1d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(long j, long j2, Continuation continuation) {
        of7 of7Var;
        Object obj;
        int i;
        of7 of7Var2;
        long j3;
        Object h;
        long j4;
        vq7 vq7Var;
        Object obj2;
        int i2;
        vq7 vq7Var2;
        Object h2;
        long j5;
        long j6 = j2;
        int i3 = this.a;
        y5j y5jVar = this.b;
        switch (i3) {
            case 0:
                qf7 qf7Var = (qf7) y5jVar;
                z5j z5jVar = qf7Var.a;
                if (continuation instanceof of7) {
                    of7Var = (of7) continuation;
                    int i4 = of7Var.n;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        of7Var.n = i4 - Integer.MIN_VALUE;
                        Object obj3 = of7Var.l;
                        obj = u85.COROUTINE_SUSPENDED;
                        i = of7Var.n;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    j4 = of7Var.k;
                                    ResultKt.a(obj3);
                                    return new j5k(j5k.e(j4, ((j5k) obj3).a));
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j3 = of7Var.k;
                            ResultKt.a(obj3);
                            of7Var2 = of7Var;
                        } else {
                            ResultKt.a(obj3);
                            if (j5k.c(j6) > 0.0f && (z5jVar.c.y() == 0.0f || z5jVar.c.y() == z5jVar.a)) {
                                z5jVar.b.z(0.0f);
                            }
                            of7Var.k = j6;
                            of7Var.n = 1;
                            of7Var2 = of7Var;
                            obj3 = super.j(j, j6, of7Var2);
                            if (obj3 != obj) {
                                j3 = j2;
                            }
                            return obj;
                        }
                        long j7 = ((j5k) obj3).a;
                        float c = j5k.c(j3);
                        rw5 rw5Var = qf7Var.c;
                        qjh qjhVar = qf7Var.b;
                        of7Var2.k = j7;
                        of7Var2.n = 2;
                        h = te0.h(z5jVar, c, rw5Var, qjhVar, of7Var2);
                        if (h != obj) {
                            obj3 = h;
                            j4 = j7;
                            return new j5k(j5k.e(j4, ((j5k) obj3).a));
                        }
                        return obj;
                    }
                }
                of7Var = new of7(this, (q55) continuation);
                Object obj32 = of7Var.l;
                obj = u85.COROUTINE_SUSPENDED;
                i = of7Var.n;
                if (i == 0) {
                }
                long j72 = ((j5k) obj32).a;
                float c2 = j5k.c(j3);
                rw5 rw5Var2 = qf7Var.c;
                qjh qjhVar2 = qf7Var.b;
                of7Var2.k = j72;
                of7Var2.n = 2;
                h = te0.h(z5jVar, c2, rw5Var2, qjhVar2, of7Var2);
                if (h != obj) {
                }
                return obj;
            default:
                wq7 wq7Var = (wq7) y5jVar;
                z5j z5jVar2 = wq7Var.a;
                if (continuation instanceof vq7) {
                    vq7Var = (vq7) continuation;
                    int i5 = vq7Var.n;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        vq7Var.n = i5 - Integer.MIN_VALUE;
                        Object obj4 = vq7Var.l;
                        obj2 = u85.COROUTINE_SUSPENDED;
                        i2 = vq7Var.n;
                        if (i2 == 0) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    j5 = vq7Var.k;
                                    ResultKt.a(obj4);
                                    return new j5k(j5k.e(j5, ((j5k) obj4).a));
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j6 = vq7Var.k;
                            ResultKt.a(obj4);
                            vq7Var2 = vq7Var;
                        } else {
                            ResultKt.a(obj4);
                            if (j5k.c(j6) > 0.0f) {
                                z5jVar2.b.z(0.0f);
                            }
                            vq7Var.k = j6;
                            vq7Var.n = 1;
                            vq7Var2 = vq7Var;
                            obj4 = super.j(j, j6, vq7Var2);
                            break;
                        }
                        long j8 = ((j5k) obj4).a;
                        float c3 = j5k.c(j6);
                        rw5 rw5Var3 = wq7Var.c;
                        qjh qjhVar3 = wq7Var.b;
                        vq7Var2.k = j8;
                        vq7Var2.n = 2;
                        h2 = te0.h(z5jVar2, c3, rw5Var3, qjhVar3, vq7Var2);
                        if (h2 != obj2) {
                            obj4 = h2;
                            j5 = j8;
                            return new j5k(j5k.e(j5, ((j5k) obj4).a));
                        }
                        return obj2;
                    }
                }
                vq7Var = new vq7(this, (q55) continuation);
                Object obj42 = vq7Var.l;
                obj2 = u85.COROUTINE_SUSPENDED;
                i2 = vq7Var.n;
                if (i2 == 0) {
                }
                long j82 = ((j5k) obj42).a;
                float c32 = j5k.c(j6);
                rw5 rw5Var32 = wq7Var.c;
                qjh qjhVar32 = wq7Var.b;
                vq7Var2.k = j82;
                vq7Var2.n = 2;
                h2 = te0.h(z5jVar2, c32, rw5Var32, qjhVar32, vq7Var2);
                if (h2 != obj2) {
                }
                return obj2;
        }
    }

    @Override // defpackage.m1d
    public final long y(int i, long j) {
        int i2 = this.a;
        y5j y5jVar = this.b;
        switch (i2) {
            case 0:
                qf7 qf7Var = (qf7) y5jVar;
                z5j z5jVar = qf7Var.a;
                if (!((Boolean) qf7Var.d.invoke()).booleanValue()) {
                    return 0L;
                }
                float y = z5jVar.c.y();
                z5jVar.b(Float.intBitsToFloat((int) (4294967295L & j)) + z5jVar.c.y());
                if (y == z5jVar.c.y()) {
                    return 0L;
                }
                return ogd.a(j, 0.0f, 0.0f, 2);
            default:
                wq7 wq7Var = (wq7) y5jVar;
                z5j z5jVar2 = wq7Var.a;
                if (!((Boolean) wq7Var.d.invoke()).booleanValue()) {
                    return 0L;
                }
                int i3 = (int) (4294967295L & j);
                if (Float.intBitsToFloat(i3) > 0.0f) {
                    return 0L;
                }
                float y2 = z5jVar2.c.y();
                z5jVar2.b(Float.intBitsToFloat(i3) + z5jVar2.c.y());
                if (y2 == z5jVar2.c.y()) {
                    return 0L;
                }
                return ogd.a(j, 0.0f, 0.0f, 2);
        }
    }
}
