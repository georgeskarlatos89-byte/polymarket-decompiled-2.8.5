package bo.app;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s1 implements Function0 {
    public final /* synthetic */ Throwable a;

    public s1(Throwable th) {
        this.a = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Child job of BrazeCoroutineScope got exception: " + this.a;
    }
}
