package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f93 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ f93[] $VALUES;
    public static final f93 CAPTIONED_IMAGE;
    public static final f93 CONTROL;
    public static final e93 Companion;
    public static final f93 DEFAULT;
    public static final f93 IMAGE;
    public static final f93 SHORT_NEWS;
    public static final f93 TEXT_ANNOUNCEMENT;

    /* JADX WARN: Type inference failed for: r0v0, types: [f93, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, e93] */
    /* JADX WARN: Type inference failed for: r1v1, types: [f93, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [f93, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [f93, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [f93, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [f93, java.lang.Enum] */
    static {
        ?? r0 = new Enum("IMAGE", 0);
        IMAGE = r0;
        ?? r1 = new Enum("CAPTIONED_IMAGE", 1);
        CAPTIONED_IMAGE = r1;
        ?? r2 = new Enum("DEFAULT", 2);
        DEFAULT = r2;
        ?? r3 = new Enum("SHORT_NEWS", 3);
        SHORT_NEWS = r3;
        ?? r4 = new Enum("TEXT_ANNOUNCEMENT", 4);
        TEXT_ANNOUNCEMENT = r4;
        ?? r5 = new Enum("CONTROL", 5);
        CONTROL = r5;
        f93[] f93VarArr = {r0, r1, r2, r3, r4, r5};
        $VALUES = f93VarArr;
        $ENTRIES = new wg7(f93VarArr);
        Companion = new Object();
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static f93 valueOf(String str) {
        return (f93) Enum.valueOf(f93.class, str);
    }

    public static f93[] values() {
        return (f93[]) $VALUES.clone();
    }
}
