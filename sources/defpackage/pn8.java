package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pn8 {
    private static final /* synthetic */ pn8[] $VALUES;
    public static final pn8 DETECT_FRAGMENT_REUSE;
    public static final pn8 DETECT_FRAGMENT_TAG_USAGE;
    public static final pn8 DETECT_RETAIN_INSTANCE_USAGE;
    public static final pn8 DETECT_SET_USER_VISIBLE_HINT;
    public static final pn8 DETECT_TARGET_FRAGMENT_USAGE;
    public static final pn8 DETECT_WRONG_FRAGMENT_CONTAINER;
    public static final pn8 DETECT_WRONG_NESTED_HIERARCHY;
    public static final pn8 PENALTY_DEATH;
    public static final pn8 PENALTY_LOG;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pn8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pn8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pn8] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, pn8] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, pn8] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, pn8] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, pn8] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, pn8] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, pn8] */
    static {
        ?? r0 = new Enum("PENALTY_LOG", 0);
        PENALTY_LOG = r0;
        ?? r1 = new Enum("PENALTY_DEATH", 1);
        PENALTY_DEATH = r1;
        ?? r2 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        DETECT_FRAGMENT_REUSE = r2;
        ?? r3 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        DETECT_FRAGMENT_TAG_USAGE = r3;
        ?? r4 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
        DETECT_WRONG_NESTED_HIERARCHY = r4;
        ?? r5 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
        DETECT_RETAIN_INSTANCE_USAGE = r5;
        ?? r6 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
        DETECT_SET_USER_VISIBLE_HINT = r6;
        ?? r7 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
        DETECT_TARGET_FRAGMENT_USAGE = r7;
        ?? r8 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        DETECT_WRONG_FRAGMENT_CONTAINER = r8;
        $VALUES = new pn8[]{r0, r1, r2, r3, r4, r5, r6, r7, r8};
    }

    public static pn8 valueOf(String str) {
        return (pn8) Enum.valueOf(pn8.class, str);
    }

    public static pn8[] values() {
        return (pn8[]) $VALUES.clone();
    }
}
