package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum rna implements y4a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final a5a internalValueMap = new Object();
    private final int value;

    rna(int i) {
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
