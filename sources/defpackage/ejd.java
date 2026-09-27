package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ejd extends el0 {
    public final hc0 a;
    public final int b;

    public ejd(hc0 hc0Var, int i) {
        this.a = hc0Var;
        this.b = i;
    }

    @Override // defpackage.el0
    public final int a() {
        return 1;
    }

    @Override // defpackage.el0
    public final Object get(int i) {
        if (i == this.b) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.el0, java.lang.Iterable
    public final Iterator iterator() {
        return new kwg(this, 2);
    }

    @Override // defpackage.el0
    public final void set(int i, Object obj) {
        throw new IllegalStateException();
    }
}
