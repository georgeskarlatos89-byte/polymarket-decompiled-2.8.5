package defpackage;

import android.content.pm.PackageInfo;
import android.webkit.WebView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lik extends sd0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lik(String str, String str2, int i) {
        super(str, str2, 2);
        this.e = i;
    }

    @Override // defpackage.sd0
    public final boolean a() {
        switch (this.e) {
            case 0:
                if (!super.a()) {
                    return false;
                }
                WeakHashMap weakHashMap = jik.a;
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage == null || currentWebViewPackage.getLongVersionCode() < 636700000) {
                    return false;
                }
                return true;
            case 1:
                if (!super.a() || !mik.b("MULTI_PROCESS")) {
                    return false;
                }
                WeakHashMap weakHashMap2 = jik.a;
                if (mik.d.a()) {
                    return oik.a.getStatics().isMultiProcessEnabled();
                }
                throw mik.a();
            default:
                if (!mik.b("MULTI_PROFILE")) {
                    return false;
                }
                return super.a();
        }
    }
}
