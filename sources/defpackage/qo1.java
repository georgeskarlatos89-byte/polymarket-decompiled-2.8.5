package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class qo1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qo1[] $VALUES;
    public static final qo1 CustomTabs;
    public static final qo1 Unknown;

    /* JADX WARN: Type inference failed for: r0v0, types: [qo1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qo1, java.lang.Enum] */
    static {
        ?? r0 = new Enum("CustomTabs", 0);
        CustomTabs = r0;
        ?? r1 = new Enum("Unknown", 1);
        Unknown = r1;
        qo1[] qo1VarArr = {r0, r1};
        $VALUES = qo1VarArr;
        $ENTRIES = new wg7(qo1VarArr);
    }

    public static qo1 valueOf(String str) {
        return (qo1) Enum.valueOf(qo1.class, str);
    }

    public static qo1[] values() {
        return (qo1[]) $VALUES.clone();
    }
}
