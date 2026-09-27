package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class wi2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wi2[] $VALUES;
    public static final wi2 Card;
    public static final wi2 Line;

    /* JADX WARN: Type inference failed for: r0v0, types: [wi2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [wi2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Card", 0);
        Card = r0;
        ?? r1 = new Enum("Line", 1);
        Line = r1;
        wi2[] wi2VarArr = {r0, r1};
        $VALUES = wi2VarArr;
        $ENTRIES = new wg7(wi2VarArr);
    }

    public static wi2 valueOf(String str) {
        return (wi2) Enum.valueOf(wi2.class, str);
    }

    public static wi2[] values() {
        return (wi2[]) $VALUES.clone();
    }
}
