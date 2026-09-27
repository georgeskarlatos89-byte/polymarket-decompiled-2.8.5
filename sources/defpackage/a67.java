package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a67 implements l05 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ a67(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.l05
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((l05) this.b).getClass();
                ((l05) this.b).accept(obj);
                return;
            case 1:
                bi8 bi8Var = (bi8) obj;
                if (bi8Var == null) {
                    bi8Var = new bi8(-3);
                }
                ((ry9) this.b).J(bi8Var);
                return;
            default:
                bi8 bi8Var2 = (bi8) obj;
                synchronized (ci8.c) {
                    try {
                        b7h b7hVar = ci8.d;
                        ArrayList arrayList = (ArrayList) b7hVar.get((String) this.b);
                        if (arrayList != null) {
                            b7hVar.remove((String) this.b);
                            for (int i = 0; i < arrayList.size(); i++) {
                                ((l05) arrayList.get(i)).accept(bi8Var2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ a67() {
        this.a = 0;
    }
}
