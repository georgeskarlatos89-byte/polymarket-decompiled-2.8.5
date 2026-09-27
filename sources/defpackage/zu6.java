package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zu6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zu6[] $VALUES;
    public static final zu6 AUTO_DISMISS;
    public static final zu6 MANUAL;
    public static final zu6 SWIPE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zu6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zu6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zu6] */
    static {
        ?? r0 = new Enum("AUTO_DISMISS", 0);
        AUTO_DISMISS = r0;
        ?? r1 = new Enum("SWIPE", 1);
        SWIPE = r1;
        ?? r2 = new Enum("MANUAL", 2);
        MANUAL = r2;
        zu6[] zu6VarArr = {r0, r1, r2};
        $VALUES = zu6VarArr;
        $ENTRIES = new wg7(zu6VarArr);
    }

    public static zu6 valueOf(String str) {
        return (zu6) Enum.valueOf(zu6.class, str);
    }

    public static zu6[] values() {
        return (zu6[]) $VALUES.clone();
    }
}
