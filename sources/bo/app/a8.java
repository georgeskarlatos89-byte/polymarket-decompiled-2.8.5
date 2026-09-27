package bo.app;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a8 implements Function0 {
    public final /* synthetic */ String a;

    public a8(String str) {
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to create valid enum from string: " + this.a;
    }
}
