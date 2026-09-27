package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum u2a {
    NONE("none"),
    TRANSFER_FULL("xfer-full"),
    TRANSFER_CHANGES("xfer-changes");

    private final String stringValue;

    u2a(String str) {
        this.stringValue = str;
    }

    public final String a() {
        return this.stringValue;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.stringValue;
    }
}
