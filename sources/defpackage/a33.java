package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a33 implements b33 {
    public final /* synthetic */ int a;
    public final String b;

    public a33(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                str.getClass();
                this.b = str;
                return;
            case 2:
                this.b = str;
                return;
            default:
                str.getClass();
                this.b = str;
                return;
        }
    }

    @Override // defpackage.b33
    public final String b() {
        int i = this.a;
        return this.b;
    }

    @Override // defpackage.fp
    public final String c() {
        switch (this.a) {
            case 0:
                return "elements.captcha.passive.execute";
            case 1:
                return "elements.captcha.passive.init";
            default:
                return "elements.captcha.passive.success";
        }
    }
}
