package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum uec implements pff {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int number_;

    uec(int i) {
        this.number_ = i;
    }

    @Override // defpackage.pff
    public final int a() {
        return this.number_;
    }
}
