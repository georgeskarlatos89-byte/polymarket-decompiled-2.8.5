package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class wy2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wy2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                o9n.e(3, "Camera2CapturePipeline");
                ((cw2) obj).a(null);
                return;
            default:
                ojg ojgVar = (ojg) obj;
                synchronized (ojgVar.b) {
                    try {
                        if (ojgVar.d == null) {
                            o9n.f("ScreenFlashWrapper", "apply: pendingListener is null!");
                        }
                        ojgVar.c();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
