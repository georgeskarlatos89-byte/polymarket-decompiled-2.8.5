package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import defpackage.ga;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/activity/result/contract/ActivityResultContracts$PickContact", "Lga;", "Ljava/lang/Void;", "Landroid/net/Uri;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityResultContracts$PickContact extends ga {
    @Override // defpackage.ga
    public final Intent createIntent(Context context, Object obj) {
        Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
        type.getClass();
        return type;
    }

    @Override // defpackage.ga
    public final Object parseResult(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        return intent.getData();
    }
}
