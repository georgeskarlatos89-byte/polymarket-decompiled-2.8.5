package com.checkout.components.ui.model;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/ui/model/CountryPickerType;", "", "<init>", "(Ljava/lang/String;I)V", "Phone", "Address", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CountryPickerType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ CountryPickerType[] $VALUES;
    public static final CountryPickerType Phone = new CountryPickerType("Phone", 0);
    public static final CountryPickerType Address = new CountryPickerType("Address", 1);

    private static final /* synthetic */ CountryPickerType[] $values() {
        return new CountryPickerType[]{Phone, Address};
    }

    static {
        CountryPickerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private CountryPickerType(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static CountryPickerType valueOf(String str) {
        return (CountryPickerType) Enum.valueOf(CountryPickerType.class, str);
    }

    public static CountryPickerType[] values() {
        return (CountryPickerType[]) $VALUES.clone();
    }
}
