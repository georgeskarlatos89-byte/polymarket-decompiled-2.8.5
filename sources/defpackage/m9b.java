package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class m9b {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ m9b[] $VALUES;
    public static final m9b LoggedOut;
    public static final m9b PaymentConfirmed;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m9b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m9b] */
    static {
        ?? r0 = new Enum("LoggedOut", 0);
        LoggedOut = r0;
        ?? r1 = new Enum("PaymentConfirmed", 1);
        PaymentConfirmed = r1;
        m9b[] m9bVarArr = {r0, r1};
        $VALUES = m9bVarArr;
        $ENTRIES = new wg7(m9bVarArr);
    }

    public static m9b valueOf(String str) {
        return (m9b) Enum.valueOf(m9b.class, str);
    }

    public static m9b[] values() {
        return (m9b[]) $VALUES.clone();
    }
}
