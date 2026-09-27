package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class gk6 extends fk6 {
    public final s7h b;

    public gk6(s7h s7hVar) {
        this.b = s7hVar;
    }

    @Override // defpackage.s7h
    public final s7h t0(boolean z) {
        if (z == a0()) {
            return this;
        }
        return this.b.t0(z).u0(L());
    }

    @Override // defpackage.s7h
    public final s7h u0(jgj jgjVar) {
        jgjVar.getClass();
        if (jgjVar != L()) {
            return new v7h(this, jgjVar);
        }
        return this;
    }

    @Override // defpackage.fk6
    public final s7h v0() {
        return this.b;
    }
}
