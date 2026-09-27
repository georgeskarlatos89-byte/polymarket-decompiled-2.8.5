package com.checkout.address.model;

import com.checkout.components.interfaces.model.AddressField;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.fy9;
import defpackage.xx9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/checkout/address/model/AddressFieldItem;", "", "Lcom/checkout/components/interfaces/model/AddressField;", "getField", "()Lcom/checkout/components/interfaces/model/AddressField;", "field", "Lfy9;", "getStyle", "()Lfy9;", "style", "Lxx9;", "getState", "()Lxx9;", "state", "Standard", "Phone", "Lcom/checkout/address/model/AddressFieldItem$Phone;", "Lcom/checkout/address/model/AddressFieldItem$Standard;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AddressFieldItem {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000f¨\u0006&"}, d2 = {"Lcom/checkout/address/model/AddressFieldItem$Standard;", "Lcom/checkout/address/model/AddressFieldItem;", "Lcom/checkout/components/interfaces/model/AddressField;", "field", "Lfy9;", "style", "Lxx9;", "state", "<init>", "(Lcom/checkout/components/interfaces/model/AddressField;Lfy9;Lxx9;)V", "component1", "()Lcom/checkout/components/interfaces/model/AddressField;", "component2", "()Lfy9;", "component3", "()Lxx9;", "copy", "(Lcom/checkout/components/interfaces/model/AddressField;Lfy9;Lxx9;)Lcom/checkout/address/model/AddressFieldItem$Standard;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/AddressField;", "getField", "b", "Lfy9;", "getStyle", "c", "Lxx9;", "getState", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Standard extends AddressFieldItem {
        public static final int $stable = AddressField.$stable;

        /* renamed from: a, reason: from kotlin metadata */
        private final AddressField field;

        /* renamed from: b, reason: from kotlin metadata */
        private final fy9 style;

        /* renamed from: c, reason: from kotlin metadata */
        private final xx9 state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Standard(AddressField addressField, fy9 fy9Var, xx9 xx9Var) {
            super(null);
            addressField.getClass();
            fy9Var.getClass();
            xx9Var.getClass();
            this.field = addressField;
            this.style = fy9Var;
            this.state = xx9Var;
        }

        public static /* synthetic */ Standard copy$default(Standard standard, AddressField addressField, fy9 fy9Var, xx9 xx9Var, int i, Object obj) {
            if ((i & 1) != 0) {
                addressField = standard.field;
            }
            if ((i & 2) != 0) {
                fy9Var = standard.style;
            }
            if ((i & 4) != 0) {
                xx9Var = standard.state;
            }
            return standard.copy(addressField, fy9Var, xx9Var);
        }

        /* renamed from: component1, reason: from getter */
        public final AddressField getField() {
            return this.field;
        }

        /* renamed from: component2, reason: from getter */
        public final fy9 getStyle() {
            return this.style;
        }

        /* renamed from: component3, reason: from getter */
        public final xx9 getState() {
            return this.state;
        }

        public final Standard copy(AddressField field, fy9 style, xx9 state) {
            field.getClass();
            style.getClass();
            state.getClass();
            return new Standard(field, style, state);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Standard)) {
                return false;
            }
            Standard standard = (Standard) other;
            if (Intrinsics.areEqual(this.field, standard.field) && Intrinsics.areEqual(this.style, standard.style) && Intrinsics.areEqual(this.state, standard.state)) {
                return true;
            }
            return false;
        }

        @Override // com.checkout.address.model.AddressFieldItem
        public final AddressField getField() {
            return this.field;
        }

        @Override // com.checkout.address.model.AddressFieldItem
        public final xx9 getState() {
            return this.state;
        }

        @Override // com.checkout.address.model.AddressFieldItem
        public final fy9 getStyle() {
            return this.style;
        }

        public final int hashCode() {
            return this.state.hashCode() + ((this.style.hashCode() + (this.field.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Standard(field=" + this.field + ", style=" + this.style + ", state=" + this.state + ")";
        }
    }

    public AddressFieldItem(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract AddressField getField();

    public abstract xx9 getState();

    public abstract fy9 getStyle();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0011¨\u0006."}, d2 = {"Lcom/checkout/address/model/AddressFieldItem$Phone;", "Lcom/checkout/address/model/AddressFieldItem;", "Lcom/checkout/components/interfaces/model/AddressField$Phone;", "field", "Lfy9;", "style", "Lxx9;", "state", "countryStyle", "countryState", "<init>", "(Lcom/checkout/components/interfaces/model/AddressField$Phone;Lfy9;Lxx9;Lfy9;Lxx9;)V", "component1", "()Lcom/checkout/components/interfaces/model/AddressField$Phone;", "component2", "()Lfy9;", "component3", "()Lxx9;", "component4", "component5", "copy", "(Lcom/checkout/components/interfaces/model/AddressField$Phone;Lfy9;Lxx9;Lfy9;Lxx9;)Lcom/checkout/address/model/AddressFieldItem$Phone;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/AddressField$Phone;", "getField", "b", "Lfy9;", "getStyle", "c", "Lxx9;", "getState", d.d, "getCountryStyle", "e", "getCountryState", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* data */ class Phone extends AddressFieldItem {
        public static final int $stable = AddressField.Phone.$stable;

        /* renamed from: a, reason: from kotlin metadata */
        private final AddressField.Phone field;

        /* renamed from: b, reason: from kotlin metadata */
        private final fy9 style;

        /* renamed from: c, reason: from kotlin metadata */
        private final xx9 state;

        /* renamed from: d, reason: from kotlin metadata */
        private final fy9 countryStyle;

        /* renamed from: e, reason: from kotlin metadata */
        private final xx9 countryState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Phone(AddressField.Phone phone, fy9 fy9Var, xx9 xx9Var, fy9 fy9Var2, xx9 xx9Var2) {
            super(null);
            phone.getClass();
            fy9Var.getClass();
            xx9Var.getClass();
            fy9Var2.getClass();
            xx9Var2.getClass();
            this.field = phone;
            this.style = fy9Var;
            this.state = xx9Var;
            this.countryStyle = fy9Var2;
            this.countryState = xx9Var2;
        }

        public static /* synthetic */ Phone copy$default(Phone phone, AddressField.Phone phone2, fy9 fy9Var, xx9 xx9Var, fy9 fy9Var2, xx9 xx9Var2, int i, Object obj) {
            if ((i & 1) != 0) {
                phone2 = phone.field;
            }
            if ((i & 2) != 0) {
                fy9Var = phone.style;
            }
            if ((i & 4) != 0) {
                xx9Var = phone.state;
            }
            if ((i & 8) != 0) {
                fy9Var2 = phone.countryStyle;
            }
            if ((i & 16) != 0) {
                xx9Var2 = phone.countryState;
            }
            xx9 xx9Var3 = xx9Var2;
            xx9 xx9Var4 = xx9Var;
            return phone.copy(phone2, fy9Var, xx9Var4, fy9Var2, xx9Var3);
        }

        /* renamed from: component1, reason: from getter */
        public final AddressField.Phone getField() {
            return this.field;
        }

        /* renamed from: component2, reason: from getter */
        public final fy9 getStyle() {
            return this.style;
        }

        /* renamed from: component3, reason: from getter */
        public final xx9 getState() {
            return this.state;
        }

        /* renamed from: component4, reason: from getter */
        public final fy9 getCountryStyle() {
            return this.countryStyle;
        }

        /* renamed from: component5, reason: from getter */
        public final xx9 getCountryState() {
            return this.countryState;
        }

        public final Phone copy(AddressField.Phone field, fy9 style, xx9 state, fy9 countryStyle, xx9 countryState) {
            field.getClass();
            style.getClass();
            state.getClass();
            countryStyle.getClass();
            countryState.getClass();
            return new Phone(field, style, state, countryStyle, countryState);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) other;
            if (Intrinsics.areEqual(this.field, phone.field) && Intrinsics.areEqual(this.style, phone.style) && Intrinsics.areEqual(this.state, phone.state) && Intrinsics.areEqual(this.countryStyle, phone.countryStyle) && Intrinsics.areEqual(this.countryState, phone.countryState)) {
                return true;
            }
            return false;
        }

        public final xx9 getCountryState() {
            return this.countryState;
        }

        public final fy9 getCountryStyle() {
            return this.countryStyle;
        }

        @Override // com.checkout.address.model.AddressFieldItem
        public final AddressField.Phone getField() {
            return this.field;
        }

        @Override // com.checkout.address.model.AddressFieldItem
        public final xx9 getState() {
            return this.state;
        }

        @Override // com.checkout.address.model.AddressFieldItem
        public final fy9 getStyle() {
            return this.style;
        }

        public final int hashCode() {
            return this.countryState.hashCode() + ((this.countryStyle.hashCode() + ((this.state.hashCode() + ((this.style.hashCode() + (this.field.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Phone(field=" + this.field + ", style=" + this.style + ", state=" + this.state + ", countryStyle=" + this.countryStyle + ", countryState=" + this.countryState + ")";
        }

        @Override // com.checkout.address.model.AddressFieldItem
        public final AddressField getField() {
            return this.field;
        }
    }
}
