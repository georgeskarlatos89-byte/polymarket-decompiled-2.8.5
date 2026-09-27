package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class by2 {
    private static final /* synthetic */ by2[] $VALUES;
    public static final by2 CLOSING;
    public static final by2 CONFIGURED;
    public static final by2 INITIALIZED;
    public static final by2 OPENED;
    public static final by2 OPENING;
    public static final by2 OPENING_WITH_ERROR;
    public static final by2 PENDING_OPEN;
    public static final by2 RELEASED;
    public static final by2 RELEASING;
    public static final by2 REOPENING;
    public static final by2 REOPENING_QUIRK;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, by2] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, by2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, by2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, by2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, by2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, by2] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, by2] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, by2] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, by2] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, by2] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, by2] */
    static {
        ?? r0 = new Enum("RELEASED", 0);
        RELEASED = r0;
        ?? r1 = new Enum("RELEASING", 1);
        RELEASING = r1;
        ?? r2 = new Enum("INITIALIZED", 2);
        INITIALIZED = r2;
        ?? r3 = new Enum("PENDING_OPEN", 3);
        PENDING_OPEN = r3;
        ?? r4 = new Enum("OPENING_WITH_ERROR", 4);
        OPENING_WITH_ERROR = r4;
        ?? r5 = new Enum("CLOSING", 5);
        CLOSING = r5;
        ?? r6 = new Enum("REOPENING_QUIRK", 6);
        REOPENING_QUIRK = r6;
        ?? r7 = new Enum("REOPENING", 7);
        REOPENING = r7;
        ?? r8 = new Enum("OPENING", 8);
        OPENING = r8;
        ?? r9 = new Enum("OPENED", 9);
        OPENED = r9;
        ?? r10 = new Enum("CONFIGURED", 10);
        CONFIGURED = r10;
        $VALUES = new by2[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10};
    }

    public static by2 valueOf(String str) {
        return (by2) Enum.valueOf(by2.class, str);
    }

    public static by2[] values() {
        return (by2[]) $VALUES.clone();
    }
}
