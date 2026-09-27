package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class naj {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ naj[] $VALUES;
    public static final naj ChallengeAdditionalAuth;
    public static final naj ChallengeDecoupledAuth;
    public static final maj Companion;
    public static final naj InformationOnly;
    public static final naj VerificationAttempted;
    public static final naj VerificationDenied;
    public static final naj VerificationNotPerformed;
    public static final naj VerificationRejected;
    public static final naj VerificationSuccessful;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [maj, java.lang.Object] */
    static {
        naj najVar = new naj("VerificationSuccessful", 0, "Y");
        VerificationSuccessful = najVar;
        naj najVar2 = new naj("VerificationDenied", 1, "N");
        VerificationDenied = najVar2;
        naj najVar3 = new naj("VerificationNotPerformed", 2, "U");
        VerificationNotPerformed = najVar3;
        naj najVar4 = new naj("VerificationAttempted", 3, "A");
        VerificationAttempted = najVar4;
        naj najVar5 = new naj("ChallengeAdditionalAuth", 4, "C");
        ChallengeAdditionalAuth = najVar5;
        naj najVar6 = new naj("ChallengeDecoupledAuth", 5, "D");
        ChallengeDecoupledAuth = najVar6;
        naj najVar7 = new naj("VerificationRejected", 6, "R");
        VerificationRejected = najVar7;
        naj najVar8 = new naj("InformationOnly", 7, "I");
        InformationOnly = najVar8;
        naj[] najVarArr = {najVar, najVar2, najVar3, najVar4, najVar5, najVar6, najVar7, najVar8};
        $VALUES = najVarArr;
        $ENTRIES = new wg7(najVarArr);
        Companion = new Object();
    }

    public naj(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static naj valueOf(String str) {
        return (naj) Enum.valueOf(naj.class, str);
    }

    public static naj[] values() {
        return (naj[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
