package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class owj {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ owj[] $VALUES;
    public static final owj Idle;
    public static final owj Removing;
    public static final owj Updating;
    private final boolean isPerformingNetworkOperation;

    static {
        owj owjVar = new owj("Idle", 0, false);
        Idle = owjVar;
        owj owjVar2 = new owj("Updating", 1, true);
        Updating = owjVar2;
        owj owjVar3 = new owj("Removing", 2, true);
        Removing = owjVar3;
        owj[] owjVarArr = {owjVar, owjVar2, owjVar3};
        $VALUES = owjVarArr;
        $ENTRIES = new wg7(owjVarArr);
    }

    public owj(String str, int i, boolean z) {
        this.isPerformingNetworkOperation = z;
    }

    public static owj valueOf(String str) {
        return (owj) Enum.valueOf(owj.class, str);
    }

    public static owj[] values() {
        return (owj[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.isPerformingNetworkOperation;
    }
}
