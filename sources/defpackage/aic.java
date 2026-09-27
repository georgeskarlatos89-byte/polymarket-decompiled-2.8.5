package defpackage;

import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class aic implements m1d {
    public final /* synthetic */ ur a;
    public final /* synthetic */ xmd b;

    public aic(ur urVar, xmd xmdVar) {
        this.a = urVar;
        this.b = xmdVar;
    }

    @Override // defpackage.m1d
    public final long M(int i, long j, long j2) {
        long j3;
        float y;
        if (i == 1) {
            if (this.b == xmd.Horizontal) {
                j3 = j2 >> 32;
            } else {
                j3 = 4294967295L & j2;
            }
            float intBitsToFloat = Float.intBitsToFloat((int) j3);
            ur urVar = this.a;
            float i2 = urVar.i(intBitsToFloat);
            gvd gvdVar = (gvd) urVar.f;
            if (Float.isNaN(gvdVar.y())) {
                y = 0.0f;
            } else {
                y = gvdVar.y();
            }
            gvdVar.z(i2);
            return a(i2 - y);
        }
        return 0L;
    }

    public final long a(float f) {
        float f2;
        xmd xmdVar = xmd.Horizontal;
        xmd xmdVar2 = this.b;
        if (xmdVar2 == xmdVar) {
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        if (xmdVar2 != xmd.Vertical) {
            f = 0.0f;
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.m1d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(long j, long j2, Continuation continuation) {
        yhc yhcVar;
        int i;
        float c;
        if (continuation instanceof yhc) {
            yhcVar = (yhc) continuation;
            int i2 = yhcVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yhcVar.n = i2 - Integer.MIN_VALUE;
                Object obj = yhcVar.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = yhcVar.n;
                if (i == 0) {
                    if (i == 1) {
                        j2 = yhcVar.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    if (this.b == xmd.Horizontal) {
                        c = j5k.b(j2);
                    } else {
                        c = j5k.c(j2);
                    }
                    yhcVar.k = j2;
                    yhcVar.n = 1;
                    if (this.a.p(c, yhcVar) == u85Var) {
                        return u85Var;
                    }
                }
                return new j5k(j2);
            }
        }
        yhcVar = new yhc(this, (q55) continuation);
        Object obj2 = yhcVar.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = yhcVar.n;
        if (i == 0) {
        }
        return new j5k(j2);
    }

    @Override // defpackage.m1d
    public final long y(int i, long j) {
        long j2;
        if (this.b == xmd.Horizontal) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) j2);
        float f = 0.0f;
        if (intBitsToFloat < 0.0f && i == 1) {
            ur urVar = this.a;
            float i2 = urVar.i(intBitsToFloat);
            gvd gvdVar = (gvd) urVar.f;
            if (!Float.isNaN(gvdVar.y())) {
                f = gvdVar.y();
            }
            gvdVar.z(i2);
            return a(i2 - f);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.m1d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z0(long j, Continuation continuation) {
        zhc zhcVar;
        int i;
        float c;
        float f;
        if (continuation instanceof zhc) {
            zhcVar = (zhc) continuation;
            int i2 = zhcVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zhcVar.n = i2 - Integer.MIN_VALUE;
                Object obj = zhcVar.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = zhcVar.n;
                if (i == 0) {
                    if (i == 1) {
                        j = zhcVar.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    if (this.b == xmd.Horizontal) {
                        c = j5k.b(j);
                    } else {
                        c = j5k.c(j);
                    }
                    ur urVar = this.a;
                    float l = urVar.l();
                    if (c < 0.0f) {
                        Float c0 = CollectionsKt.c0(urVar.h().a.values());
                        if (c0 != null) {
                            f = c0.floatValue();
                        } else {
                            f = Float.NaN;
                        }
                        if (l > f) {
                            zhcVar.k = j;
                            zhcVar.n = 1;
                            if (urVar.p(c, zhcVar) == u85Var) {
                                return u85Var;
                            }
                        }
                    }
                    j = 0;
                }
                return new j5k(j);
            }
        }
        zhcVar = new zhc(this, (q55) continuation);
        Object obj2 = zhcVar.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = zhcVar.n;
        if (i == 0) {
        }
        return new j5k(j);
    }
}
