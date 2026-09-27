package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum wma implements y4a {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
    public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
    public static final int REMOTE_VALUE = 4;
    public static final int SYMMETRIC_VALUE = 1;
    public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
    private static final a5a internalValueMap = new ve5(12);
    private final int value;

    wma(int i) {
        this.value = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        dmk.v("Can't get the number of an unknown enum value.");
        return 0;
    }
}
