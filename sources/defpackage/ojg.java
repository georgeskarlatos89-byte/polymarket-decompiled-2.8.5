package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ojg implements in9 {
    public final in9 a;
    public final Object b = new Object();
    public boolean c;
    public wy2 d;

    public ojg(in9 in9Var) {
        this.a = in9Var;
    }

    @Override // defpackage.in9
    public final void a(long j, wy2 wy2Var) {
        wy2Var.getClass();
        synchronized (this.b) {
            this.c = true;
            this.d = wy2Var;
        }
        in9 in9Var = this.a;
        if (in9Var != null) {
            in9Var.a(j, new wy2(this, 1));
        } else {
            o9n.b("ScreenFlashWrapper", "apply: screenFlash is null!");
            c();
        }
    }

    public final void b() {
        synchronized (this.b) {
            try {
                if (this.c) {
                    in9 in9Var = this.a;
                    if (in9Var != null) {
                        in9Var.clear();
                    } else {
                        o9n.b("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    o9n.f("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                wy2 wy2Var = this.d;
                if (wy2Var != null) {
                    wy2Var.a();
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.in9
    public final void clear() {
        b();
    }
}
