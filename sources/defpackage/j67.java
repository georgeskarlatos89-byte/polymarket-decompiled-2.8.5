package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class j67 extends i67 {
    @Override // defpackage.h67
    public void a(hii hiiVar, hii hiiVar2, Window window, View view, boolean z, boolean z2) {
        ndj ndjVar;
        hiiVar.getClass();
        hiiVar2.getClass();
        window.getClass();
        view.getClass();
        boolean z3 = false;
        w6n.c(window, false);
        window.setStatusBarColor(hiiVar.a(z));
        window.setNavigationBarColor(hiiVar2.a(z2));
        window.setStatusBarContrastEnforced(false);
        if (hiiVar2.c == 0) {
            z3 = true;
        }
        window.setNavigationBarContrastEnforced(z3);
        evf evfVar = new evf(view);
        if (Build.VERSION.SDK_INT >= 35) {
            ndjVar = new ndj(window, evfVar);
        } else {
            ndjVar = new ndj(window, evfVar);
        }
        ndjVar.j(!z);
        ndjVar.i(!z2);
    }
}
