package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class do8 implements fcj {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public do8(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.fcj
    public final void e(gcj gcjVar) {
        gcjVar.B(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.fcj
    public final void f(gcj gcjVar) {
        gcjVar.B(this);
        gcjVar.a(this);
    }

    @Override // defpackage.fcj
    public final void a() {
    }

    @Override // defpackage.fcj
    public final void c() {
    }

    @Override // defpackage.fcj
    public final void d(gcj gcjVar) {
    }
}
