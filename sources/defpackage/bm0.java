package defpackage;

import androidx.media3.ui.AspectRatioFrameLayout;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bm0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    public bm0(twm twmVar, boolean z) {
        this.b = z;
        Objects.requireNonNull(twmVar);
        this.c = twmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r4 != r1) goto L21;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                this.b = false;
                return;
            case 1:
                zx zxVar = (zx) this.c;
                boolean z3 = this.b;
                o1k.b();
                af9 af9Var = (af9) zxVar.b;
                boolean z4 = af9Var.b;
                af9Var.b = z3;
                if (z4 != z3) {
                    ((r8h) af9Var.c).a(z3);
                    return;
                }
                return;
            default:
                twm twmVar = (twm) this.c;
                kfm kfmVar = (kfm) twmVar.a;
                boolean a = kfmVar.a();
                if (kfmVar.y != null && kfmVar.y.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z5 = this.b;
                kfmVar.y = Boolean.valueOf(z5);
                if (z == z5) {
                    c7m c7mVar = kfmVar.f;
                    kfm.g(c7mVar);
                    c7mVar.n.b(Boolean.valueOf(z5), "Default data collection state already set to");
                }
                if (kfmVar.a() != a) {
                    boolean a2 = kfmVar.a();
                    if (kfmVar.y != null && kfmVar.y.booleanValue()) {
                        z2 = true;
                        break;
                    }
                }
                c7m c7mVar2 = kfmVar.f;
                kfm.g(c7mVar2);
                c7mVar2.k.c(Boolean.valueOf(z5), Boolean.valueOf(a), "Default data collection is different than actual status");
                twmVar.y1();
                return;
        }
    }

    public bm0(zx zxVar, boolean z) {
        this.c = zxVar;
        this.b = z;
    }

    public bm0(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.c = aspectRatioFrameLayout;
    }
}
