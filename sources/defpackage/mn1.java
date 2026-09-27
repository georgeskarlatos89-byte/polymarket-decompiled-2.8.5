package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class mn1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bcd b;

    public /* synthetic */ mn1(bcd bcdVar, int i) {
        this.a = i;
        this.b = bcdVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        bcd bcdVar = this.b;
        switch (i) {
            case 0:
                return "Failed to set push notification subscription to: " + bcdVar;
            default:
                return "Failed to set email notification subscription to: " + bcdVar;
        }
    }
}
