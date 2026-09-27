package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tc9 {
    public int a;
    public float b;
    public final Object c;

    public tc9(wwi wwiVar) {
        this.c = wwiVar;
        this.a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        float i3;
        wwi wwiVar = (wwi) this.c;
        int i4 = 1;
        if (z) {
            int d = h3n.d(wwiVar.f, i, z);
            int lineStart = wwiVar.f.getLineStart(d);
            int f = wwiVar.f(d);
            if (i == lineStart || i == f) {
                z4 = true;
                int i5 = i * 4;
                if (!z3) {
                    if (z4) {
                        i4 = 0;
                    }
                } else if (z4) {
                    i4 = 2;
                } else {
                    i4 = 3;
                }
                i2 = i5 + i4;
                if (this.a != i2) {
                    return this.b;
                }
                if (z3) {
                    i3 = wwiVar.h(i, z);
                } else {
                    i3 = wwiVar.i(i, z);
                }
                if (z2) {
                    this.a = i2;
                    this.b = i3;
                }
                return i3;
            }
        }
        z4 = false;
        int i52 = i * 4;
        if (!z3) {
        }
        i2 = i52 + i4;
        if (this.a != i2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f, q55 q55Var) {
        mxf mxfVar;
        int i;
        if (q55Var instanceof mxf) {
            mxfVar = (mxf) q55Var;
            int i2 = mxfVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mxfVar.m = i2 - Integer.MIN_VALUE;
                Object obj = mxfVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = mxfVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    ip4 ip4Var = (ip4) this.c;
                    Float f2 = new Float(f);
                    mxfVar.m = 1;
                    obj = ip4Var.invoke(f2, mxfVar);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                this.b += ((Number) obj).floatValue();
                return Unit.INSTANCE;
            }
        }
        mxfVar = new mxf(this, q55Var);
        Object obj2 = mxfVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = mxfVar.m;
        if (i == 0) {
        }
        this.b += ((Number) obj2).floatValue();
        return Unit.INSTANCE;
    }

    public tc9(int i, ip4 ip4Var) {
        this.a = i;
        this.c = ip4Var;
    }
}
