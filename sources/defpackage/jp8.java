package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class jp8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ jp8[] $VALUES;
    public static final jp8 Picker;
    public static final jp8 Rules;

    /* JADX WARN: Type inference failed for: r0v0, types: [jp8, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [jp8, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Rules", 0);
        Rules = r0;
        ?? r1 = new Enum("Picker", 1);
        Picker = r1;
        jp8[] jp8VarArr = {r0, r1};
        $VALUES = jp8VarArr;
        $ENTRIES = new wg7(jp8VarArr);
    }

    public static jp8 valueOf(String str) {
        return (jp8) Enum.valueOf(jp8.class, str);
    }

    public static jp8[] values() {
        return (jp8[]) $VALUES.clone();
    }
}
