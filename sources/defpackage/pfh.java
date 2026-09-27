package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pfh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ pfh[] $VALUES;
    public static final pfh CARD_TOKEN;
    public static final pfh RISK_SDK;
    private final String rawValue;

    static {
        pfh pfhVar = new pfh("CARD_TOKEN", 0, "card_token");
        CARD_TOKEN = pfhVar;
        pfh pfhVar2 = new pfh("RISK_SDK", 1, "riskandroid");
        RISK_SDK = pfhVar2;
        pfh[] pfhVarArr = {pfhVar, pfhVar2};
        $VALUES = pfhVarArr;
        $ENTRIES = new wg7(pfhVarArr);
    }

    public pfh(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static pfh valueOf(String str) {
        return (pfh) Enum.valueOf(pfh.class, str);
    }

    public static pfh[] values() {
        return (pfh[]) $VALUES.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
