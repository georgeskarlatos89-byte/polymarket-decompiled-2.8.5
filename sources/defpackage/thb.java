package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class thb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ thb[] $VALUES;
    public static final thb Full;
    public static final thb Inline;
    public static final thb InlineOptional;
    public static final thb InlineOptionalWithPhoneFirst;
    public static final thb InlineWithDefaultOptIn;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, thb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, thb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, thb] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, thb] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, thb] */
    static {
        ?? r0 = new Enum("InlineOptionalWithPhoneFirst", 0);
        InlineOptionalWithPhoneFirst = r0;
        ?? r1 = new Enum("InlineOptional", 1);
        InlineOptional = r1;
        ?? r2 = new Enum("Inline", 2);
        Inline = r2;
        ?? r3 = new Enum("InlineWithDefaultOptIn", 3);
        InlineWithDefaultOptIn = r3;
        ?? r4 = new Enum("Full", 4);
        Full = r4;
        thb[] thbVarArr = {r0, r1, r2, r3, r4};
        $VALUES = thbVarArr;
        $ENTRIES = new wg7(thbVarArr);
    }

    public static thb valueOf(String str) {
        return (thb) Enum.valueOf(thb.class, str);
    }

    public static thb[] values() {
        return (thb[]) $VALUES.clone();
    }
}
