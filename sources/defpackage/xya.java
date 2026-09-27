package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xya {
    public final /* synthetic */ int a;
    public final hvd b;
    public final hvd c;
    public boolean d;
    public Object e;
    public final q1b f;

    public xya(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new hvd(i);
                this.c = new hvd(i2);
                this.f = new q1b(i, 30, 100);
                return;
            default:
                this.b = new hvd(i);
                this.c = new hvd(i2);
                this.f = new q1b(i, 90, 200);
                return;
        }
    }

    public final void a(int i, int i2) {
        int i3 = this.a;
        hvd hvdVar = this.c;
        q1b q1bVar = this.f;
        hvd hvdVar2 = this.b;
        switch (i3) {
            case 0:
                if (i < 0.0f) {
                    nw9.a("Index should be non-negative");
                }
                hvdVar2.z(i);
                q1bVar.a(i);
                hvdVar.z(i2);
                return;
            default:
                if (i < 0.0f) {
                    nw9.a("Index should be non-negative (" + i + ')');
                }
                hvdVar2.z(i);
                q1bVar.a(i);
                hvdVar.z(i2);
                return;
        }
    }
}
