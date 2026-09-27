package defpackage;

import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y9n implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SharedPrefManager b;

    public /* synthetic */ y9n(SharedPrefManager sharedPrefManager, int i) {
        this.a = i;
        this.b = sharedPrefManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return this.b.getMlSdkInstanceId();
            case 1:
                return this.b.getMlSdkInstanceId();
            case 2:
                return this.b.getMlSdkInstanceId();
            default:
                return this.b.getMlSdkInstanceId();
        }
    }
}
