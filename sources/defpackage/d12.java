package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class d12 implements apd {
    public final kvd a = ikl.c(new ogd(0));
    public float b = 160.0f;
    public final c12 c = new c12(this);

    public static float f(float f, float f2) {
        if (f > 0.0f && f2 < 0.0f) {
            float f3 = -f;
            if (f2 < f3) {
                return f3;
            }
        } else {
            if (f >= 0.0f || f2 <= 0.0f) {
                return 0.0f;
            }
            float f4 = -f;
            if (f2 > f4) {
                return f4;
            }
        }
        return f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        if (defpackage.uei.c(defpackage.i3n.f, r2, r3, r4, r5, r6, r7) != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        if (r14 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.apd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, Function2 function2, q55 q55Var) {
        b12 b12Var;
        b12 b12Var2;
        int i;
        long floatToRawIntBits;
        if (q55Var instanceof b12) {
            b12Var = (b12) q55Var;
            int i2 = b12Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b12Var.n = i2 - Integer.MIN_VALUE;
                b12Var2 = b12Var;
                Object obj = b12Var2.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = b12Var2.n;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj);
                            g(0L);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = b12Var2.k;
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    j5k j5kVar = new j5k(j);
                    b12Var2.k = j;
                    b12Var2.n = 1;
                    obj = function2.invoke(j5kVar, b12Var2);
                }
                long j2 = ((j5k) obj).a;
                float b = j5k.b(j) - j5k.b(j2);
                float c = j5k.c(j) - j5k.c(j2);
                floatToRawIntBits = (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(c) & 4294967295L);
                if (ogd.d(floatToRawIntBits) <= 100.0f) {
                    floatToRawIntBits = 0;
                }
                if (!ogd.c(e(), 0L) && ogd.c(floatToRawIntBits, 0L)) {
                    return Unit.INSTANCE;
                }
                ogd ogdVar = new ogd(e());
                ogd ogdVar2 = new ogd(0L);
                ogd ogdVar3 = new ogd(floatToRawIntBits);
                qjh qjhVar = f12.a;
                y9 y9Var = new y9(this, 13);
                b12Var2.k = j;
                b12Var2.n = 2;
            }
        }
        b12Var = new b12(this, q55Var);
        b12Var2 = b12Var;
        Object obj2 = b12Var2.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = b12Var2.n;
        if (i == 0) {
        }
        long j22 = ((j5k) obj2).a;
        float b2 = j5k.b(j) - j5k.b(j22);
        float c2 = j5k.c(j) - j5k.c(j22);
        floatToRawIntBits = (Float.floatToRawIntBits(b2) << 32) | (Float.floatToRawIntBits(c2) & 4294967295L);
        if (ogd.d(floatToRawIntBits) <= 100.0f) {
        }
        if (!ogd.c(e(), 0L)) {
        }
        ogd ogdVar4 = new ogd(e());
        ogd ogdVar22 = new ogd(0L);
        ogd ogdVar32 = new ogd(floatToRawIntBits);
        qjh qjhVar2 = f12.a;
        y9 y9Var2 = new y9(this, 13);
        b12Var2.k = j;
        b12Var2.n = 2;
    }

    @Override // defpackage.apd
    public final mj6 b() {
        return this.c;
    }

    @Override // defpackage.apd
    public final boolean c() {
        return !ogd.c(e(), 0L);
    }

    @Override // defpackage.apd
    public final long d(long j, int i, Function1 function1) {
        float f = f(Float.intBitsToFloat((int) (e() >> 32)), Float.intBitsToFloat((int) (j >> 32)));
        float f2 = f(Float.intBitsToFloat((int) (e() & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L)));
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        if (!ogd.c(floatToRawIntBits, 0L)) {
            g(ogd.f(e(), floatToRawIntBits));
        }
        long j2 = ((ogd) function1.invoke(new ogd(ogd.e(j, floatToRawIntBits)))).a;
        long e = ogd.e(ogd.e(j, floatToRawIntBits), j2);
        if (i == 1 && !ogd.c(e, 0L)) {
            long e2 = e();
            float intBitsToFloat = Float.intBitsToFloat((int) (e >> 32)) / ((Math.abs(Float.intBitsToFloat((int) (e() >> 32))) / this.b) + 1.0f);
            float intBitsToFloat2 = Float.intBitsToFloat((int) (e & 4294967295L)) / ((Math.abs(Float.intBitsToFloat((int) (e() & 4294967295L))) / this.b) + 1.0f);
            g(ogd.f(e2, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)));
            return j;
        }
        return ogd.f(floatToRawIntBits, j2);
    }

    public final long e() {
        return ((ogd) this.a.getValue()).a;
    }

    public final void g(long j) {
        this.a.setValue(new ogd(j));
    }
}
