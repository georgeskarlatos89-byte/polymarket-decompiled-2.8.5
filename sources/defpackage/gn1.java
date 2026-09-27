package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gn1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ gn1[] $VALUES;
    public static final gn1 NOTIFICATION_DELETED;
    public static final gn1 NOTIFICATION_OPENED;
    public static final gn1 NOTIFICATION_RECEIVED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gn1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gn1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, gn1] */
    static {
        ?? r0 = new Enum("NOTIFICATION_RECEIVED", 0);
        NOTIFICATION_RECEIVED = r0;
        ?? r1 = new Enum("NOTIFICATION_DELETED", 1);
        NOTIFICATION_DELETED = r1;
        ?? r2 = new Enum("NOTIFICATION_OPENED", 2);
        NOTIFICATION_OPENED = r2;
        gn1[] gn1VarArr = {r0, r1, r2};
        $VALUES = gn1VarArr;
        $ENTRIES = new wg7(gn1VarArr);
    }

    public static gn1 valueOf(String str) {
        return (gn1) Enum.valueOf(gn1.class, str);
    }

    public static gn1[] values() {
        return (gn1[]) $VALUES.clone();
    }
}
