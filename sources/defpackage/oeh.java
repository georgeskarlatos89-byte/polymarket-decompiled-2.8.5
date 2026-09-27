package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class oeh implements fv1 {
    public final sp1 b;
    private volatile u74 closed;

    public oeh(sp1 sp1Var) {
        this.b = sp1Var;
    }

    @Override // defpackage.fv1
    public final void a(Throwable th) {
        if (this.closed != null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        this.closed = new u74(new IOException(message, th));
    }

    @Override // defpackage.fv1
    public final Throwable b() {
        u74 u74Var = this.closed;
        if (u74Var != null) {
            return u74Var.a(t74.f);
        }
        return null;
    }

    @Override // defpackage.fv1
    public final sp1 c() {
        Throwable b = b();
        if (b == null) {
            return this.b;
        }
        throw b;
    }

    @Override // defpackage.fv1
    public final Object d(int i, q55 q55Var) {
        Throwable b = b();
        if (b == null) {
            return Boolean.valueOf(this.b.h(i));
        }
        throw b;
    }

    @Override // defpackage.fv1
    public final boolean e() {
        return this.b.j();
    }
}
