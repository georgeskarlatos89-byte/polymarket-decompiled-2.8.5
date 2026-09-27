package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class kqf implements leh {
    public final gje a;
    public boolean b;
    public final sp1 c = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [sp1, java.lang.Object] */
    public kqf(gje gjeVar) {
        this.a = gjeVar;
    }

    @Override // defpackage.leh
    public final sp1 c() {
        return this.c;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.e = true;
        sp1 sp1Var = this.c;
        sp1Var.skip(sp1Var.c);
    }

    @Override // defpackage.leh
    public final boolean h(long j) {
        sp1 sp1Var;
        if (!this.b) {
            if (j < 0) {
                f27.q(woa.m(j, "byteCount: "));
                return false;
            }
            do {
                sp1Var = this.c;
                if (sp1Var.c >= j) {
                    return true;
                }
            } while (this.a.v0(sp1Var, 8192L) != -1);
            return false;
        }
        dmk.n("Source is closed.");
        return false;
    }

    @Override // defpackage.leh
    public final void i(long j) {
        if (h(j)) {
        } else {
            throw new EOFException(ace.g(j, "Source doesn't contain required number of bytes (", ")."));
        }
    }

    @Override // defpackage.leh
    public final boolean j() {
        if (!this.b) {
            sp1 sp1Var = this.c;
            if (!sp1Var.j() || this.a.v0(sp1Var, 8192L) != -1) {
                return false;
            }
            return true;
        }
        dmk.n("Source is closed.");
        return false;
    }

    @Override // defpackage.leh
    public final kqf peek() {
        if (!this.b) {
            return new kqf(new gje(this));
        }
        dmk.n("Source is closed.");
        return null;
    }

    @Override // defpackage.leh
    public final byte readByte() {
        i(1L);
        return this.c.readByte();
    }

    public final String toString() {
        return "buffered(" + this.a + ')';
    }

    @Override // defpackage.tnf
    public final long v0(sp1 sp1Var, long j) {
        if (!this.b) {
            if (j >= 0) {
                sp1 sp1Var2 = this.c;
                if (sp1Var2.c == 0 && this.a.v0(sp1Var2, 8192L) == -1) {
                    return -1L;
                }
                return sp1Var2.v0(sp1Var, Math.min(j, sp1Var2.c));
            }
            f27.q(woa.m(j, "byteCount: "));
            return 0L;
        }
        dmk.n("Source is closed.");
        return 0L;
    }
}
