package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum s49 implements y4a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA224_VALUE = 5;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final a5a internalValueMap = new qf5(9);
    private final int value;

    s49(int i) {
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
