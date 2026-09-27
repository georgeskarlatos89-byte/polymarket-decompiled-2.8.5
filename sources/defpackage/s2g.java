package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s2g {
    public final ky0 a;
    public final ali b;
    public final gw2 c;
    public final gw2 d;
    public final cw2 e;
    public final cw2 f;
    public boolean g = false;
    public boolean h = false;
    public ac3 i;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, cw2] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, cw2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [c3g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [c3g, java.lang.Object] */
    public s2g(ky0 ky0Var, ali aliVar) {
        this.a = ky0Var;
        this.b = aliVar;
        ?? obj = new Object();
        obj.c = new Object();
        gw2 gw2Var = new gw2(obj);
        obj.b = gw2Var;
        try {
            this.e = obj;
            obj.a = "CaptureCompleteFuture";
        } catch (Exception e) {
            gw2Var.a(e);
        }
        this.c = gw2Var;
        ?? obj2 = new Object();
        obj2.c = new Object();
        gw2 gw2Var2 = new gw2(obj2);
        obj2.b = gw2Var2;
        try {
            this.f = obj2;
            obj2.a = "RequestCompleteFuture";
        } catch (Exception e2) {
            gw2Var2.a(e2);
        }
        this.d = gw2Var2;
    }

    public final void a() {
        ky0 ky0Var = this.a;
        boolean z = ky0Var.j;
        if (z && !ky0Var.a()) {
            return;
        }
        if (!z) {
            grn.g("The callback can only complete once.", !this.d.b.isDone());
        }
        this.f.a(null);
    }

    public final void b() {
        xkm.a();
        if (!this.g && !this.h) {
            this.h = true;
            hn9 hn9Var = this.a.d;
            if (hn9Var != null) {
                hn9Var.onCaptureStarted();
            }
        }
    }
}
