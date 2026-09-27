package io.intercom.android.sdk.m5.home.ui.helpers;

import android.view.ViewGroup;
import android.view.ViewParent;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002\u001a\b\u0010\r\u001a\u00020\u0007H\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"webViewCache", "", "", "Lio/intercom/android/sdk/blocks/messengercard/CardWebView;", "getCachedWebView", "url", "cacheWebView", "", "webView", "getFromURL", "attribute", "missingAttributeValue", "getIdFromURL", "clearWebViewCache", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InMemoryWebViewCacheKt {
    private static Map<String, CardWebView> webViewCache = new LinkedHashMap();

    public static final void cacheWebView(String str, CardWebView cardWebView) {
        ViewGroup viewGroup;
        str.getClass();
        cardWebView.getClass();
        String idFromURL = getIdFromURL(str);
        ViewParent parent = cardWebView.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(cardWebView);
        }
        webViewCache.put(idFromURL, cardWebView);
    }

    public static final void clearWebViewCache() {
        ViewGroup viewGroup;
        for (CardWebView cardWebView : webViewCache.values()) {
            ViewParent parent = cardWebView.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(cardWebView);
            }
            cardWebView.destroy();
        }
        webViewCache.clear();
    }

    public static final CardWebView getCachedWebView(String str) {
        ViewGroup viewGroup;
        str.getClass();
        CardWebView cardWebView = webViewCache.get(getIdFromURL(str));
        if (cardWebView != null) {
            ViewParent parent = cardWebView.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(cardWebView);
            }
        }
        return cardWebView;
    }

    private static final String getFromURL(String str, String str2, String str3) {
        return StringsKt.n0(StringsKt.j0(str, str2 + '=', str3), "&");
    }

    public static /* synthetic */ String getFromURL$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return getFromURL(str, str2, str3);
    }

    private static final String getIdFromURL(String str) {
        return getFromURL$default(str, "card_id", null, 4, null) + '#' + getFromURL(str, "theme", "");
    }
}
