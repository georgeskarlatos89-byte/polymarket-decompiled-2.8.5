package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ui5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ui5[] $VALUES;
    public static final ui5 Add;
    public static final ui5 Edit;
    private final String value;

    static {
        ui5 ui5Var = new ui5("Edit", 0, "edit");
        Edit = ui5Var;
        ui5 ui5Var2 = new ui5("Add", 1, "add");
        Add = ui5Var2;
        ui5[] ui5VarArr = {ui5Var, ui5Var2};
        $VALUES = ui5VarArr;
        $ENTRIES = new wg7(ui5VarArr);
    }

    public ui5(String str, int i, String str2) {
        this.value = str2;
    }

    public static ui5 valueOf(String str) {
        return (ui5) Enum.valueOf(ui5.class, str);
    }

    public static ui5[] values() {
        return (ui5[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
