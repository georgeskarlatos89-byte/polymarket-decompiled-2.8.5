package com.polymarket.usviewmodels;

import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.RawRepresentable;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u001cB\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u001d"}, d2 = {"Lcom/polymarket/usviewmodels/KYCScene;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "birthday", AttributeType.PHONE, "phoneCode", "email", "firstName", "lastName", "addressSearch", "addressForm", "ssn", "confirmInfo", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KYCScene implements RawRepresentable<String>, SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ KYCScene[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final KYCScene birthday = new KYCScene("birthday", 0, "birthday", null, 2, null);
    public static final KYCScene phone = new KYCScene(AttributeType.PHONE, 1, AttributeType.PHONE, null, 2, null);
    public static final KYCScene phoneCode = new KYCScene("phoneCode", 2, "phoneCode", null, 2, null);
    public static final KYCScene email = new KYCScene("email", 3, "email", null, 2, null);
    public static final KYCScene firstName = new KYCScene("firstName", 4, "firstName", null, 2, null);
    public static final KYCScene lastName = new KYCScene("lastName", 5, "lastName", null, 2, null);
    public static final KYCScene addressSearch = new KYCScene("addressSearch", 6, "addressSearch", null, 2, null);
    public static final KYCScene addressForm = new KYCScene("addressForm", 7, "addressForm", null, 2, null);
    public static final KYCScene ssn = new KYCScene("ssn", 8, "ssn", null, 2, null);
    public static final KYCScene confirmInfo = new KYCScene("confirmInfo", 9, "confirmInfo", null, 2, null);

    private static final /* synthetic */ KYCScene[] $values() {
        return new KYCScene[]{birthday, phone, phoneCode, email, firstName, lastName, addressSearch, addressForm, ssn, confirmInfo};
    }

    static {
        KYCScene[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ KYCScene(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : r4);
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static KYCScene valueOf(String str) {
        return (KYCScene) Enum.valueOf(KYCScene.class, str);
    }

    public static KYCScene[] values() {
        return (KYCScene[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/KYCScene$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/KYCScene;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KYCScene init(String rawValue) {
            rawValue.getClass();
            switch (rawValue.hashCode()) {
                case -1459599807:
                    if (!rawValue.equals("lastName")) {
                        return null;
                    }
                    return KYCScene.lastName;
                case -1377697064:
                    if (rawValue.equals("addressForm")) {
                        return KYCScene.addressForm;
                    }
                    return null;
                case -1029506949:
                    if (rawValue.equals("phoneCode")) {
                        return KYCScene.phoneCode;
                    }
                    return null;
                case -754506052:
                    if (rawValue.equals("addressSearch")) {
                        return KYCScene.addressSearch;
                    }
                    return null;
                case 114190:
                    if (rawValue.equals("ssn")) {
                        return KYCScene.ssn;
                    }
                    return null;
                case 96619420:
                    if (rawValue.equals("email")) {
                        return KYCScene.email;
                    }
                    return null;
                case 106642798:
                    if (rawValue.equals(AttributeType.PHONE)) {
                        return KYCScene.phone;
                    }
                    return null;
                case 132835675:
                    if (rawValue.equals("firstName")) {
                        return KYCScene.firstName;
                    }
                    return null;
                case 344088462:
                    if (rawValue.equals("confirmInfo")) {
                        return KYCScene.confirmInfo;
                    }
                    return null;
                case 1069376125:
                    if (rawValue.equals("birthday")) {
                        return KYCScene.birthday;
                    }
                    return null;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }

    private KYCScene(String str, int i, String str2, Void r4) {
        this.rawValue = str2;
    }
}
