package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class wm9 implements ll8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wm9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ll8
    public final void a(ml8 ml8Var) {
        ali aliVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ym9 ym9Var = (ym9) ((WeakReference) ((xm9) obj).e).get();
                if (ym9Var != null) {
                    ym9Var.v.execute(new y85(ym9Var, 24));
                    return;
                }
                return;
            default:
                mfj mfjVar = (mfj) obj;
                synchronized (mfjVar.c) {
                    try {
                        int i2 = mfjVar.a - 1;
                        mfjVar.a = i2;
                        if (mfjVar.b && i2 == 0) {
                            mfjVar.close();
                        }
                        aliVar = (ali) mfjVar.f;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (aliVar != null) {
                    aliVar.a(ml8Var);
                    return;
                }
                return;
        }
    }
}
