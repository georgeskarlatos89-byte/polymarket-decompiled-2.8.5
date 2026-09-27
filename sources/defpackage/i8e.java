package defpackage;

import com.polymarket.android.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class i8e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ i8e[] $VALUES;
    public static final i8e Full;
    public static final i8e None;
    public static final i8e Partial;
    private final Integer removeMessageId;

    static {
        i8e i8eVar = new i8e("Full", 0, null);
        Full = i8eVar;
        i8e i8eVar2 = new i8e("Partial", 1, Integer.valueOf(R.string.stripe_paymentsheet_remove_partial_description));
        Partial = i8eVar2;
        i8e i8eVar3 = new i8e("None", 2, null);
        None = i8eVar3;
        i8e[] i8eVarArr = {i8eVar, i8eVar2, i8eVar3};
        $VALUES = i8eVarArr;
        $ENTRIES = new wg7(i8eVarArr);
    }

    public i8e(String str, int i, Integer num) {
        this.removeMessageId = num;
    }

    public static i8e valueOf(String str) {
        return (i8e) Enum.valueOf(i8e.class, str);
    }

    public static i8e[] values() {
        return (i8e[]) $VALUES.clone();
    }

    public final il9 a(String str) {
        str.getClass();
        Integer num = this.removeMessageId;
        if (num != null) {
            return xun.f(num.intValue(), new Object[]{str});
        }
        return null;
    }
}
