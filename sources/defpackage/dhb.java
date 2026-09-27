package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class dhb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ dhb[] $VALUES;
    public static final dhb AttestationIssues;
    public static final dhb DisabledInElementsSession;
    public static final dhb LinkCardNotSupported;
    public static final dhb LinkUsedBefore;
    public static final dhb SignupOptInFeatureNoEmailProvided;
    private final String value;

    static {
        dhb dhbVar = new dhb("LinkCardNotSupported", 0, "link_card_not_supported");
        LinkCardNotSupported = dhbVar;
        dhb dhbVar2 = new dhb("DisabledInElementsSession", 1, "disabled_in_elements_session");
        DisabledInElementsSession = dhbVar2;
        dhb dhbVar3 = new dhb("SignupOptInFeatureNoEmailProvided", 2, "signup_opt_in_feature_no_email_provided");
        SignupOptInFeatureNoEmailProvided = dhbVar3;
        dhb dhbVar4 = new dhb("AttestationIssues", 3, "attestation_issues");
        AttestationIssues = dhbVar4;
        dhb dhbVar5 = new dhb("LinkUsedBefore", 4, "link_used_before");
        LinkUsedBefore = dhbVar5;
        dhb[] dhbVarArr = {dhbVar, dhbVar2, dhbVar3, dhbVar4, dhbVar5};
        $VALUES = dhbVarArr;
        $ENTRIES = new wg7(dhbVarArr);
    }

    public dhb(String str, int i, String str2) {
        this.value = str2;
    }

    public static dhb valueOf(String str) {
        return (dhb) Enum.valueOf(dhb.class, str);
    }

    public static dhb[] values() {
        return (dhb[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
