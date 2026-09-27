package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class c98 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ c98[] $VALUES;
    public static final c98 FundingRequired;
    public static final c98 LoginRequired;

    /* JADX WARN: Type inference failed for: r0v0, types: [c98, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c98, java.lang.Enum] */
    static {
        ?? r0 = new Enum("LoginRequired", 0);
        LoginRequired = r0;
        ?? r1 = new Enum("FundingRequired", 1);
        FundingRequired = r1;
        c98[] c98VarArr = {r0, r1};
        $VALUES = c98VarArr;
        $ENTRIES = new wg7(c98VarArr);
    }

    public static c98 valueOf(String str) {
        return (c98) Enum.valueOf(c98.class, str);
    }

    public static c98[] values() {
        return (c98[]) $VALUES.clone();
    }
}
