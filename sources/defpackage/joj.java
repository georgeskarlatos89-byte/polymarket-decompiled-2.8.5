package defpackage;

import com.polymarket.usviewmodels.USSportsCategoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class joj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ USSportsCategoryViewModel b;

    public /* synthetic */ joj(USSportsCategoryViewModel uSSportsCategoryViewModel, int i) {
        this.a = i;
        this.b = uSSportsCategoryViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        USSportsCategoryViewModel uSSportsCategoryViewModel = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                uSSportsCategoryViewModel.sendInput(USSportsCategoryViewModel.Input.INSTANCE.onSearchQueryChanged(str));
                return Unit.INSTANCE;
            default:
                uSSportsCategoryViewModel.selectPillAtIndex(((Integer) obj).intValue());
                return Unit.INSTANCE;
        }
    }
}
