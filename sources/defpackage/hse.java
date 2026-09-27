package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hse {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ hse[] $VALUES;
    public static final hse Final;
    public static final hse Initial;
    public static final hse Main;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hse] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hse] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, hse] */
    static {
        ?? r0 = new Enum("Initial", 0);
        Initial = r0;
        ?? r1 = new Enum("Main", 1);
        Main = r1;
        ?? r2 = new Enum("Final", 2);
        Final = r2;
        hse[] hseVarArr = {r0, r1, r2};
        $VALUES = hseVarArr;
        $ENTRIES = new wg7(hseVarArr);
    }

    public static hse valueOf(String str) {
        return (hse) Enum.valueOf(hse.class, str);
    }

    public static hse[] values() {
        return (hse[]) $VALUES.clone();
    }
}
