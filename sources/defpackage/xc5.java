package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class xc5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd5 b;

    public /* synthetic */ xc5(dd5 dd5Var, int i) {
        this.a = i;
        this.b = dd5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        dd5 dd5Var = this.b;
        switch (i) {
            case 0:
                od5 od5Var = dd5Var.e;
                if (od5Var != null) {
                    od5Var.a(new nb5("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    Intrinsics.i("callback");
                    throw null;
                }
            default:
                od5 od5Var2 = dd5Var.e;
                if (od5Var2 != null) {
                    od5Var2.a(new nb5("No provider data returned."));
                    return;
                } else {
                    Intrinsics.i("callback");
                    throw null;
                }
        }
    }
}
