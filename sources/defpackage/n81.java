package defpackage;

import android.os.SystemClock;
import com.socure.docv.capturesdk.common.utils.Scanner;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class n81 implements gp5 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public jp5 d;

    public n81(boolean z) {
        this.a = z;
    }

    @Override // defpackage.gp5
    public final void e(qz5 qz5Var) {
        qz5Var.getClass();
        ArrayList arrayList = this.b;
        if (!arrayList.contains(qz5Var)) {
            arrayList.add(qz5Var);
            this.c++;
        }
    }

    public final void i(int i) {
        boolean z;
        jp5 jp5Var = this.d;
        int i2 = u1k.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            qz5 qz5Var = (qz5) this.b.get(i3);
            boolean z2 = this.a;
            synchronized (qz5Var) {
                wwf wwfVar = qz5.p;
                if (z2 && (jp5Var.h & 8) != 8) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    qz5Var.i += i;
                }
            }
        }
    }

    public final void m() {
        boolean z;
        boolean z2;
        jp5 jp5Var = this.d;
        int i = u1k.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            qz5 qz5Var = (qz5) this.b.get(i2);
            boolean z3 = this.a;
            synchronized (qz5Var) {
                try {
                    wwf wwfVar = qz5.p;
                    if (z3 && (jp5Var.h & 8) != 8) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (qz5Var.g > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        pfn.f(z2);
                        qz5Var.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (elapsedRealtime - qz5Var.h);
                        qz5Var.j += i3;
                        long j = qz5Var.k;
                        long j2 = qz5Var.i;
                        qz5Var.k = j + j2;
                        if (i3 > 0) {
                            qz5Var.f.a((((float) j2) * 8000.0f) / i3, (int) Math.sqrt(j2));
                            if (qz5Var.j < Scanner.CAMERA_SETUP_DELAY_MS) {
                                if (qz5Var.k >= 524288) {
                                }
                                qz5Var.b(i3, qz5Var.i, qz5Var.l);
                                qz5Var.h = elapsedRealtime;
                                qz5Var.i = 0L;
                            }
                            qz5Var.l = qz5Var.f.i();
                            qz5Var.b(i3, qz5Var.i, qz5Var.l);
                            qz5Var.h = elapsedRealtime;
                            qz5Var.i = 0L;
                        }
                        qz5Var.g--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = null;
    }

    public final void p() {
        for (int i = 0; i < this.c; i++) {
            ((qz5) this.b.get(i)).getClass();
        }
    }

    public final void q(jp5 jp5Var) {
        boolean z;
        this.d = jp5Var;
        for (int i = 0; i < this.c; i++) {
            qz5 qz5Var = (qz5) this.b.get(i);
            boolean z2 = this.a;
            synchronized (qz5Var) {
                try {
                    wwf wwfVar = qz5.p;
                    if (z2 && (jp5Var.h & 8) != 8) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (qz5Var.g == 0) {
                            qz5Var.d.getClass();
                            qz5Var.h = SystemClock.elapsedRealtime();
                        }
                        qz5Var.g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
