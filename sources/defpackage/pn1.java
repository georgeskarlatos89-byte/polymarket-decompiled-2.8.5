package defpackage;

import bo.app.v1;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class pn1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public /* synthetic */ pn1(String str, double d, double d2, int i) {
        this.a = i;
        this.b = str;
        this.c = d;
        this.d = d2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        double d = this.d;
        double d2 = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return "Failed to set custom location attribute with key '" + str + "' and latitude '" + d2 + "' and longitude '" + d + '\'';
            default:
                return v1.b(str, d2, d);
        }
    }
}
