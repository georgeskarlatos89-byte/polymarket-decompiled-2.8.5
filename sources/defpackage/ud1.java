package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ud1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ud1[] $VALUES;
    public static final ud1 Automatic;
    public static final ud1 Full;
    public static final ud1 Never;

    /* JADX WARN: Type inference failed for: r0v0, types: [ud1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ud1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ud1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Automatic", 0);
        Automatic = r0;
        ?? r1 = new Enum("Never", 1);
        Never = r1;
        ?? r2 = new Enum("Full", 2);
        Full = r2;
        ud1[] ud1VarArr = {r0, r1, r2};
        $VALUES = ud1VarArr;
        $ENTRIES = new wg7(ud1VarArr);
    }

    public static ud1 valueOf(String str) {
        return (ud1) Enum.valueOf(ud1.class, str);
    }

    public static ud1[] values() {
        return (ud1[]) $VALUES.clone();
    }
}
