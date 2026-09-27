package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class zbc {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zbc[] $VALUES;
    public static final zbc DROP_LATEST;
    public static final zbc DROP_OLDEST;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zbc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zbc] */
    static {
        ?? r0 = new Enum("DROP_OLDEST", 0);
        DROP_OLDEST = r0;
        ?? r1 = new Enum("DROP_LATEST", 1);
        DROP_LATEST = r1;
        zbc[] zbcVarArr = {r0, r1};
        $VALUES = zbcVarArr;
        $ENTRIES = new wg7(zbcVarArr);
    }

    public static zbc valueOf(String str) {
        return (zbc) Enum.valueOf(zbc.class, str);
    }

    public static zbc[] values() {
        return (zbc[]) $VALUES.clone();
    }
}
