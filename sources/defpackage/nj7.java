package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nj7 implements a0i {
    public static final nj7 b = new nj7(0);
    public final /* synthetic */ int a;

    public /* synthetic */ nj7(int i) {
        this.a = i;
    }

    @Override // defpackage.a0i
    public final void a(g6f g6fVar, String str, String str2, Throwable th) {
        int i = this.a;
        g6fVar.getClass();
        switch (i) {
            case 0:
                int i2 = mj7.a[g6fVar.ordinal()];
                return;
            default:
                int i3 = z50.a[g6fVar.ordinal()];
                int i4 = 2;
                if (i3 != 1) {
                    if (i3 != 2) {
                        i4 = 4;
                        if (i3 != 3) {
                            if (i3 != 4) {
                                i4 = 6;
                                if (i3 == 6) {
                                    i4 = 7;
                                }
                            } else {
                                i4 = 5;
                            }
                        }
                    } else {
                        i4 = 3;
                    }
                }
                Thread currentThread = Thread.currentThread();
                String k = m51.k("(", currentThread.getName() + ":" + currentThread.getId(), ") ", str2);
                if (th != null) {
                    th.printStackTrace();
                    k = sv6.n(k, "\n", gp7.b(th));
                }
                Log.println(i4, str, k);
                return;
        }
    }
}
