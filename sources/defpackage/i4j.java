package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class i4j {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ i4j[] $VALUES;
    public static final i4j Account;
    public static final i4j BankAccount;
    public static final i4j Card;
    public static final h4j Companion;
    public static final i4j CvcUpdate;
    public static final i4j Person;
    public static final i4j Pii;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, h4j] */
    static {
        i4j i4jVar = new i4j("Card", 0, "card");
        Card = i4jVar;
        i4j i4jVar2 = new i4j("BankAccount", 1, "bank_account");
        BankAccount = i4jVar2;
        i4j i4jVar3 = new i4j("Pii", 2, "pii");
        Pii = i4jVar3;
        i4j i4jVar4 = new i4j("Account", 3, "account");
        Account = i4jVar4;
        i4j i4jVar5 = new i4j("CvcUpdate", 4, "cvc_update");
        CvcUpdate = i4jVar5;
        i4j i4jVar6 = new i4j("Person", 5, "person");
        Person = i4jVar6;
        i4j[] i4jVarArr = {i4jVar, i4jVar2, i4jVar3, i4jVar4, i4jVar5, i4jVar6};
        $VALUES = i4jVarArr;
        $ENTRIES = new wg7(i4jVarArr);
        Companion = new Object();
    }

    public i4j(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static i4j valueOf(String str) {
        return (i4j) Enum.valueOf(i4j.class, str);
    }

    public static i4j[] values() {
        return (i4j[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
