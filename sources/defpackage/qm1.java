package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qm1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qm1[] $VALUES;
    public static final qm1 CONTENT_CARDS_SYNC;
    public static final qm1 OTHER;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qm1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qm1] */
    static {
        ?? r0 = new Enum("CONTENT_CARDS_SYNC", 0);
        CONTENT_CARDS_SYNC = r0;
        ?? r1 = new Enum("OTHER", 1);
        OTHER = r1;
        qm1[] qm1VarArr = {r0, r1};
        $VALUES = qm1VarArr;
        $ENTRIES = new wg7(qm1VarArr);
    }

    public static qm1 valueOf(String str) {
        return (qm1) Enum.valueOf(qm1.class, str);
    }

    public static qm1[] values() {
        return (qm1[]) $VALUES.clone();
    }
}
