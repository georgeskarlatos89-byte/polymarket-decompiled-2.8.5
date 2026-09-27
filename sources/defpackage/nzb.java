package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nzb implements hdc {
    public hdc[] a;

    @Override // defpackage.hdc
    public final pnf a(Class cls) {
        for (hdc hdcVar : this.a) {
            if (hdcVar.b(cls)) {
                return hdcVar.a(cls);
            }
        }
        py2.f("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.hdc
    public final boolean b(Class cls) {
        for (hdc hdcVar : this.a) {
            if (hdcVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
