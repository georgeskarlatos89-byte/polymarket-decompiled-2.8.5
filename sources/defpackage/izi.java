package defpackage;

import com.polymarket.usviewmodels.USEventCardViewModel;
import com.polymarket.usviewmodels.UserPositionViewModel;
import io.getstream.chat.android.models.Poll;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import skip.foundation.URLResponse;
import skip.foundation.UnitConverterLinear;
import skip.foundation.UnitConverterReciprocal;
import skip.lib.Hasher;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class izi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref.ObjectRef b;

    public /* synthetic */ izi(Ref.ObjectRef objectRef, int i) {
        this.a = i;
        this.b = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Ref.ObjectRef objectRef = this.b;
        switch (i) {
            case 0:
                ((String) obj).getClass();
                return (Poll) objectRef.a;
            case 1:
                ((String) obj).getClass();
                return (Poll) objectRef.a;
            case 2:
                ((String) obj).getClass();
                return (Poll) objectRef.a;
            case 3:
                ((String) obj).getClass();
                return (Poll) objectRef.a;
            case 4:
                ((String) obj).getClass();
                return (Poll) objectRef.a;
            case 5:
                bea beaVar = (bea) obj;
                beaVar.getClass();
                objectRef.a = beaVar;
                return Unit.INSTANCE;
            case 6:
                return URLResponse.a(objectRef, (Hasher) obj);
            case 7:
                return USEventCardViewModel.c(objectRef, (Hasher) obj);
            case 8:
                return UnitConverterLinear.a(objectRef, (Hasher) obj);
            case 9:
                return UnitConverterReciprocal.b(objectRef, (Hasher) obj);
            default:
                return UserPositionViewModel.c(objectRef, (Hasher) obj);
        }
    }
}
