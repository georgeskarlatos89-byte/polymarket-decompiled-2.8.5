package defpackage;

import com.braze.BrazeActivityLifecycleCallbackListener;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class ol1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BrazeActivityLifecycleCallbackListener b;

    public /* synthetic */ ol1(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener, int i) {
        this.a = i;
        this.b = brazeActivityLifecycleCallbackListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener = this.b;
        switch (i) {
            case 0:
                return "Skipping unregisterInAppMessageManager in onActivityPaused. shouldPersistWebView=" + brazeActivityLifecycleCallbackListener.c + " (null means async load incomplete, defaulting to persist)";
            case 1:
                return "BrazeActivityLifecycleCallbackListener using in-app messaging blocklist: " + brazeActivityLifecycleCallbackListener.a;
            case 2:
                return "BrazeActivityLifecycleCallbackListener using session handling blocklist: " + brazeActivityLifecycleCallbackListener.b;
            default:
                return "Async load of shouldPersistWebView completed: " + brazeActivityLifecycleCallbackListener.c;
        }
    }
}
