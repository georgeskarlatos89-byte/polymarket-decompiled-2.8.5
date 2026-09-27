package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gxa {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ gxa[] $VALUES;
    public static final gxa InLayoutBlock;
    public static final gxa InMeasureBlock;
    public static final gxa NotUsed;

    /* JADX WARN: Type inference failed for: r0v0, types: [gxa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gxa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [gxa, java.lang.Enum] */
    static {
        ?? r0 = new Enum("InMeasureBlock", 0);
        InMeasureBlock = r0;
        ?? r1 = new Enum("InLayoutBlock", 1);
        InLayoutBlock = r1;
        ?? r2 = new Enum("NotUsed", 2);
        NotUsed = r2;
        gxa[] gxaVarArr = {r0, r1, r2};
        $VALUES = gxaVarArr;
        $ENTRIES = new wg7(gxaVarArr);
    }

    public static gxa valueOf(String str) {
        return (gxa) Enum.valueOf(gxa.class, str);
    }

    public static gxa[] values() {
        return (gxa[]) $VALUES.clone();
    }
}
