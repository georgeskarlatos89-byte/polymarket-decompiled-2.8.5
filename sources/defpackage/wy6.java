package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wy6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wy6[] $VALUES;
    public static final wy6 No;
    public static final wy6 NotInitialized;
    public static final wy6 Yes;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wy6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wy6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wy6] */
    static {
        ?? r0 = new Enum("Yes", 0);
        Yes = r0;
        ?? r1 = new Enum("No", 1);
        No = r1;
        ?? r2 = new Enum("NotInitialized", 2);
        NotInitialized = r2;
        wy6[] wy6VarArr = {r0, r1, r2};
        $VALUES = wy6VarArr;
        $ENTRIES = new wg7(wy6VarArr);
    }

    public static wy6 valueOf(String str) {
        return (wy6) Enum.valueOf(wy6.class, str);
    }

    public static wy6[] values() {
        return (wy6[]) $VALUES.clone();
    }
}
