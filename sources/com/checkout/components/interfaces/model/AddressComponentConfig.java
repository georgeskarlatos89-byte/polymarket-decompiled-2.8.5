package com.checkout.components.interfaces.model;

import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.ix2;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJX\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0014R+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u000e\u0010\u001a¨\u00064"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressComponentConfig;", "Lcom/checkout/components/interfaces/model/ComponentConfig;", "Lcom/checkout/components/interfaces/model/ComponentName$Address;", Keys.KEY_NAME, "Ljava/util/Locale;", "locale", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/Translation;", "translation", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "appearance", "", "isStandalone", "<init>", "(Lcom/checkout/components/interfaces/model/ComponentName$Address;Ljava/util/Locale;Ljava/util/Map;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Z)V", "component1", "()Lcom/checkout/components/interfaces/model/ComponentName$Address;", "component2", "()Ljava/util/Locale;", "component3", "()Ljava/util/Map;", "component4", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "component5", "()Z", "copy", "(Lcom/checkout/components/interfaces/model/ComponentName$Address;Ljava/util/Locale;Ljava/util/Map;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Z)Lcom/checkout/components/interfaces/model/AddressComponentConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/ComponentName$Address;", "getName", "b", "Ljava/util/Locale;", "getLocale", "c", "Ljava/util/Map;", "getTranslation", d.d, "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "getAppearance", "e", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AddressComponentConfig implements ComponentConfig {
    public static final int $stable = 8;

    /* renamed from: a, reason: from kotlin metadata */
    private final ComponentName.Address name;

    /* renamed from: b, reason: from kotlin metadata */
    private final Locale locale;

    /* renamed from: c, reason: from kotlin metadata */
    private final Map translation;

    /* renamed from: d, reason: from kotlin metadata */
    private final DesignTokens appearance;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean isStandalone;

    public AddressComponentConfig(ComponentName.Address address, Locale locale, Map<ComponentTranslationKey, String> map, DesignTokens designTokens, boolean z) {
        address.getClass();
        locale.getClass();
        this.name = address;
        this.locale = locale;
        this.translation = map;
        this.appearance = designTokens;
        this.isStandalone = z;
    }

    public static /* synthetic */ AddressComponentConfig copy$default(AddressComponentConfig addressComponentConfig, ComponentName.Address address, Locale locale, Map map, DesignTokens designTokens, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            address = addressComponentConfig.name;
        }
        if ((i & 2) != 0) {
            locale = addressComponentConfig.locale;
        }
        if ((i & 4) != 0) {
            map = addressComponentConfig.translation;
        }
        if ((i & 8) != 0) {
            designTokens = addressComponentConfig.appearance;
        }
        if ((i & 16) != 0) {
            z = addressComponentConfig.isStandalone;
        }
        boolean z2 = z;
        Map map2 = map;
        return addressComponentConfig.copy(address, locale, map2, designTokens, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final ComponentName.Address getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    public final Map<ComponentTranslationKey, String> component3() {
        return this.translation;
    }

    /* renamed from: component4, reason: from getter */
    public final DesignTokens getAppearance() {
        return this.appearance;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsStandalone() {
        return this.isStandalone;
    }

    public final AddressComponentConfig copy(ComponentName.Address name, Locale locale, Map<ComponentTranslationKey, String> translation, DesignTokens appearance, boolean isStandalone) {
        name.getClass();
        locale.getClass();
        return new AddressComponentConfig(name, locale, translation, appearance, isStandalone);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressComponentConfig)) {
            return false;
        }
        AddressComponentConfig addressComponentConfig = (AddressComponentConfig) other;
        if (Intrinsics.areEqual(this.name, addressComponentConfig.name) && Intrinsics.areEqual(this.locale, addressComponentConfig.locale) && Intrinsics.areEqual(this.translation, addressComponentConfig.translation) && Intrinsics.areEqual(this.appearance, addressComponentConfig.appearance) && this.isStandalone == addressComponentConfig.isStandalone) {
            return true;
        }
        return false;
    }

    public final DesignTokens getAppearance() {
        return this.appearance;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final ComponentName.Address getName() {
        return this.name;
    }

    public final Map<ComponentTranslationKey, String> getTranslation() {
        return this.translation;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.locale.hashCode() + (this.name.hashCode() * 31)) * 31;
        Map map = this.translation;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        DesignTokens designTokens = this.appearance;
        if (designTokens != null) {
            i = designTokens.hashCode();
        }
        return Boolean.hashCode(this.isStandalone) + ((i2 + i) * 31);
    }

    public final boolean isStandalone() {
        return this.isStandalone;
    }

    public final String toString() {
        ComponentName.Address address = this.name;
        Locale locale = this.locale;
        Map map = this.translation;
        DesignTokens designTokens = this.appearance;
        boolean z = this.isStandalone;
        StringBuilder sb = new StringBuilder("AddressComponentConfig(name=");
        sb.append(address);
        sb.append(", locale=");
        sb.append(locale);
        sb.append(", translation=");
        sb.append(map);
        sb.append(", appearance=");
        sb.append(designTokens);
        sb.append(", isStandalone=");
        return ix2.r(sb, z, ")");
    }

    public /* synthetic */ AddressComponentConfig(ComponentName.Address address, Locale locale, Map map, DesignTokens designTokens, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(address, locale, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : designTokens, z);
    }
}
