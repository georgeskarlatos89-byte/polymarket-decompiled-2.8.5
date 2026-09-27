package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class yaj {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ yaj[] $VALUES;
    public static final yaj Deposit;
    public static final yaj Withdraw;

    /* JADX WARN: Type inference failed for: r0v0, types: [yaj, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [yaj, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Deposit", 0);
        Deposit = r0;
        ?? r1 = new Enum("Withdraw", 1);
        Withdraw = r1;
        yaj[] yajVarArr = {r0, r1};
        $VALUES = yajVarArr;
        $ENTRIES = new wg7(yajVarArr);
    }

    public static yaj valueOf(String str) {
        return (yaj) Enum.valueOf(yaj.class, str);
    }

    public static yaj[] values() {
        return (yaj[]) $VALUES.clone();
    }
}
