package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class qtj {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qtj[] $VALUES;
    public static final ptj Companion;
    public static final qtj Html;
    public static final qtj MultiSelect;
    public static final qtj OutOfBand;
    public static final qtj SingleSelect;
    public static final qtj Text;
    private final String code;
    private final boolean requiresSubmitButton;

    /* JADX WARN: Type inference failed for: r0v2, types: [ptj, java.lang.Object] */
    static {
        qtj qtjVar = new qtj(0, "Text", true, "01");
        Text = qtjVar;
        qtj qtjVar2 = new qtj(1, "SingleSelect", true, "02");
        SingleSelect = qtjVar2;
        qtj qtjVar3 = new qtj(2, "MultiSelect", true, "03");
        MultiSelect = qtjVar3;
        qtj qtjVar4 = new qtj(3, "OutOfBand", false, "04");
        OutOfBand = qtjVar4;
        qtj qtjVar5 = new qtj(4, "Html", false, "05");
        Html = qtjVar5;
        qtj[] qtjVarArr = {qtjVar, qtjVar2, qtjVar3, qtjVar4, qtjVar5};
        $VALUES = qtjVarArr;
        $ENTRIES = new wg7(qtjVarArr);
        Companion = new Object();
    }

    public qtj(int i, String str, boolean z, String str2) {
        this.code = str2;
        this.requiresSubmitButton = z;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static qtj valueOf(String str) {
        return (qtj) Enum.valueOf(qtj.class, str);
    }

    public static qtj[] values() {
        return (qtj[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }

    public final boolean c() {
        return this.requiresSubmitButton;
    }
}
