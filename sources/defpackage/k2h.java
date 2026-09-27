package defpackage;

import com.google.mlkit.common.MlKitException;
import com.polymarket.usviewmodels.SignupWallViewModel;
import com.polymarket.usviewmodels.SportsTeamPickerViewModel;
import com.polymarket.usviewmodels.SquadsChatViewModel;
import com.polymarket.usviewmodels.SquadsEditProfileViewModel;
import com.polymarket.usviewmodels.SquadsInviteShareViewModel;
import com.polymarket.usviewmodels.SquadsInviteUsersViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class k2h implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ k2h(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new i2h();
            case 1:
                return new j2h(rag.b(4.0f), rag.b(4.0f), rag.b(0.0f));
            case 2:
                return new yk0(uk8.d, 0);
            case 3:
                return null;
            case 4:
                return ikl.c(Boolean.FALSE);
            case 5:
                return ikl.c(Boolean.FALSE);
            case 6:
                return ikl.c(Boolean.FALSE);
            case 7:
                return ikl.c(Boolean.FALSE);
            case 8:
                return SignupWallViewModel.Callbacks.c();
            case 9:
                return SignupWallViewModel.Callbacks.a();
            case 10:
                return SignupWallViewModel.Callbacks.b();
            case 11:
                return y23.Companion.serializer();
            case 12:
                return qoa.Companion.serializer();
            case 13:
                throw null;
            case 14:
                return Long.valueOf(System.currentTimeMillis());
            case 15:
                return new yk0(k1a.a, 0);
            case 16:
                return Float.valueOf(0.0f);
            case 17:
                return Float.valueOf(0.0f);
            case MlKitException.UNSUPPORTED /* 18 */:
                return SportsTeamPickerViewModel.Callbacks.a();
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return SquadsChatViewModel.Callbacks.e();
            case 20:
                return SquadsChatViewModel.Callbacks.k();
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return SquadsChatViewModel.Callbacks.j();
            case 22:
                return SquadsChatViewModel.Callbacks.g();
            case 23:
                return SquadsChatViewModel.Callbacks.i();
            case 24:
                return Unit.INSTANCE;
            case 25:
                return SquadsEditProfileViewModel.Callbacks.a();
            case 26:
                return SquadsInviteShareViewModel.Callbacks.c();
            case 27:
                return SquadsInviteUsersViewModel.Callbacks.b();
            case 28:
                return SquadsInviteUsersViewModel.Callbacks.a();
            default:
                return Unit.INSTANCE;
        }
    }
}
