package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class tu4 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tu4[] $VALUES;
    public static final tu4 InformCancellation;
    public static final tu4 ModifyPaymentDetails;
    public static final tu4 None;

    /* JADX WARN: Type inference failed for: r0v0, types: [tu4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [tu4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [tu4, java.lang.Enum] */
    static {
        ?? r0 = new Enum("InformCancellation", 0);
        InformCancellation = r0;
        ?? r1 = new Enum("ModifyPaymentDetails", 1);
        ModifyPaymentDetails = r1;
        ?? r2 = new Enum("None", 2);
        None = r2;
        tu4[] tu4VarArr = {r0, r1, r2};
        $VALUES = tu4VarArr;
        $ENTRIES = new wg7(tu4VarArr);
    }

    public static tu4 valueOf(String str) {
        return (tu4) Enum.valueOf(tu4.class, str);
    }

    public static tu4[] values() {
        return (tu4[]) $VALUES.clone();
    }
}
