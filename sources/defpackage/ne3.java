package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ne3 extends pcj {
    public boolean a = false;
    public final ViewGroup b;

    public ne3(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.pcj, defpackage.fcj
    public final void a() {
        this.b.suppressLayout(false);
    }

    @Override // defpackage.pcj, defpackage.fcj
    public final void c() {
        this.b.suppressLayout(true);
    }

    @Override // defpackage.pcj, defpackage.fcj
    public final void d(gcj gcjVar) {
        this.b.suppressLayout(false);
        this.a = true;
    }

    @Override // defpackage.pcj, defpackage.fcj
    public final void e(gcj gcjVar) {
        if (!this.a) {
            this.b.suppressLayout(false);
        }
        gcjVar.B(this);
    }
}
