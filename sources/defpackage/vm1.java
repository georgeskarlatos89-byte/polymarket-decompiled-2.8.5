package defpackage;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class vm1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ vm1(String str, int i, Bundle bundle) {
        this.a = i;
        this.b = str;
        this.c = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Bundle bundle = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return "Failed to parse string as long with key " + str + " and bundle: " + bundle;
            case 1:
                return "Failed to parse string with key " + str + " and bundle: " + bundle;
            case 2:
                return "Failed to parse string as boolean with key " + str + " and bundle: " + bundle;
            case 3:
                return "Failed to parse non blank string with key " + str + " and bundle: " + bundle;
            default:
                return "Failed to parse string as int with key " + str + " and bundle: " + bundle;
        }
    }
}
