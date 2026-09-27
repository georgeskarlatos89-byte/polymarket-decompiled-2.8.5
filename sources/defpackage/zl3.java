package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zl3 extends f9g {
    public final /* synthetic */ int a;

    public /* synthetic */ zl3(int i) {
        this.a = i;
    }

    @Override // defpackage.f9g
    public final void a(sci sciVar) {
        int i = this.a;
        sciVar.getClass();
        switch (i) {
            case 0:
                sciVar.t("PRAGMA synchronous = NORMAL");
                return;
            default:
                sciVar.t("PRAGMA synchronous = 1");
                return;
        }
    }
}
