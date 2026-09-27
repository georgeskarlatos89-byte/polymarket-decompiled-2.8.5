package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class h67 {
    public void a(hii hiiVar, hii hiiVar2, Window window, View view, boolean z, boolean z2) {
        int i;
        int i2;
        ndj ndjVar;
        hiiVar.getClass();
        hiiVar2.getClass();
        window.getClass();
        view.getClass();
        w6n.c(window, false);
        if (z) {
            i = hiiVar.b;
        } else {
            i = hiiVar.a;
        }
        window.setStatusBarColor(i);
        if (z2) {
            i2 = hiiVar2.b;
        } else {
            i2 = hiiVar2.a;
        }
        window.setNavigationBarColor(i2);
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
