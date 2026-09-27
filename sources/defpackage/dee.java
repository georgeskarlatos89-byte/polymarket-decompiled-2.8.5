package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class dee {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ dee[] $VALUES;
    public static final dee Automatic;
    public static final dee Never;
    public static final dee WalletButtonHidden;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dee] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dee] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, dee] */
    static {
        ?? r0 = new Enum("Automatic", 0);
        Automatic = r0;
        ?? r1 = new Enum("Never", 1);
        Never = r1;
        ?? r2 = new Enum("WalletButtonHidden", 2);
        WalletButtonHidden = r2;
        dee[] deeVarArr = {r0, r1, r2};
        $VALUES = deeVarArr;
        $ENTRIES = new wg7(deeVarArr);
    }

    public static dee valueOf(String str) {
        return (dee) Enum.valueOf(dee.class, str);
    }

    public static dee[] values() {
        return (dee[]) $VALUES.clone();
    }
}
