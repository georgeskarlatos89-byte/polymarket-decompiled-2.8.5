package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ufc {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ufc[] $VALUES;
    public static final ufc AMOUNTS;
    public static final ufc DESCRIPTOR_CODE;
    public static final ufc UNKNOWN;
    private final String value;

    static {
        ufc ufcVar = new ufc("AMOUNTS", 0, "amounts");
        AMOUNTS = ufcVar;
        ufc ufcVar2 = new ufc("DESCRIPTOR_CODE", 1, "descriptor_code");
        DESCRIPTOR_CODE = ufcVar2;
        ufc ufcVar3 = new ufc("UNKNOWN", 2, "unknown");
        UNKNOWN = ufcVar3;
        ufc[] ufcVarArr = {ufcVar, ufcVar2, ufcVar3};
        $VALUES = ufcVarArr;
        $ENTRIES = new wg7(ufcVarArr);
    }

    public ufc(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static ufc valueOf(String str) {
        return (ufc) Enum.valueOf(ufc.class, str);
    }

    public static ufc[] values() {
        return (ufc[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
