package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class zmi {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zmi[] $VALUES;
    public static final zmi Complete;
    public static final zmi Continue;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zmi] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zmi] */
    static {
        ?? r0 = new Enum("Complete", 0);
        Complete = r0;
        ?? r1 = new Enum("Continue", 1);
        Continue = r1;
        zmi[] zmiVarArr = {r0, r1};
        $VALUES = zmiVarArr;
        $ENTRIES = new wg7(zmiVarArr);
    }

    public static zmi valueOf(String str) {
        return (zmi) Enum.valueOf(zmi.class, str);
    }

    public static zmi[] values() {
        return (zmi[]) $VALUES.clone();
    }
}
