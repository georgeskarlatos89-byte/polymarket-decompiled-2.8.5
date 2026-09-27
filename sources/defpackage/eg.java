package defpackage;

import com.polymarket.data.APIAddress;
import com.polymarket.usviewmodels.AddressViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class eg implements Function0 {
    public final /* synthetic */ AddressViewModel a;
    public final /* synthetic */ APIAddress.SearchResult b;

    public eg(AddressViewModel addressViewModel, APIAddress.SearchResult searchResult) {
        this.a = addressViewModel;
        this.b = searchResult;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.sendInput(AddressViewModel.Input.INSTANCE.onSelectSearchResult(this.b));
        return Unit.INSTANCE;
    }
}
