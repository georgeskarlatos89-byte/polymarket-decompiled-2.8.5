package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class jjc implements mj6 {
    public xw1 b;
    public int c;
    public jjc e;
    public jjc f;
    public bgd g;
    public x8d h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public bo m;
    public boolean n;
    public jjc a = this;
    public int d = -1;

    public final t85 Q0() {
        xw1 xw1Var = this.b;
        if (xw1Var == null) {
            xw1 a = qsn.a(nj6.i(this).getCoroutineContext().plus(new lca((jca) nj6.i(this).getCoroutineContext().get(jca.C0))));
            this.b = a;
            return a;
        }
        return xw1Var;
    }

    public boolean R0() {
        return !(this instanceof j31);
    }

    public void S0() {
        if (this.n) {
            kw9.c("node attached multiple times");
        }
        if (this.h == null) {
            kw9.c("attach invoked on a node without a coordinator");
        }
        this.n = true;
        this.k = true;
    }

    public void T0() {
        if (!this.n) {
            kw9.c("Cannot detach a node that is not attached");
        }
        if (this.k) {
            kw9.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.l) {
            kw9.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.n = false;
        xw1 xw1Var = this.b;
        if (xw1Var != null) {
            qsn.e(xw1Var, new CancellationException("The Modifier.Node was detached"));
            this.b = null;
        }
    }

    public void X0() {
        if (!this.n) {
            kw9.c("reset() called on an unattached node");
        }
        W0();
    }

    public void Y0() {
        if (!this.n) {
            kw9.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.k) {
            kw9.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.k = false;
        U0();
        this.l = true;
    }

    public void Z0() {
        if (!this.n) {
            kw9.c("node detached multiple times");
        }
        if (this.h == null) {
            kw9.c("detach invoked on a node without a coordinator");
        }
        if (!this.l) {
            kw9.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.l = false;
        bo boVar = this.m;
        if (boVar != null) {
            boVar.invoke();
        }
        V0();
    }

    public void a1(jjc jjcVar) {
        this.a = jjcVar;
    }

    public void b1(x8d x8dVar) {
        this.h = x8dVar;
    }

    public void U0() {
    }

    public void V0() {
    }

    public void W0() {
    }
}
