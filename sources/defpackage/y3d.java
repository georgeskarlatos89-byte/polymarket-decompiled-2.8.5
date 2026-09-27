package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y3d {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ z3d c;

    public y3d(z3d z3dVar, pz5 pz5Var, Executor executor) {
        this.c = z3dVar;
        this.a = new WeakReference(pz5Var);
        this.b = executor;
    }
}
