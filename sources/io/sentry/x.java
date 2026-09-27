package io.sentry;

import java.io.File;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class x {
    public final e1 a;
    public final x0 b;
    public final long c;
    public final g7 d;

    public x(e1 e1Var, x0 x0Var, long j, int i) {
        this.a = e1Var;
        this.b = x0Var;
        this.c = j;
        this.d = new g7(new h(i));
    }

    public abstract boolean a(String str);

    public abstract void b(File file, j0 j0Var);
}
