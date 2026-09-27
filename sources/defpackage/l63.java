package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class l63 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ l63[] $VALUES;
    public static final l63 CardFormView;
    public static final l63 CardInputWidget;
    public static final l63 CardMultilineWidget;
    private final String analyticsValue;

    static {
        l63 l63Var = new l63("CardInputWidget", 0, "card_input_widget");
        CardInputWidget = l63Var;
        l63 l63Var2 = new l63("CardFormView", 1, "card_form_view");
        CardFormView = l63Var2;
        l63 l63Var3 = new l63("CardMultilineWidget", 2, "card_multiline_widget");
        CardMultilineWidget = l63Var3;
        l63[] l63VarArr = {l63Var, l63Var2, l63Var3};
        $VALUES = l63VarArr;
        $ENTRIES = new wg7(l63VarArr);
    }

    public l63(String str, int i, String str2) {
        this.analyticsValue = str2;
    }

    public static l63 valueOf(String str) {
        return (l63) Enum.valueOf(l63.class, str);
    }

    public static l63[] values() {
        return (l63[]) $VALUES.clone();
    }

    public final String a() {
        return this.analyticsValue;
    }
}
