package defpackage;

import com.polymarket.designtokens.Icon;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hn2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ hn2[] $VALUES;
    public static final hn2 Checkmark;
    public static final hn2 Info;
    public static final hn2 None;
    private final Icon asset;

    static {
        hn2 hn2Var = new hn2("None", 0, null);
        None = hn2Var;
        hn2 hn2Var2 = new hn2("Checkmark", 1, Icon.checkmarkSF);
        Checkmark = hn2Var2;
        hn2 hn2Var3 = new hn2("Info", 2, Icon.infoFill);
        Info = hn2Var3;
        hn2[] hn2VarArr = {hn2Var, hn2Var2, hn2Var3};
        $VALUES = hn2VarArr;
        $ENTRIES = new wg7(hn2VarArr);
    }

    public hn2(String str, int i, Icon icon) {
        this.asset = icon;
    }

    public static hn2 valueOf(String str) {
        return (hn2) Enum.valueOf(hn2.class, str);
    }

    public static hn2[] values() {
        return (hn2[]) $VALUES.clone();
    }

    public final Icon a() {
        return this.asset;
    }
}
