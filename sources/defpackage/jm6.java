package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jm6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ jm6[] $VALUES;
    public static final jm6 ERROR;
    public static final jm6 HIDDEN;
    public static final jm6 WARNING;

    /* JADX WARN: Type inference failed for: r0v0, types: [jm6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [jm6, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [jm6, java.lang.Enum] */
    static {
        ?? r0 = new Enum("WARNING", 0);
        WARNING = r0;
        ?? r1 = new Enum("ERROR", 1);
        ERROR = r1;
        ?? r2 = new Enum("HIDDEN", 2);
        HIDDEN = r2;
        jm6[] jm6VarArr = {r0, r1, r2};
        $VALUES = jm6VarArr;
        $ENTRIES = new wg7(jm6VarArr);
    }

    public static jm6 valueOf(String str) {
        return (jm6) Enum.valueOf(jm6.class, str);
    }

    public static jm6[] values() {
        return (jm6[]) $VALUES.clone();
    }
}
