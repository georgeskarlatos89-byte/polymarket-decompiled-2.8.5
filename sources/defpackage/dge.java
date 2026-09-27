package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class dge {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ dge[] $VALUES;
    public static final dge Complete;
    public static final dge Custom;

    /* JADX WARN: Type inference failed for: r0v0, types: [dge, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dge, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Complete", 0);
        Complete = r0;
        ?? r1 = new Enum("Custom", 1);
        Custom = r1;
        dge[] dgeVarArr = {r0, r1};
        $VALUES = dgeVarArr;
        $ENTRIES = new wg7(dgeVarArr);
    }

    public static dge valueOf(String str) {
        return (dge) Enum.valueOf(dge.class, str);
    }

    public static dge[] values() {
        return (dge[]) $VALUES.clone();
    }
}
