package defpackage;

import com.google.mlkit.common.MlKitException;
import io.intercom.android.sdk.m5.components.HomeItemKt;
import io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.m5.home.ui.HomeScreenKt;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.ui.component.IntercomTopBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.Handshake;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class xi8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ xi8(Function0 function0, int i) {
        this.a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                if (lnf.d(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f) >= 0.5f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                return GifGridKt.b(function0);
            case 2:
                function0.invoke();
                return Boolean.TRUE;
            case 3:
                return Handshake.a(function0);
            case 4:
                return HeaderMenuItemRowKt.h(function0);
            case 5:
                return HomeHeaderKt.b(function0);
            case 6:
                return HomeItemKt.f(function0);
            case 7:
                return HomeScreenKt.a(function0);
            case 8:
                function0.invoke();
                return Unit.INSTANCE;
            case 9:
                return IntercomTopBarKt.f(function0);
            case 10:
                function0.invoke();
                return Unit.INSTANCE;
            case 11:
                float d = 1.0f - (lnf.d(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f) * 2.5f);
                if (d < 0.0f) {
                    d = 0.0f;
                }
                if (d == 0.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                float d2 = 1.0f - (lnf.d(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f) * 2.5f);
                if (d2 < 0.0f) {
                    d2 = 0.0f;
                }
                if (d2 == 0.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                function0.invoke();
                return Unit.INSTANCE;
            case 14:
                return MediaInputSheetContentKt.e(function0);
            case 15:
                return MediaInputSheetContentKt.b(function0);
            case 16:
                return MessageComposerKt.d(function0);
            case 17:
                function0.invoke();
                return Boolean.TRUE;
            case MlKitException.UNSUPPORTED /* 18 */:
                function0.invoke();
                return Boolean.TRUE;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                function0.invoke();
                return Boolean.TRUE;
            case 20:
                function0.invoke();
                return Unit.INSTANCE;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                function0.invoke();
                return Unit.INSTANCE;
            case 22:
                function0.invoke();
                return Unit.INSTANCE;
            case 23:
                function0.invoke();
                return Unit.INSTANCE;
            case 24:
                function0.invoke();
                return Unit.INSTANCE;
            case 25:
                function0.invoke();
                return Unit.INSTANCE;
            case 26:
                function0.invoke();
                return Unit.INSTANCE;
            case 27:
                function0.invoke();
                return Unit.INSTANCE;
            case 28:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            default:
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
