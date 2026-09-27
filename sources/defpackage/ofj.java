package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ofj implements e47 {
    public final int a;
    public final int b;
    public final w57 c;

    public ofj(int i, w57 w57Var, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? y57.a : w57Var);
    }

    @Override // defpackage.la0
    public final c5k a(tfj tfjVar) {
        return new wgd(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ofj) {
            ofj ofjVar = (ofj) obj;
            if (ofjVar.a == this.a && ofjVar.b == this.b && Intrinsics.areEqual(ofjVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.e47, defpackage.la0
    public final e5k a(tfj tfjVar) {
        return new wgd(this.a, this.b, this.c);
    }

    public ofj(int i, int i2, w57 w57Var) {
        this.a = i;
        this.b = i2;
        this.c = w57Var;
    }
}
