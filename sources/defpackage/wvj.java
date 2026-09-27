package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class wvj extends UnsupportedOperationException {
    public final gw7 a;

    public wvj(gw7 gw7Var) {
        this.a = gw7Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
