package defpackage;

import bo.app.f7;
import bo.app.o2;
import bo.app.p4;
import com.braze.ui.support.UriUtils;
import com.polymarket.usviewmodels.USEventCardViewModel;
import com.polymarket.usviewmodels.UserPositionViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import skip.foundation.Thread;
import skip.foundation.URLResponse;
import skip.foundation.UnitConverterLinear;
import skip.foundation.UnitConverterReciprocal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class xyi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref.ObjectRef b;

    public /* synthetic */ xyi(Ref.ObjectRef objectRef, int i) {
        this.a = i;
        this.b = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Ref.ObjectRef objectRef = this.b;
        switch (i) {
            case 0:
                return Thread.a(objectRef);
            case 1:
                return URLResponse.c(objectRef);
            case 2:
                return USEventCardViewModel.d(objectRef);
            case 3:
                return UnitConverterLinear.b(objectRef);
            case 4:
                return UnitConverterReciprocal.a(objectRef);
            case 5:
                return UriUtils.c(objectRef);
            case 6:
                return UriUtils.b(objectRef);
            case 7:
                return UserPositionViewModel.d(objectRef);
            case 8:
                return "Provided string field is too long [" + ((String) objectRef.a).length() + "]. The max length is 255, truncating provided field.";
            case 9:
                return f7.b(objectRef);
            case 10:
                return f7.c(objectRef);
            case 11:
                return f7.a(objectRef);
            case 12:
                return o2.a(objectRef);
            default:
                return p4.a(objectRef);
        }
    }
}
