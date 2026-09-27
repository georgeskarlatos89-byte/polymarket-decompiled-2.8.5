package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ofe {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ofe[] $VALUES;
    public static final ofe Add;
    public static final ofe Edit;
    private final String value;

    static {
        ofe ofeVar = new ofe("Edit", 0, "edit");
        Edit = ofeVar;
        ofe ofeVar2 = new ofe("Add", 1, "add");
        Add = ofeVar2;
        ofe[] ofeVarArr = {ofeVar, ofeVar2};
        $VALUES = ofeVarArr;
        $ENTRIES = new wg7(ofeVarArr);
    }

    public ofe(String str, int i, String str2) {
        this.value = str2;
    }

    public static ofe valueOf(String str) {
        return (ofe) Enum.valueOf(ofe.class, str);
    }

    public static ofe[] values() {
        return (ofe[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
