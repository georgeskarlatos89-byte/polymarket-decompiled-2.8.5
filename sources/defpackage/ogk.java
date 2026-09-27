package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ogk {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ogk[] $VALUES;
    public static final ogk HIGH;
    public static final ogk LOW;
    public static final ogk MEDIUM;

    /* JADX WARN: Type inference failed for: r0v0, types: [ogk, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ogk, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ogk, java.lang.Enum] */
    static {
        ?? r0 = new Enum("LOW", 0);
        LOW = r0;
        ?? r1 = new Enum("MEDIUM", 1);
        MEDIUM = r1;
        ?? r2 = new Enum("HIGH", 2);
        HIGH = r2;
        ogk[] ogkVarArr = {r0, r1, r2};
        $VALUES = ogkVarArr;
        $ENTRIES = new wg7(ogkVarArr);
    }

    public static ogk valueOf(String str) {
        return (ogk) Enum.valueOf(ogk.class, str);
    }

    public static ogk[] values() {
        return (ogk[]) $VALUES.clone();
    }
}
