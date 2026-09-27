package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class wqf {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wqf[] $VALUES;
    public static final wqf Completed;
    public static final wqf Loading;
    public static final wqf ShowingLottieSuccess;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wqf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wqf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wqf] */
    static {
        ?? r0 = new Enum("Loading", 0);
        Loading = r0;
        ?? r1 = new Enum("ShowingLottieSuccess", 1);
        ShowingLottieSuccess = r1;
        ?? r2 = new Enum("Completed", 2);
        Completed = r2;
        wqf[] wqfVarArr = {r0, r1, r2};
        $VALUES = wqfVarArr;
        $ENTRIES = new wg7(wqfVarArr);
    }

    public static wqf valueOf(String str) {
        return (wqf) Enum.valueOf(wqf.class, str);
    }

    public static wqf[] values() {
        return (wqf[]) $VALUES.clone();
    }
}
