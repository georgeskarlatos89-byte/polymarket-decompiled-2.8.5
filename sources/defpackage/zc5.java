package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class zc5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd5 b;
    public final /* synthetic */ eb5 c;

    public /* synthetic */ zc5(dd5 dd5Var, eb5 eb5Var, int i) {
        this.a = i;
        this.b = dd5Var;
        this.c = eb5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        dd5 dd5Var = this.b;
        switch (i) {
            case 0:
                od5 od5Var = dd5Var.e;
                if (od5Var != null) {
                    od5Var.a(obj);
                    return;
                } else {
                    Intrinsics.i("callback");
                    throw null;
                }
            default:
                od5 od5Var2 = dd5Var.e;
                if (od5Var2 != null) {
                    if (obj == null) {
                        obj = new nb5("No provider data returned");
                    }
                    od5Var2.a(obj);
                    return;
                }
                Intrinsics.i("callback");
                throw null;
        }
    }
}
