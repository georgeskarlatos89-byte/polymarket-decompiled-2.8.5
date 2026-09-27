package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum fy7 {
    YEAR(4),
    MONTH(7),
    DAY(10),
    HOUR(13),
    MINUTE(16),
    SECOND(19),
    NANO(20),
    ZONE_OFFSET(17);

    private final int requiredLength;

    fy7(int i) {
        this.requiredLength = i;
    }

    public final int a() {
        return this.requiredLength;
    }
}
