package defpackage;

import com.google.mlkit.common.MlKitException;
import com.polymarket.data.EThemeSettings;
import com.polymarket.usviewmodels.TradingCoordinatorViewModel;
import com.polymarket.usviewmodels.TransactionDetailViewModel;
import com.polymarket.usviewmodels.TransactionSuccessViewModel;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.usecase.TrackLastReceivedPartsUseCase;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class nyi implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ nyi(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("No Typography provided");
            case 1:
                return new mqd(0.0f, 0.0f, 0.0f, 0.0f);
            case 2:
                throw new IllegalStateException("No Colors provided");
            case 3:
                throw new IllegalStateException("No Shapes provided");
            case 4:
                return ikl.c(EThemeSettings.Appearance.f9default);
            case 5:
                return new Object();
            case 6:
                return TicketDetailDestinationKt.e();
            case 7:
                return TicketsListReducerKt.c();
            case 8:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (!StringsKt.T("kotlinx.datetime.TimeBased")) {
                    m44 m44Var = new m44("kotlinx.datetime.TimeBased");
                    List emptyList = CollectionsKt.emptyList();
                    cub cubVar = cub.a;
                    m44Var.a("nanoseconds", cub.b, emptyList);
                    return new zwg("kotlinx.datetime.TimeBased", u9i.g, m44Var.c.size(), ArraysKt.e0(serialDescriptorArr), m44Var);
                }
                dmk.v("Blank serial names are prohibited");
                return null;
            case 9:
                return TopActionBarKt.a();
            case 10:
                return Unit.INSTANCE;
            case 11:
                return TrackLastReceivedPartsUseCase.a();
            case 12:
                return TradingCoordinatorViewModel.Callbacks.l();
            case 13:
                return TradingCoordinatorViewModel.Callbacks.c();
            case 14:
                return TradingCoordinatorViewModel.Callbacks.h();
            case 15:
                return TradingCoordinatorViewModel.Callbacks.a();
            case 16:
                return TradingCoordinatorViewModel.Callbacks.n();
            case 17:
                return Unit.INSTANCE;
            case MlKitException.UNSUPPORTED /* 18 */:
                return TransactionDetailViewModel.Callbacks.a();
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return TransactionDetailViewModel.Callbacks.c();
            case 20:
                return TransactionDetailViewModel.Callbacks.b();
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return TransactionSuccessViewModel.Callbacks.a();
            case 22:
                return TransactionSuccessViewModel.Companion.d();
            case 23:
                return TransactionSuccessViewModel.Companion.a();
            case 24:
                return TransactionSuccessViewModel.Companion.c();
            case 25:
                return TransactionSuccessViewModel.Companion.e();
            case 26:
                return TransactionSuccessViewModel.Companion.b();
            case 27:
                return TransactionSuccessViewModel.Companion.g();
            case 28:
                return TransactionSuccessViewModel.Companion.f();
            default:
                return go5.f("com.stripe.android.ui.core.elements.TranslationId", cdj.values(), new String[]{"upe.labels.ideal.bank", "upe.labels.p24.bank", "upe.labels.eps.bank", "upe.labels.fpx.bank", "address.label.name", "upe.labels.name.onAccount"}, new Annotation[][]{null, null, null, null, null, null});
        }
    }
}
