package com.braze.ui.inappmessage.views;

import android.view.View;
import defpackage.vlk;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "", "Lvlk;", "insets", "", "applyWindowInsets", "(Lvlk;)V", "Landroid/view/View;", "getMessageClickableView", "()Landroid/view/View;", "messageClickableView", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IInAppMessageView {
    void applyWindowInsets(vlk insets);

    View getMessageClickableView();
}
