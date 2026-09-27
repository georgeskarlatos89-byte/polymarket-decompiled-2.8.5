package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class j59 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ j59[] $VALUES;
    public static final j59 Avatar;
    public static final j59 Icon;
    public static final j59 Others;
    public static final j59 OwnerName;
    public static final j59 Subtitle;
    public static final j59 Title;
    public static final j59 Trailing;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j59] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j59] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j59] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j59] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j59] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, j59] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, j59] */
    static {
        ?? r0 = new Enum("Icon", 0);
        Icon = r0;
        ?? r1 = new Enum("Title", 1);
        Title = r1;
        ?? r2 = new Enum("Subtitle", 2);
        Subtitle = r2;
        ?? r3 = new Enum("Avatar", 3);
        Avatar = r3;
        ?? r4 = new Enum("OwnerName", 4);
        OwnerName = r4;
        ?? r5 = new Enum("Others", 5);
        Others = r5;
        ?? r6 = new Enum("Trailing", 6);
        Trailing = r6;
        j59[] j59VarArr = {r0, r1, r2, r3, r4, r5, r6};
        $VALUES = j59VarArr;
        $ENTRIES = new wg7(j59VarArr);
    }

    public static j59 valueOf(String str) {
        return (j59) Enum.valueOf(j59.class, str);
    }

    public static j59[] values() {
        return (j59[]) $VALUES.clone();
    }
}
