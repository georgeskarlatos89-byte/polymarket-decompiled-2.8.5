package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class hn5 implements jgf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hn5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kgf
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new kn5(((in5) obj).b);
            case 1:
                return new jn5(((in5) obj).b);
            default:
                return new jw8((fyg) ((fyg) obj).c, 25);
        }
    }
}
