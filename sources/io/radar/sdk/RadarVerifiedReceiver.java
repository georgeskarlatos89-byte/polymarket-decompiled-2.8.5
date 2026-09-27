package io.radar.sdk;

import android.content.Context;
import io.radar.sdk.model.RadarVerifiedLocationToken;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lio/radar/sdk/RadarVerifiedReceiver;", "", "()V", "onIpChanged", "", "context", "Landroid/content/Context;", "onSharingChanged", "sharing", "", "onTokenUpdated", "token", "Lio/radar/sdk/model/RadarVerifiedLocationToken;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RadarVerifiedReceiver {
    public void onIpChanged(Context context) {
        context.getClass();
    }

    public void onSharingChanged(Context context, boolean sharing) {
        context.getClass();
    }

    public abstract void onTokenUpdated(Context context, RadarVerifiedLocationToken token);
}
