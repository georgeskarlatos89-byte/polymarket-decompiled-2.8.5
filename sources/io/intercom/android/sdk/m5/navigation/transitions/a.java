package io.intercom.android.sdk.m5.navigation.transitions;

import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int a;
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                a = EnterTransitionStyle.SLIDE_IN_LEFT.a(num.intValue());
                break;
            case 1:
                a = EnterTransitionStyle.SLIDE_IN_RIGHT.a(num.intValue());
                break;
            case 2:
                a = EnterTransitionStyle.SLIDE_UP.a(num.intValue());
                break;
            case 3:
                a = ExitTransitionStyle.SLIDE_DOWN.a(num.intValue());
                break;
            case 4:
                a = ExitTransitionStyle.SLIDE_OUT_LEFT.a(num.intValue());
                break;
            default:
                a = ExitTransitionStyle.SLIDE_OUT_RIGHT.a(num.intValue());
                break;
        }
        return Integer.valueOf(a);
    }
}
