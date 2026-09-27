package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class m5i {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ m5i[] $VALUES;
    public static final m5i Programmatically;
    public static final m5i SwipedDownByUser;

    /* JADX WARN: Type inference failed for: r0v0, types: [m5i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [m5i, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Programmatically", 0);
        Programmatically = r0;
        ?? r1 = new Enum("SwipedDownByUser", 1);
        SwipedDownByUser = r1;
        m5i[] m5iVarArr = {r0, r1};
        $VALUES = m5iVarArr;
        $ENTRIES = new wg7(m5iVarArr);
    }

    public static m5i valueOf(String str) {
        return (m5i) Enum.valueOf(m5i.class, str);
    }

    public static m5i[] values() {
        return (m5i[]) $VALUES.clone();
    }
}
