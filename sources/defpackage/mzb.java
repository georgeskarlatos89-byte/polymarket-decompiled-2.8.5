package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class mzb implements gdc {
    public gdc[] a;

    @Override // defpackage.gdc
    public final onf a(Class cls) {
        for (gdc gdcVar : this.a) {
            if (gdcVar.b(cls)) {
                return gdcVar.a(cls);
            }
        }
        py2.f("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.gdc
    public final boolean b(Class cls) {
        for (gdc gdcVar : this.a) {
            if (gdcVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
