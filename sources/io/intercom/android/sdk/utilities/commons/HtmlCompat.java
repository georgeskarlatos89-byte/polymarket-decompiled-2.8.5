package io.intercom.android.sdk.utilities.commons;

import android.text.Html;
import android.text.Spanned;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class HtmlCompat {
    public static Spanned fromHtml(String str) {
        return Html.fromHtml(str, 0);
    }
}
