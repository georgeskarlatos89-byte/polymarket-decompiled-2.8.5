package defpackage;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class jd0 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jd0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 1:
                ((ag0) obj).I();
                return;
            case 2:
                ((x3c) obj).c();
                return;
            case 3:
                ((rhd) obj).a();
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
