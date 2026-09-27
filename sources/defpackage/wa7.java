package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class wa7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wa7[] $VALUES;
    public static final wa7 Confirm;
    public static final wa7 Continue;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wa7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wa7] */
    static {
        ?? r0 = new Enum("Continue", 0);
        Continue = r0;
        ?? r1 = new Enum("Confirm", 1);
        Confirm = r1;
        wa7[] wa7VarArr = {r0, r1};
        $VALUES = wa7VarArr;
        $ENTRIES = new wg7(wa7VarArr);
    }

    public static wa7 valueOf(String str) {
        return (wa7) Enum.valueOf(wa7.class, str);
    }

    public static wa7[] values() {
        return (wa7[]) $VALUES.clone();
    }
}
