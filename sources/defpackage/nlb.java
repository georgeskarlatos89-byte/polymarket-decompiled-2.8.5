package defpackage;

import androidx.lifecycle.LifecycleOwner;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class nlb {
    public final zfd a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ olb d;

    public nlb(olb olbVar, zfd zfdVar) {
        this.d = olbVar;
        this.a = zfdVar;
    }

    public final void a(boolean z) {
        int i;
        boolean z2;
        boolean z3;
        if (z != this.b) {
            this.b = z;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            olb olbVar = this.d;
            int i2 = olbVar.c;
            olbVar.c = i + i2;
            if (!olbVar.d) {
                olbVar.d = true;
                while (true) {
                    try {
                        int i3 = olbVar.c;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0 && i3 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i2 > 0 && i3 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                            olbVar.g();
                        } else if (z3) {
                            olbVar.h();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        olbVar.d = false;
                        throw th;
                    }
                }
                olbVar.d = false;
            }
            if (this.b) {
                olbVar.c(this);
            }
        }
    }

    public boolean c(LifecycleOwner lifecycleOwner) {
        return false;
    }

    public abstract boolean d();

    public void b() {
    }
}
