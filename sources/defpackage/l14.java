package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class l14 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ l14[] $VALUES;
    public static final l14 READY;
    public static final l14 REQUIRES_BILLING_ADDRESS;
    public static final l14 REQUIRES_SHIPPING_ADDRESS;
    public static final l14 UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l14] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l14] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l14] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, l14] */
    static {
        ?? r0 = new Enum("READY", 0);
        READY = r0;
        ?? r1 = new Enum("REQUIRES_SHIPPING_ADDRESS", 1);
        REQUIRES_SHIPPING_ADDRESS = r1;
        ?? r2 = new Enum("REQUIRES_BILLING_ADDRESS", 2);
        REQUIRES_BILLING_ADDRESS = r2;
        ?? r3 = new Enum("UNKNOWN", 3);
        UNKNOWN = r3;
        l14[] l14VarArr = {r0, r1, r2, r3};
        $VALUES = l14VarArr;
        $ENTRIES = new wg7(l14VarArr);
    }

    public static l14 valueOf(String str) {
        return (l14) Enum.valueOf(l14.class, str);
    }

    public static l14[] values() {
        return (l14[]) $VALUES.clone();
    }
}
