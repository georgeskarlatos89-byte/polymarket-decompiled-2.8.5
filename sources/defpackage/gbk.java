package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gbk {
    public Interpolator c;
    public hbk d;
    public boolean e;
    public long b = -1;
    public final k5j f = new k5j(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (!this.e) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fbk) it.next()).b();
        }
        this.e = false;
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            fbk fbkVar = (fbk) it.next();
            long j = this.b;
            if (j >= 0) {
                fbkVar.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) fbkVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                fbkVar.d(this.f);
            }
            View view2 = (View) fbkVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
