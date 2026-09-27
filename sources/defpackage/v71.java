package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class v71 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ v71(Boolean bool, String str, int i) {
        this.a = i;
        this.b = bool;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        String str = this.c;
        Boolean bool = this.b;
        switch (i) {
            case 0:
                return "Added impression:" + bool.booleanValue() + " for banner:" + str + " from SharedPreferences";
            default:
                return "Added impression:" + bool.booleanValue() + " for feature flag:" + str + " from SharedPreferences";
        }
    }
}
