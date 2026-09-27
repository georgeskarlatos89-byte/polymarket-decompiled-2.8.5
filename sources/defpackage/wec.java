package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum wec implements pff {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int number_;

    wec(int i) {
        this.number_ = i;
    }

    @Override // defpackage.pff
    public final int a() {
        return this.number_;
    }
}
