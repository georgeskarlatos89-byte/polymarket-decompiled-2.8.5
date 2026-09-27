package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.fa;
import defpackage.ga;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"androidx/activity/result/contract/ActivityResultContracts$GetMultipleContents", "Lga;", "", "", "Landroid/net/Uri;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class ActivityResultContracts$GetMultipleContents extends ga {
    @Override // defpackage.ga
    public final Intent createIntent(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.ga
    public final fa getSynchronousResult(Context context, Object obj) {
        context.getClass();
        ((String) obj).getClass();
        return null;
    }

    @Override // defpackage.ga
    public final Object parseResult(int i, Intent intent) {
        List arrayList;
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                arrayList = CollectionsKt.emptyList();
            } else {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        Uri uri = clipData.getItemAt(i2).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }
}
