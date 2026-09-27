package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ycd {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ycd[] $VALUES;
    public static final ycd FORCE_FLEXIBILITY;
    public static final ycd NOT_NULL;
    public static final ycd NULLABLE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ycd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ycd] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ycd] */
    static {
        ?? r0 = new Enum("FORCE_FLEXIBILITY", 0);
        FORCE_FLEXIBILITY = r0;
        ?? r1 = new Enum("NULLABLE", 1);
        NULLABLE = r1;
        ?? r2 = new Enum("NOT_NULL", 2);
        NOT_NULL = r2;
        ycd[] ycdVarArr = {r0, r1, r2};
        $VALUES = ycdVarArr;
        $ENTRIES = new wg7(ycdVarArr);
    }

    public static ycd valueOf(String str) {
        return (ycd) Enum.valueOf(ycd.class, str);
    }

    public static ycd[] values() {
        return (ycd[]) $VALUES.clone();
    }
}
