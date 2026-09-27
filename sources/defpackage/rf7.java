package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rf7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ rf7[] $VALUES;
    public static final rf7 PostExit;
    public static final rf7 PreEnter;
    public static final rf7 Visible;

    /* JADX WARN: Type inference failed for: r0v0, types: [rf7, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rf7, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [rf7, java.lang.Enum] */
    static {
        ?? r0 = new Enum("PreEnter", 0);
        PreEnter = r0;
        ?? r1 = new Enum("Visible", 1);
        Visible = r1;
        ?? r2 = new Enum("PostExit", 2);
        PostExit = r2;
        rf7[] rf7VarArr = {r0, r1, r2};
        $VALUES = rf7VarArr;
        $ENTRIES = new wg7(rf7VarArr);
    }

    public static rf7 valueOf(String str) {
        return (rf7) Enum.valueOf(rf7.class, str);
    }

    public static rf7[] values() {
        return (rf7[]) $VALUES.clone();
    }
}
