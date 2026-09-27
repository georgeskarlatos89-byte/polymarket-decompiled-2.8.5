package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum vec implements pff {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int number_;

    vec(int i) {
        this.number_ = i;
    }

    @Override // defpackage.pff
    public final int a() {
        return this.number_;
    }
}
