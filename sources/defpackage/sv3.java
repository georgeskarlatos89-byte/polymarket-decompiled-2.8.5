package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class sv3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sv3[] $VALUES;
    public static final sv3 EventChat;
    public static final sv3 SquadChat;

    /* JADX WARN: Type inference failed for: r0v0, types: [sv3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sv3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("SquadChat", 0);
        SquadChat = r0;
        ?? r1 = new Enum("EventChat", 1);
        EventChat = r1;
        sv3[] sv3VarArr = {r0, r1};
        $VALUES = sv3VarArr;
        $ENTRIES = new wg7(sv3VarArr);
    }

    public static sv3 valueOf(String str) {
        return (sv3) Enum.valueOf(sv3.class, str);
    }

    public static sv3[] values() {
        return (sv3[]) $VALUES.clone();
    }
}
