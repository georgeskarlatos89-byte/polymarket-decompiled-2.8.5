package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e25 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ e25[] $VALUES;
    public static final e25 Checkbox;
    public static final e25 CheckboxWithPrefilledEmail;
    public static final e25 CheckboxWithPrefilledEmailAndPhone;
    public static final e25 EnteredPhoneNumberClickedSaveToLink;
    public static final e25 Implied;
    public static final e25 ImpliedWithPrefilledEmail;
    public static final e25 PrecheckedOptInBoxPrefilledAll;
    public static final e25 PrecheckedOptInBoxPrefilledNone;
    public static final e25 PrecheckedOptInBoxPrefilledSome;
    public static final e25 SignUpOptInMobileChecked;
    public static final e25 SignUpOptInMobilePrechecked;
    private final String value;

    static {
        e25 e25Var = new e25("Checkbox", 0, "clicked_checkbox_nospm_mobile_v0");
        Checkbox = e25Var;
        e25 e25Var2 = new e25("CheckboxWithPrefilledEmail", 1, "clicked_checkbox_nospm_mobile_v0_0");
        CheckboxWithPrefilledEmail = e25Var2;
        e25 e25Var3 = new e25("CheckboxWithPrefilledEmailAndPhone", 2, "clicked_checkbox_nospm_mobile_v0_1");
        CheckboxWithPrefilledEmailAndPhone = e25Var3;
        e25 e25Var4 = new e25("Implied", 3, "implied_consent_withspm_mobile_v0");
        Implied = e25Var4;
        e25 e25Var5 = new e25("ImpliedWithPrefilledEmail", 4, "implied_consent_withspm_mobile_v0_0");
        ImpliedWithPrefilledEmail = e25Var5;
        e25 e25Var6 = new e25("PrecheckedOptInBoxPrefilledAll", 5, "prechecked_opt_in_box_prefilled_all");
        PrecheckedOptInBoxPrefilledAll = e25Var6;
        e25 e25Var7 = new e25("PrecheckedOptInBoxPrefilledSome", 6, "prechecked_opt_in_box_prefilled_some");
        PrecheckedOptInBoxPrefilledSome = e25Var7;
        e25 e25Var8 = new e25("PrecheckedOptInBoxPrefilledNone", 7, "prechecked_opt_in_box_prefilled_none");
        PrecheckedOptInBoxPrefilledNone = e25Var8;
        e25 e25Var9 = new e25("SignUpOptInMobileChecked", 8, "sign_up_opt_in_mobile_checked");
        SignUpOptInMobileChecked = e25Var9;
        e25 e25Var10 = new e25("SignUpOptInMobilePrechecked", 9, "sign_up_opt_in_mobile_prechecked");
        SignUpOptInMobilePrechecked = e25Var10;
        e25 e25Var11 = new e25("EnteredPhoneNumberClickedSaveToLink", 10, "entered_phone_number_clicked_save_to_link");
        EnteredPhoneNumberClickedSaveToLink = e25Var11;
        e25[] e25VarArr = {e25Var, e25Var2, e25Var3, e25Var4, e25Var5, e25Var6, e25Var7, e25Var8, e25Var9, e25Var10, e25Var11};
        $VALUES = e25VarArr;
        $ENTRIES = new wg7(e25VarArr);
    }

    public e25(String str, int i, String str2) {
        this.value = str2;
    }

    public static e25 valueOf(String str) {
        return (e25) Enum.valueOf(e25.class, str);
    }

    public static e25[] values() {
        return (e25[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
