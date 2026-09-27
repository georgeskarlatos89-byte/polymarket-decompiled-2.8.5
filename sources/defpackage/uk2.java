package defpackage;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class uk2 implements m1d {
    public final /* synthetic */ z70 a;
    public final /* synthetic */ t85 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ qqc d;
    public final /* synthetic */ qqc e;

    public uk2(z70 z70Var, t85 t85Var, float f, qqc qqcVar, qqc qqcVar2) {
        this.a = z70Var;
        this.b = t85Var;
        this.c = f;
        this.d = qqcVar;
        this.e = qqcVar2;
    }

    @Override // defpackage.m1d
    public final long M(int i, long j, long j2) {
        if (i == 1) {
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) > 0.0f) {
                z70 z70Var = this.a;
                coc.c(this.b, null, null, new qe2(z70Var, (Float.intBitsToFloat(i2) * 0.5f) + ((Number) z70Var.d()).floatValue(), null, 1), 3);
                float intBitsToFloat = Float.intBitsToFloat(i2);
                return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.m1d
    public final long y(int i, long j) {
        if (i == 1) {
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i2) < 0.0f) {
                z70 z70Var = this.a;
                if (((Number) z70Var.d()).floatValue() > 0.0f) {
                    float floatValue = ((Number) z70Var.d()).floatValue() + Float.intBitsToFloat(i2);
                    if (floatValue < 0.0f) {
                        floatValue = 0.0f;
                    }
                    coc.c(this.b, null, null, new qe2(z70Var, floatValue, null, 2), 3);
                    float floatValue2 = floatValue - ((Number) z70Var.d()).floatValue();
                    return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(floatValue2) & 4294967295L);
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (defpackage.z70.a(r8.a, r2, null, null, null, r6, 14) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        if (defpackage.z70.a(r8.a, r2, null, null, null, r6, 14) == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.m1d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z0(long j, Continuation continuation) {
        tk2 tk2Var;
        int i;
        if (continuation instanceof tk2) {
            tk2Var = (tk2) continuation;
            int i2 = tk2Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tk2Var.n = i2 - Integer.MIN_VALUE;
                tk2 tk2Var2 = tk2Var;
                Object obj = tk2Var2.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = tk2Var2.n;
                if (i == 0) {
                    if (i != 1 && i != 2) {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = tk2Var2.k;
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    z70 z70Var = this.a;
                    if (((Number) z70Var.d()).floatValue() > 0.0f) {
                        float floatValue = ((Number) z70Var.d()).floatValue();
                        float f = this.c;
                        qqc qqcVar = this.d;
                        if (floatValue >= f && !((Boolean) qqcVar.getValue()).booleanValue()) {
                            ((Function0) this.e.getValue()).invoke();
                            Float f2 = new Float(f);
                            tk2Var2.k = j;
                            tk2Var2.n = 1;
                        } else if (!((Boolean) qqcVar.getValue()).booleanValue()) {
                            Float f3 = new Float(0.0f);
                            tk2Var2.k = j;
                            tk2Var2.n = 2;
                        }
                    } else {
                        return new j5k(0L);
                    }
                }
                return new j5k(j);
            }
        }
        tk2Var = new tk2(this, (q55) continuation);
        tk2 tk2Var22 = tk2Var;
        Object obj2 = tk2Var22.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = tk2Var22.n;
        if (i == 0) {
        }
        return new j5k(j);
    }
}
