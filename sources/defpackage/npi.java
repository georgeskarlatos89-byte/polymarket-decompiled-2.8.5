package defpackage;

import com.polymarket.data.ETaxDocument;
import com.polymarket.usviewmodels.TaxDocumentsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class npi implements Function1 {
    public final /* synthetic */ TaxDocumentsListViewModel a;

    public npi(TaxDocumentsListViewModel taxDocumentsListViewModel) {
        this.a = taxDocumentsListViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ETaxDocument eTaxDocument = (ETaxDocument) obj;
        eTaxDocument.getClass();
        this.a.sendInput(TaxDocumentsListViewModel.Input.INSTANCE.onSelectDocument(eTaxDocument));
        return Unit.INSTANCE;
    }
}
