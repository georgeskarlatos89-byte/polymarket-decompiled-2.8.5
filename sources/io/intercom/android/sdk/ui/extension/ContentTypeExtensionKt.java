package io.intercom.android.sdk.ui.extension;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"isVideo", "", "", "isImage", "isAudio", "isDocument", "isPdf", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentTypeExtensionKt {
    public static final boolean isAudio(String str) {
        str.getClass();
        return StringsKt.L(str, "audio", false);
    }

    public static final boolean isDocument(String str) {
        str.getClass();
        if (!StringsKt.L(str, "application", false) && !StringsKt.L(str, "text", false)) {
            return false;
        }
        return true;
    }

    public static final boolean isImage(String str) {
        str.getClass();
        return StringsKt.L(str, "image", false);
    }

    public static final boolean isPdf(String str) {
        str.getClass();
        return StringsKt.L(str, "pdf", false);
    }

    public static final boolean isVideo(String str) {
        str.getClass();
        return StringsKt.L(str, "video", false);
    }
}
