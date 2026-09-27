package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bs8 implements yj9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ bs8[] $VALUES;
    public static final as8 Companion;
    public static final bs8 FEMALE;
    public static final bs8 MALE;
    public static final bs8 NOT_APPLICABLE;
    public static final bs8 OTHER;
    public static final bs8 PREFER_NOT_TO_SAY;
    public static final bs8 UNKNOWN;
    private final String value;

    /* JADX WARN: Type inference failed for: r0v2, types: [as8, java.lang.Object] */
    static {
        bs8 bs8Var = new bs8("MALE", 0, "m");
        MALE = bs8Var;
        bs8 bs8Var2 = new bs8("FEMALE", 1, "f");
        FEMALE = bs8Var2;
        bs8 bs8Var3 = new bs8("OTHER", 2, "o");
        OTHER = bs8Var3;
        bs8 bs8Var4 = new bs8("UNKNOWN", 3, "u");
        UNKNOWN = bs8Var4;
        bs8 bs8Var5 = new bs8("NOT_APPLICABLE", 4, "n");
        NOT_APPLICABLE = bs8Var5;
        bs8 bs8Var6 = new bs8("PREFER_NOT_TO_SAY", 5, "p");
        PREFER_NOT_TO_SAY = bs8Var6;
        bs8[] bs8VarArr = {bs8Var, bs8Var2, bs8Var3, bs8Var4, bs8Var5, bs8Var6};
        $VALUES = bs8VarArr;
        $ENTRIES = new wg7(bs8VarArr);
        Companion = new Object();
    }

    public bs8(String str, int i, String str2) {
        this.value = str2;
    }

    public static bs8 valueOf(String str) {
        return (bs8) Enum.valueOf(bs8.class, str);
    }

    public static bs8[] values() {
        return (bs8[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }

    @Override // defpackage.yj9
    public final Object forJsonPut() {
        return this.value;
    }
}
