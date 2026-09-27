package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z2f implements il6 {
    public final /* synthetic */ il6 a;
    public boolean b;
    public boolean c;
    public final orc d = new orc();

    public z2f(il6 il6Var) {
        this.a = il6Var;
    }

    @Override // defpackage.il6
    public final int A0(long j) {
        return this.a.A0(j);
    }

    @Override // defpackage.il6
    public final long J0(long j) {
        return this.a.J0(j);
    }

    @Override // defpackage.il6
    public final int O(float f) {
        return this.a.O(f);
    }

    @Override // defpackage.il6
    public final float S(long j) {
        return this.a.S(j);
    }

    public final void a() {
        this.c = true;
        orc orcVar = this.d;
        if (orcVar.g()) {
            orcVar.o(null);
        }
    }

    public final void b() {
        this.b = true;
        orc orcVar = this.d;
        if (orcVar.g()) {
            orcVar.o(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(q55 q55Var) {
        x2f x2fVar;
        int i;
        if (q55Var instanceof x2f) {
            x2fVar = (x2f) q55Var;
            int i2 = x2fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x2fVar.m = i2 - Integer.MIN_VALUE;
                Object obj = x2fVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = x2fVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    x2fVar.m = 1;
                    if (this.d.e(x2fVar) == u85Var) {
                        return u85Var;
                    }
                }
                this.b = false;
                this.c = false;
                return Unit.INSTANCE;
            }
        }
        x2fVar = new x2f(this, q55Var);
        Object obj2 = x2fVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = x2fVar.m;
        if (i == 0) {
        }
        this.b = false;
        this.c = false;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(q55 q55Var) {
        y2f y2fVar;
        int i;
        if (q55Var instanceof y2f) {
            y2fVar = (y2f) q55Var;
            int i2 = y2fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y2fVar.m = i2 - Integer.MIN_VALUE;
                Object obj = y2fVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = y2fVar.m;
                orc orcVar = this.d;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    if (!this.b && !this.c) {
                        y2fVar.m = 1;
                        if (orcVar.e(y2fVar) == u85Var) {
                            return u85Var;
                        }
                    }
                    return Boolean.valueOf(this.b);
                }
                orcVar.o(null);
                return Boolean.valueOf(this.b);
            }
        }
        y2fVar = new y2f(this, q55Var);
        Object obj2 = y2fVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = y2fVar.m;
        orc orcVar2 = this.d;
        if (i == 0) {
        }
        orcVar2.o(null);
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.il6
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.il6
    public final float j0(int i) {
        return this.a.j0(i);
    }

    @Override // defpackage.il6
    public final long k(float f) {
        return this.a.k(f);
    }

    @Override // defpackage.il6
    public final float k0(float f) {
        return this.a.k0(f);
    }

    @Override // defpackage.il6
    public final long l(long j) {
        return this.a.l(j);
    }

    @Override // defpackage.il6
    public final float p(long j) {
        return this.a.p(j);
    }

    @Override // defpackage.il6
    public final float q0() {
        return this.a.q0();
    }

    @Override // defpackage.il6
    public final float t0(float f) {
        return this.a.t0(f);
    }

    @Override // defpackage.il6
    public final long v(int i) {
        return this.a.v(i);
    }

    @Override // defpackage.il6
    public final long x(float f) {
        return this.a.x(f);
    }
}
