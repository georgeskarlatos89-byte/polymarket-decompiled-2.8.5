package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mbk {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ mbk[] $VALUES;
    public static final mbk Clickable;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mbk] */
    static {
        ?? r0 = new Enum("Clickable", 0);
        Clickable = r0;
        mbk[] mbkVarArr = {r0};
        $VALUES = mbkVarArr;
        $ENTRIES = new wg7(mbkVarArr);
    }

    public static mbk valueOf(String str) {
        return (mbk) Enum.valueOf(mbk.class, str);
    }

    public static mbk[] values() {
        return (mbk[]) $VALUES.clone();
    }
}
