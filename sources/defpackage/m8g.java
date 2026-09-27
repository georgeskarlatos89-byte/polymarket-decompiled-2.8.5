package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m8g {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ m8g[] $VALUES;
    public static final m8g PRODUCTION;
    public static final m8g QA;
    public static final m8g SANDBOX;
    private final String rawValue;

    static {
        m8g m8gVar = new m8g("QA", 0, "qa");
        QA = m8gVar;
        m8g m8gVar2 = new m8g("SANDBOX", 1, "sandbox");
        SANDBOX = m8gVar2;
        m8g m8gVar3 = new m8g("PRODUCTION", 2, "prod");
        PRODUCTION = m8gVar3;
        m8g[] m8gVarArr = {m8gVar, m8gVar2, m8gVar3};
        $VALUES = m8gVarArr;
        $ENTRIES = new wg7(m8gVarArr);
    }

    public m8g(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static m8g valueOf(String str) {
        return (m8g) Enum.valueOf(m8g.class, str);
    }

    public static m8g[] values() {
        return (m8g[]) $VALUES.clone();
    }
}
