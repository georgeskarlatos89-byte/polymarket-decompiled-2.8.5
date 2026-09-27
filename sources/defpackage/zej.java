package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class zej {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zej[] $VALUES;
    public static final zej ALREADY_SELECTED;
    public static final zej CANCELLED;
    public static final zej REREGISTER;
    public static final zej SUCCESSFUL;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zej] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zej] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zej] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, zej] */
    static {
        ?? r0 = new Enum("SUCCESSFUL", 0);
        SUCCESSFUL = r0;
        ?? r1 = new Enum("REREGISTER", 1);
        REREGISTER = r1;
        ?? r2 = new Enum("CANCELLED", 2);
        CANCELLED = r2;
        ?? r3 = new Enum("ALREADY_SELECTED", 3);
        ALREADY_SELECTED = r3;
        zej[] zejVarArr = {r0, r1, r2, r3};
        $VALUES = zejVarArr;
        $ENTRIES = new wg7(zejVarArr);
    }

    public static zej valueOf(String str) {
        return (zej) Enum.valueOf(zej.class, str);
    }

    public static zej[] values() {
        return (zej[]) $VALUES.clone();
    }
}
