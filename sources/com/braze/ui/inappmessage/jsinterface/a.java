package com.braze.ui.inappmessage.jsinterface;

import com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return InAppMessageJavascriptInterface$requestPushPermission$1.h();
            default:
                return InAppMessageJavascriptInterface$requestPushPermission$1.AnonymousClass1.h();
        }
    }
}
