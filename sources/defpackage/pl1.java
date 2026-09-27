package defpackage;

import com.braze.push.BrazeFirebaseMessagingService;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.google.mlkit.common.MlKitException;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class pl1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ pl1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return "Error while reading shouldPersistWebViewWhenBackgroundingApp from BrazeConfigurationProvider";
            case 1:
                return "Cannot set Firebase Cloud Messaging Sender Id to blank string. Firebase Cloud Messaging Sender Id field not set";
            case 2:
                return "Cannot set Braze API key to blank string. API key field not set";
            case 3:
                return "**                                                **";
            case 4:
                return "****************************************************";
            case 5:
                return "Unable to read the version code.";
            case 6:
                return "Using default notification accent color found in resources";
            case 7:
                return "More than 12 ephemeral/graylisted events detected. Only using first 12 events. Please truncate this list!";
            case 8:
                return "Exception while parsing stored SDK flavor. Returning null.";
            case 9:
                return "Found an override api key. Using it to configure the Braze SDK";
            case 10:
                return "****************************************************";
            case 11:
                return "**                                                **";
            case 12:
                return "**                 !! WARNING !!                  **";
            case 13:
                return "**                                                **";
            case 14:
                return "**     No API key set in res/values/braze.xml     **";
            case 15:
                return "** No cached API Key found from Braze.configure   **";
            case 16:
                return "**          Braze functionality disabled          **";
            case 17:
                return BrazeContentCardUtils.a();
            case MlKitException.UNSUPPORTED /* 18 */:
                return BrazeContentCardsManager.a();
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return "Cancelling children of BrazeCoroutineScope";
            case 20:
                return BrazeDeeplinkHandler.b();
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return BrazeDeeplinkHandler.a();
            case 22:
                return "Null or blank Uri scheme.";
            case 23:
                return "Output filename null or blank. File not downloaded.";
            case 24:
                return "Zip file url null or blank. File not downloaded.";
            case 25:
                return "Download directory null or blank. File not downloaded.";
            case 26:
                return BrazeFirebaseMessagingService.Companion.g();
            case 27:
                return BrazeFirebaseMessagingService.Companion.e();
            case 28:
                return BrazeFirebaseMessagingService.Companion.o();
            default:
                return "Braze geofences not enabled. Geofences not set up.";
        }
    }
}
