package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import defpackage.d55;
import defpackage.fa;
import defpackage.ga;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/activity/result/contract/ActivityResultContracts$RequestPermission", "Lga;", "", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityResultContracts$RequestPermission extends ga {
    @Override // defpackage.ga
    public final Intent createIntent(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.ga
    public final fa getSynchronousResult(Context context, Object obj) {
        String str = (String) obj;
        context.getClass();
        str.getClass();
        if (d55.a(context, str) == 0) {
            return new fa(Boolean.TRUE);
        }
        return null;
    }

    @Override // defpackage.ga
    public final Object parseResult(int i, Intent intent) {
        if (intent != null && i == -1) {
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (intArrayExtra[i2] == 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }
}
