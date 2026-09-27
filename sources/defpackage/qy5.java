package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class qy5 implements hkb {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ qy5(lp lpVar, int i, aqe aqeVar, aqe aqeVar2) {
        this.a = 0;
        this.b = i;
    }

    @Override // defpackage.hkb
    public final void invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                o7c o7cVar = (o7c) obj;
                if (i2 == 1) {
                    o7cVar.v = true;
                }
                o7cVar.l = i2;
                return;
            case 1:
                ((zpe) obj).D(i2);
                return;
            default:
                ((zpe) obj).d(i2);
                return;
        }
    }

    public /* synthetic */ qy5(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
