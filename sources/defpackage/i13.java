package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i13 implements s6g {
    public final /* synthetic */ int b;
    public final s6g c;

    public i13(long j, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = new i3j(j, new h13(j));
                return;
            default:
                this.c = new i13(j, 1);
                return;
        }
    }

    @Override // defpackage.s6g
    public final long a() {
        int i = this.b;
        s6g s6gVar = this.c;
        switch (i) {
            case 0:
                return ((i3j) ((i13) s6gVar).c).b;
            default:
                return ((i3j) s6gVar).b;
        }
    }

    @Override // defpackage.s6g
    public final q6g b(tk0 tk0Var) {
        int i = this.b;
        s6g s6gVar = this.c;
        switch (i) {
            case 0:
                if (!((i3j) ((i13) s6gVar).c).b(tk0Var).b) {
                    Throwable th = (Throwable) tk0Var.c;
                    if (th instanceof v13) {
                        o9n.b("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                        if (((v13) th).a > 0) {
                            return q6g.f;
                        }
                    }
                    return q6g.d;
                }
                return q6g.e;
            default:
                return ((i3j) s6gVar).b(tk0Var);
        }
    }
}
