package com.polymarket.usviewmodels;

import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0019"}, d2 = {"Lcom/polymarket/usviewmodels/KYCFieldFocus;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "birthday", AttributeType.PHONE, "phoneCode", "email", "firstName", "lastName", "searchQuery", "address1", "address2", "city", "state", "zipCode", "ssn", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KYCFieldFocus implements SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ KYCFieldFocus[] $VALUES;
    public static final KYCFieldFocus birthday = new KYCFieldFocus("birthday", 0);
    public static final KYCFieldFocus phone = new KYCFieldFocus(AttributeType.PHONE, 1);
    public static final KYCFieldFocus phoneCode = new KYCFieldFocus("phoneCode", 2);
    public static final KYCFieldFocus email = new KYCFieldFocus("email", 3);
    public static final KYCFieldFocus firstName = new KYCFieldFocus("firstName", 4);
    public static final KYCFieldFocus lastName = new KYCFieldFocus("lastName", 5);
    public static final KYCFieldFocus searchQuery = new KYCFieldFocus("searchQuery", 6);
    public static final KYCFieldFocus address1 = new KYCFieldFocus("address1", 7);
    public static final KYCFieldFocus address2 = new KYCFieldFocus("address2", 8);
    public static final KYCFieldFocus city = new KYCFieldFocus("city", 9);
    public static final KYCFieldFocus state = new KYCFieldFocus("state", 10);
    public static final KYCFieldFocus zipCode = new KYCFieldFocus("zipCode", 11);
    public static final KYCFieldFocus ssn = new KYCFieldFocus("ssn", 12);

    private static final /* synthetic */ KYCFieldFocus[] $values() {
        return new KYCFieldFocus[]{birthday, phone, phoneCode, email, firstName, lastName, searchQuery, address1, address2, city, state, zipCode, ssn};
    }

    static {
        KYCFieldFocus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private KYCFieldFocus(String str, int i) {
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static KYCFieldFocus valueOf(String str) {
        return (KYCFieldFocus) Enum.valueOf(KYCFieldFocus.class, str);
    }

    public static KYCFieldFocus[] values() {
        return (KYCFieldFocus[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }
}
