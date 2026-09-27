package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kj6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kj6[] $VALUES;
    public static final jj6 Companion;
    public static final kj6 DROP;
    public static final kj6 QUEUE;
    private final String value;

    /* JADX WARN: Type inference failed for: r0v2, types: [jj6, java.lang.Object] */
    static {
        kj6 kj6Var = new kj6("DROP", 0, "DROP");
        DROP = kj6Var;
        kj6 kj6Var2 = new kj6("QUEUE", 1, "QUEUE");
        QUEUE = kj6Var2;
        kj6[] kj6VarArr = {kj6Var, kj6Var2};
        $VALUES = kj6VarArr;
        $ENTRIES = new wg7(kj6VarArr);
        Companion = new Object();
    }

    public kj6(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static kj6 valueOf(String str) {
        return (kj6) Enum.valueOf(kj6.class, str);
    }

    public static kj6[] values() {
        return (kj6[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
