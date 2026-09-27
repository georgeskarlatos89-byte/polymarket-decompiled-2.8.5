package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class sce {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sce[] $VALUES;
    public static final sce Always;
    public static final sce Automatic;
    public static final sce Never;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sce] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sce] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, sce] */
    static {
        ?? r0 = new Enum("Automatic", 0);
        Automatic = r0;
        ?? r1 = new Enum("Never", 1);
        Never = r1;
        ?? r2 = new Enum("Always", 2);
        Always = r2;
        sce[] sceVarArr = {r0, r1, r2};
        $VALUES = sceVarArr;
        $ENTRIES = new wg7(sceVarArr);
    }

    public static sce valueOf(String str) {
        return (sce) Enum.valueOf(sce.class, str);
    }

    public static sce[] values() {
        return (sce[]) $VALUES.clone();
    }
}
