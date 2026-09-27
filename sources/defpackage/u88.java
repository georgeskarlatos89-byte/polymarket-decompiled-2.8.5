package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u88 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final z70 e;
    public c4a f;
    public c4a g;

    public u88(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new z70(new hy6(f), i3n.c, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.Unit, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c4a c4aVar, q55 q55Var) {
        s88 s88Var;
        int i;
        float f;
        z70 z70Var = this.e;
        try {
            if (q55Var instanceof s88) {
                s88Var = (s88) q55Var;
                int i2 = s88Var.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    s88Var.n = i2 - Integer.MIN_VALUE;
                    Object obj = s88Var.l;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = s88Var.n;
                    if (i == 0) {
                        if (i == 1) {
                            c4aVar = s88Var.k;
                            ResultKt.a(obj);
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ResultKt.a(obj);
                        if (c4aVar instanceof b3f) {
                            f = this.b;
                        } else if (c4aVar instanceof hd9) {
                            f = this.c;
                        } else if (c4aVar instanceof lf8) {
                            f = this.d;
                        } else {
                            f = this.a;
                        }
                        this.g = c4aVar;
                        if (!hy6.c(((hy6) z70Var.e.getValue()).a, f)) {
                            c4a c4aVar2 = this.f;
                            s88Var.k = c4aVar;
                            s88Var.n = 1;
                            if (s87.a(z70Var, f, c4aVar2, c4aVar, s88Var) == u85Var) {
                                return u85Var;
                            }
                        }
                    }
                    this.f = c4aVar;
                    this = Unit.INSTANCE;
                    return this;
                }
            }
            if (i == 0) {
            }
            this.f = c4aVar;
            this = Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            this.f = c4aVar;
            throw th;
        }
        s88Var = new s88(this, q55Var);
        Object obj2 = s88Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = s88Var.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q55 q55Var) {
        t88 t88Var;
        int i;
        float f;
        try {
            if (q55Var instanceof t88) {
                t88Var = (t88) q55Var;
                int i2 = t88Var.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    t88Var.m = i2 - Integer.MIN_VALUE;
                    Object obj = t88Var.k;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = t88Var.m;
                    if (i == 0) {
                        if (i == 1) {
                            ResultKt.a(obj);
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ResultKt.a(obj);
                        c4a c4aVar = this.g;
                        if (c4aVar instanceof b3f) {
                            f = this.b;
                        } else if (c4aVar instanceof hd9) {
                            f = this.c;
                        } else if (c4aVar instanceof lf8) {
                            f = this.d;
                        } else {
                            f = this.a;
                        }
                        z70 z70Var = this.e;
                        if (!hy6.c(((hy6) z70Var.e.getValue()).a, f)) {
                            hy6 hy6Var = new hy6(f);
                            t88Var.m = 1;
                            if (z70Var.f(hy6Var, t88Var) == u85Var) {
                                return u85Var;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i == 0) {
            }
            return Unit.INSTANCE;
        } finally {
            this.f = this.g;
        }
        t88Var = new t88(this, q55Var);
        Object obj2 = t88Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = t88Var.m;
    }
}
