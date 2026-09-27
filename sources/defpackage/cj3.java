package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class cj3 extends fj3 {
    public static final cj3 c = new cj3("CharMatcher.ascii()", 0);
    public static final cj3 d = new cj3("CharMatcher.none()", 1);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj3(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.dj3
    public int a(String str) {
        switch (this.b) {
            case 1:
                str.getClass();
                return 0;
            default:
                return super.a(str);
        }
    }

    @Override // defpackage.dj3
    public final boolean b(char c2) {
        switch (this.b) {
            case 0:
                if (c2 <= 127) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
