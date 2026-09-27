package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class g6f {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ g6f[] $VALUES;
    public static final g6f ASSERT;
    public static final g6f DEBUG;
    public static final g6f ERROR;
    public static final g6f INFO;
    public static final g6f VERBOSE;
    public static final g6f WARN;
    private final int level;

    static {
        g6f g6fVar = new g6f("VERBOSE", 0, 2);
        VERBOSE = g6fVar;
        g6f g6fVar2 = new g6f("DEBUG", 1, 3);
        DEBUG = g6fVar2;
        g6f g6fVar3 = new g6f("INFO", 2, 4);
        INFO = g6fVar3;
        g6f g6fVar4 = new g6f("WARN", 3, 5);
        WARN = g6fVar4;
        g6f g6fVar5 = new g6f("ERROR", 4, 6);
        ERROR = g6fVar5;
        g6f g6fVar6 = new g6f("ASSERT", 5, 7);
        ASSERT = g6fVar6;
        g6f[] g6fVarArr = {g6fVar, g6fVar2, g6fVar3, g6fVar4, g6fVar5, g6fVar6};
        $VALUES = g6fVarArr;
        $ENTRIES = new wg7(g6fVarArr);
    }

    public g6f(String str, int i, int i2) {
        this.level = i2;
    }

    public static g6f valueOf(String str) {
        return (g6f) Enum.valueOf(g6f.class, str);
    }

    public static g6f[] values() {
        return (g6f[]) $VALUES.clone();
    }

    public final int a() {
        return this.level;
    }
}
