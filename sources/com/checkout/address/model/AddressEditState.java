package com.checkout.address.model;

import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\fHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ`\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0017R+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001b¨\u00066"}, d2 = {"Lcom/checkout/address/model/AddressEditState;", "", "", "Lcom/checkout/components/interfaces/model/AddressField;", "fields", "Ljava/util/Locale;", "locale", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "appearance", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/Translation;", "translation", "Lcom/checkout/components/interfaces/model/contact/ContactData;", "prefilledData", "<init>", "(Ljava/util/List;Ljava/util/Locale;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Ljava/util/Map;Lcom/checkout/components/interfaces/model/contact/ContactData;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Locale;", "component3", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "component4", "()Ljava/util/Map;", "component5", "()Lcom/checkout/components/interfaces/model/contact/ContactData;", "copy", "(Ljava/util/List;Ljava/util/Locale;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Ljava/util/Map;Lcom/checkout/components/interfaces/model/contact/ContactData;)Lcom/checkout/address/model/AddressEditState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getFields", "b", "Ljava/util/Locale;", "getLocale", "c", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "getAppearance", d.d, "Ljava/util/Map;", "getTranslation", "e", "Lcom/checkout/components/interfaces/model/contact/ContactData;", "getPrefilledData", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AddressEditState {
    public static final int $stable = 8;

    /* renamed from: a, reason: from kotlin metadata */
    private final List fields;

    /* renamed from: b, reason: from kotlin metadata */
    private final Locale locale;

    /* renamed from: c, reason: from kotlin metadata */
    private final DesignTokens appearance;

    /* renamed from: d, reason: from kotlin metadata */
    private final Map translation;

    /* renamed from: e, reason: from kotlin metadata */
    private final ContactData prefilledData;

    public AddressEditState(List<? extends AddressField> list, Locale locale, DesignTokens designTokens, Map<ComponentTranslationKey, String> map, ContactData contactData) {
        list.getClass();
        locale.getClass();
        this.fields = list;
        this.locale = locale;
        this.appearance = designTokens;
        this.translation = map;
        this.prefilledData = contactData;
    }

    public static /* synthetic */ AddressEditState copy$default(AddressEditState addressEditState, List list, Locale locale, DesignTokens designTokens, Map map, ContactData contactData, int i, Object obj) {
        if ((i & 1) != 0) {
            list = addressEditState.fields;
        }
        if ((i & 2) != 0) {
            locale = addressEditState.locale;
        }
        if ((i & 4) != 0) {
            designTokens = addressEditState.appearance;
        }
        if ((i & 8) != 0) {
            map = addressEditState.translation;
        }
        if ((i & 16) != 0) {
            contactData = addressEditState.prefilledData;
        }
        ContactData contactData2 = contactData;
        DesignTokens designTokens2 = designTokens;
        return addressEditState.copy(list, locale, designTokens2, map, contactData2);
    }

    public final List<AddressField> component1() {
        return this.fields;
    }

    /* renamed from: component2, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    /* renamed from: component3, reason: from getter */
    public final DesignTokens getAppearance() {
        return this.appearance;
    }

    public final Map<ComponentTranslationKey, String> component4() {
        return this.translation;
    }

    /* renamed from: component5, reason: from getter */
    public final ContactData getPrefilledData() {
        return this.prefilledData;
    }

    public final AddressEditState copy(List<? extends AddressField> fields, Locale locale, DesignTokens appearance, Map<ComponentTranslationKey, String> translation, ContactData prefilledData) {
        fields.getClass();
        locale.getClass();
        return new AddressEditState(fields, locale, appearance, translation, prefilledData);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditState)) {
            return false;
        }
        AddressEditState addressEditState = (AddressEditState) other;
        if (Intrinsics.areEqual(this.fields, addressEditState.fields) && Intrinsics.areEqual(this.locale, addressEditState.locale) && Intrinsics.areEqual(this.appearance, addressEditState.appearance) && Intrinsics.areEqual(this.translation, addressEditState.translation) && Intrinsics.areEqual(this.prefilledData, addressEditState.prefilledData)) {
            return true;
        }
        return false;
    }

    public final DesignTokens getAppearance() {
        return this.appearance;
    }

    public final List<AddressField> getFields() {
        return this.fields;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final ContactData getPrefilledData() {
        return this.prefilledData;
    }

    public final Map<ComponentTranslationKey, String> getTranslation() {
        return this.translation;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.locale.hashCode() + (this.fields.hashCode() * 31)) * 31;
        DesignTokens designTokens = this.appearance;
        int i = 0;
        if (designTokens == null) {
            hashCode = 0;
        } else {
            hashCode = designTokens.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Map map = this.translation;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ContactData contactData = this.prefilledData;
        if (contactData != null) {
            i = contactData.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "AddressEditState(fields=" + this.fields + ", locale=" + this.locale + ", appearance=" + this.appearance + ", translation=" + this.translation + ", prefilledData=" + this.prefilledData + ")";
    }

    public /* synthetic */ AddressEditState(List list, Locale locale, DesignTokens designTokens, Map map, ContactData contactData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, locale, designTokens, map, (i & 16) != 0 ? null : contactData);
    }
}
