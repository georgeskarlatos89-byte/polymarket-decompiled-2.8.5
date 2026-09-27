package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class are {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ are[] $VALUES;
    public static final are Inline;
    public static final are Stacked;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, are] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, are] */
    static {
        ?? r0 = new Enum("Stacked", 0);
        Stacked = r0;
        ?? r1 = new Enum("Inline", 1);
        Inline = r1;
        are[] areVarArr = {r0, r1};
        $VALUES = areVarArr;
        $ENTRIES = new wg7(areVarArr);
    }

    public static are valueOf(String str) {
        return (are) Enum.valueOf(are.class, str);
    }

    public static are[] values() {
        return (are[]) $VALUES.clone();
    }
}
