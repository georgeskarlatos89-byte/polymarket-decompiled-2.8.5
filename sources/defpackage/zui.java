package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zui {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zui[] $VALUES;
    public static final zui Filled;
    public static final zui Outlined;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zui] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zui] */
    static {
        ?? r0 = new Enum("Filled", 0);
        Filled = r0;
        ?? r1 = new Enum("Outlined", 1);
        Outlined = r1;
        zui[] zuiVarArr = {r0, r1};
        $VALUES = zuiVarArr;
        $ENTRIES = new wg7(zuiVarArr);
    }

    public static zui valueOf(String str) {
        return (zui) Enum.valueOf(zui.class, str);
    }

    public static zui[] values() {
        return (zui[]) $VALUES.clone();
    }
}
