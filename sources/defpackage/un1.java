package defpackage;

import android.webkit.ConsoleMessage;
import com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class un1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConsoleMessage b;

    public /* synthetic */ un1(ConsoleMessage consoleMessage, int i) {
        this.a = i;
        this.b = consoleMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ConsoleMessage consoleMessage = this.b;
        switch (i) {
            case 0:
                return BrazeWebViewActivity$createWebChromeClient$1.a(consoleMessage);
            default:
                return InAppMessageHtmlBaseView$messageWebView$6.e(consoleMessage);
        }
    }
}
