package com.checkout.address.di;

import com.checkout.address.model.validation.contract.AddressValidator;
import defpackage.ba5;
import defpackage.d4g;
import defpackage.qwi;
import defpackage.w9i;
import defpackage.y0c;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0002j\u0002`\nH&¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u0002j\u0002`\rH&¢\u0006\u0004\b\u000e\u0010\u0007J\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u0002j\u0002`\u0011H&¢\u0006\u0004\b\u0012\u0010\u0007J\u001f\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130\u0002j\u0002`\u0014H&¢\u0006\u0004\b\u0015\u0010\u0007J\u001f\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0002j\u0002`\u0018H&¢\u0006\u0004\b\u0019\u0010\u0007J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H&¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H&¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H&¢\u0006\u0004\b*\u0010+ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, d2 = {"Lcom/checkout/address/di/AddressDIComponent;", "", "Ly0c;", "Lcom/checkout/components/interfaces/model/AddressField;", "Lcom/checkout/address/model/AddressFieldItem;", "Lcom/checkout/address/mapper/AddressFieldStyleMapper;", "addressFieldMapper", "()Ly0c;", "Lyr1;", "Lj5a;", "Lcom/checkout/components/ui/mapper/ButtonViewStyleMapper;", "buttonStyleMapper", "Li5a;", "Lcom/checkout/components/ui/mapper/ButtonStateMapper;", "buttonStateMapper", "Lky9;", "Ljy9;", "Lcom/checkout/components/ui/mapper/InputFieldStateMapper;", "inputFieldStateMapper", "Loy9;", "Lcom/checkout/components/ui/mapper/InputFieldViewStyleMapper;", "inputFieldStyleMapper", "Lpwi;", "Lswi;", "Lcom/checkout/components/ui/mapper/TextLabelViewStyleMapper;", "textLabelViewStyleMapper", "Lqwi;", "textLabelStateMapper", "()Lqwi;", "Lw9i;", "styleUtils", "()Lw9i;", "Lba5;", "countryPickerStyleUtils", "()Lba5;", "Lcom/checkout/address/model/validation/contract/AddressValidator;", "addressValidator", "()Lcom/checkout/address/model/validation/contract/AddressValidator;", "Ld4g;", "resourceProvider", "()Ld4g;", "", "isRTL", "()Z", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AddressDIComponent {
    y0c addressFieldMapper();

    AddressValidator addressValidator();

    y0c buttonStateMapper();

    y0c buttonStyleMapper();

    ba5 countryPickerStyleUtils();

    y0c inputFieldStateMapper();

    y0c inputFieldStyleMapper();

    boolean isRTL();

    d4g resourceProvider();

    w9i styleUtils();

    qwi textLabelStateMapper();

    y0c textLabelViewStyleMapper();
}
