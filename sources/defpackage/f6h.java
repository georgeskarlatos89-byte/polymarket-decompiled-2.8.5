package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class f6h {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ f6h[] $VALUES;
    public static final f6h Checkbox;
    public static final f6h CheckboxWithPrefilledEmail;
    public static final f6h CheckboxWithPrefilledEmailAndPhone;
    public static final f6h DefaultOptInWithAllPrefilled;
    public static final f6h DefaultOptInWithNonePrefilled;
    public static final f6h DefaultOptInWithSomePrefilled;
    public static final f6h Implied;
    public static final f6h ImpliedWithPrefilledEmail;
    public static final f6h SignUpOptInMobileChecked;
    public static final f6h SignUpOptInMobilePrechecked;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f6h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f6h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, f6h] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, f6h] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, f6h] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, f6h] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, f6h] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, f6h] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, f6h] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, f6h] */
    static {
        ?? r0 = new Enum("Checkbox", 0);
        Checkbox = r0;
        ?? r1 = new Enum("CheckboxWithPrefilledEmail", 1);
        CheckboxWithPrefilledEmail = r1;
        ?? r2 = new Enum("CheckboxWithPrefilledEmailAndPhone", 2);
        CheckboxWithPrefilledEmailAndPhone = r2;
        ?? r3 = new Enum("Implied", 3);
        Implied = r3;
        ?? r4 = new Enum("ImpliedWithPrefilledEmail", 4);
        ImpliedWithPrefilledEmail = r4;
        ?? r5 = new Enum("DefaultOptInWithAllPrefilled", 5);
        DefaultOptInWithAllPrefilled = r5;
        ?? r6 = new Enum("DefaultOptInWithSomePrefilled", 6);
        DefaultOptInWithSomePrefilled = r6;
        ?? r7 = new Enum("DefaultOptInWithNonePrefilled", 7);
        DefaultOptInWithNonePrefilled = r7;
        ?? r8 = new Enum("SignUpOptInMobileChecked", 8);
        SignUpOptInMobileChecked = r8;
        ?? r9 = new Enum("SignUpOptInMobilePrechecked", 9);
        SignUpOptInMobilePrechecked = r9;
        f6h[] f6hVarArr = {r0, r1, r2, r3, r4, r5, r6, r7, r8, r9};
        $VALUES = f6hVarArr;
        $ENTRIES = new wg7(f6hVarArr);
    }

    public static f6h valueOf(String str) {
        return (f6h) Enum.valueOf(f6h.class, str);
    }

    public static f6h[] values() {
        return (f6h[]) $VALUES.clone();
    }
}
