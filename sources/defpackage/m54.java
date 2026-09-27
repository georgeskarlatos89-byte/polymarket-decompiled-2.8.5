package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m54 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ m54[] $VALUES;
    public static final m54 INFO_TEXT;
    public static final m54 X_BUTTON;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m54] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m54] */
    static {
        ?? r0 = new Enum("INFO_TEXT", 0);
        INFO_TEXT = r0;
        ?? r1 = new Enum("X_BUTTON", 1);
        X_BUTTON = r1;
        m54[] m54VarArr = {r0, r1};
        $VALUES = m54VarArr;
        $ENTRIES = new wg7(m54VarArr);
    }

    public static m54 valueOf(String str) {
        return (m54) Enum.valueOf(m54.class, str);
    }

    public static m54[] values() {
        return (m54[]) $VALUES.clone();
    }
}
