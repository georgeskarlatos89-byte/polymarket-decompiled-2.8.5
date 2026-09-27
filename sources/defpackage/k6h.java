package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class k6h {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ k6h[] $VALUES;
    public static final k6h InputtingPrimaryField;
    public static final k6h InputtingRemainingFields;
    public static final k6h VerifyingEmail;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k6h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k6h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, k6h] */
    static {
        ?? r0 = new Enum("InputtingPrimaryField", 0);
        InputtingPrimaryField = r0;
        ?? r1 = new Enum("VerifyingEmail", 1);
        VerifyingEmail = r1;
        ?? r2 = new Enum("InputtingRemainingFields", 2);
        InputtingRemainingFields = r2;
        k6h[] k6hVarArr = {r0, r1, r2};
        $VALUES = k6hVarArr;
        $ENTRIES = new wg7(k6hVarArr);
    }

    public static k6h valueOf(String str) {
        return (k6h) Enum.valueOf(k6h.class, str);
    }

    public static k6h[] values() {
        return (k6h[]) $VALUES.clone();
    }
}
