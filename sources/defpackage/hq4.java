package defpackage;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hq4 implements m1d {
    public final /* synthetic */ z70 a;
    public final /* synthetic */ t85 b;
    public final /* synthetic */ qjh c;

    public hq4(z70 z70Var, t85 t85Var, qjh qjhVar) {
        this.a = z70Var;
        this.b = t85Var;
        this.c = qjhVar;
    }

    @Override // defpackage.m1d
    public final long M(int i, long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & j2));
        if (i == 1 && intBitsToFloat != 0.0f) {
            z70 z70Var = this.a;
            float floatValue = ((Number) z70Var.d()).floatValue();
            coc.c(this.b, null, null, new fq4(z70Var, floatValue, intBitsToFloat / ((Math.abs(floatValue) / 100.0f) + 1.0f), null, 0), 3);
            return j2;
        }
        return 0L;
    }

    @Override // defpackage.m1d
    public final long y(int i, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        z70 z70Var = this.a;
        float floatValue = ((Number) z70Var.d()).floatValue();
        if (floatValue == 0.0f) {
            return 0L;
        }
        float f = floatValue + intBitsToFloat;
        t85 t85Var = this.b;
        if ((floatValue > 0.0f && f < 0.0f) || (floatValue < 0.0f && f > 0.0f)) {
            coc.c(t85Var, null, null, new re2(25, z70Var, null), 3);
            return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(floatValue * (-1.0f)) & 4294967295L);
        }
        coc.c(t85Var, null, null, new fq4(z70Var, floatValue, intBitsToFloat / ((Math.abs(floatValue) / 100.0f) + 1.0f), null, 1), 3);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.m1d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z0(long j, Continuation continuation) {
        gq4 gq4Var;
        int i;
        if (continuation instanceof gq4) {
            gq4Var = (gq4) continuation;
            int i2 = gq4Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gq4Var.n = i2 - Integer.MIN_VALUE;
                gq4 gq4Var2 = gq4Var;
                Object obj = gq4Var2.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = gq4Var2.n;
                if (i == 0) {
                    if (i == 1) {
                        j = gq4Var2.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    if (((Number) this.a.d()).floatValue() == 0.0f) {
                        return new j5k(0L);
                    }
                    Float f = new Float(0.0f);
                    gq4Var2.k = j;
                    gq4Var2.n = 1;
                    if (z70.a(this.a, f, this.c, null, null, gq4Var2, 12) == u85Var) {
                        return u85Var;
                    }
                }
                return new j5k(j);
            }
        }
        gq4Var = new gq4(this, (q55) continuation);
        gq4 gq4Var22 = gq4Var;
        Object obj2 = gq4Var22.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = gq4Var22.n;
        if (i == 0) {
        }
        return new j5k(j);
    }
}
