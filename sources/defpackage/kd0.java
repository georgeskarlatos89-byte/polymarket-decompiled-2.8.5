package defpackage;

import android.view.View;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.IntConsumer;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class kd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kd0(or7 or7Var, int i, boolean z) {
        this.a = 5;
        this.c = or7Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                ((IntConsumer) this.c).accept(this.b);
                return;
            case 1:
                ys0 ys0Var = (ys0) this.c;
                ys0Var.b.onAudioFocusChange(this.b);
                return;
            case 2:
                ((qz2) this.c).a(this.b);
                return;
            case 3:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                int i = this.b;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    whi whiVar = (whi) it.next();
                    if (i == 5) {
                        synchronized (whiVar.o) {
                            try {
                                if (whiVar.l() && whiVar.p != null) {
                                    whi.k();
                                    Iterator it2 = whiVar.p.iterator();
                                    while (it2.hasNext()) {
                                        ((gi6) it2.next()).a();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        whiVar.getClass();
                    }
                }
                return;
            case 4:
                ContentCardAdapter.f(this.b, (ContentCardAdapter) this.c);
                return;
            case 5:
                or7 or7Var = (or7) this.c;
                int i2 = this.b;
                ry5 ry5Var = or7Var.v;
                int i3 = ((r91) or7Var.a[i2].e).b;
                ry5Var.N(ry5Var.M(), 1033, new f05(11));
                return;
            case 6:
                MaterialButton materialButton = (MaterialButton) this.c;
                int i4 = this.b;
                int[] iArr = MaterialButton.N;
                materialButton.setIconSize(i4);
                return;
            case 7:
                ((gvn) this.c).c(this.b);
                return;
            case 8:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                int i5 = this.b;
                WeakReference weakReference = sideSheetBehavior.p;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if (view != null) {
                    sideSheetBehavior.z(view, i5, false);
                    return;
                }
                return;
            default:
                SurfaceTextureHelper.b((SurfaceTextureHelper) this.c, this.b);
                return;
        }
    }

    public /* synthetic */ kd0(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
