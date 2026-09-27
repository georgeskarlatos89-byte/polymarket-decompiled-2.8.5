package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qjh implements h58 {
    public final float a;
    public final float b;
    public final Object c;

    public /* synthetic */ qjh(Object obj, int i) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    @Override // defpackage.la0
    public final c5k a(tfj tfjVar) {
        sa0 sa0Var;
        Object obj = this.c;
        if (obj == null) {
            sa0Var = null;
        } else {
            sa0Var = (sa0) tfjVar.a.invoke(obj);
        }
        return new x3g(this.a, this.b, sa0Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qjh) {
            qjh qjhVar = (qjh) obj;
            if (qjhVar.a == this.a && qjhVar.b == this.b && Intrinsics.areEqual(qjhVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return Float.hashCode(this.b) + sv6.a(i * 31, this.a, 31);
    }

    public qjh(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }
}
