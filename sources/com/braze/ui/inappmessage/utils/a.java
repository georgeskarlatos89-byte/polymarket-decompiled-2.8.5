package com.braze.ui.inappmessage.utils;

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
                return BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2.h();
            case 1:
                return BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.i();
            default:
                return BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.h();
        }
    }
}
