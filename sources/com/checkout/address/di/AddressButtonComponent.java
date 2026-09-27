package com.checkout.address.di;

import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import defpackage.qwi;
import defpackage.y0c;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0002j\u0002`\tH&¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0002j\u0002`\rH&¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lcom/checkout/address/di/AddressButtonComponent;", "", "Ly0c;", "Lky9;", "Ljy9;", "Lcom/checkout/components/ui/mapper/InputFieldStateMapper;", "inputFieldStateMapper", "()Ly0c;", "Loy9;", "Lcom/checkout/components/ui/mapper/InputFieldViewStyleMapper;", "inputFieldStyleMapper", "Lpwi;", "Lswi;", "Lcom/checkout/components/ui/mapper/TextLabelViewStyleMapper;", "textLabelViewStyleMapper", "Lqwi;", "textLabelStateMapper", "()Lqwi;", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "", "errorMessageRepository", "()Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AddressButtonComponent {
    PrimitiveStateFlowRepository<String> errorMessageRepository();

    y0c inputFieldStateMapper();

    y0c inputFieldStyleMapper();

    qwi textLabelStateMapper();

    y0c textLabelViewStyleMapper();
}
