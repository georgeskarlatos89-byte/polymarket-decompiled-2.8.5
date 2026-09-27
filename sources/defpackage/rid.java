package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rid extends jjc implements a6c {
    public Function1 o;
    public long p;

    @Override // defpackage.jjc
    public final boolean R0() {
        return true;
    }

    @Override // defpackage.a6c
    public final void a(long j) {
        if (!n1a.b(this.p, j)) {
            this.o.invoke(new n1a(j));
            this.p = j;
        }
    }
}
