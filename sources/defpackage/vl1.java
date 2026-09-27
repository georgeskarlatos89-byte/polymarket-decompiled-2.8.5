package defpackage;

import bo.app.v1;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class vl1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ vl1(int i, String str) {
        this.a = 0;
        this.c = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return "HTTP response code was " + i2 + ". File with url " + str + " could not be downloaded.";
            case 1:
                return "Failed to increment custom attribute " + str + " by " + i2 + '.';
            default:
                return v1.b(str, i2);
        }
    }

    public /* synthetic */ vl1(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }
}
