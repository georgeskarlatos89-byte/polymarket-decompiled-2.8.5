package com.braze.ui.inappmessage.listeners;

import android.os.Bundle;
import defpackage.jj9;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "", "Ljj9;", "inAppMessage", "", "url", "Landroid/os/Bundle;", "queryBundle", "", "onCloseClicked", "(Ljj9;Ljava/lang/String;Landroid/os/Bundle;)V", "", "onCustomEventFired", "(Ljj9;Ljava/lang/String;Landroid/os/Bundle;)Z", "onOtherUrlAction", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IHtmlInAppMessageActionListener {
    default void onCloseClicked(jj9 inAppMessage, String url, Bundle queryBundle) {
        inAppMessage.getClass();
        url.getClass();
        queryBundle.getClass();
    }

    default boolean onCustomEventFired(jj9 inAppMessage, String url, Bundle queryBundle) {
        inAppMessage.getClass();
        url.getClass();
        queryBundle.getClass();
        return false;
    }

    default boolean onOtherUrlAction(jj9 inAppMessage, String url, Bundle queryBundle) {
        inAppMessage.getClass();
        url.getClass();
        queryBundle.getClass();
        return false;
    }
}
