package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class w95 extends bng {
    public final ll9 b;
    public final z27 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w95(ll9 ll9Var, z27 z27Var) {
        super(ll9Var);
        ll9Var.getClass();
        this.b = ll9Var;
        this.c = z27Var;
    }

    @Override // defpackage.bng, defpackage.wmg
    public final ll9 d() {
        return this.b;
    }

    @Override // defpackage.wmg
    public final d3g e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w95) {
                w95 w95Var = (w95) obj;
                if (!Intrinsics.areEqual(this.b, w95Var.b) || !Intrinsics.areEqual(this.c, w95Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.wmg
    public final boolean f() {
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.bng
    public final gy9 k() {
        return this.c;
    }

    public final String toString() {
        return "CountryElement(identifier=" + this.b + ", controller=" + this.c + ")";
    }
}
