package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eu9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ eu9[] $VALUES;
    public static final eu9 No;
    public static final eu9 NotInitialized;
    public static final eu9 Yes;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eu9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eu9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, eu9] */
    static {
        ?? r0 = new Enum("Yes", 0);
        Yes = r0;
        ?? r1 = new Enum("No", 1);
        No = r1;
        ?? r2 = new Enum("NotInitialized", 2);
        NotInitialized = r2;
        eu9[] eu9VarArr = {r0, r1, r2};
        $VALUES = eu9VarArr;
        $ENTRIES = new wg7(eu9VarArr);
    }

    public static eu9 valueOf(String str) {
        return (eu9) Enum.valueOf(eu9.class, str);
    }

    public static eu9[] values() {
        return (eu9[]) $VALUES.clone();
    }
}
