package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qra {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qra[] $VALUES;
    public static final qra API_VERSION;
    public static final qra COMPILER_VERSION;
    public static final qra LANGUAGE_VERSION;
    public static final qra UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [qra, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qra, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qra, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [qra, java.lang.Enum] */
    static {
        ?? r0 = new Enum("LANGUAGE_VERSION", 0);
        LANGUAGE_VERSION = r0;
        ?? r1 = new Enum("COMPILER_VERSION", 1);
        COMPILER_VERSION = r1;
        ?? r2 = new Enum("API_VERSION", 2);
        API_VERSION = r2;
        ?? r3 = new Enum("UNKNOWN", 3);
        UNKNOWN = r3;
        qra[] qraVarArr = {r0, r1, r2, r3};
        $VALUES = qraVarArr;
        $ENTRIES = new wg7(qraVarArr);
    }

    public static qra valueOf(String str) {
        return (qra) Enum.valueOf(qra.class, str);
    }

    public static qra[] values() {
        return (qra[]) $VALUES.clone();
    }
}
