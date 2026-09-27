package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class rsh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ rsh[] $VALUES;
    public static final rsh Prominent;
    public static final rsh Standard;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, rsh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, rsh] */
    static {
        ?? r0 = new Enum("Standard", 0);
        Standard = r0;
        ?? r1 = new Enum("Prominent", 1);
        Prominent = r1;
        rsh[] rshVarArr = {r0, r1};
        $VALUES = rshVarArr;
        $ENTRIES = new wg7(rshVarArr);
    }

    public static rsh valueOf(String str) {
        return (rsh) Enum.valueOf(rsh.class, str);
    }

    public static rsh[] values() {
        return (rsh[]) $VALUES.clone();
    }
}
