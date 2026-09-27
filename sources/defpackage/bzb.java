package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bzb extends ka {
    public final la a;

    public bzb(la laVar) {
        this.a = laVar;
    }

    @Override // defpackage.ka
    public final void a(Object obj, r9 r9Var) {
        ra raVar = this.a.a;
        if (raVar != null) {
            raVar.a(obj, r9Var);
        } else {
            dmk.n("Launcher has not been initialized");
        }
    }

    @Override // defpackage.ka
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
