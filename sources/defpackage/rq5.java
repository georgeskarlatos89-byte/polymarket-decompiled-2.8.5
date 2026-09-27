package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rq5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ rq5(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return m51.m(new StringBuilder("Failed to parse JSON list: '"), this.b, '\'');
            default:
                return m51.m(new StringBuilder("Failed to parse JSON map: '"), this.b, '\'');
        }
    }
}
