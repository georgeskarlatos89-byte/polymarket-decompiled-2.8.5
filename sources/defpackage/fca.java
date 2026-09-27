package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class fca extends wck {
    public static final fca c = new wck("package", false);

    @Override // defpackage.wck
    public final Integer a(wck wckVar) {
        wckVar.getClass();
        if (this == wckVar) {
            return 0;
        }
        xzb xzbVar = sck.a;
        if (wckVar != nck.c && wckVar != ock.c) {
            return -1;
        }
        return 1;
    }

    @Override // defpackage.wck
    public final String b() {
        return "public/*package*/";
    }

    @Override // defpackage.wck
    public final wck c() {
        return pck.c;
    }
}
