package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.fa;
import defpackage.ga;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/activity/result/contract/ActivityResultContracts$TakePicturePreview", "Lga;", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class ActivityResultContracts$TakePicturePreview extends ga {
    @Override // defpackage.ga
    public final Intent createIntent(Context context, Object obj) {
        Intent addFlags = new Intent("android.media.action.IMAGE_CAPTURE").addFlags(1).addFlags(2);
        addFlags.getClass();
        return addFlags;
    }

    @Override // defpackage.ga
    public final fa getSynchronousResult(Context context, Object obj) {
        context.getClass();
        return null;
    }

    @Override // defpackage.ga
    public final Object parseResult(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        return (Bitmap) intent.getParcelableExtra(ApiConstant.KEY_DATA);
    }
}
