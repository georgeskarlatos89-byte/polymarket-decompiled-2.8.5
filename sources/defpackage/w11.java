package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class w11 implements CancelHandler {
    public final v11[] a;

    public w11(v11[] v11VarArr) {
        this.a = v11VarArr;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (v11 v11Var : this.a) {
            jw6 jw6Var = v11Var.f;
            if (jw6Var != null) {
                jw6Var.dispose();
            } else {
                Intrinsics.i("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
