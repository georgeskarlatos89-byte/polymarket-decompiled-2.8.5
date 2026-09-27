package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nrf {
    public orf a;
    public int b;
    public nr8 c;
    public Function2 d;
    public int e;
    public rpc f;
    public iqc g;

    public nrf(orf orfVar) {
        this.a = orfVar;
    }

    public final boolean a() {
        boolean z;
        if (this.a != null) {
            nr8 nr8Var = this.c;
            if (nr8Var != null) {
                z = nr8Var.a();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        orf orfVar = this.a;
        if (orfVar != null) {
            orfVar.b(this, null);
        }
    }

    public final h8a c(Object obj) {
        h8a b;
        orf orfVar = this.a;
        if (orfVar != null && (b = orfVar.b(this, obj)) != null) {
            return b;
        }
        return h8a.IGNORED;
    }

    public final void d() {
        orf orfVar = this.a;
        if (orfVar != null) {
            orfVar.a();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void e(boolean z) {
        int i;
        int i2 = this.b;
        if (z) {
            i = i2 | 32;
        } else {
            i = i2 & (-33);
        }
        this.b = i;
    }
}
