package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tl9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tl9[] $VALUES;
    public static final tl9 ADD;
    public static final tl9 APPEND;
    public static final tl9 CLEAR_ALL;
    public static final tl9 POST_INSERT;
    public static final tl9 PREPEND;
    public static final tl9 PRE_INSERT;
    public static final tl9 REMOVE;
    public static final tl9 SET;
    public static final tl9 SET_ONCE;
    public static final tl9 UNSET;
    private final String operationType;

    static {
        tl9 tl9Var = new tl9("SET", 0, "$set");
        SET = tl9Var;
        tl9 tl9Var2 = new tl9("SET_ONCE", 1, "$setOnce");
        SET_ONCE = tl9Var2;
        tl9 tl9Var3 = new tl9("ADD", 2, "$add");
        ADD = tl9Var3;
        tl9 tl9Var4 = new tl9("APPEND", 3, "$append");
        APPEND = tl9Var4;
        tl9 tl9Var5 = new tl9("CLEAR_ALL", 4, "$clearAll");
        CLEAR_ALL = tl9Var5;
        tl9 tl9Var6 = new tl9("PREPEND", 5, "$prepend");
        PREPEND = tl9Var6;
        tl9 tl9Var7 = new tl9("UNSET", 6, "$unset");
        UNSET = tl9Var7;
        tl9 tl9Var8 = new tl9("PRE_INSERT", 7, "$preInsert");
        PRE_INSERT = tl9Var8;
        tl9 tl9Var9 = new tl9("POST_INSERT", 8, "$postInsert");
        POST_INSERT = tl9Var9;
        tl9 tl9Var10 = new tl9("REMOVE", 9, "$remove");
        REMOVE = tl9Var10;
        tl9[] tl9VarArr = {tl9Var, tl9Var2, tl9Var3, tl9Var4, tl9Var5, tl9Var6, tl9Var7, tl9Var8, tl9Var9, tl9Var10};
        $VALUES = tl9VarArr;
        $ENTRIES = new wg7(tl9VarArr);
    }

    public tl9(String str, int i, String str2) {
        this.operationType = str2;
    }

    public static tl9 valueOf(String str) {
        return (tl9) Enum.valueOf(tl9.class, str);
    }

    public static tl9[] values() {
        return (tl9[]) $VALUES.clone();
    }

    public final String a() {
        return this.operationType;
    }
}
