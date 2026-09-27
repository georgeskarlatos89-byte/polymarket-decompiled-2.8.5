package defpackage;

import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.google.mlkit.common.MlKitException;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class fl1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ fl1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return "Shutting down all queued work on the Braze SDK";
            case 1:
                return "Sending sdk data wipe event to external subscribers";
            case 2:
                return "Shutting down the singleton work queue";
            case 3:
                return "Failed to shutdown queued work on the Braze SDK.";
            case 4:
                return "Failed to delete shared preference data for the Braze SDK.";
            case 5:
                return "DelayedInitializationProvider was null. Returning delayed initialization as disabled.";
            case 6:
                return "The instance is null. Allowing instance initialization";
            case 7:
                return "Delayed initialization mode is enabled. Actions will not be performed on the SDK.";
            case 8:
                return "Braze.configure() cannot be called while the singleton is still live.";
            case 9:
                return "SDK enablement provider was null. Returning SDK as enabled.";
            case 10:
                return "API key not present. Actions will not be performed on the SDK.";
            case 11:
                return "SDK is disabled. Actions will not be performed on the SDK.";
            case 12:
                return "Failed to delete DataStore data for the Braze SDK.";
            case 13:
                return "Stopping the SDK instance.";
            case 14:
                return "Disabling all network requests";
            case 15:
                return "The instance was stopped. Allowing instance initialization";
            case 16:
                return "disableSdk has finished";
            case 17:
                return "Push contained key for fetching test triggers, fetching triggers.";
            case MlKitException.UNSUPPORTED /* 18 */:
                return "Caught exception trying to get a Braze API endpoint from the BrazeEndpointProvider. Using the original URI";
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return "No API key was found previously. Allowing instance initialization";
            case 20:
                return "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.";
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return "Braze network requests will be mocked. Events dispatchedin this mode will be dropped.";
            case 22:
                return "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.";
            case 23:
                return "Failed to delete data from the internal storage cache.";
            case 24:
                return "Setting SDK to enabled.";
            case 25:
                return "Enabling all network requests";
            case 26:
                return BrazeActionParser.f();
            case 27:
                return "Skipping automatic registration for notification trampoline activity class.";
            case 28:
                return "Activity is different from previous activity. Unregistering in-app message manager";
            default:
                return "Failed to register this lifecycle callback listener directly against application class";
        }
    }
}
