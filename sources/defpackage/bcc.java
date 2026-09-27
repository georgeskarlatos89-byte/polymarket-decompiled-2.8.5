package defpackage;

import bo.app.q0;
import bo.app.s0;
import bo.app.z0;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.UriUtils;
import com.google.mlkit.common.MlKitException;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import kotlin.jvm.functions.Function0;
import skip.lib.StringKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class bcc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ bcc(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return MessageComposerKt.m(str);
            case 1:
                return new ttc(str, null, null);
            case 2:
                return z0.a("Failure checking permission ", str);
            case 3:
                return z0.a("Migrated sealed session with key: ", str);
            case 4:
                return new vki(str, yzh.b, yzh.c);
            case 5:
                return StringKt.e(str);
            case 6:
                return new q2i(str);
            case 7:
                return str;
            case 8:
                return s0.a("Added timestamp for trigger:", str, " from SharedPreferences");
            case 9:
                return z0.a("Added triggered action from SharedPreferences key: ", str);
            case 10:
                return UriAction.a(str);
            case 11:
                return UriAction.h(str);
            case 12:
                return UriAction.m(str);
            case 13:
                return UriUtils.a(str);
            case 14:
                return UserJavascriptInterfaceBase.z(str);
            case 15:
                return UserJavascriptInterfaceBase.F(str);
            case 16:
                return UserJavascriptInterfaceBase.p(str);
            case 17:
                return UserJavascriptInterfaceBase.I(str);
            case MlKitException.UNSUPPORTED /* 18 */:
                return UserJavascriptInterfaceBase.c(str);
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return UserJavascriptInterfaceBase.t(str);
            case 20:
                return UserJavascriptInterfaceBase.s(str);
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return UserJavascriptInterfaceBase.d(str);
            case 22:
                return UserJavascriptInterfaceBase.H(str);
            case 23:
                return UserJavascriptInterfaceBase.B(str);
            case 24:
                return s0.a("The custom event is a blocklisted custom event: ", str, ". Invalid custom event.");
            case 25:
                return z0.a("The productId is a blocklisted productId: ", str);
            case 26:
                StringBuilder s = ix2.s("The currencyCode ", str, " is invalid. Expected one of ");
                s.append(f3k.b);
                return s.toString();
            case 27:
                return q0.a("Html content zip unpacked to to ", str, '.');
            case 28:
                return z0.a("Could not download zip file to local storage. ", str);
            default:
                return z0.a("Cannot find local asset file at path: ", str);
        }
    }
}
