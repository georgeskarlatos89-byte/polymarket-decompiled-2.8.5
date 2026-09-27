package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cm9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ cm9[] $VALUES;
    public static final cm9 Initialized;
    public static final cm9 Updated;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cm9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, cm9] */
    static {
        ?? r0 = new Enum("Initialized", 0);
        Initialized = r0;
        ?? r1 = new Enum("Updated", 1);
        Updated = r1;
        cm9[] cm9VarArr = {r0, r1};
        $VALUES = cm9VarArr;
        $ENTRIES = new wg7(cm9VarArr);
    }

    public static cm9 valueOf(String str) {
        return (cm9) Enum.valueOf(cm9.class, str);
    }

    public static cm9[] values() {
        return (cm9[]) $VALUES.clone();
    }
}
