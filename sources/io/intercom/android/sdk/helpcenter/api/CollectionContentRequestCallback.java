package io.intercom.android.sdk.helpcenter.api;

import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/helpcenter/api/CollectionContentRequestCallback;", "", "onComplete", "", "response", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "onError", "errorCode", "", "onFailure", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CollectionContentRequestCallback {
    void onComplete(HelpCenterCollectionContent response);

    void onError(int errorCode);

    void onFailure();
}
