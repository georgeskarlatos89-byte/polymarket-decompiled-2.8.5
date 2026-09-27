package com.braze.ui.inappmessage.listeners;

import android.view.View;
import defpackage.acc;
import defpackage.jj9;
import defpackage.lj9;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "", "Landroid/view/View;", "inAppMessageView", "Ljj9;", "inAppMessage", "", "beforeOpened", "(Landroid/view/View;Ljj9;)V", "afterOpened", "beforeClosed", "afterClosed", "(Ljj9;)V", "onClicked", "Lacc;", "messageButton", "Llj9;", "inAppMessageImmersive", "onButtonClicked", "(Lacc;Llj9;)V", "onDismissed", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IInAppMessageViewLifecycleListener {
    void afterClosed(jj9 inAppMessage);

    void afterOpened(View inAppMessageView, jj9 inAppMessage);

    void beforeClosed(View inAppMessageView, jj9 inAppMessage);

    void beforeOpened(View inAppMessageView, jj9 inAppMessage);

    void onButtonClicked(acc messageButton, lj9 inAppMessageImmersive);

    void onClicked(View inAppMessageView, jj9 inAppMessage);

    void onDismissed(View inAppMessageView, jj9 inAppMessage);
}
