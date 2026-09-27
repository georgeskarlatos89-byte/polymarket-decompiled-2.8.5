package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class mzf implements kk8 {
    public final ll9 a;
    public final boolean b;

    public mzf(ll9 ll9Var, boolean z) {
        this.a = ll9Var;
        this.b = z;
    }

    public abstract void a(boolean z, Set set, ll9 ll9Var, pq4 pq4Var, int i);

    @Override // defpackage.kk8
    public final ll9 d() {
        return this.a;
    }

    @Override // defpackage.kk8
    public final d3g e() {
        return null;
    }

    @Override // defpackage.kk8
    public final boolean f() {
        return this.b;
    }
}
