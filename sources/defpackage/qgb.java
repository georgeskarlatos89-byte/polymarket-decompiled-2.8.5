package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qgb {
    private static final /* synthetic */ qgb[] $VALUES;
    public static final qgb DESTINATION;
    public static final qgb LABEL;
    public static final qgb PARAGRAPH;
    public static final qgb START_DEFINITION;
    public static final qgb START_TITLE;
    public static final qgb TITLE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qgb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qgb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qgb] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, qgb] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, qgb] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, qgb] */
    static {
        ?? r0 = new Enum("START_DEFINITION", 0);
        START_DEFINITION = r0;
        ?? r1 = new Enum("LABEL", 1);
        LABEL = r1;
        ?? r2 = new Enum("DESTINATION", 2);
        DESTINATION = r2;
        ?? r3 = new Enum("START_TITLE", 3);
        START_TITLE = r3;
        ?? r4 = new Enum("TITLE", 4);
        TITLE = r4;
        ?? r5 = new Enum("PARAGRAPH", 5);
        PARAGRAPH = r5;
        $VALUES = new qgb[]{r0, r1, r2, r3, r4, r5};
    }

    public static qgb valueOf(String str) {
        return (qgb) Enum.valueOf(qgb.class, str);
    }

    public static qgb[] values() {
        return (qgb[]) $VALUES.clone();
    }
}
