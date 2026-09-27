package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e80 implements i80 {
    public final b80 a;
    public final b80 b;

    public e80(b80 b80Var, b80 b80Var2) {
        this.a = b80Var;
        this.b = b80Var2;
    }

    @Override // defpackage.i80
    public final g91 a() {
        return new phh(this.a.f(), this.b.f());
    }

    @Override // defpackage.i80
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.i80
    public final boolean c() {
        if (this.a.c() && this.b.c()) {
            return true;
        }
        return false;
    }
}
