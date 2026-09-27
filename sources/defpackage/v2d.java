package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class v2d extends fq8 implements Function1 {
    public static final v2d f = new fq8(1, ww4.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) d55.l(applicationContext, ConnectivityManager.class);
        if (connectivityManager != null && d55.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new vw4(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return uw4.a;
    }
}
