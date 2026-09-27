package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pub {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ pub[] $VALUES;
    public static final pub IsNotPlaced;
    public static final pub IsPlacedInApproach;
    public static final pub IsPlacedInLookahead;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pub] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pub] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pub] */
    static {
        ?? r0 = new Enum("IsPlacedInLookahead", 0);
        IsPlacedInLookahead = r0;
        ?? r1 = new Enum("IsPlacedInApproach", 1);
        IsPlacedInApproach = r1;
        ?? r2 = new Enum("IsNotPlaced", 2);
        IsNotPlaced = r2;
        pub[] pubVarArr = {r0, r1, r2};
        $VALUES = pubVarArr;
        $ENTRIES = new wg7(pubVarArr);
    }

    public static pub valueOf(String str) {
        return (pub) Enum.valueOf(pub.class, str);
    }

    public static pub[] values() {
        return (pub[]) $VALUES.clone();
    }
}
