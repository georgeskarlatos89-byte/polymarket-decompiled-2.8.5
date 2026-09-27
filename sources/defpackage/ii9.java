package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ii9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ii9[] $VALUES;
    public static final ii9 Content;
    public static final ii9 Error;
    public static final ii9 Loading;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ii9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ii9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ii9] */
    static {
        ?? r0 = new Enum("Loading", 0);
        Loading = r0;
        ?? r1 = new Enum("Error", 1);
        Error = r1;
        ?? r2 = new Enum("Content", 2);
        Content = r2;
        ii9[] ii9VarArr = {r0, r1, r2};
        $VALUES = ii9VarArr;
        $ENTRIES = new wg7(ii9VarArr);
    }

    public static ii9 valueOf(String str) {
        return (ii9) Enum.valueOf(ii9.class, str);
    }

    public static ii9[] values() {
        return (ii9[]) $VALUES.clone();
    }
}
