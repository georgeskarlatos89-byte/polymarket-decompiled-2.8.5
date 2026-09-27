package com.checkout.address.model.validation;

import com.checkout.components.interfaces.model.AddressField;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.ix2;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\n\u0010\u0015¨\u0006+"}, d2 = {"Lcom/checkout/address/model/validation/FieldValidationRequest;", "", "", "inputValue", "Lcom/checkout/components/interfaces/model/AddressField;", "fieldType", "", "maxLength", "minLength", "", "isOptional", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/AddressField;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/interfaces/model/AddressField;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/AddressField;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/checkout/address/model/validation/FieldValidationRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getInputValue", "b", "Lcom/checkout/components/interfaces/model/AddressField;", "getFieldType", "c", "Ljava/lang/Integer;", "getMaxLength", d.d, "getMinLength", "e", "Z", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FieldValidationRequest {
    public static final int $stable = AddressField.$stable;

    /* renamed from: a, reason: from kotlin metadata */
    private final String inputValue;

    /* renamed from: b, reason: from kotlin metadata */
    private final AddressField fieldType;

    /* renamed from: c, reason: from kotlin metadata */
    private final Integer maxLength;

    /* renamed from: d, reason: from kotlin metadata */
    private final Integer minLength;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean isOptional;

    public FieldValidationRequest(String str, AddressField addressField, Integer num, Integer num2, boolean z) {
        str.getClass();
        addressField.getClass();
        this.inputValue = str;
        this.fieldType = addressField;
        this.maxLength = num;
        this.minLength = num2;
        this.isOptional = z;
    }

    public static /* synthetic */ FieldValidationRequest copy$default(FieldValidationRequest fieldValidationRequest, String str, AddressField addressField, Integer num, Integer num2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fieldValidationRequest.inputValue;
        }
        if ((i & 2) != 0) {
            addressField = fieldValidationRequest.fieldType;
        }
        if ((i & 4) != 0) {
            num = fieldValidationRequest.maxLength;
        }
        if ((i & 8) != 0) {
            num2 = fieldValidationRequest.minLength;
        }
        if ((i & 16) != 0) {
            z = fieldValidationRequest.isOptional;
        }
        boolean z2 = z;
        Integer num3 = num;
        return fieldValidationRequest.copy(str, addressField, num3, num2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInputValue() {
        return this.inputValue;
    }

    /* renamed from: component2, reason: from getter */
    public final AddressField getFieldType() {
        return this.fieldType;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getMinLength() {
        return this.minLength;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsOptional() {
        return this.isOptional;
    }

    public final FieldValidationRequest copy(String inputValue, AddressField fieldType, Integer maxLength, Integer minLength, boolean isOptional) {
        inputValue.getClass();
        fieldType.getClass();
        return new FieldValidationRequest(inputValue, fieldType, maxLength, minLength, isOptional);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldValidationRequest)) {
            return false;
        }
        FieldValidationRequest fieldValidationRequest = (FieldValidationRequest) other;
        if (Intrinsics.areEqual(this.inputValue, fieldValidationRequest.inputValue) && Intrinsics.areEqual(this.fieldType, fieldValidationRequest.fieldType) && Intrinsics.areEqual(this.maxLength, fieldValidationRequest.maxLength) && Intrinsics.areEqual(this.minLength, fieldValidationRequest.minLength) && this.isOptional == fieldValidationRequest.isOptional) {
            return true;
        }
        return false;
    }

    public final AddressField getFieldType() {
        return this.fieldType;
    }

    public final String getInputValue() {
        return this.inputValue;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final Integer getMinLength() {
        return this.minLength;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.fieldType.hashCode() + (this.inputValue.hashCode() * 31)) * 31;
        Integer num = this.maxLength;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Integer num2 = this.minLength;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return Boolean.hashCode(this.isOptional) + ((i2 + i) * 31);
    }

    public final boolean isOptional() {
        return this.isOptional;
    }

    public final String toString() {
        String str = this.inputValue;
        AddressField addressField = this.fieldType;
        Integer num = this.maxLength;
        Integer num2 = this.minLength;
        boolean z = this.isOptional;
        StringBuilder sb = new StringBuilder("FieldValidationRequest(inputValue=");
        sb.append(str);
        sb.append(", fieldType=");
        sb.append(addressField);
        sb.append(", maxLength=");
        sv6.z(sb, num, ", minLength=", num2, ", isOptional=");
        return ix2.r(sb, z, ")");
    }

    public /* synthetic */ FieldValidationRequest(String str, AddressField addressField, Integer num, Integer num2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, addressField, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? false : z);
    }
}
