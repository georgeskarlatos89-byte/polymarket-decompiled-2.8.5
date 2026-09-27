package com.checkout.address.model;

import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/checkout/address/model/AddressButtonState;", "", ApiConstant.KEY_DATA, "Lcom/checkout/components/interfaces/model/contact/ContactData;", "fields", "", "Lcom/checkout/components/interfaces/model/AddressField;", "<init>", "(Lcom/checkout/components/interfaces/model/contact/ContactData;Ljava/util/List;)V", "getData", "()Lcom/checkout/components/interfaces/model/contact/ContactData;", "getFields", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AddressButtonState {
    public static final int $stable = 8;
    private final ContactData data;
    private final List<AddressField> fields;

    /* JADX WARN: Multi-variable type inference failed */
    public AddressButtonState(ContactData contactData, List<? extends AddressField> list) {
        list.getClass();
        this.data = contactData;
        this.fields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressButtonState copy$default(AddressButtonState addressButtonState, ContactData contactData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            contactData = addressButtonState.data;
        }
        if ((i & 2) != 0) {
            list = addressButtonState.fields;
        }
        return addressButtonState.copy(contactData, list);
    }

    /* renamed from: component1, reason: from getter */
    public final ContactData getData() {
        return this.data;
    }

    public final List<AddressField> component2() {
        return this.fields;
    }

    public final AddressButtonState copy(ContactData data, List<? extends AddressField> fields) {
        fields.getClass();
        return new AddressButtonState(data, fields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressButtonState)) {
            return false;
        }
        AddressButtonState addressButtonState = (AddressButtonState) other;
        if (Intrinsics.areEqual(this.data, addressButtonState.data) && Intrinsics.areEqual(this.fields, addressButtonState.fields)) {
            return true;
        }
        return false;
    }

    public final ContactData getData() {
        return this.data;
    }

    public final List<AddressField> getFields() {
        return this.fields;
    }

    public int hashCode() {
        int hashCode;
        ContactData contactData = this.data;
        if (contactData == null) {
            hashCode = 0;
        } else {
            hashCode = contactData.hashCode();
        }
        return this.fields.hashCode() + (hashCode * 31);
    }

    public String toString() {
        return "AddressButtonState(data=" + this.data + ", fields=" + this.fields + ")";
    }
}
