package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class pb0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ pb0[] $VALUES;
    public static final pb0 JAVA;
    public static final pb0 KOTLIN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pb0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pb0] */
    static {
        ?? r0 = new Enum("JAVA", 0);
        JAVA = r0;
        ?? r1 = new Enum("KOTLIN", 1);
        KOTLIN = r1;
        pb0[] pb0VarArr = {r0, r1};
        $VALUES = pb0VarArr;
        $ENTRIES = new wg7(pb0VarArr);
    }

    public static pb0 valueOf(String str) {
        return (pb0) Enum.valueOf(pb0.class, str);
    }

    public static pb0[] values() {
        return (pb0[]) $VALUES.clone();
    }
}
