package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vu8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vu8[] $VALUES;
    public static final vu8 APP_LINK;
    public static final vu8 DEEP_LINK;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vu8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vu8] */
    static {
        ?? r0 = new Enum("APP_LINK", 0);
        APP_LINK = r0;
        ?? r1 = new Enum("DEEP_LINK", 1);
        DEEP_LINK = r1;
        vu8[] vu8VarArr = {r0, r1};
        $VALUES = vu8VarArr;
        $ENTRIES = new wg7(vu8VarArr);
    }

    public static vu8 valueOf(String str) {
        return (vu8) Enum.valueOf(vu8.class, str);
    }

    public static vu8[] values() {
        return (vu8[]) $VALUES.clone();
    }
}
